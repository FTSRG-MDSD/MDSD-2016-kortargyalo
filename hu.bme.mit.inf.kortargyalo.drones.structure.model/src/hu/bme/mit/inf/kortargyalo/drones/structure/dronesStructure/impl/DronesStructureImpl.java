/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drones Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl#getDroneTypes <em>Drone Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl#getCooperativeActions <em>Cooperative Actions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DronesStructureImpl extends MinimalEObjectImpl.Container implements DronesStructure {
	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * The cached value of the '{@link #getDroneTypes() <em>Drone Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DroneType> droneTypes;

	/**
	 * The cached value of the '{@link #getCooperativeActions() <em>Cooperative Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooperativeActions()
	 * @generated
	 * @ordered
	 */
	protected EList<CooperativeAction> cooperativeActions;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DronesStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.DRONES_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, DronesStructurePackage.DRONES_STRUCTURE__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DroneType> getDroneTypes() {
		if (droneTypes == null) {
			droneTypes = new EObjectContainmentEList<DroneType>(DroneType.class, this, DronesStructurePackage.DRONES_STRUCTURE__DRONE_TYPES);
		}
		return droneTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CooperativeAction> getCooperativeActions() {
		if (cooperativeActions == null) {
			cooperativeActions = new EObjectContainmentEList<CooperativeAction>(CooperativeAction.class, this, DronesStructurePackage.DRONES_STRUCTURE__COOPERATIVE_ACTIONS);
		}
		return cooperativeActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, DronesStructurePackage.DRONES_STRUCTURE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesStructurePackage.DRONES_STRUCTURE__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.DRONES_STRUCTURE__DRONE_TYPES:
				return ((InternalEList<?>)getDroneTypes()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.DRONES_STRUCTURE__COOPERATIVE_ACTIONS:
				return ((InternalEList<?>)getCooperativeActions()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.DRONES_STRUCTURE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case DronesStructurePackage.DRONES_STRUCTURE__SCENARIOS:
				return getScenarios();
			case DronesStructurePackage.DRONES_STRUCTURE__DRONE_TYPES:
				return getDroneTypes();
			case DronesStructurePackage.DRONES_STRUCTURE__COOPERATIVE_ACTIONS:
				return getCooperativeActions();
			case DronesStructurePackage.DRONES_STRUCTURE__CAPABILITIES:
				return getCapabilities();
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
			case DronesStructurePackage.DRONES_STRUCTURE__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case DronesStructurePackage.DRONES_STRUCTURE__DRONE_TYPES:
				getDroneTypes().clear();
				getDroneTypes().addAll((Collection<? extends DroneType>)newValue);
				return;
			case DronesStructurePackage.DRONES_STRUCTURE__COOPERATIVE_ACTIONS:
				getCooperativeActions().clear();
				getCooperativeActions().addAll((Collection<? extends CooperativeAction>)newValue);
				return;
			case DronesStructurePackage.DRONES_STRUCTURE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
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
			case DronesStructurePackage.DRONES_STRUCTURE__SCENARIOS:
				getScenarios().clear();
				return;
			case DronesStructurePackage.DRONES_STRUCTURE__DRONE_TYPES:
				getDroneTypes().clear();
				return;
			case DronesStructurePackage.DRONES_STRUCTURE__COOPERATIVE_ACTIONS:
				getCooperativeActions().clear();
				return;
			case DronesStructurePackage.DRONES_STRUCTURE__CAPABILITIES:
				getCapabilities().clear();
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
			case DronesStructurePackage.DRONES_STRUCTURE__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case DronesStructurePackage.DRONES_STRUCTURE__DRONE_TYPES:
				return droneTypes != null && !droneTypes.isEmpty();
			case DronesStructurePackage.DRONES_STRUCTURE__COOPERATIVE_ACTIONS:
				return cooperativeActions != null && !cooperativeActions.isEmpty();
			case DronesStructurePackage.DRONES_STRUCTURE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DronesStructureImpl
