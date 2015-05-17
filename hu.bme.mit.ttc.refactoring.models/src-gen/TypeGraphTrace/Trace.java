/**
 */
package TypeGraphTrace;

import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphTrace.Trace#getProgramGraph <em>Program Graph</em>}</li>
 *   <li>{@link TypeGraphTrace.Trace#getMethodSignatures <em>Method Signatures</em>}</li>
 *   <li>{@link TypeGraphTrace.Trace#getClassLists <em>Class Lists</em>}</li>
 * </ul>
 *
 * @see TypeGraphTrace.TypeGraphTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Program Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Graph</em>' containment reference.
	 * @see #setProgramGraph(TypeGraph)
	 * @see TypeGraphTrace.TypeGraphTracePackage#getTrace_ProgramGraph()
	 * @model containment="true"
	 * @generated
	 */
	TypeGraph getProgramGraph();

	/**
	 * Sets the value of the '{@link TypeGraphTrace.Trace#getProgramGraph <em>Program Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Graph</em>' containment reference.
	 * @see #getProgramGraph()
	 * @generated
	 */
	void setProgramGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>Method Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphTrace.MethodSignatureTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Signatures</em>' containment reference list.
	 * @see TypeGraphTrace.TypeGraphTracePackage#getTrace_MethodSignatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodSignatureTrace> getMethodSignatures();

	/**
	 * Returns the value of the '<em><b>Class Lists</b></em>' containment reference list.
	 * The list contents are of type {@link TypeGraphTrace.ClassListTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Lists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Lists</em>' containment reference list.
	 * @see TypeGraphTrace.TypeGraphTracePackage#getTrace_ClassLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassListTrace> getClassLists();

} // Trace
