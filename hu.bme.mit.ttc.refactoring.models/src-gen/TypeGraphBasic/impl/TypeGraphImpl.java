/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TField;
import TypeGraphBasic.TMethod;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicPackage;

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
 * An implementation of the model object '<em><b>Type Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TypeGraphImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TypeGraphImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TypeGraphImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TypeGraphImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TypeGraphImpl#getTName <em>TName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeGraphImpl extends MinimalEObjectImpl.Container implements TypeGraph {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> packages;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethod> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TField> fields;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> classes;

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
	protected TypeGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TYPE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<TPackage>(TPackage.class, this, TypeGraphBasicPackage.TYPE_GRAPH__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<TMethod>(TMethod.class, this, TypeGraphBasicPackage.TYPE_GRAPH__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<TField>(TField.class, this, TypeGraphBasicPackage.TYPE_GRAPH__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<TClass>(TClass.class, this, TypeGraphBasicPackage.TYPE_GRAPH__CLASSES);
		}
		return classes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TYPE_GRAPH__TNAME, oldTName, tName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypeGraphBasicPackage.TYPE_GRAPH__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case TypeGraphBasicPackage.TYPE_GRAPH__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case TypeGraphBasicPackage.TYPE_GRAPH__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case TypeGraphBasicPackage.TYPE_GRAPH__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case TypeGraphBasicPackage.TYPE_GRAPH__PACKAGES:
				return getPackages();
			case TypeGraphBasicPackage.TYPE_GRAPH__METHODS:
				return getMethods();
			case TypeGraphBasicPackage.TYPE_GRAPH__FIELDS:
				return getFields();
			case TypeGraphBasicPackage.TYPE_GRAPH__CLASSES:
				return getClasses();
			case TypeGraphBasicPackage.TYPE_GRAPH__TNAME:
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
			case TypeGraphBasicPackage.TYPE_GRAPH__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends TPackage>)newValue);
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends TMethod>)newValue);
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends TField>)newValue);
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends TClass>)newValue);
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__TNAME:
				setTName((String)newValue);
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
			case TypeGraphBasicPackage.TYPE_GRAPH__PACKAGES:
				getPackages().clear();
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__METHODS:
				getMethods().clear();
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__FIELDS:
				getFields().clear();
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__CLASSES:
				getClasses().clear();
				return;
			case TypeGraphBasicPackage.TYPE_GRAPH__TNAME:
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
			case TypeGraphBasicPackage.TYPE_GRAPH__PACKAGES:
				return packages != null && !packages.isEmpty();
			case TypeGraphBasicPackage.TYPE_GRAPH__METHODS:
				return methods != null && !methods.isEmpty();
			case TypeGraphBasicPackage.TYPE_GRAPH__FIELDS:
				return fields != null && !fields.isEmpty();
			case TypeGraphBasicPackage.TYPE_GRAPH__CLASSES:
				return classes != null && !classes.isEmpty();
			case TypeGraphBasicPackage.TYPE_GRAPH__TNAME:
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tName: ");
		result.append(tName);
		result.append(')');
		return result.toString();
	}

} //TypeGraphImpl
