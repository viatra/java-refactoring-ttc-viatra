/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TField;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TField Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TFieldSignatureImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TFieldSignatureImpl#getField <em>Field</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TFieldSignatureImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldSignatureImpl extends TSignatureImpl implements TFieldSignature {
	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TFieldDefinition> definitions;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TClass type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TFIELD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFieldDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectWithInverseResolvingEList<TFieldDefinition>(TFieldDefinition.class, this, TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS, TypeGraphBasicPackage.TFIELD_DEFINITION__SIGNATURE);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TField getField() {
		if (eContainerFeatureID() != TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD) return null;
		return (TField)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(TField newField, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newField, TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(TField newField) {
		if (newField != eInternalContainer() || (eContainerFeatureID() != TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD && newField != null)) {
			if (EcoreUtil.isAncestor(this, newField))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newField != null)
				msgs = ((InternalEObject)newField).eInverseAdd(this, TypeGraphBasicPackage.TFIELD__SIGNATURES, TField.class, msgs);
			msgs = basicSetField(newField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD, newField, newField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeGraphBasicPackage.TFIELD_SIGNATURE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TClass newType) {
		TClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeGraphBasicPackage.TFIELD_SIGNATURE__TYPE, oldType, type));
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
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefinitions()).basicAdd(otherEnd, msgs);
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetField((TField)otherEnd, msgs);
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
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD:
				return basicSetField(null, msgs);
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
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD:
				return eInternalContainer().eInverseRemove(this, TypeGraphBasicPackage.TFIELD__SIGNATURES, TField.class, msgs);
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
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return getDefinitions();
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD:
				return getField();
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends TFieldDefinition>)newValue);
				return;
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD:
				setField((TField)newValue);
				return;
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__TYPE:
				setType((TClass)newValue);
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
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				getDefinitions().clear();
				return;
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD:
				setField((TField)null);
				return;
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__TYPE:
				setType((TClass)null);
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
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__FIELD:
				return getField() != null;
			case TypeGraphBasicPackage.TFIELD_SIGNATURE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //TFieldSignatureImpl
