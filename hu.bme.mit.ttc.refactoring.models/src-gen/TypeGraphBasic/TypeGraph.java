/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphBasic.TypeGraph#getPackages <em>Packages</em>}</li>
 *   <li>{@link TypeGraphBasic.TypeGraph#getMethods <em>Methods</em>}</li>
 *   <li>{@link TypeGraphBasic.TypeGraph#getFields <em>Fields</em>}</li>
 *   <li>{@link TypeGraphBasic.TypeGraph#getClasses <em>Classes</em>}</li>
 *   <li>{@link TypeGraphBasic.TypeGraph#getTName <em>TName</em>}</li>
 * </ul>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTypeGraph()
 * @model
 * @generated
 */
public interface TypeGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphBasic.TPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTypeGraph_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<TPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTypeGraph_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphBasic.TField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTypeGraph_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<TField> getFields();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphBasic.TClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTypeGraph_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TClass> getClasses();

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
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTypeGraph_TName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTName();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TypeGraph#getTName <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TName</em>' attribute.
	 * @see #getTName()
	 * @generated
	 */
	void setTName(String value);

} // TypeGraph
