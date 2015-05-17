/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphBasic.TFieldDefinition#getHiding <em>Hiding</em>}</li>
 *   <li>{@link TypeGraphBasic.TFieldDefinition#getHiddenBy <em>Hidden By</em>}</li>
 *   <li>{@link TypeGraphBasic.TFieldDefinition#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldDefinition()
 * @model
 * @generated
 */
public interface TFieldDefinition extends TMember {
	/**
	 * Returns the value of the '<em><b>Hiding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TFieldDefinition#getHiddenBy <em>Hidden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hiding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hiding</em>' reference.
	 * @see #setHiding(TFieldDefinition)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldDefinition_Hiding()
	 * @see TypeGraphBasic.TFieldDefinition#getHiddenBy
	 * @model opposite="hiddenBy"
	 * @generated
	 */
	TFieldDefinition getHiding();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TFieldDefinition#getHiding <em>Hiding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hiding</em>' reference.
	 * @see #getHiding()
	 * @generated
	 */
	void setHiding(TFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>Hidden By</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TFieldDefinition}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TFieldDefinition#getHiding <em>Hiding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden By</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldDefinition_HiddenBy()
	 * @see TypeGraphBasic.TFieldDefinition#getHiding
	 * @model opposite="hiding"
	 * @generated
	 */
	EList<TFieldDefinition> getHiddenBy();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TFieldSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(TFieldSignature)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldDefinition_Signature()
	 * @see TypeGraphBasic.TFieldSignature#getDefinitions
	 * @model opposite="definitions" required="true"
	 * @generated
	 */
	TFieldSignature getSignature();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TFieldDefinition#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TFieldSignature value);

} // TFieldDefinition
