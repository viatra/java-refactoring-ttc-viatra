package hu.bme.mit.ttc.refactoring.transformations;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import TypeGraphBasic.TypeGraphBasicPackage;

public class Main {
	public static void main(String[] args) throws IncQueryException, IOException {
		// Initializing the EMF package
		TypeGraphBasicPackage.eINSTANCE.getName();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("typegraphbasic", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createFileURI("min_sample_wo_overload.typegraphbasic");
		set.getResource(uri, true);

		final AdvancedIncQueryEngine engine = AdvancedIncQueryEngine.createUnmanagedEngine(new EMFScope(set));

		Runnable executeRefactoring = new Runnable() {
			@Override
			public void run() {
				RefactoringTransformation transformation = new RefactoringTransformation(engine);
				transformation.fire();
			}
		};
		new Thread(executeRefactoring).start();
	}
}
