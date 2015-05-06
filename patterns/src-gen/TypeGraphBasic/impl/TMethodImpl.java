/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TypeGraphBasicPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TMethodImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodImpl#getTName <em>TName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMethodImpl extends EObjectImpl implements TMethod {
	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodSignature> signatures;

	/**
	 * The default value of the '{@link #getTName() <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTName()
	 * @generated
	 * @ordered
	 */
	protected static final String TNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTName() <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTName()
	 * @generated
	 * @ordered
	 */
	protected String tName = TNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethodSignature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentWithInverseEList<TMethodSignature>(TMethodSignature.class, this,
					TypeGraphBasicPackage.TMETHOD__SIGNATURES, TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTName() {
		return tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTName(String newTName) {
		String oldTName = tName;
		tName = newTName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TMETHOD__TNAME, oldTName, tName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TypeGraphBasicPackage.TMETHOD__SIGNATURES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSignatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TypeGraphBasicPackage.TMETHOD__SIGNATURES:
			return ((InternalEList<?>) getSignatures()).basicRemove(otherEnd, msgs);
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
		case TypeGraphBasicPackage.TMETHOD__SIGNATURES:
			return getSignatures();
		case TypeGraphBasicPackage.TMETHOD__TNAME:
			return getTName();
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
		case TypeGraphBasicPackage.TMETHOD__SIGNATURES:
			getSignatures().clear();
			getSignatures().addAll((Collection<? extends TMethodSignature>) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD__TNAME:
			setTName((String) newValue);
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
		case TypeGraphBasicPackage.TMETHOD__SIGNATURES:
			getSignatures().clear();
			return;
		case TypeGraphBasicPackage.TMETHOD__TNAME:
			setTName(TNAME_EDEFAULT);
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
		case TypeGraphBasicPackage.TMETHOD__SIGNATURES:
			return signatures != null && !signatures.isEmpty();
		case TypeGraphBasicPackage.TMETHOD__TNAME:
			return TNAME_EDEFAULT == null ? tName != null : !TNAME_EDEFAULT.equals(tName);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tName: ");
		result.append(tName);
		result.append(')');
		return result.toString();
	}

} //TMethodImpl
