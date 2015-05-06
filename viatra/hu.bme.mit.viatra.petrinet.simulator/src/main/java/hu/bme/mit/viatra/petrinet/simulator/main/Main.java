package hu.bme.mit.viatra.petrinet.simulator.main;

import hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public class Main {
	public static void main(String[] args) throws IncQueryException, IOException {
		// Initializing the EMF package
		PetriNetPackage.eINSTANCE.getName();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("petrinet", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createFileURI("My.petrinet");
		set.getResource(uri, true);

		final AdvancedIncQueryEngine engine = AdvancedIncQueryEngine.createUnmanagedEngine(new EMFScope(set));

		Runnable executeSimulation = new Runnable() {

			@Override
			public void run() {
				PetriNetSimulator simulator = new PetriNetSimulator(engine);
				simulator.fire(10);
			}
		};
		new Thread(executeSimulation).start();
	}
}
