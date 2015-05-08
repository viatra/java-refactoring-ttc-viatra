package hu.bme.mit.ttc.refactoring;

import java.util.Scanner;

public class TransformationsMain {
	// public static void main(String[] args) throws IncQueryException, IOException {
	// // Initializing the EMF package
	// TypeGraphBasicPackage.eINSTANCE.getName();
	// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("typegraphbasic", new XMIResourceFactoryImpl());
	// Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());
	//
	// ResourceSet set = new ResourceSetImpl();
	// URI uri = URI.createFileURI("min_sample_wo_overload.typegraphbasic");
	// set.getResource(uri, true);
	//
	// final AdvancedIncQueryEngine engine = AdvancedIncQueryEngine.createUnmanagedEngine(new EMFScope(set));
	//
	// Runnable executeRefactoring = new Runnable() {
	// @Override
	// public void run() {
	// RefactoringTransformation transformation = new RefactoringTransformation(engine);
	// transformation.fire();
	// }
	// };
	// new Thread(executeRefactoring).start();
	// }

	public static void main(String[] args) {
		getBool("A");
		getBool("B");
		getBool("C");
	}

	static boolean getBool(String text) {
		//        switch (JOptionPane.showInputDialog(text + "\n\nEnter \"true\" or \"false\"")) { //$NON-NLS-1$
		// case "true":
		//                return true; //$NON-NLS-1$
		// case "false":
		//                return false; //$NON-NLS-1$	
		// default:
		//                return getBool("Wrong input. Retry:\n\n" + text); //$NON-NLS-1$
		// }

		Scanner scanner = new Scanner(System.in);
		System.out.print(text + "\n\nEnter \"(t)rue\" or \"(f)alse\": ");
		String answer = scanner.next();

		if (answer.isEmpty()) {
			return getBool(text);
		}

		switch (answer.substring(0, 1).toLowerCase()) {
		case "t":
			return true;
		case "f":
			return false;
		default:
			return getBool("Wrong input. Retry:\n\n" + text);
		}
	}
}
