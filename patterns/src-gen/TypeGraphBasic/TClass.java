/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TypeGraphBasic.TClass#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link TypeGraphBasic.TClass#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link TypeGraphBasic.TClass#getSignature <em>Signature</em>}</li>
 *   <li>{@link TypeGraphBasic.TClass#getPackage <em>Package</em>}</li>
 *   <li>{@link TypeGraphBasic.TClass#getDefines <em>Defines</em>}</li>
 *   <li>{@link TypeGraphBasic.TClass#getTName <em>TName</em>}</li>
 * </ul>
 * </p>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTClass()
 * @model
 * @generated
 */
public interface TClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Class</em>' reference.
	 * @see #setParentClass(TClass)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTClass_ParentClass()
	 * @see TypeGraphBasic.TClass#getChildClasses
	 * @model opposite="childClasses"
	 * @generated
	 */
	TClass getParentClass();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TClass#getParentClass <em>Parent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Class</em>' reference.
	 * @see #getParentClass()
	 * @generated
	 */
	void setParentClass(TClass value);

	/**
	 * Returns the value of the '<em><b>Child Classes</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TClass}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TClass#getParentClass <em>Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Classes</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTClass_ChildClasses()
	 * @see TypeGraphBasic.TClass#getParentClass
	 * @model opposite="parentClass"
	 * @generated
	 */
	EList<TClass> getChildClasses();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTClass_Signature()
	 * @model
	 * @generated
	 */
	EList<TSignature> getSignature();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TPackage#getContainedClasses <em>Contained Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(TPackage)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTClass_Package()
	 * @see TypeGraphBasic.TPackage#getContainedClasses
	 * @model opposite="containedClasses" required="true"
	 * @generated
	 */
	TPackage getPackage();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TClass#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' containment reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTClass_Defines()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMember> getDefines();

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
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTClass_TName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTName();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TClass#getTName <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TName</em>' attribute.
	 * @see #getTName()
	 * @generated
	 */
	void setTName(String value);

} // TClass
