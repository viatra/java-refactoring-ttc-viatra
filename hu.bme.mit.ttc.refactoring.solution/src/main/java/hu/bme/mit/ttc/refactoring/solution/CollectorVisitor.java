package hu.bme.mit.ttc.refactoring.solution;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TField;
import TypeGraphBasic.TFieldDefinition;
import TypeGraphBasic.TFieldSignature;
import TypeGraphBasic.TMember;
import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TSignature;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;
import TypeGraphTrace.Trace;

import com.google.common.base.Splitter;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

/**
 * An ASTVisitor implementation that iterates the JDT ASG and turns it into a TypeGraph PG.
 * The transformation is performed in two steps. First, the appropriate EObjects are created,
 * then after every AST is processed, the collected relations are added to the entities.
 */
public class CollectorVisitor extends ASTVisitor {

	protected Resource resource;
	protected TypeGraph typeGraph;
	protected TypeGraphBasicFactory factory;

	/**
	 * Map connecting the name of the packages and the stored TPackage EObjects.
	 */
	protected static Map<String, TPackage> packages = new HashMap<>();
	/**
	 * Multimap connecting the TPackages (by their name String) to their children (just created, TPackage).
	 */
	protected static Multimap<String, EObject> packageChildren = HashMultimap.create();

	protected static Map<String, TClass> classes = new HashMap<>();
	protected static Multimap<String, String> packageToClasses = HashMultimap.create(); // package -> classes*
	protected static Map<String, String> classAndParent = new HashMap<>(); // class -> class (parent)


	/**
	 * Map connecting the name of the methods and the stored TMethod EObjects.
	 */
	protected static Map<String, TMethod> methods = new HashMap<>();
	/**
	 * Map connecting the method signatures to the stored TPackage EObject.
	 * signature (cropped) string -> TMethodSignature
	 */
	protected static Map<String, TMethodSignature> methodSignatures = new HashMap<>();
	protected static Multimap<String, TSignature> classSignatures = HashMultimap.create();

	protected static Map<String, TField> fields = new HashMap<>();
	protected static Map<String, TFieldSignature> tFieldSignatures = new HashMap<>();

	// connecting access
	protected static Map<String, TMember> memberDeclarations = new HashMap<>();
	protected static Multimap<String, String> memberAccesses = HashMultimap.create();


	public CollectorVisitor(Resource resource) {
		this.resource = resource;
		this.typeGraph = ((Trace) resource.getContents().get(0)).getProgramGraph();
		this.factory = TypeGraphBasicFactory.eINSTANCE;
	}

	public void init() {
		packages = new HashMap<>();
		packageChildren = HashMultimap.create();

		classes = new HashMap<>();
		packageToClasses = HashMultimap.create(); // package -> classes*
		classAndParent = new HashMap<>(); // class -> class (parent)

		methods = new HashMap<>();
		methodSignatures = new HashMap<>(); // signature (cropped) string
		classSignatures = HashMultimap.create();

		fields = new HashMap<>();
		tFieldSignatures = new HashMap<>();

		memberDeclarations = new HashMap<>();
		memberAccesses = HashMultimap.create();
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// PACKAGES
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	@Override
	public boolean visit(CompilationUnit node) {
		try {
			String fullyQualifiedName = node.getPackage().getName().getFullyQualifiedName();
			createPackagesFor(fullyQualifiedName);
		} catch (Exception e) {
		}
		return super.visit(node);
	}

	public void createPackagesFor(String pkg) {
		String[] split = pkg.split("\\.");

		String previous = "";
		for (int i = 0; i < split.length; i++) {
			String current = previous + ((i == 0) ? "" : ".") + split[i];

			if (!packages.containsKey(current)) {
				TPackage tPackage = factory.createTPackage();
				tPackage.setTName(current);
				typeGraph.getPackages().add(tPackage);

				packages.put(current, tPackage);
			}

			if (!"".equalsIgnoreCase(previous)) {
				packageChildren.get(previous).add(packages.get(current));
			}

			previous = current;
		}
	}

	protected void connectPackages() {
		packageChildren.keySet().forEach(
				parentFQN -> {
					TPackage parent = packages.get(parentFQN);
					packageChildren.get(parentFQN).forEach(
							child -> {
								((TPackage) child).setParent(parent);
							}
					);
				}
		);
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// CLASSES
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	@Override
	public boolean visit(TypeDeclaration node) {

		if (node.isInterface()) {
			return super.visit(node);
		}

		ITypeBinding iTypeBinding = node.resolveBinding();
		String classKey = iTypeBinding.getKey();
		String packageName = iTypeBinding.getPackage().getName();

		TClass tClass = createTClass(classKey);
		createPackagesFor(packageName);

		packageToClasses.get(packageName).add(classKey);

		if (node.getSuperclassType() != null) {
			String parentClassKey = node.getSuperclassType().resolveBinding().getKey();
			TClass parentClass = createTClass(parentClassKey);

			classAndParent.put(classKey, parentClassKey);
		}

		return super.visit(node);
	}

	protected TClass createTClass(String classKey) {
		TClass tClass;

		if (classes.containsKey(classKey)) {
			tClass = classes.get(classKey);
		} else {
			tClass = factory.createTClass();
			typeGraph.getClasses().add(tClass);
			tClass.setTName(classKey);

			classes.put(classKey, tClass);
		}
		return tClass;
	}

	protected void connectClasses() {
		// Set packages
		packageToClasses.keys().forEach(
				(packageKey) -> {
					TPackage tPackage = (TPackage) packages.get(packageKey);

					packageToClasses.get(packageKey).forEach(
							(classKey) -> {
								((TClass) classes.get(classKey)).setPackage(tPackage);
							}
					);
				}
		);

		// Set the parent, if given
		classAndParent.keySet().forEach(
				(classKey) -> {
					TClass tClass = (TClass) classes.get(classKey);
					TClass parent = (TClass) classes.get(classAndParent.get(classKey));
					tClass.setParentClass(parent);
				}
		);

		classSignatures.keys().forEach(
				classKey -> {
					TClass tClass = createTClass(classKey);

					classSignatures.get(classKey).forEach(
							signature -> {
								tClass.getSignature().add(signature);
							}
					);
				}
		);
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// METHODS
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	@Override
	public boolean visit(MethodDeclaration node) {
		String methodName = node.getName().toString();
		String fullSignature = node.resolveBinding().getKey();
		String signature = Splitter.on(';').limit(2).splitToList(fullSignature).get(1);

		TMethod tMethod = createTMethod(methodName);
		TMethodSignature tMethodSignature = createTMethodSignature(signature);

		tMethodSignature.setMethod(tMethod);
		EList<TClass> paramList = tMethodSignature.getParamList();

		if (paramList.isEmpty()) {
			node.parameters().forEach(
					(variableDeclaration) -> {
						try {
							SingleVariableDeclaration declaration = (SingleVariableDeclaration)
									variableDeclaration;

							ITypeBinding typeBinding = declaration.getType().resolveBinding();
							String classKey = null;
							if (typeBinding != null) {
								classKey = typeBinding.getKey();
							} else {
								classKey = typeBinding.getName();
							}

							TClass parameterTClass = createTClass(classKey);
							paramList.add(parameterTClass);
						} catch (Exception e) {
						}
					}
			);
		}

		try {
			String classKey = ((TypeDeclaration) node.getParent()).resolveBinding().getKey();
			classSignatures.get(classKey).add(tMethodSignature);

			TClass tClass = createTClass(classKey);
			TMethodDefinition tMethodDefinition = createTMethodDefinition(fullSignature);

			if (!node.isConstructor()) {
				String returnKey = node.getReturnType2().resolveBinding().getKey();
				TClass returnType = createTClass(returnKey);
				tMethodDefinition.setReturnType(returnType);
			}

			tMethodDefinition.setSignature(tMethodSignature);

			/// overload, override not needed in the solution
			// tMethodDefinition.setOverriding();
			// tMethodDefinition.getOverloadedBy();

			tClass.getDefines().add(tMethodDefinition);
			memberDeclarations.put(fullSignature, tMethodDefinition);
		} catch (Exception e) {
		}

		return super.visit(node);
	}

	protected TMethodDefinition createTMethodDefinition(String fullSignature) {
		TMethodDefinition tMethodDefinition;
		if (memberDeclarations.containsKey(fullSignature)) {
			tMethodDefinition = (TMethodDefinition) memberDeclarations.get(fullSignature);
		} else {
			tMethodDefinition = factory.createTMethodDefinition();
			memberDeclarations.put(fullSignature, tMethodDefinition);
		}
		return tMethodDefinition;
	}

	protected TMethodSignature createTMethodSignature(String signature) {
		TMethodSignature tMethodSignature;
		if (methodSignatures.containsKey(signature)) {
			tMethodSignature = methodSignatures.get(signature);
		} else {
			tMethodSignature = factory.createTMethodSignature();
			methodSignatures.put(signature, tMethodSignature);
		}
		return tMethodSignature;
	}

	protected TMethod createTMethod(String methodName) {
		TMethod tMethod;
		if (methods.containsKey(methodName)) {
			tMethod = methods.get(methodName);
		} else {
			tMethod = factory.createTMethod();
			tMethod.setTName(methodName);
			typeGraph.getMethods().add(tMethod);

			methods.put(methodName, tMethod);
		}
		return tMethod;
	}

	protected void connectMemberAccesses() {
		memberAccesses.keys().forEach(
				methodKey -> {
					memberAccesses.get(methodKey).forEach(
							memberKey -> {
								// do not connect the method to itself
								if (memberDeclarations.containsKey(memberKey) && methodKey != memberKey) {
									TMember tMethodDefinition = memberDeclarations.get(methodKey);
									TMember tFieldDefinition = memberDeclarations.get(memberKey);

									tMethodDefinition.getAccess().add(tFieldDefinition);
								}
							}
					);
				}
		);
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// FIELDS
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	@Override
	public boolean visit(FieldDeclaration node) {
		String fieldName = ((VariableDeclarationFragment) node.fragments().get(0)).resolveBinding().getKey();
		String typeKey = node.getType().resolveBinding().getKey();
		String parentKey = ((TypeDeclaration) node.getParent()).resolveBinding().getKey();
		String fieldKey = fieldName;

		TField tField = createTField(fieldName);
		typeGraph.getFields().add(tField);

		TClass tClass = createTClass(typeKey);

		TFieldSignature tFieldSignature = createTFieldSignature(fieldKey);

		tFieldSignature.setField(tField);
		tFieldSignature.setType(tClass);

		TClass parentClass = createTClass(parentKey);
		classSignatures.get(parentKey).add(tFieldSignature);

		TFieldDefinition tFieldDefinition = factory.createTFieldDefinition();
		tFieldDefinition.setSignature(tFieldSignature);

		parentClass.getDefines().add(tFieldDefinition);
		memberDeclarations.put(fieldKey, tFieldDefinition);
		
		return super.visit(node);
	}

	protected TFieldSignature createTFieldSignature(String fieldKey) {
		TFieldSignature tFieldSignature;
		if (tFieldSignatures.containsKey(fieldKey)) {
			tFieldSignature = tFieldSignatures.get(fieldKey);
		} else {
			tFieldSignature = factory.createTFieldSignature();
			tFieldSignatures.put(fieldKey, tFieldSignature);
		}
		return tFieldSignature;
	}

	protected TField createTField(String fieldName) {
		TField tField;
		if (fields.containsKey(fieldName)) {
			tField = fields.get(fieldName);
		} else {
			tField = factory.createTField();
			tField.setTName(fieldName);
			fields.put(fieldName, tField);
		}

		typeGraph.getFields().add(tField);

		return tField;
	}

	@Override
	public boolean visit(SimpleName node) {
		String simpleNameKey = node.resolveBinding().getKey();
		MethodDeclaration methodDeclaration = (MethodDeclaration) findNearestParent(node, ASTNode.METHOD_DECLARATION);

		if (methodDeclaration != null) {
			String methodKey = methodDeclaration.resolveBinding().getKey();
			memberAccesses.get(methodKey).add(simpleNameKey);
		}
		return super.visit(node);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// UTIL
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	protected Object findNearestParent(ASTNode node, int astNodeType) {
		while (node.getParent() != null && node.getParent().getNodeType() != astNodeType) {
			node = node.getParent();
		}

		if (node.getParent() != null) {
			return ASTNode.nodeClassForType(astNodeType).cast(node.getParent());
		}

		return null;
	}
	
	public void finish() {
		connectPackages();
		connectClasses();
		connectMemberAccesses();
	}
}