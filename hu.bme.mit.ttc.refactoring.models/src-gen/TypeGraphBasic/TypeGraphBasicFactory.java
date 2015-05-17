/**
 */
package TypeGraphBasic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TypeGraphBasic.TypeGraphBasicPackage
 * @generated
 */
public interface TypeGraphBasicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeGraphBasicFactory eINSTANCE = TypeGraphBasic.impl.TypeGraphBasicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TClass</em>'.
	 * @generated
	 */
	TClass createTClass();

	/**
	 * Returns a new object of class '<em>TField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField</em>'.
	 * @generated
	 */
	TField createTField();

	/**
	 * Returns a new object of class '<em>TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Definition</em>'.
	 * @generated
	 */
	TFieldDefinition createTFieldDefinition();

	/**
	 * Returns a new object of class '<em>TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Signature</em>'.
	 * @generated
	 */
	TFieldSignature createTFieldSignature();

	/**
	 * Returns a new object of class '<em>TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod</em>'.
	 * @generated
	 */
	TMethod createTMethod();

	/**
	 * Returns a new object of class '<em>TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod Definition</em>'.
	 * @generated
	 */
	TMethodDefinition createTMethodDefinition();

	/**
	 * Returns a new object of class '<em>TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod Signature</em>'.
	 * @generated
	 */
	TMethodSignature createTMethodSignature();

	/**
	 * Returns a new object of class '<em>TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPackage</em>'.
	 * @generated
	 */
	TPackage createTPackage();

	/**
	 * Returns a new object of class '<em>Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Graph</em>'.
	 * @generated
	 */
	TypeGraph createTypeGraph();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypeGraphBasicPackage getTypeGraphBasicPackage();

} //TypeGraphBasicFactory
