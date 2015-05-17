/**
 */
package TypeGraphBasic.util;

import TypeGraphBasic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TypeGraphBasic.TypeGraphBasicPackage
 * @generated
 */
public class TypeGraphBasicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypeGraphBasicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphBasicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypeGraphBasicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGraphBasicSwitch<Adapter> modelSwitch =
		new TypeGraphBasicSwitch<Adapter>() {
			@Override
			public Adapter caseTClass(TClass object) {
				return createTClassAdapter();
			}
			@Override
			public Adapter caseTField(TField object) {
				return createTFieldAdapter();
			}
			@Override
			public Adapter caseTFieldDefinition(TFieldDefinition object) {
				return createTFieldDefinitionAdapter();
			}
			@Override
			public Adapter caseTFieldSignature(TFieldSignature object) {
				return createTFieldSignatureAdapter();
			}
			@Override
			public Adapter caseTMember(TMember object) {
				return createTMemberAdapter();
			}
			@Override
			public Adapter caseTMethod(TMethod object) {
				return createTMethodAdapter();
			}
			@Override
			public Adapter caseTMethodDefinition(TMethodDefinition object) {
				return createTMethodDefinitionAdapter();
			}
			@Override
			public Adapter caseTMethodSignature(TMethodSignature object) {
				return createTMethodSignatureAdapter();
			}
			@Override
			public Adapter caseTPackage(TPackage object) {
				return createTPackageAdapter();
			}
			@Override
			public Adapter caseTypeGraph(TypeGraph object) {
				return createTypeGraphAdapter();
			}
			@Override
			public Adapter caseTSignature(TSignature object) {
				return createTSignatureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TClass
	 * @generated
	 */
	public Adapter createTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TField <em>TField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TField
	 * @generated
	 */
	public Adapter createTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TFieldDefinition <em>TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TFieldDefinition
	 * @generated
	 */
	public Adapter createTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TFieldSignature <em>TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TFieldSignature
	 * @generated
	 */
	public Adapter createTFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TMember <em>TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TMember
	 * @generated
	 */
	public Adapter createTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TMethod <em>TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TMethod
	 * @generated
	 */
	public Adapter createTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TMethodDefinition <em>TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TMethodDefinition
	 * @generated
	 */
	public Adapter createTMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TMethodSignature <em>TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TMethodSignature
	 * @generated
	 */
	public Adapter createTMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TPackage <em>TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TPackage
	 * @generated
	 */
	public Adapter createTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TypeGraph
	 * @generated
	 */
	public Adapter createTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TypeGraphBasic.TSignature <em>TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TypeGraphBasic.TSignature
	 * @generated
	 */
	public Adapter createTSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TypeGraphBasicAdapterFactory
