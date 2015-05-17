package hu.bme.mit.ttc.refactoring.solution;

import java.io.IOException;

public class TransformationsMain {
	
	public static void main(String[] args) {
		ViatraTransformator transformator = new ViatraTransformator("/tmp", "/tmp", "/tmp");
		try {
			String src = "/home/szarnyasg/git/java-refactoring-ttc-viatra/java-refactoring-ttc-viatra-solution/src/main/java/hu/bme/mit/ttc/refactoring";
			transformator.transformToPG(src);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
//	public static void main(String[] args) throws IncQueryException, IOException {
//		// Initializing the EMF package
//		TypeGraphBasicPackage.eINSTANCE.getName();
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("typegraphbasic", new XMIResourceFactoryImpl());
//		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());
//
//		ResourceSet set = new ResourceSetImpl();
//		URI uri = URI.createFileURI("min_sample_wo_overload.typegraphbasic");
//		set.getResource(uri, true);
//
//		final AdvancedIncQueryEngine engine = AdvancedIncQueryEngine.createUnmanagedEngine(new EMFScope(set));
//
//		Runnable executeRefactoring = new Runnable() {
//			@Override
//			public void run() {
////				RefactoringTransformation transformation = new RefactoringTransformation(engine);
////				transformation.fire();
//			}
//		};
//		new Thread(executeRefactoring).start();
//	}

}
