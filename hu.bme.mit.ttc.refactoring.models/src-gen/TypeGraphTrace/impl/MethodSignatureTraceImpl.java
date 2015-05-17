/**
 */
package TypeGraphTrace.impl;

import TypeGraphBasic.TMethodSignature;

import TypeGraphTrace.MethodSignatureTrace;
import TypeGraphTrace.TypeGraphTracePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Signature Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphTrace.impl.MethodSignatureTraceImpl#getTMethodSignature <em>TMethod Signature</em>}</li>
 *   <li>{@link TypeGraphTrace.impl.MethodSignatureTraceImpl#getSignatureString <em>Signature String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodSignatureTraceImpl extends MinimalEObjectImpl.Container implements MethodSignatureTrace {
	/**
	 * The cached value of the '{@link #getTMethodSignature() <em>TMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMethodSignature()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature tMethodSignature;

	/**
	 * The default value of the '{@link #getSignatureString() <em>Signature String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureString()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureString() <em>Signature String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureString()
	 * @generated
	 * @ordered
	 */
	protected String signatureString = SIGNATURE_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphTracePackage.Literals.METHOD_SIGNATURE_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature getTMethodSignature() {
		if (tMethodSignature != null && tMethodSignature.eIsProxy()) {
			InternalEObject oldTMethodSignature = (InternalEObject)tMethodSignature;
			tMethodSignature = (TMethodSignature)eResolveProxy(oldTMethodSignature);
			if (tMethodSignature != oldTMethodSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE, oldTMethodSignature, tMethodSignature));
			}
		}
		return tMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetTMethodSignature() {
		return tMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTMethodSignature(TMethodSignature newTMethodSignature) {
		TMethodSignature oldTMethodSignature = tMethodSignature;
		tMethodSignature = newTMethodSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE, oldTMethodSignature, tMethodSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignatureString() {
		return signatureString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureString(String newSignatureString) {
		String oldSignatureString = signatureString;
		signatureString = newSignatureString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__SIGNATURE_STRING, oldSignatureString, signatureString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE:
				if (resolve) return getTMethodSignature();
				return basicGetTMethodSignature();
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__SIGNATURE_STRING:
				return getSignatureString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE:
				setTMethodSignature((TMethodSignature)newValue);
				return;
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__SIGNATURE_STRING:
				setSignatureString((String)newValue);
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
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE:
				setTMethodSignature((TMethodSignature)null);
				return;
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__SIGNATURE_STRING:
				setSignatureString(SIGNATURE_STRING_EDEFAULT);
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
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__TMETHOD_SIGNATURE:
				return tMethodSignature != null;
			case TypeGraphTracePackage.METHOD_SIGNATURE_TRACE__SIGNATURE_STRING:
				return SIGNATURE_STRING_EDEFAULT == null ? signatureString != null : !SIGNATURE_STRING_EDEFAULT.equals(signatureString);
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
		result.append(" (signatureString: ");
		result.append(signatureString);
		result.append(')');
		return result.toString();
	}

} //MethodSignatureTraceImpl
