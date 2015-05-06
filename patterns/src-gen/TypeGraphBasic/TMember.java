/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TypeGraphBasic.TMember#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMember()
 * @model abstract="true"
 * @generated
 */
public interface TMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMember_Access()
	 * @model
	 * @generated
	 */
	EList<TMember> getAccess();

} // TMember
