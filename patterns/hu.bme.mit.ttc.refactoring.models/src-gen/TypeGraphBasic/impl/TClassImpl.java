/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMember;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TSignature;
import TypeGraphBasic.TypeGraphBasicPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TClassImpl#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TClassImpl#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TClassImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TClassImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TClassImpl#getTName <em>TName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TClassImpl extends EObjectImpl implements TClass {
	/**
	 * The cached value of the '{@link #getParentClass() <em>Parent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClass()
	 * @generated
	 * @ordered
	 */
	protected TClass parentClass;

	/**
	 * The cached value of the '{@link #getChildClasses() <em>Child Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> childClasses;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> signature;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage package_;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> defines;

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
	protected TClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getParentClass() {
		if (parentClass != null && parentClass.eIsProxy()) {
			InternalEObject oldParentClass = (InternalEObject) parentClass;
			parentClass = (TClass) eResolveProxy(oldParentClass);
			if (parentClass != oldParentClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TCLASS__PARENT_CLASS, oldParentClass,
							parentClass));
			}
		}
		return parentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetParentClass() {
		return parentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentClass(TClass newParentClass, NotificationChain msgs) {
		TClass oldParentClass = parentClass;
		parentClass = newParentClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TCLASS__PARENT_CLASS,
					oldParentClass, newParentClass);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentClass(TClass newParentClass) {
		if (newParentClass != parentClass) {
			NotificationChain msgs = null;
			if (parentClass != null)
				msgs = ((InternalEObject) parentClass)
						.eInverseRemove(this, TypeGraphBasicPackage.TCLASS__CHILD_CLASSES, TClass.class, msgs);
			if (newParentClass != null)
				msgs = ((InternalEObject) newParentClass)
						.eInverseAdd(this, TypeGraphBasicPackage.TCLASS__CHILD_CLASSES, TClass.class, msgs);
			msgs = basicSetParentClass(newParentClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TCLASS__PARENT_CLASS, newParentClass,
					newParentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TClass> getChildClasses() {
		if (childClasses == null) {
			childClasses = new EObjectWithInverseResolvingEList<TClass>(TClass.class, this, TypeGraphBasicPackage.TCLASS__CHILD_CLASSES,
					TypeGraphBasicPackage.TCLASS__PARENT_CLASS);
		}
		return childClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSignature> getSignature() {
		if (signature == null) {
			signature = new EObjectResolvingEList<TSignature>(TSignature.class, this, TypeGraphBasicPackage.TCLASS__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject) package_;
			package_ = (TPackage) eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TCLASS__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(TPackage newPackage, NotificationChain msgs) {
		TPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TCLASS__PACKAGE,
					oldPackage, newPackage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(TPackage newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject) package_).eInverseRemove(this, TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES, TPackage.class,
						msgs);
			if (newPackage != null)
				msgs = ((InternalEObject) newPackage).eInverseAdd(this, TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES, TPackage.class,
						msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TCLASS__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMember> getDefines() {
		if (defines == null) {
			defines = new EObjectContainmentEList<TMember>(TMember.class, this, TypeGraphBasicPackage.TCLASS__DEFINES);
		}
		return defines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TCLASS__TNAME, oldTName, tName));
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
		case TypeGraphBasicPackage.TCLASS__PARENT_CLASS:
			if (parentClass != null)
				msgs = ((InternalEObject) parentClass)
						.eInverseRemove(this, TypeGraphBasicPackage.TCLASS__CHILD_CLASSES, TClass.class, msgs);
			return basicSetParentClass((TClass) otherEnd, msgs);
		case TypeGraphBasicPackage.TCLASS__CHILD_CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildClasses()).basicAdd(otherEnd, msgs);
		case TypeGraphBasicPackage.TCLASS__PACKAGE:
			if (package_ != null)
				msgs = ((InternalEObject) package_).eInverseRemove(this, TypeGraphBasicPackage.TPACKAGE__CONTAINED_CLASSES, TPackage.class,
						msgs);
			return basicSetPackage((TPackage) otherEnd, msgs);
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
		case TypeGraphBasicPackage.TCLASS__PARENT_CLASS:
			return basicSetParentClass(null, msgs);
		case TypeGraphBasicPackage.TCLASS__CHILD_CLASSES:
			return ((InternalEList<?>) getChildClasses()).basicRemove(otherEnd, msgs);
		case TypeGraphBasicPackage.TCLASS__PACKAGE:
			return basicSetPackage(null, msgs);
		case TypeGraphBasicPackage.TCLASS__DEFINES:
			return ((InternalEList<?>) getDefines()).basicRemove(otherEnd, msgs);
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
		case TypeGraphBasicPackage.TCLASS__PARENT_CLASS:
			if (resolve)
				return getParentClass();
			return basicGetParentClass();
		case TypeGraphBasicPackage.TCLASS__CHILD_CLASSES:
			return getChildClasses();
		case TypeGraphBasicPackage.TCLASS__SIGNATURE:
			return getSignature();
		case TypeGraphBasicPackage.TCLASS__PACKAGE:
			if (resolve)
				return getPackage();
			return basicGetPackage();
		case TypeGraphBasicPackage.TCLASS__DEFINES:
			return getDefines();
		case TypeGraphBasicPackage.TCLASS__TNAME:
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
		case TypeGraphBasicPackage.TCLASS__PARENT_CLASS:
			setParentClass((TClass) newValue);
			return;
		case TypeGraphBasicPackage.TCLASS__CHILD_CLASSES:
			getChildClasses().clear();
			getChildClasses().addAll((Collection<? extends TClass>) newValue);
			return;
		case TypeGraphBasicPackage.TCLASS__SIGNATURE:
			getSignature().clear();
			getSignature().addAll((Collection<? extends TSignature>) newValue);
			return;
		case TypeGraphBasicPackage.TCLASS__PACKAGE:
			setPackage((TPackage) newValue);
			return;
		case TypeGraphBasicPackage.TCLASS__DEFINES:
			getDefines().clear();
			getDefines().addAll((Collection<? extends TMember>) newValue);
			return;
		case TypeGraphBasicPackage.TCLASS__TNAME:
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
		case TypeGraphBasicPackage.TCLASS__PARENT_CLASS:
			setParentClass((TClass) null);
			return;
		case TypeGraphBasicPackage.TCLASS__CHILD_CLASSES:
			getChildClasses().clear();
			return;
		case TypeGraphBasicPackage.TCLASS__SIGNATURE:
			getSignature().clear();
			return;
		case TypeGraphBasicPackage.TCLASS__PACKAGE:
			setPackage((TPackage) null);
			return;
		case TypeGraphBasicPackage.TCLASS__DEFINES:
			getDefines().clear();
			return;
		case TypeGraphBasicPackage.TCLASS__TNAME:
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
		case TypeGraphBasicPackage.TCLASS__PARENT_CLASS:
			return parentClass != null;
		case TypeGraphBasicPackage.TCLASS__CHILD_CLASSES:
			return childClasses != null && !childClasses.isEmpty();
		case TypeGraphBasicPackage.TCLASS__SIGNATURE:
			return signature != null && !signature.isEmpty();
		case TypeGraphBasicPackage.TCLASS__PACKAGE:
			return package_ != null;
		case TypeGraphBasicPackage.TCLASS__DEFINES:
			return defines != null && !defines.isEmpty();
		case TypeGraphBasicPackage.TCLASS__TNAME:
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

} //TClassImpl
