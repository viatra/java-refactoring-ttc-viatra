/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TPackage;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TPackageImpl#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TPackageImpl#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TPackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TPackageImpl#getTName <em>TName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPackageImpl extends EObjectImpl implements TPackage {
	/**
	 * The cached value of the '{@link #getContainedClasses() <em>Contained Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> containedClasses;

	/**
	 * The cached value of the '{@link #getSubpackage() <em>Subpackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackage()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> subpackage;

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
	protected TPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TClass> getContainedClasses() {
		if (containedClasses == null) {
			containedClasses = new EObjectWithInverseResolvingEList<TClass>(TClass.class, this,
					TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES, TypeGraphBasicPackage.TCLASS__PACKAGE);
		}
		return containedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPackage> getSubpackage() {
		if (subpackage == null) {
			subpackage = new EObjectContainmentWithInverseEList<TPackage>(TPackage.class, this, TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE,
					TypeGraphBasicPackage.TPACKAGE__PARENT);
		}
		return subpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage getParent() {
		if (eContainerFeatureID() != TypeGraphBasicPackage.TPACKAGE__PARENT)
			return null;
		return (TPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TPackage newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, TypeGraphBasicPackage.TPACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TPackage newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != TypeGraphBasicPackage.TPACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE, TPackage.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TPACKAGE__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TPACKAGE__TNAME, oldTName, tName));
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
		case TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedClasses()).basicAdd(otherEnd, msgs);
		case TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubpackage()).basicAdd(otherEnd, msgs);
		case TypeGraphBasicPackage.TPACKAGE__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((TPackage) otherEnd, msgs);
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
		case TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES:
			return ((InternalEList<?>) getContainedClasses()).basicRemove(otherEnd, msgs);
		case TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE:
			return ((InternalEList<?>) getSubpackage()).basicRemove(otherEnd, msgs);
		case TypeGraphBasicPackage.TPACKAGE__PARENT:
			return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TypeGraphBasicPackage.TPACKAGE__PARENT:
			return eInternalContainer().eInverseRemove(this, TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE, TPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES:
			return getContainedClasses();
		case TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE:
			return getSubpackage();
		case TypeGraphBasicPackage.TPACKAGE__PARENT:
			return getParent();
		case TypeGraphBasicPackage.TPACKAGE__TNAME:
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
		case TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES:
			getContainedClasses().clear();
			getContainedClasses().addAll((Collection<? extends TClass>) newValue);
			return;
		case TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE:
			getSubpackage().clear();
			getSubpackage().addAll((Collection<? extends TPackage>) newValue);
			return;
		case TypeGraphBasicPackage.TPACKAGE__PARENT:
			setParent((TPackage) newValue);
			return;
		case TypeGraphBasicPackage.TPACKAGE__TNAME:
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
		case TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES:
			getContainedClasses().clear();
			return;
		case TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE:
			getSubpackage().clear();
			return;
		case TypeGraphBasicPackage.TPACKAGE__PARENT:
			setParent((TPackage) null);
			return;
		case TypeGraphBasicPackage.TPACKAGE__TNAME:
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
		case TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES:
			return containedClasses != null && !containedClasses.isEmpty();
		case TypeGraphBasicPackage.TPACKAGE__SUBPACKAGE:
			return subpackage != null && !subpackage.isEmpty();
		case TypeGraphBasicPackage.TPACKAGE__PARENT:
			return getParent() != null;
		case TypeGraphBasicPackage.TPACKAGE__TNAME:
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

} //TPackageImpl
