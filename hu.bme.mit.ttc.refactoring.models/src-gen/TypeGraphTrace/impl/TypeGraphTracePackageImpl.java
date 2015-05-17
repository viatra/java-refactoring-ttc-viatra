/**
 */
package TypeGraphTrace.impl;

import TypeGraphBasic.TypeGraphBasicPackage;

import TypeGraphBasic.impl.TypeGraphBasicPackageImpl;

import TypeGraphTrace.ClassListTrace;
import TypeGraphTrace.MethodSignatureTrace;
import TypeGraphTrace.Trace;
import TypeGraphTrace.TypeGraphTraceFactory;
import TypeGraphTrace.TypeGraphTracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeGraphTracePackageImpl extends EPackageImpl implements TypeGraphTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSignatureTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classListTraceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TypeGraphTrace.TypeGraphTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypeGraphTracePackageImpl() {
		super(eNS_URI, TypeGraphTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TypeGraphTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypeGraphTracePackage init() {
		if (isInited) return (TypeGraphTracePackage)EPackage.Registry.INSTANCE.getEPackage(TypeGraphTracePackage.eNS_URI);

		// Obtain or create and register package
		TypeGraphTracePackageImpl theTypeGraphTracePackage = (TypeGraphTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypeGraphTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypeGraphTracePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypeGraphBasicPackageImpl theTypeGraphBasicPackage = (TypeGraphBasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypeGraphBasicPackage.eNS_URI) instanceof TypeGraphBasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypeGraphBasicPackage.eNS_URI) : TypeGraphBasicPackage.eINSTANCE);

		// Create package meta-data objects
		theTypeGraphTracePackage.createPackageContents();
		theTypeGraphBasicPackage.createPackageContents();

		// Initialize created meta-data
		theTypeGraphTracePackage.initializePackageContents();
		theTypeGraphBasicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypeGraphTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypeGraphTracePackage.eNS_URI, theTypeGraphTracePackage);
		return theTypeGraphTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ProgramGraph() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_MethodSignatures() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ClassLists() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodSignatureTrace() {
		return methodSignatureTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodSignatureTrace_TMethodSignature() {
		return (EReference)methodSignatureTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodSignatureTrace_SignatureString() {
		return (EAttribute)methodSignatureTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassListTrace() {
		return classListTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassListTrace_TClasses() {
		return (EReference)classListTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassListTrace_ConcatSignature() {
		return (EAttribute)classListTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphTraceFactory getTypeGraphTraceFactory() {
		return (TypeGraphTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__PROGRAM_GRAPH);
		createEReference(traceEClass, TRACE__METHOD_SIGNATURES);
		createEReference(traceEClass, TRACE__CLASS_LISTS);

		methodSignatureTraceEClass = createEClass(METHOD_SIGNATURE_TRACE);
		createEReference(methodSignatureTraceEClass, METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE);
		createEAttribute(methodSignatureTraceEClass, METHOD_SIGNATURE_TRACE__SIGNATURE_STRING);

		classListTraceEClass = createEClass(CLASS_LIST_TRACE);
		createEReference(classListTraceEClass, CLASS_LIST_TRACE__TCLASSES);
		createEAttribute(classListTraceEClass, CLASS_LIST_TRACE__CONCAT_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypeGraphBasicPackage theTypeGraphBasicPackage = (TypeGraphBasicPackage)EPackage.Registry.INSTANCE.getEPackage(TypeGraphBasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_ProgramGraph(), theTypeGraphBasicPackage.getTypeGraph(), null, "programGraph", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_MethodSignatures(), this.getMethodSignatureTrace(), null, "methodSignatures", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_ClassLists(), this.getClassListTrace(), null, "classLists", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodSignatureTraceEClass, MethodSignatureTrace.class, "MethodSignatureTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodSignatureTrace_TMethodSignature(), theTypeGraphBasicPackage.getTMethodSignature(), null, "tMethodSignature", null, 0, 1, MethodSignatureTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodSignatureTrace_SignatureString(), ecorePackage.getEString(), "signatureString", null, 0, 1, MethodSignatureTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classListTraceEClass, ClassListTrace.class, "ClassListTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassListTrace_TClasses(), theTypeGraphBasicPackage.getTClass(), null, "tClasses", null, 0, -1, ClassListTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassListTrace_ConcatSignature(), ecorePackage.getEString(), "concatSignature", null, 0, 1, ClassListTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TypeGraphTracePackageImpl
