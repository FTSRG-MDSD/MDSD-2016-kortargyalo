/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RequiredCapabilityImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RequiredCapabilityImpl#getMinimalValue <em>Minimal Value</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RequiredCapabilityImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredCapabilityImpl extends MinimalEObjectImpl.Container implements RequiredCapability {
	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected Capability capability;

	/**
	 * The default value of the '{@link #getMinimalValue() <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimalValue() <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalValue()
	 * @generated
	 * @ordered
	 */
	protected double minimalValue = MINIMAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.REQUIRED_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (Capability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesStructurePackage.REQUIRED_CAPABILITY__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(Capability newCapability) {
		Capability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.REQUIRED_CAPABILITY__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimalValue() {
		return minimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimalValue(double newMinimalValue) {
		double oldMinimalValue = minimalValue;
		minimalValue = newMinimalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.REQUIRED_CAPABILITY__MINIMAL_VALUE, oldMinimalValue, minimalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (eContainerFeatureID() != DronesStructurePackage.REQUIRED_CAPABILITY__ROLE) return null;
		return (Role)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRole, DronesStructurePackage.REQUIRED_CAPABILITY__ROLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != eInternalContainer() || (eContainerFeatureID() != DronesStructurePackage.REQUIRED_CAPABILITY__ROLE && newRole != null)) {
			if (EcoreUtil.isAncestor(this, newRole))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.REQUIRED_CAPABILITY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesStructurePackage.REQUIRED_CAPABILITY__ROLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRole((Role)otherEnd, msgs);
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
			case DronesStructurePackage.REQUIRED_CAPABILITY__ROLE:
				return basicSetRole(null, msgs);
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
			case DronesStructurePackage.REQUIRED_CAPABILITY__ROLE:
				return eInternalContainer().eInverseRemove(this, DronesStructurePackage.ROLE__REQUIRED_CAPABILITIES, Role.class, msgs);
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
			case DronesStructurePackage.REQUIRED_CAPABILITY__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case DronesStructurePackage.REQUIRED_CAPABILITY__MINIMAL_VALUE:
				return getMinimalValue();
			case DronesStructurePackage.REQUIRED_CAPABILITY__ROLE:
				return getRole();
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
			case DronesStructurePackage.REQUIRED_CAPABILITY__CAPABILITY:
				setCapability((Capability)newValue);
				return;
			case DronesStructurePackage.REQUIRED_CAPABILITY__MINIMAL_VALUE:
				setMinimalValue((Double)newValue);
				return;
			case DronesStructurePackage.REQUIRED_CAPABILITY__ROLE:
				setRole((Role)newValue);
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
			case DronesStructurePackage.REQUIRED_CAPABILITY__CAPABILITY:
				setCapability((Capability)null);
				return;
			case DronesStructurePackage.REQUIRED_CAPABILITY__MINIMAL_VALUE:
				setMinimalValue(MINIMAL_VALUE_EDEFAULT);
				return;
			case DronesStructurePackage.REQUIRED_CAPABILITY__ROLE:
				setRole((Role)null);
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
			case DronesStructurePackage.REQUIRED_CAPABILITY__CAPABILITY:
				return capability != null;
			case DronesStructurePackage.REQUIRED_CAPABILITY__MINIMAL_VALUE:
				return minimalValue != MINIMAL_VALUE_EDEFAULT;
			case DronesStructurePackage.REQUIRED_CAPABILITY__ROLE:
				return getRole() != null;
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
		result.append(" (minimalValue: ");
		result.append(minimalValue);
		result.append(')');
		return result.toString();
	}

} //RequiredCapabilityImpl
