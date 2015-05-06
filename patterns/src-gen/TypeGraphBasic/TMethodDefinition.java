/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TypeGraphBasic.TMethodDefinition#getSignature <em>Signature</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethodDefinition#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethodDefinition#getOverriddenBy <em>Overridden By</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethodDefinition#getOverloading <em>Overloading</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethodDefinition#getOverloadedBy <em>Overloaded By</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethodDefinition#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodDefinition()
 * @model
 * @generated
 */
public interface TMethodDefinition extends TMember {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethodSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(TMethodSignature)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodDefinition_Signature()
	 * @see TypeGraphBasic.TMethodSignature#getDefinitions
	 * @model opposite="definitions" required="true"
	 * @generated
	 */
	TMethodSignature getSignature();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TMethodDefinition#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>Overriding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethodDefinition#getOverriddenBy <em>Overridden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overriding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overriding</em>' reference.
	 * @see #setOverriding(TMethodDefinition)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodDefinition_Overriding()
	 * @see TypeGraphBasic.TMethodDefinition#getOverriddenBy
	 * @model opposite="overriddenBy"
	 * @generated
	 */
	TMethodDefinition getOverriding();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TMethodDefinition#getOverriding <em>Overriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overriding</em>' reference.
	 * @see #getOverriding()
	 * @generated
	 */
	void setOverriding(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>Overridden By</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethodDefinition#getOverriding <em>Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden By</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodDefinition_OverriddenBy()
	 * @see TypeGraphBasic.TMethodDefinition#getOverriding
	 * @model opposite="overriding"
	 * @generated
	 */
	EList<TMethodDefinition> getOverriddenBy();

	/**
	 * Returns the value of the '<em><b>Overloading</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethodDefinition#getOverloadedBy <em>Overloaded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overloading</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overloading</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodDefinition_Overloading()
	 * @see TypeGraphBasic.TMethodDefinition#getOverloadedBy
	 * @model opposite="overloadedBy"
	 * @generated
	 */
	EList<TMethodDefinition> getOverloading();

	/**
	 * Returns the value of the '<em><b>Overloaded By</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethodDefinition#getOverloading <em>Overloading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overloaded By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overloaded By</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodDefinition_OverloadedBy()
	 * @see TypeGraphBasic.TMethodDefinition#getOverloading
	 * @model opposite="overloading"
	 * @generated
	 */
	EList<TMethodDefinition> getOverloadedBy();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(TClass)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodDefinition_ReturnType()
	 * @model
	 * @generated
	 */
	TClass getReturnType();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TMethodDefinition#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TClass value);

} // TMethodDefinition
