/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl#getMaxBatteryCapacity <em>Max Battery Capacity</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl#getIdleEneryConsumption <em>Idle Enery Consumption</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl#getMovementCapability <em>Movement Capability</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl#getScanningCapability <em>Scanning Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneTypeImpl extends NamedElementImpl implements DroneType {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBatteryCapacity() <em>Max Battery Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBatteryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_BATTERY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxBatteryCapacity() <em>Max Battery Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBatteryCapacity()
	 * @generated
	 * @ordered
	 */
	protected double maxBatteryCapacity = MAX_BATTERY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdleEneryConsumption() <em>Idle Enery Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleEneryConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final double IDLE_ENERY_CONSUMPTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIdleEneryConsumption() <em>Idle Enery Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleEneryConsumption()
	 * @generated
	 * @ordered
	 */
	protected double idleEneryConsumption = IDLE_ENERY_CONSUMPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedCapability> providedCapabilities;

	/**
	 * The cached setting delegate for the '{@link #getMovementCapability() <em>Movement Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementCapability()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MOVEMENT_CAPABILITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DronesStructurePackage.Literals.DRONE_TYPE__MOVEMENT_CAPABILITY).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The cached setting delegate for the '{@link #getScanningCapability() <em>Scanning Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanningCapability()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SCANNING_CAPABILITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DronesStructurePackage.Literals.DRONE_TYPE__SCANNING_CAPABILITY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.DRONE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE_TYPE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxBatteryCapacity() {
		return maxBatteryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBatteryCapacity(double newMaxBatteryCapacity) {
		double oldMaxBatteryCapacity = maxBatteryCapacity;
		maxBatteryCapacity = newMaxBatteryCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE_TYPE__MAX_BATTERY_CAPACITY, oldMaxBatteryCapacity, maxBatteryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIdleEneryConsumption() {
		return idleEneryConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdleEneryConsumption(double newIdleEneryConsumption) {
		double oldIdleEneryConsumption = idleEneryConsumption;
		idleEneryConsumption = newIdleEneryConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE_TYPE__IDLE_ENERY_CONSUMPTION, oldIdleEneryConsumption, idleEneryConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedCapability> getProvidedCapabilities() {
		if (providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentWithInverseEList<ProvidedCapability>(ProvidedCapability.class, this, DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES, DronesStructurePackage.PROVIDED_CAPABILITY__DRONE_TYPE);
		}
		return providedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCapability getMovementCapability() {
		return (ProvidedCapability)MOVEMENT_CAPABILITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCapability basicGetMovementCapability() {
		return (ProvidedCapability)MOVEMENT_CAPABILITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE_TYPE__DIMENSION, oldDimension, newDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject)dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesStructurePackage.DRONE_TYPE__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject)newDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesStructurePackage.DRONE_TYPE__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE_TYPE__DIMENSION, newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCapability getScanningCapability() {
		return (ProvidedCapability)SCANNING_CAPABILITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCapability basicGetScanningCapability() {
		return (ProvidedCapability)SCANNING_CAPABILITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
			case DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedCapabilities()).basicAdd(otherEnd, msgs);
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
			case DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>)getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.DRONE_TYPE__DIMENSION:
				return basicSetDimension(null, msgs);
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
			case DronesStructurePackage.DRONE_TYPE__WEIGHT:
				return getWeight();
			case DronesStructurePackage.DRONE_TYPE__MAX_BATTERY_CAPACITY:
				return getMaxBatteryCapacity();
			case DronesStructurePackage.DRONE_TYPE__IDLE_ENERY_CONSUMPTION:
				return getIdleEneryConsumption();
			case DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case DronesStructurePackage.DRONE_TYPE__MOVEMENT_CAPABILITY:
				if (resolve) return getMovementCapability();
				return basicGetMovementCapability();
			case DronesStructurePackage.DRONE_TYPE__DIMENSION:
				return getDimension();
			case DronesStructurePackage.DRONE_TYPE__SCANNING_CAPABILITY:
				if (resolve) return getScanningCapability();
				return basicGetScanningCapability();
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
			case DronesStructurePackage.DRONE_TYPE__WEIGHT:
				setWeight((Double)newValue);
				return;
			case DronesStructurePackage.DRONE_TYPE__MAX_BATTERY_CAPACITY:
				setMaxBatteryCapacity((Double)newValue);
				return;
			case DronesStructurePackage.DRONE_TYPE__IDLE_ENERY_CONSUMPTION:
				setIdleEneryConsumption((Double)newValue);
				return;
			case DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends ProvidedCapability>)newValue);
				return;
			case DronesStructurePackage.DRONE_TYPE__DIMENSION:
				setDimension((Dimension)newValue);
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
			case DronesStructurePackage.DRONE_TYPE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case DronesStructurePackage.DRONE_TYPE__MAX_BATTERY_CAPACITY:
				setMaxBatteryCapacity(MAX_BATTERY_CAPACITY_EDEFAULT);
				return;
			case DronesStructurePackage.DRONE_TYPE__IDLE_ENERY_CONSUMPTION:
				setIdleEneryConsumption(IDLE_ENERY_CONSUMPTION_EDEFAULT);
				return;
			case DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case DronesStructurePackage.DRONE_TYPE__DIMENSION:
				setDimension((Dimension)null);
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
			case DronesStructurePackage.DRONE_TYPE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case DronesStructurePackage.DRONE_TYPE__MAX_BATTERY_CAPACITY:
				return maxBatteryCapacity != MAX_BATTERY_CAPACITY_EDEFAULT;
			case DronesStructurePackage.DRONE_TYPE__IDLE_ENERY_CONSUMPTION:
				return idleEneryConsumption != IDLE_ENERY_CONSUMPTION_EDEFAULT;
			case DronesStructurePackage.DRONE_TYPE__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case DronesStructurePackage.DRONE_TYPE__MOVEMENT_CAPABILITY:
				return MOVEMENT_CAPABILITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DronesStructurePackage.DRONE_TYPE__DIMENSION:
				return dimension != null;
			case DronesStructurePackage.DRONE_TYPE__SCANNING_CAPABILITY:
				return SCANNING_CAPABILITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", maxBatteryCapacity: ");
		result.append(maxBatteryCapacity);
		result.append(", idleEneryConsumption: ");
		result.append(idleEneryConsumption);
		result.append(')');
		return result.toString();
	}

} //DroneTypeImpl
