/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RoleImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RoleImpl#getCooperativeAction <em>Cooperative Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getRequiredCapabilities() <em>Required Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCapability> requiredCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredCapability> getRequiredCapabilities() {
		if (requiredCapabilities == null) {
			requiredCapabilities = new EObjectContainmentWithInverseEList<RequiredCapability>(RequiredCapability.class, this, DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES, DronesStructurePackage.REQUIRED_CAPABILITY__ROLE);
		}
		return requiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooperativeAction getCooperativeAction() {
		if (eContainerFeatureID() != DronesStructurePackage.ROLE__COOPERATIVE_ACTION) return null;
		return (CooperativeAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCooperativeAction(CooperativeAction newCooperativeAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCooperativeAction, DronesStructurePackage.ROLE__COOPERATIVE_ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooperativeAction(CooperativeAction newCooperativeAction) {
		if (newCooperativeAction != eInternalContainer() || (eContainerFeatureID() != DronesStructurePackage.ROLE__COOPERATIVE_ACTION && newCooperativeAction != null)) {
			if (EcoreUtil.isAncestor(this, newCooperativeAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCooperativeAction != null)
				msgs = ((InternalEObject)newCooperativeAction).eInverseAdd(this, DronesStructurePackage.COOPERATIVE_ACTION__ROLES, CooperativeAction.class, msgs);
			msgs = basicSetCooperativeAction(newCooperativeAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.ROLE__COOPERATIVE_ACTION, newCooperativeAction, newCooperativeAction));
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
			case DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredCapabilities()).basicAdd(otherEnd, msgs);
			case DronesStructurePackage.ROLE__COOPERATIVE_ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCooperativeAction((CooperativeAction)otherEnd, msgs);
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
			case DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES:
				return ((InternalEList<?>)getRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.ROLE__COOPERATIVE_ACTION:
				return basicSetCooperativeAction(null, msgs);
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
			case DronesStructurePackage.ROLE__COOPERATIVE_ACTION:
				return eInternalContainer().eInverseRemove(this, DronesStructurePackage.COOPERATIVE_ACTION__ROLES, CooperativeAction.class, msgs);
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
			case DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case DronesStructurePackage.ROLE__COOPERATIVE_ACTION:
				return getCooperativeAction();
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
			case DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends RequiredCapability>)newValue);
				return;
			case DronesStructurePackage.ROLE__COOPERATIVE_ACTION:
				setCooperativeAction((CooperativeAction)newValue);
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
			case DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case DronesStructurePackage.ROLE__COOPERATIVE_ACTION:
				setCooperativeAction((CooperativeAction)null);
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
			case DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES:
				return requiredCapabilities != null && !requiredCapabilities.isEmpty();
			case DronesStructurePackage.ROLE__COOPERATIVE_ACTION:
				return getCooperativeAction() != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
