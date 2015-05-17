/**
 */
package TypeGraphTrace.impl;

import TypeGraphBasic.TypeGraph;
import TypeGraphTrace.ClassListTrace;
import TypeGraphTrace.MethodSignatureTrace;
import TypeGraphTrace.Trace;
import TypeGraphTrace.TypeGraphTracePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphTrace.impl.TraceImpl#getProgramGraph <em>Program Graph</em>}</li>
 *   <li>{@link TypeGraphTrace.impl.TraceImpl#getMethodSignatures <em>Method Signatures</em>}</li>
 *   <li>{@link TypeGraphTrace.impl.TraceImpl#getClassLists <em>Class Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getProgramGraph() <em>Program Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramGraph()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph programGraph;

	/**
	 * The cached value of the '{@link #getMethodSignatures() <em>Method Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodSignatureTrace> methodSignatures;

	/**
	 * The cached value of the '{@link #getClassLists() <em>Class Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassLists()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassListTrace> classLists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph getProgramGraph() {
		return programGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramGraph(TypeGraph newProgramGraph, NotificationChain msgs) {
		TypeGraph oldProgramGraph = programGraph;
		programGraph = newProgramGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypeGraphTracePackage.TRACE__PROGRAM_GRAPH, oldProgramGraph, newProgramGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramGraph(TypeGraph newProgramGraph) {
		if (newProgramGraph != programGraph) {
			NotificationChain msgs = null;
			if (programGraph != null)
				msgs = ((InternalEObject)programGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypeGraphTracePackage.TRACE__PROGRAM_GRAPH, null, msgs);
			if (newProgramGraph != null)
				msgs = ((InternalEObject)newProgramGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypeGraphTracePackage.TRACE__PROGRAM_GRAPH, null, msgs);
			msgs = basicSetProgramGraph(newProgramGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphTracePackage.TRACE__PROGRAM_GRAPH, newProgramGraph, newProgramGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodSignatureTrace> getMethodSignatures() {
		if (methodSignatures == null) {
			methodSignatures = new EObjectContainmentEList<MethodSignatureTrace>(MethodSignatureTrace.class, this, TypeGraphTracePackage.TRACE__METHOD_SIGNATURES);
		}
		return methodSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassListTrace> getClassLists() {
		if (classLists == null) {
			classLists = new EObjectContainmentEList<ClassListTrace>(ClassListTrace.class, this, TypeGraphTracePackage.TRACE__CLASS_LISTS);
		}
		return classLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypeGraphTracePackage.TRACE__PROGRAM_GRAPH:
				return basicSetProgramGraph(null, msgs);
			case TypeGraphTracePackage.TRACE__METHOD_SIGNATURES:
				return ((InternalEList<?>)getMethodSignatures()).basicRemove(otherEnd, msgs);
			case TypeGraphTracePackage.TRACE__CLASS_LISTS:
				return ((InternalEList<?>)getClassLists()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeGraphTracePackage.TRACE__PROGRAM_GRAPH:
				return getProgramGraph();
			case TypeGraphTracePackage.TRACE__METHOD_SIGNATURES:
				return getMethodSignatures();
			case TypeGraphTracePackage.TRACE__CLASS_LISTS:
				return getClassLists();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypeGraphTracePackage.TRACE__PROGRAM_GRAPH:
				setProgramGraph((TypeGraph)newValue);
				return;
			case TypeGraphTracePackage.TRACE__METHOD_SIGNATURES:
				getMethodSignatures().clear();
				getMethodSignatures().addAll((Collection<? extends MethodSignatureTrace>)newValue);
				return;
			case TypeGraphTracePackage.TRACE__CLASS_LISTS:
				getClassLists().clear();
				getClassLists().addAll((Collection<? extends ClassListTrace>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypeGraphTracePackage.TRACE__PROGRAM_GRAPH:
				setProgramGraph((TypeGraph)null);
				return;
			case TypeGraphTracePackage.TRACE__METHOD_SIGNATURES:
				getMethodSignatures().clear();
				return;
			case TypeGraphTracePackage.TRACE__CLASS_LISTS:
				getClassLists().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypeGraphTracePackage.TRACE__PROGRAM_GRAPH:
				return programGraph != null;
			case TypeGraphTracePackage.TRACE__METHOD_SIGNATURES:
				return methodSignatures != null && !methodSignatures.isEmpty();
			case TypeGraphTracePackage.TRACE__CLASS_LISTS:
				return classLists != null && !classLists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
