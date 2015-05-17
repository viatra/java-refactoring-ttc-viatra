/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphBasic.TMethod#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethod#getTName <em>TName</em>}</li>
 * </ul>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethod()
 * @model
 * @generated
 */
public interface TMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMethodSignature}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethodSignature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethod_Signatures()
	 * @see TypeGraphBasic.TMethodSignature#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<TMethodSignature> getSignatures();

	/**
	 * Returns the value of the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TName</em>' attribute.
	 * @see #setTName(String)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethod_TName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTName();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TMethod#getTName <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TName</em>' attribute.
	 * @see #getTName()
	 * @generated
	 */
	void setTName(String value);

} // TMethod
