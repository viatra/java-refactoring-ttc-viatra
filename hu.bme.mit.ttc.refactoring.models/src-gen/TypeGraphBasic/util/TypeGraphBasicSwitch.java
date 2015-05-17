/**
 */
package TypeGraphBasic.util;

import TypeGraphBasic.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see TypeGraphBasic.TypeGraphBasicPackage
 * @generated
 */
public class TypeGraphBasicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypeGraphBasicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphBasicSwitch() {
		if (modelPackage == null) {
			modelPackage = TypeGraphBasicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TypeGraphBasicPackage.TCLASS: {
				TClass tClass = (TClass)theEObject;
				T result = caseTClass(tClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TFIELD: {
				TField tField = (TField)theEObject;
				T result = caseTField(tField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TFIELD_DEFINITION: {
				TFieldDefinition tFieldDefinition = (TFieldDefinition)theEObject;
				T result = caseTFieldDefinition(tFieldDefinition);
				if (result == null) result = caseTMember(tFieldDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TFIELD_SIGNATURE: {
				TFieldSignature tFieldSignature = (TFieldSignature)theEObject;
				T result = caseTFieldSignature(tFieldSignature);
				if (result == null) result = caseTSignature(tFieldSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TMEMBER: {
				TMember tMember = (TMember)theEObject;
				T result = caseTMember(tMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TMETHOD: {
				TMethod tMethod = (TMethod)theEObject;
				T result = caseTMethod(tMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TMETHOD_DEFINITION: {
				TMethodDefinition tMethodDefinition = (TMethodDefinition)theEObject;
				T result = caseTMethodDefinition(tMethodDefinition);
				if (result == null) result = caseTMember(tMethodDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TMETHOD_SIGNATURE: {
				TMethodSignature tMethodSignature = (TMethodSignature)theEObject;
				T result = caseTMethodSignature(tMethodSignature);
				if (result == null) result = caseTSignature(tMethodSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TPACKAGE: {
				TPackage tPackage = (TPackage)theEObject;
				T result = caseTPackage(tPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TYPE_GRAPH: {
				TypeGraph typeGraph = (TypeGraph)theEObject;
				T result = caseTypeGraph(typeGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypeGraphBasicPackage.TSIGNATURE: {
				TSignature tSignature = (TSignature)theEObject;
				T result = caseTSignature(tSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTClass(TClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTField(TField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFieldDefinition(TFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFieldSignature(TFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMember(TMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethod(TMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethodDefinition(TMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethodSignature(TMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPackage(TPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeGraph(TypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSignature(TSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TypeGraphBasicSwitch
