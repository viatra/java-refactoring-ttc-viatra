/**
 */
package TypeGraphBasic.impl;

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
import TypeGraphBasic.TypeGraphBasicPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeGraphBasicPackageImpl extends EPackageImpl implements TypeGraphBasicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSignatureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TypeGraphBasic.TypeGraphBasicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypeGraphBasicPackageImpl() {
		super(eNS_URI, TypeGraphBasicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TypeGraphBasicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypeGraphBasicPackage init() {
		if (isInited)
			return (TypeGraphBasicPackage) EPackage.Registry.INSTANCE.getEPackage(TypeGraphBasicPackage.eNS_URI);

		// Obtain or create and register package
		TypeGraphBasicPackageImpl theTypeGraphBasicPackage = (TypeGraphBasicPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypeGraphBasicPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new TypeGraphBasicPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTypeGraphBasicPackage.createPackageContents();

		// Initialize created meta-data
		theTypeGraphBasicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypeGraphBasicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypeGraphBasicPackage.eNS_URI, theTypeGraphBasicPackage);
		return theTypeGraphBasicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTClass() {
		return tClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_ParentClass() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_ChildClasses() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_Signature() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_Package() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_Defines() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClass_TName() {
		return (EAttribute) tClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTField() {
		return tFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTField_Signatures() {
		return (EReference) tFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTField_TName() {
		return (EAttribute) tFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFieldDefinition() {
		return tFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldDefinition_Hiding() {
		return (EReference) tFieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldDefinition_HiddenBy() {
		return (EReference) tFieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldDefinition_Signature() {
		return (EReference) tFieldDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFieldSignature() {
		return tFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldSignature_Definitions() {
		return (EReference) tFieldSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldSignature_Field() {
		return (EReference) tFieldSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldSignature_Type() {
		return (EReference) tFieldSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMember() {
		return tMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMember_Access() {
		return (EReference) tMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethod() {
		return tMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethod_Signatures() {
		return (EReference) tMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMethod_TName() {
		return (EAttribute) tMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethodDefinition() {
		return tMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_Signature() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_Overriding() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_OverriddenBy() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_Overloading() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_OverloadedBy() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_ReturnType() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethodSignature() {
		return tMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodSignature_Method() {
		return (EReference) tMethodSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodSignature_Definitions() {
		return (EReference) tMethodSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodSignature_ParamList() {
		return (EReference) tMethodSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPackage() {
		return tPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_ContainedClasses() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_Subpackage() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_Parent() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPackage_TName() {
		return (EAttribute) tPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeGraph() {
		return typeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Packages() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Methods() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Fields() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Classes() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeGraph_TName() {
		return (EAttribute) typeGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSignature() {
		return tSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphBasicFactory getTypeGraphBasicFactory() {
		return (TypeGraphBasicFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		tClassEClass = createEClass(TCLASS);
		createEReference(tClassEClass, TCLASS__PARENT_CLASS);
		createEReference(tClassEClass, TCLASS__CHILD_CLASSES);
		createEReference(tClassEClass, TCLASS__SIGNATURE);
		createEReference(tClassEClass, TCLASS__PACKAGE);
		createEReference(tClassEClass, TCLASS__DEFINES);
		createEAttribute(tClassEClass, TCLASS__TNAME);

		tFieldEClass = createEClass(TFIELD);
		createEReference(tFieldEClass, TFIELD__SIGNATURES);
		createEAttribute(tFieldEClass, TFIELD__TNAME);

		tFieldDefinitionEClass = createEClass(TFIELD_DEFINITION);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__HIDING);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__HIDDEN_BY);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__SIGNATURE);

		tFieldSignatureEClass = createEClass(TFIELD_SIGNATURE);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__DEFINITIONS);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__FIELD);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__TYPE);

		tMemberEClass = createEClass(TMEMBER);
		createEReference(tMemberEClass, TMEMBER__ACCESS);

		tMethodEClass = createEClass(TMETHOD);
		createEReference(tMethodEClass, TMETHOD__SIGNATURES);
		createEAttribute(tMethodEClass, TMETHOD__TNAME);

		tMethodDefinitionEClass = createEClass(TMETHOD_DEFINITION);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__SIGNATURE);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERRIDING);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERRIDDEN_BY);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERLOADING);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERLOADED_BY);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__RETURN_TYPE);

		tMethodSignatureEClass = createEClass(TMETHOD_SIGNATURE);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__METHOD);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__DEFINITIONS);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__PARAM_LIST);

		tPackageEClass = createEClass(TPACKAGE);
		createEReference(tPackageEClass, TPACKAGE__CONTAINED_CLASSES);
		createEReference(tPackageEClass, TPACKAGE__SUBPACKAGE);
		createEReference(tPackageEClass, TPACKAGE__PARENT);
		createEAttribute(tPackageEClass, TPACKAGE__TNAME);

		typeGraphEClass = createEClass(TYPE_GRAPH);
		createEReference(typeGraphEClass, TYPE_GRAPH__PACKAGES);
		createEReference(typeGraphEClass, TYPE_GRAPH__METHODS);
		createEReference(typeGraphEClass, TYPE_GRAPH__FIELDS);
		createEReference(typeGraphEClass, TYPE_GRAPH__CLASSES);
		createEAttribute(typeGraphEClass, TYPE_GRAPH__TNAME);

		tSignatureEClass = createEClass(TSIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tFieldDefinitionEClass.getESuperTypes().add(this.getTMember());
		tFieldSignatureEClass.getESuperTypes().add(this.getTSignature());
		tMethodDefinitionEClass.getESuperTypes().add(this.getTMember());
		tMethodSignatureEClass.getESuperTypes().add(this.getTSignature());

		// Initialize classes, features, and operations; add parameters
		initEClass(tClassEClass, TClass.class, "TClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTClass_ParentClass(), this.getTClass(), this.getTClass_ChildClasses(), "parentClass", null, 0, 1, TClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTClass_ChildClasses(), this.getTClass(), this.getTClass_ParentClass(), "childClasses", null, 0, -1, TClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTClass_Signature(), this.getTSignature(), null, "signature", null, 0, -1, TClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTClass_Package(), this.getTPackage(), this.getTPackage_ContainedClasses(), "package", null, 1, 1, TClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTClass_Defines(), this.getTMember(), null, "defines", null, 0, -1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTClass_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tFieldEClass, TField.class, "TField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTField_Signatures(), this.getTFieldSignature(), this.getTFieldSignature_Field(), "signatures", null, 0, -1,
				TField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTField_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TField.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tFieldDefinitionEClass, TFieldDefinition.class, "TFieldDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldDefinition_Hiding(), this.getTFieldDefinition(), this.getTFieldDefinition_HiddenBy(), "hiding", null, 0, 1,
				TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldDefinition_HiddenBy(), this.getTFieldDefinition(), this.getTFieldDefinition_Hiding(), "hiddenBy", null, 0,
				-1, TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldDefinition_Signature(), this.getTFieldSignature(), this.getTFieldSignature_Definitions(), "signature",
				null, 1, 1, TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFieldSignatureEClass, TFieldSignature.class, "TFieldSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldSignature_Definitions(), this.getTFieldDefinition(), this.getTFieldDefinition_Signature(), "definitions",
				null, 0, -1, TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldSignature_Field(), this.getTField(), this.getTField_Signatures(), "field", null, 1, 1,
				TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldSignature_Type(), this.getTClass(), null, "type", null, 1, 1, TFieldSignature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMemberEClass, TMember.class, "TMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMember_Access(), this.getTMember(), null, "access", null, 0, -1, TMember.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMethodEClass, TMethod.class, "TMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethod_Signatures(), this.getTMethodSignature(), this.getTMethodSignature_Method(), "signatures", null, 0, -1,
				TMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMethod_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TMethod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tMethodDefinitionEClass, TMethodDefinition.class, "TMethodDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodDefinition_Signature(), this.getTMethodSignature(), this.getTMethodSignature_Definitions(), "signature",
				null, 1, 1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_Overriding(), this.getTMethodDefinition(), this.getTMethodDefinition_OverriddenBy(),
				"overriding", null, 0, 1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_OverriddenBy(), this.getTMethodDefinition(), this.getTMethodDefinition_Overriding(),
				"overriddenBy", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_Overloading(), this.getTMethodDefinition(), this.getTMethodDefinition_OverloadedBy(),
				"overloading", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_OverloadedBy(), this.getTMethodDefinition(), this.getTMethodDefinition_Overloading(),
				"overloadedBy", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_ReturnType(), this.getTClass(), null, "returnType", null, 0, 1, TMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tMethodSignatureEClass, TMethodSignature.class, "TMethodSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodSignature_Method(), this.getTMethod(), this.getTMethod_Signatures(), "method", null, 1, 1,
				TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_Definitions(), this.getTMethodDefinition(), this.getTMethodDefinition_Signature(),
				"definitions", null, 0, -1, TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_ParamList(), this.getTClass(), null, "paramList", null, 0, -1, TMethodSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tPackageEClass, TPackage.class, "TPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPackage_ContainedClasses(), this.getTClass(), this.getTClass_Package(), "containedClasses", null, 0, -1,
				TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_Subpackage(), this.getTPackage(), this.getTPackage_Parent(), "subpackage", null, 0, -1, TPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTPackage_Parent(), this.getTPackage(), this.getTPackage_Subpackage(), "parent", null, 0, 1, TPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTPackage_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeGraphEClass, TypeGraph.class, "TypeGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeGraph_Packages(), this.getTPackage(), null, "packages", null, 0, -1, TypeGraph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_Methods(), this.getTMethod(), null, "methods", null, 0, -1, TypeGraph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_Fields(), this.getTField(), null, "fields", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_Classes(), this.getTClass(), null, "classes", null, 0, -1, TypeGraph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeGraph_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tSignatureEClass, TSignature.class, "TSignature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TypeGraphBasicPackageImpl
