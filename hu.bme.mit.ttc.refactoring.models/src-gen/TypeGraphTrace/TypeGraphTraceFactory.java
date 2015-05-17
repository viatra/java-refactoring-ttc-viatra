/**
 */
package TypeGraphTrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TypeGraphTrace.TypeGraphTracePackage
 * @generated
 */
public interface TypeGraphTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeGraphTraceFactory eINSTANCE = TypeGraphTrace.impl.TypeGraphTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Method Signature Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Signature Trace</em>'.
	 * @generated
	 */
	MethodSignatureTrace createMethodSignatureTrace();

	/**
	 * Returns a new object of class '<em>Class List Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class List Trace</em>'.
	 * @generated
	 */
	ClassListTrace createClassListTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypeGraphTracePackage getTypeGraphTracePackage();

} //TypeGraphTraceFactory
