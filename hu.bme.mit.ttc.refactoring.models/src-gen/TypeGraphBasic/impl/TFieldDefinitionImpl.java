/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TFieldDefinition;
import TypeGraphBasic.TFieldSignature;
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
 * An implementation of the model object '<em><b>TField Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TFieldDefinitionImpl#getHiding <em>Hiding</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TFieldDefinitionImpl#getHiddenBy <em>Hidden By</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TFieldDefinitionImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldDefinitionImpl extends TMemberImpl implements TFieldDefinition {
	/**
	 * The cached value of the '{@link #getHiding() <em>Hiding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiding()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition hiding;

	/**
	 * The cached value of the '{@link #getHiddenBy() <em>Hidden By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TFieldDefinition> hiddenBy;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected TFieldSignature signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TFIELD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition getHiding() {
		if (hiding != null && hiding.eIsProxy()) {
			InternalEObject oldHiding = (InternalEObject)hiding;
			hiding = (TFieldDefinition)eResolveProxy(oldHiding);
			if (hiding != oldHiding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING, oldHiding, hiding));
			}
		}
		return hiding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition basicGetHiding() {
		return hiding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHiding(TFieldDefinition newHiding, NotificationChain msgs) {
		TFieldDefinition oldHiding = hiding;
		hiding = newHiding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING, oldHiding, newHiding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiding(TFieldDefinition newHiding) {
		if (newHiding != hiding) {
			NotificationChain msgs = null;
			if (hiding != null)
				msgs = ((InternalEObject)hiding).eInverseRemove(this, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY, TFieldDefinition.class, msgs);
			if (newHiding != null)
				msgs = ((InternalEObject)newHiding).eInverseAdd(this, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY, TFieldDefinition.class, msgs);
			msgs = basicSetHiding(newHiding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING, newHiding, newHiding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFieldDefinition> getHiddenBy() {
		if (hiddenBy == null) {
			hiddenBy = new EObjectWithInverseResolvingEList<TFieldDefinition>(TFieldDefinition.class, this, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING);
		}
		return hiddenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (TFieldSignature)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(TFieldSignature newSignature, NotificationChain msgs) {
		TFieldSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE, oldSignature, newSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TFieldSignature newSignature) {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject)signature).eInverseRemove(this, TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS, TFieldSignature.class, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS, TFieldSignature.class, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE, newSignature, newSignature));
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
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING:
				if (hiding != null)
					msgs = ((InternalEObject)hiding).eInverseRemove(this, TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY, TFieldDefinition.class, msgs);
				return basicSetHiding((TFieldDefinition)otherEnd, msgs);
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHiddenBy()).basicAdd(otherEnd, msgs);
			case TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE:
				if (signature != null)
					msgs = ((InternalEObject)signature).eInverseRemove(this, TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS, TFieldSignature.class, msgs);
				return basicSetSignature((TFieldSignature)otherEnd, msgs);
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
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING:
				return basicSetHiding(null, msgs);
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return ((InternalEList<?>)getHiddenBy()).basicRemove(otherEnd, msgs);
			case TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE:
				return basicSetSignature(null, msgs);
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
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING:
				if (resolve) return getHiding();
				return basicGetHiding();
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return getHiddenBy();
			case TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
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
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING:
				setHiding((TFieldDefinition)newValue);
				return;
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				getHiddenBy().clear();
				getHiddenBy().addAll((Collection<? extends TFieldDefinition>)newValue);
				return;
			case TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE:
				setSignature((TFieldSignature)newValue);
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
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING:
				setHiding((TFieldDefinition)null);
				return;
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				getHiddenBy().clear();
				return;
			case TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE:
				setSignature((TFieldSignature)null);
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
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDING:
				return hiding != null;
			case TypeGraphBasicPackage.TFIELD_DEFINITION__HIDDEN_BY:
				return hiddenBy != null && !hiddenBy.isEmpty();
			case TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE:
				return signature != null;
		}
		return super.eIsSet(featureID);
	}

} //TFieldDefinitionImpl
