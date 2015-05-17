/**
 */
package TypeGraphTrace.impl;

import TypeGraphTrace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeGraphTraceFactoryImpl extends EFactoryImpl implements TypeGraphTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeGraphTraceFactory init() {
		try {
			TypeGraphTraceFactory theTypeGraphTraceFactory = (TypeGraphTraceFactory)EPackage.Registry.INSTANCE.getEFactory(TypeGraphTracePackage.eNS_URI);
			if (theTypeGraphTraceFactory != null) {
				return theTypeGraphTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeGraphTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphTraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypeGraphTracePackage.TRACE: return createTrace();
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE: return createMethodSignatureTrace();
			case TypeGraphTracePackage.CLASS_LIST_TRACE: return createClassListTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSignatureTrace createMethodSignatureTrace() {
		MethodSignatureTraceImpl methodSignatureTrace = new MethodSignatureTraceImpl();
		return methodSignatureTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassListTrace createClassListTrace() {
		ClassListTraceImpl classListTrace = new ClassListTraceImpl();
		return classListTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphTracePackage getTypeGraphTracePackage() {
		return (TypeGraphTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypeGraphTracePackage getPackage() {
		return TypeGraphTracePackage.eINSTANCE;
	}

} //TypeGraphTraceFactoryImpl
