/**
 */
package TypeGraphTrace;

import TypeGraphBasic.TMethodSignature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Signature Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphTrace.MethodSignatureTrace#getTMethodSignature <em>TMethod Signature</em>}</li>
 *   <li>{@link TypeGraphTrace.MethodSignatureTrace#getSignatureString <em>Signature String</em>}</li>
 * </ul>
 *
 * @see TypeGraphTrace.TypeGraphTracePackage#getMethodSignatureTrace()
 * @model
 * @generated
 */
public interface MethodSignatureTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMethod Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMethod Signature</em>' reference.
	 * @see #setTMethodSignature(TMethodSignature)
	 * @see TypeGraphTrace.TypeGraphTracePackage#getMethodSignatureTrace_TMethodSignature()
	 * @model
	 * @generated
	 */
	TMethodSignature getTMethodSignature();

	/**
	 * Sets the value of the '{@link TypeGraphTrace.MethodSignatureTrace#getTMethodSignature <em>TMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMethod Signature</em>' reference.
	 * @see #getTMethodSignature()
	 * @generated
	 */
	void setTMethodSignature(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>Signature String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature String</em>' attribute.
	 * @see #setSignatureString(String)
	 * @see TypeGraphTrace.TypeGraphTracePackage#getMethodSignatureTrace_SignatureString()
	 * @model id="true"
	 * @generated
	 */
	String getSignatureString();

	/**
	 * Sets the value of the '{@link TypeGraphTrace.MethodSignatureTrace#getSignatureString <em>Signature String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature String</em>' attribute.
	 * @see #getSignatureString()
	 * @generated
	 */
	void setSignatureString(String value);

} // MethodSignatureTrace
