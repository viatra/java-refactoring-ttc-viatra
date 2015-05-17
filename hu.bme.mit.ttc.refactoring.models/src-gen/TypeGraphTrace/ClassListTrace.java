/**
 */
package TypeGraphTrace;

import TypeGraphBasic.TClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class List Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphTrace.ClassListTrace#getTClasses <em>TClasses</em>}</li>
 *   <li>{@link TypeGraphTrace.ClassListTrace#getConcatSignature <em>Concat Signature</em>}</li>
 * </ul>
 *
 * @see TypeGraphTrace.TypeGraphTracePackage#getClassListTrace()
 * @model
 * @generated
 */
public interface ClassListTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>TClasses</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TClasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TClasses</em>' reference list.
	 * @see TypeGraphTrace.TypeGraphTracePackage#getClassListTrace_TClasses()
	 * @model
	 * @generated
	 */
	EList<TClass> getTClasses();

	/**
	 * Returns the value of the '<em><b>Concat Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concat Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concat Signature</em>' attribute.
	 * @see #setConcatSignature(String)
	 * @see TypeGraphTrace.TypeGraphTracePackage#getClassListTrace_ConcatSignature()
	 * @model id="true"
	 * @generated
	 */
	String getConcatSignature();

	/**
	 * Sets the value of the '{@link TypeGraphTrace.ClassListTrace#getConcatSignature <em>Concat Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concat Signature</em>' attribute.
	 * @see #getConcatSignature()
	 * @generated
	 */
	void setConcatSignature(String value);

} // ClassListTrace
