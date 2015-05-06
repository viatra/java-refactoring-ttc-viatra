/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TypeGraphBasic.TPackage#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link TypeGraphBasic.TPackage#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link TypeGraphBasic.TPackage#getParent <em>Parent</em>}</li>
 *   <li>{@link TypeGraphBasic.TPackage#getTName <em>TName</em>}</li>
 * </ul>
 * </p>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTPackage()
 * @model
 * @generated
 */
public interface TPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Classes</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TClass}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Classes</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTPackage_ContainedClasses()
	 * @see TypeGraphBasic.TClass#getPackage
	 * @model opposite="package"
	 * @generated
	 */
	EList<TClass> getContainedClasses();

	/**
	 * Returns the value of the '<em><b>Subpackage</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphBasic.TPackage}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpackage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackage</em>' containment reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTPackage_Subpackage()
	 * @see TypeGraphBasic.TPackage#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TPackage> getSubpackage();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TPackage#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TPackage)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTPackage_Parent()
	 * @see TypeGraphBasic.TPackage#getSubpackage
	 * @model opposite="subpackage" transient="false"
	 * @generated
	 */
	TPackage getParent();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TPackage#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TPackage value);

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
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTPackage_TName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTName();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TPackage#getTName <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TName</em>' attribute.
	 * @see #getTName()
	 * @generated
	 */
	void setTName(String value);

} // TPackage
