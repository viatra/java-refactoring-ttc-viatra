/**
 */
package TypeGraphTrace.impl;

import TypeGraphBasic.TClass;

import TypeGraphTrace.ClassListTrace;
import TypeGraphTrace.TypeGraphTracePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class List Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphTrace.impl.ClassListTraceImpl#getTClasses <em>TClasses</em>}</li>
 *   <li>{@link TypeGraphTrace.impl.ClassListTraceImpl#getConcatSignature <em>Concat Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassListTraceImpl extends MinimalEObjectImpl.Container implements ClassListTrace {
	/**
	 * The cached value of the '{@link #getTClasses() <em>TClasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> tClasses;

	/**
	 * The default value of the '{@link #getConcatSignature() <em>Concat Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcatSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCAT_SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcatSignature() <em>Concat Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcatSignature()
	 * @generated
	 * @ordered
	 */
	protected String concatSignature = CONCAT_SIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassListTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphTracePackage.Literals.CLASS_LIST_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TClass> getTClasses() {
		if (tClasses == null) {
			tClasses = new EObjectResolvingEList<TClass>(TClass.class, this, TypeGraphTracePackage.CLASS_LIST_TRACE__TCLASSES);
		}
		return tClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcatSignature() {
		return concatSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcatSignature(String newConcatSignature) {
		String oldConcatSignature = concatSignature;
		concatSignature = newConcatSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphTracePackage.CLASS_LIST_TRACE__CONCAT_SIGNATURE, oldConcatSignature, concatSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeGraphTracePackage.CLASS_LIST_TRACE__TCLASSES:
				return getTClasses();
			case TypeGraphTracePackage.CLASS_LIST_TRACE__CONCAT_SIGNATURE:
				return getConcatSignature();
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
			case TypeGraphTracePackage.CLASS_LIST_TRACE__TCLASSES:
				getTClasses().clear();
				getTClasses().addAll((Collection<? extends TClass>)newValue);
				return;
			case TypeGraphTracePackage.CLASS_LIST_TRACE__CONCAT_SIGNATURE:
				setConcatSignature((String)newValue);
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
			case TypeGraphTracePackage.CLASS_LIST_TRACE__TCLASSES:
				getTClasses().clear();
				return;
			case TypeGraphTracePackage.CLASS_LIST_TRACE__CONCAT_SIGNATURE:
				setConcatSignature(CONCAT_SIGNATURE_EDEFAULT);
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
			case TypeGraphTracePackage.CLASS_LIST_TRACE__TCLASSES:
				return tClasses != null && !tClasses.isEmpty();
			case TypeGraphTracePackage.CLASS_LIST_TRACE__CONCAT_SIGNATURE:
				return CONCAT_SIGNATURE_EDEFAULT == null ? concatSignature != null : !CONCAT_SIGNATURE_EDEFAULT.equals(concatSignature);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (concatSignature: ");
		result.append(concatSignature);
		result.append(')');
		return result.toString();
	}

} //ClassListTraceImpl
