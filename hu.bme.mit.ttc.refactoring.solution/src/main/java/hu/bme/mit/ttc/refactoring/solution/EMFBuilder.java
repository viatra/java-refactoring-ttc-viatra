package hu.bme.mit.ttc.refactoring.solution;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FileASTRequestor;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.internal.compiler.impl.CompilerOptions;

import TypeGraphBasic.TypeGraphBasicPackage;
import TypeGraphTrace.TypeGraphTracePackage;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Utility class for initializing the EMF environment turning the Eclipse JDT into PG.
 */
public class EMFBuilder {

	protected ResourceSet resourceSet;

	public EMFBuilder() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("typegraphbasic", new XMLResourceFactoryImpl());

		resourceSet = new ResourceSetImpl();
		TypeGraphBasicPackage.eINSTANCE.eClass();
		TypeGraphTracePackage.eINSTANCE.eClass();
	}

	/**
	 * Source:
	 * https://eclipse.googlesource.com/jdt/eclipse.jdt.core/+/da9462d198d04c44908d3d49f69b725f7fd55c77/org.eclipse.jdt.core.tests.compiler/src/org/eclipse/jdt/core/tests/compiler/regression/AbstractRegressionTest.java?autodive=0%2F%2F
	 */
	public static Map<String, String> getCompilerOptions() {
		Map<String, String> defaultOptions = new HashMap<>();
		defaultOptions.put(CompilerOptions.OPTION_LocalVariableAttribute, CompilerOptions.GENERATE);
		defaultOptions.put(CompilerOptions.OPTION_ReportUnusedPrivateMember, CompilerOptions.WARNING);
		defaultOptions.put(CompilerOptions.OPTION_ReportUnusedImport, CompilerOptions.WARNING);
		defaultOptions.put(CompilerOptions.OPTION_ReportLocalVariableHiding, CompilerOptions.WARNING);
		defaultOptions.put(CompilerOptions.OPTION_ReportFieldHiding, CompilerOptions.WARNING);
		defaultOptions.put(CompilerOptions.OPTION_ReportPossibleAccidentalBooleanAssignment, CompilerOptions.WARNING);
		defaultOptions.put(CompilerOptions.OPTION_ReportSyntheticAccessEmulation, CompilerOptions.WARNING);
		defaultOptions.put(CompilerOptions.OPTION_PreserveUnusedLocal, CompilerOptions.PRESERVE);
		defaultOptions.put(CompilerOptions.OPTION_ReportUnnecessaryElse, CompilerOptions.WARNING);
		defaultOptions.put(CompilerOptions.OPTION_ReportDeadCode, CompilerOptions.WARNING);
		return defaultOptions;
	}

	public static void initParser(ASTParser parser) {
		Map<String, String> options = getCompilerOptions();

		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_7);
		options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_1_7);
		options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_7);

		JavaCore.setComplianceOptions(JavaCore.VERSION_1_7, options);
		parser.setCompilerOptions(options);

		parser.setResolveBindings(true);
		parser.setStatementsRecovery(true);
		parser.setBindingsRecovery(true);
		parser.setIgnoreMethodBodies(false);
	}

	public static BiMap<String, CompilationUnit> parseProject(ASTParser parser, Resource resource, String[] classPath, String[] sourcePath, String[] sourceFilePath) {
		BiMap<String, CompilationUnit> compilationUnits = HashBiMap.create();

		parser.setEnvironment(classPath, sourcePath, null, true);
		CollectorVisitor visitor = new CollectorVisitor(resource);
		visitor.init();

		parser.createASTs(sourceFilePath, null, new String[] {}, new FileASTRequestor() {
			@Override
			public void acceptAST(String sourceFilePath, CompilationUnit ast) {
				super.acceptAST(sourceFilePath, ast);

				compilationUnits.put(sourceFilePath, ast);
				ast.accept(visitor);
			}

			@Override
			public void acceptBinding(String bindingKey, IBinding binding) {
				super.acceptBinding(bindingKey, binding);
			}
		}, null);

		visitor.finish();
		return compilationUnits;
	}
	

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	public Resource createResource(String path) {
		return resourceSet.createResource(URI.createURI(path));
	}

}
