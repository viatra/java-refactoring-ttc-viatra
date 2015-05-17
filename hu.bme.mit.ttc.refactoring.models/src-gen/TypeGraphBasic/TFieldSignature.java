/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphBasic.TFieldSignature#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link TypeGraphBasic.TFieldSignature#getField <em>Field</em>}</li>
 *   <li>{@link TypeGraphBasic.TFieldSignature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldSignature()
 * @model
 * @generated
 */
public interface TFieldSignature extends TSignature {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TFieldDefinition}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TFieldDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldSignature_Definitions()
	 * @see TypeGraphBasic.TFieldDefinition#getSignature
	 * @model opposite="signature"
	 * @generated
	 */
	EList<TFieldDefinition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TField#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' container reference.
	 * @see #setField(TField)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldSignature_Field()
	 * @see TypeGraphBasic.TField#getSignatures
	 * @model opposite="signatures" required="true" transient="false"
	 * @generated
	 */
	TField getField();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TFieldSignature#getField <em>Field</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' container reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(TField value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TClass)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTFieldSignature_Type()
	 * @model required="true"
	 * @generated
	 */
	TClass getType();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TFieldSignature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TClass value);

} // TFieldSignature
