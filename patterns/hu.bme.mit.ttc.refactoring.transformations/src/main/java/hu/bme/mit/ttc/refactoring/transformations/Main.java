package hu.bme.mit.ttc.refactoring.transformations;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import TypeGraphBasic.TypeGraphBasicPackage;

public class Main {
	public static void main(String[] args) throws IncQueryException, IOException {
		// Initializing the EMF package
		TypeGraphBasicPackage.eINSTANCE.getName();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("pg", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

		ResourceSet set = new ResourceSetImpl();
//		URI uri = URI.createFileURI("My.petrinet");
//		set.getResource(uri, true);

//		final AdvancedIncQueryEngine engine = AdvancedIncQueryEngine.createUnmanagedEngine(new EMFScope(set));

//		Runnable executeSimulation = new Runnable() {
//
//			@Override
//			public void run() {
//				PetriNetSimulator simulator = new PetriNetSimulator(engine);
//				simulator.fire(10);
//			}
//		};
//		new Thread(executeSimulation).start();
	}
}
