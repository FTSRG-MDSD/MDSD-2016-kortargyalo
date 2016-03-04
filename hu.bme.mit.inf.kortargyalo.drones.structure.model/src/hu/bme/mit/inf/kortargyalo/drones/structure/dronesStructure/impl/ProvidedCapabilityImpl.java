/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl#getMaximalValue <em>Maximal Value</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl#getEnergyConsumptionPerValue <em>Energy Consumption Per Value</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl#getDroneType <em>Drone Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedCapabilityImpl extends MinimalEObjectImpl.Container implements ProvidedCapability {
	/**
	 * The default value of the '{@link #getMaximalValue() <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximalValue() <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalValue()
	 * @generated
	 * @ordered
	 */
	protected double maximalValue = MAXIMAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyConsumptionPerValue() <em>Energy Consumption Per Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumptionPerValue()
	 * @generated
	 * @ordered
	 */
	protected static final double ENERGY_CONSUMPTION_PER_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEnergyConsumptionPerValue() <em>Energy Consumption Per Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumptionPerValue()
	 * @generated
	 * @ordered
	 */
	protected double energyConsumptionPerValue = ENERGY_CONSUMPTION_PER_VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.PROVIDED_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximalValue() {
		return maximalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximalValue(double newMaximalValue) {
		double oldMaximalValue = maximalValue;
		maximalValue = newMaximalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.PROVIDED_CAPABILITY__MAXIMAL_VALUE, oldMaximalValue, maximalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEnergyConsumptionPerValue() {
		return energyConsumptionPerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyConsumptionPerValue(double newEnergyConsumptionPerValue) {
		double oldEnergyConsumptionPerValue = energyConsumptionPerValue;
		energyConsumptionPerValue = newEnergyConsumptionPerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE, oldEnergyConsumptionPerValue, energyConsumptionPerValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesStructurePackage.PROVIDED_CAPABILITY__CAPABILITY, oldCapability, capability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.PROVIDED_CAPABILITY__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneType getDroneType() {
		if (eContainerFeatureID() != DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE) return null;
		return (DroneType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDroneType(DroneType newDroneType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDroneType, DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroneType(DroneType newDroneType) {
		if (newDroneType != eInternalContainer() || (eContainerFeatureID() != DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE && newDroneType != null)) {
			if (EcoreUtil.isAncestor(this, newDroneType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDroneType != null)
				msgs = ((InternalEObject)newDroneType).eInverseAdd(this, DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES, DroneType.class, msgs);
			msgs = basicSetDroneType(newDroneType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE, newDroneType, newDroneType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDroneType((DroneType)otherEnd, msgs);
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
			case DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE:
				return basicSetDroneType(null, msgs);
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
			case DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE:
				return eInternalContainer().eInverseRemove(this, DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES, DroneType.class, msgs);
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
			case DronesStructurePackage.PROVIDED_CAPABILITY__MAXIMAL_VALUE:
				return getMaximalValue();
			case DronesStructurePackage.PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE:
				return getEnergyConsumptionPerValue();
			case DronesStructurePackage.PROVIDED_CAPABILITY__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE:
				return getDroneType();
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
			case DronesStructurePackage.PROVIDED_CAPABILITY__MAXIMAL_VALUE:
				setMaximalValue((Double)newValue);
				return;
			case DronesStructurePackage.PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE:
				setEnergyConsumptionPerValue((Double)newValue);
				return;
			case DronesStructurePackage.PROVIDED_CAPABILITY__CAPABILITY:
				setCapability((Capability)newValue);
				return;
			case DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE:
				setDroneType((DroneType)newValue);
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
			case DronesStructurePackage.PROVIDED_CAPABILITY__MAXIMAL_VALUE:
				setMaximalValue(MAXIMAL_VALUE_EDEFAULT);
				return;
			case DronesStructurePackage.PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE:
				setEnergyConsumptionPerValue(ENERGY_CONSUMPTION_PER_VALUE_EDEFAULT);
				return;
			case DronesStructurePackage.PROVIDED_CAPABILITY__CAPABILITY:
				setCapability((Capability)null);
				return;
			case DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE:
				setDroneType((DroneType)null);
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
			case DronesStructurePackage.PROVIDED_CAPABILITY__MAXIMAL_VALUE:
				return maximalValue != MAXIMAL_VALUE_EDEFAULT;
			case DronesStructurePackage.PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE:
				return energyConsumptionPerValue != ENERGY_CONSUMPTION_PER_VALUE_EDEFAULT;
			case DronesStructurePackage.PROVIDED_CAPABILITY__CAPABILITY:
				return capability != null;
			case DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE:
				return getDroneType() != null;
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
		result.append(" (maximalValue: ");
		result.append(maximalValue);
		result.append(", energyConsumptionPerValue: ");
		result.append(energyConsumptionPerValue);
		result.append(')');
		return result.toString();
	}

} //ProvidedCapabilityImpl
