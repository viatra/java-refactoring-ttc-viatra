/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TypeGraphBasicPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TMethodDefinitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodDefinitionImpl#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodDefinitionImpl#getOverriddenBy <em>Overridden By</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodDefinitionImpl#getOverloading <em>Overloading</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodDefinitionImpl#getOverloadedBy <em>Overloaded By</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMethodDefinitionImpl extends TMemberImpl implements TMethodDefinition {
	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature signature;

	/**
	 * The cached value of the '{@link #getOverriding() <em>Overriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriding()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition overriding;

	/**
	 * The cached value of the '{@link #getOverriddenBy() <em>Overridden By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriddenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overriddenBy;

	/**
	 * The cached value of the '{@link #getOverloading() <em>Overloading</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverloading()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overloading;

	/**
	 * The cached value of the '{@link #getOverloadedBy() <em>Overloaded By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverloadedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> overloadedBy;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TClass returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TMETHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject) signature;
			signature = (TMethodSignature) eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE,
							oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(TMethodSignature newSignature, NotificationChain msgs) {
		TMethodSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE, oldSignature, newSignature);
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
	public void setSignature(TMethodSignature newSignature) {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject) signature).eInverseRemove(this, TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS,
						TMethodSignature.class, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject) newSignature).eInverseAdd(this, TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS,
						TMethodSignature.class, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE, newSignature,
					newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition getOverriding() {
		if (overriding != null && overriding.eIsProxy()) {
			InternalEObject oldOverriding = (InternalEObject) overriding;
			overriding = (TMethodDefinition) eResolveProxy(oldOverriding);
			if (overriding != oldOverriding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING,
							oldOverriding, overriding));
			}
		}
		return overriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetOverriding() {
		return overriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverriding(TMethodDefinition newOverriding, NotificationChain msgs) {
		TMethodDefinition oldOverriding = overriding;
		overriding = newOverriding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING, oldOverriding, newOverriding);
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
	public void setOverriding(TMethodDefinition newOverriding) {
		if (newOverriding != overriding) {
			NotificationChain msgs = null;
			if (overriding != null)
				msgs = ((InternalEObject) overriding).eInverseRemove(this, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY,
						TMethodDefinition.class, msgs);
			if (newOverriding != null)
				msgs = ((InternalEObject) newOverriding).eInverseAdd(this, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY,
						TMethodDefinition.class, msgs);
			msgs = basicSetOverriding(newOverriding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING, newOverriding,
					newOverriding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethodDefinition> getOverriddenBy() {
		if (overriddenBy == null) {
			overriddenBy = new EObjectWithInverseResolvingEList<TMethodDefinition>(TMethodDefinition.class, this,
					TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING);
		}
		return overriddenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethodDefinition> getOverloading() {
		if (overloading == null) {
			overloading = new EObjectWithInverseResolvingEList.ManyInverse<TMethodDefinition>(TMethodDefinition.class, this,
					TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY);
		}
		return overloading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethodDefinition> getOverloadedBy() {
		if (overloadedBy == null) {
			overloadedBy = new EObjectWithInverseResolvingEList.ManyInverse<TMethodDefinition>(TMethodDefinition.class, this,
					TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING);
		}
		return overloadedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject) returnType;
			returnType = (TClass) eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TMETHOD_DEFINITION__RETURN_TYPE,
							oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TClass newReturnType) {
		TClass oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TMETHOD_DEFINITION__RETURN_TYPE, oldReturnType,
					returnType));
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
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE:
			if (signature != null)
				msgs = ((InternalEObject) signature).eInverseRemove(this, TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS,
						TMethodSignature.class, msgs);
			return basicSetSignature((TMethodSignature) otherEnd, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING:
			if (overriding != null)
				msgs = ((InternalEObject) overriding).eInverseRemove(this, TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY,
						TMethodDefinition.class, msgs);
			return basicSetOverriding((TMethodDefinition) otherEnd, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOverriddenBy()).basicAdd(otherEnd, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOverloading()).basicAdd(otherEnd, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOverloadedBy()).basicAdd(otherEnd, msgs);
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
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE:
			return basicSetSignature(null, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING:
			return basicSetOverriding(null, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
			return ((InternalEList<?>) getOverriddenBy()).basicRemove(otherEnd, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING:
			return ((InternalEList<?>) getOverloading()).basicRemove(otherEnd, msgs);
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
			return ((InternalEList<?>) getOverloadedBy()).basicRemove(otherEnd, msgs);
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
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE:
			if (resolve)
				return getSignature();
			return basicGetSignature();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING:
			if (resolve)
				return getOverriding();
			return basicGetOverriding();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
			return getOverriddenBy();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING:
			return getOverloading();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
			return getOverloadedBy();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
			if (resolve)
				return getReturnType();
			return basicGetReturnType();
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
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE:
			setSignature((TMethodSignature) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING:
			setOverriding((TMethodDefinition) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
			getOverriddenBy().clear();
			getOverriddenBy().addAll((Collection<? extends TMethodDefinition>) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING:
			getOverloading().clear();
			getOverloading().addAll((Collection<? extends TMethodDefinition>) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
			getOverloadedBy().clear();
			getOverloadedBy().addAll((Collection<? extends TMethodDefinition>) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
			setReturnType((TClass) newValue);
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
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE:
			setSignature((TMethodSignature) null);
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING:
			setOverriding((TMethodDefinition) null);
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
			getOverriddenBy().clear();
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING:
			getOverloading().clear();
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
			getOverloadedBy().clear();
			return;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
			setReturnType((TClass) null);
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
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE:
			return signature != null;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDING:
			return overriding != null;
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERRIDDEN_BY:
			return overriddenBy != null && !overriddenBy.isEmpty();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADING:
			return overloading != null && !overloading.isEmpty();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__OVERLOADED_BY:
			return overloadedBy != null && !overloadedBy.isEmpty();
		case TypeGraphBasicPackage.TMETHOD_DEFINITION__RETURN_TYPE:
			return returnType != null;
		}
		return super.eIsSet(featureID);
	}

} //TMethodDefinitionImpl
