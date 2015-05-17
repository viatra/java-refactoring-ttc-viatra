/**
 */
package TypeGraphTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TypeGraphTrace.TypeGraphTraceFactory
 * @model kind="package"
 * @generated
 */
public interface TypeGraphTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TypeGraphTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TypeGraphTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeGraphTracePackage eINSTANCE = TypeGraphTrace.impl.TypeGraphTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link TypeGraphTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphTrace.impl.TraceImpl
	 * @see TypeGraphTrace.impl.TypeGraphTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Program Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PROGRAM_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Method Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__METHOD_SIGNATURES = 1;

	/**
	 * The feature id for the '<em><b>Class Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__CLASS_LISTS = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphTrace.impl.MethodSignatureTraceImpl <em>Method Signature Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphTrace.impl.MethodSignatureTraceImpl
	 * @see TypeGraphTrace.impl.TypeGraphTracePackageImpl#getMethodSignatureTrace()
	 * @generated
	 */
	int METHOD_SIGNATURE_TRACE = 1;

	/**
	 * The feature id for the '<em><b>TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Signature String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_TRACE__SIGNATURE_STRING = 1;

	/**
	 * The number of structural features of the '<em>Method Signature Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Method Signature Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_TRACE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link TypeGraphTrace.impl.ClassListTraceImpl <em>Class List Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphTrace.impl.ClassListTraceImpl
	 * @see TypeGraphTrace.impl.TypeGraphTracePackageImpl#getClassListTrace()
	 * @generated
	 */
	int CLASS_LIST_TRACE = 2;

	/**
	 * The feature id for the '<em><b>TClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_TRACE__TCLASSES = 0;

	/**
	 * The feature id for the '<em><b>Concat Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_TRACE__CONCAT_SIGNATURE = 1;

	/**
	 * The number of structural features of the '<em>Class List Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class List Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link TypeGraphTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see TypeGraphTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference '{@link TypeGraphTrace.Trace#getProgramGraph <em>Program Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Graph</em>'.
	 * @see TypeGraphTrace.Trace#getProgramGraph()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ProgramGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphTrace.Trace#getMethodSignatures <em>Method Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Signatures</em>'.
	 * @see TypeGraphTrace.Trace#getMethodSignatures()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_MethodSignatures();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphTrace.Trace#getClassLists <em>Class Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Lists</em>'.
	 * @see TypeGraphTrace.Trace#getClassLists()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ClassLists();

	/**
	 * Returns the meta object for class '{@link TypeGraphTrace.MethodSignatureTrace <em>Method Signature Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Signature Trace</em>'.
	 * @see TypeGraphTrace.MethodSignatureTrace
	 * @generated
	 */
	EClass getMethodSignatureTrace();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphTrace.MethodSignatureTrace#getTMethodSignature <em>TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMethod Signature</em>'.
	 * @see TypeGraphTrace.MethodSignatureTrace#getTMethodSignature()
	 * @see #getMethodSignatureTrace()
	 * @generated
	 */
	EReference getMethodSignatureTrace_TMethodSignature();

	/**
	 * Returns the meta object for the attribute '{@link TypeGraphTrace.MethodSignatureTrace#getSignatureString <em>Signature String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature String</em>'.
	 * @see TypeGraphTrace.MethodSignatureTrace#getSignatureString()
	 * @see #getMethodSignatureTrace()
	 * @generated
	 */
	EAttribute getMethodSignatureTrace_SignatureString();

	/**
	 * Returns the meta object for class '{@link TypeGraphTrace.ClassListTrace <em>Class List Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class List Trace</em>'.
	 * @see TypeGraphTrace.ClassListTrace
	 * @generated
	 */
	EClass getClassListTrace();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphTrace.ClassListTrace#getTClasses <em>TClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TClasses</em>'.
	 * @see TypeGraphTrace.ClassListTrace#getTClasses()
	 * @see #getClassListTrace()
	 * @generated
	 */
	EReference getClassListTrace_TClasses();

	/**
	 * Returns the meta object for the attribute '{@link TypeGraphTrace.ClassListTrace#getConcatSignature <em>Concat Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concat Signature</em>'.
	 * @see TypeGraphTrace.ClassListTrace#getConcatSignature()
	 * @see #getClassListTrace()
	 * @generated
	 */
	EAttribute getClassListTrace_ConcatSignature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeGraphTraceFactory getTypeGraphTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TypeGraphTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphTrace.impl.TraceImpl
		 * @see TypeGraphTrace.impl.TypeGraphTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Program Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PROGRAM_GRAPH = eINSTANCE.getTrace_ProgramGraph();

		/**
		 * The meta object literal for the '<em><b>Method Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__METHOD_SIGNATURES = eINSTANCE.getTrace_MethodSignatures();

		/**
		 * The meta object literal for the '<em><b>Class Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__CLASS_LISTS = eINSTANCE.getTrace_ClassLists();

		/**
		 * The meta object literal for the '{@link TypeGraphTrace.impl.MethodSignatureTraceImpl <em>Method Signature Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphTrace.impl.MethodSignatureTraceImpl
		 * @see TypeGraphTrace.impl.TypeGraphTracePackageImpl#getMethodSignatureTrace()
		 * @generated
		 */
		EClass METHOD_SIGNATURE_TRACE = eINSTANCE.getMethodSignatureTrace();

		/**
		 * The meta object literal for the '<em><b>TMethod Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE = eINSTANCE.getMethodSignatureTrace_TMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Signature String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SIGNATURE_TRACE__SIGNATURE_STRING = eINSTANCE.getMethodSignatureTrace_SignatureString();

		/**
		 * The meta object literal for the '{@link TypeGraphTrace.impl.ClassListTraceImpl <em>Class List Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphTrace.impl.ClassListTraceImpl
		 * @see TypeGraphTrace.impl.TypeGraphTracePackageImpl#getClassListTrace()
		 * @generated
		 */
		EClass CLASS_LIST_TRACE = eINSTANCE.getClassListTrace();

		/**
		 * The meta object literal for the '<em><b>TClasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LIST_TRACE__TCLASSES = eINSTANCE.getClassListTrace_TClasses();

		/**
		 * The meta object literal for the '<em><b>Concat Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LIST_TRACE__CONCAT_SIGNATURE = eINSTANCE.getClassListTrace_ConcatSignature();

	}

} //TypeGraphTracePackage
