/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;

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
 * An implementation of the model object '<em><b>Drones Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationImpl#getTaskInstances <em>Task Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationImpl#getDroneInstances <em>Drone Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DronesSimulationImpl extends MinimalEObjectImpl.Container implements DronesSimulation {
	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenario;

	/**
	 * The cached value of the '{@link #getTaskInstances() <em>Task Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInstance> taskInstances;

	/**
	 * The cached value of the '{@link #getDroneInstances() <em>Drone Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DroneInstance> droneInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DronesSimulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesSimulationPackage.Literals.DRONES_SIMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (Scenario)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesSimulationPackage.DRONES_SIMULATION__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		Scenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONES_SIMULATION__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskInstance> getTaskInstances() {
		if (taskInstances == null) {
			taskInstances = new EObjectContainmentEList<TaskInstance>(TaskInstance.class, this, DronesSimulationPackage.DRONES_SIMULATION__TASK_INSTANCES);
		}
		return taskInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DroneInstance> getDroneInstances() {
		if (droneInstances == null) {
			droneInstances = new EObjectContainmentEList<DroneInstance>(DroneInstance.class, this, DronesSimulationPackage.DRONES_SIMULATION__DRONE_INSTANCES);
		}
		return droneInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesSimulationPackage.DRONES_SIMULATION__TASK_INSTANCES:
				return ((InternalEList<?>)getTaskInstances()).basicRemove(otherEnd, msgs);
			case DronesSimulationPackage.DRONES_SIMULATION__DRONE_INSTANCES:
				return ((InternalEList<?>)getDroneInstances()).basicRemove(otherEnd, msgs);
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
			case DronesSimulationPackage.DRONES_SIMULATION__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
			case DronesSimulationPackage.DRONES_SIMULATION__TASK_INSTANCES:
				return getTaskInstances();
			case DronesSimulationPackage.DRONES_SIMULATION__DRONE_INSTANCES:
				return getDroneInstances();
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
			case DronesSimulationPackage.DRONES_SIMULATION__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case DronesSimulationPackage.DRONES_SIMULATION__TASK_INSTANCES:
				getTaskInstances().clear();
				getTaskInstances().addAll((Collection<? extends TaskInstance>)newValue);
				return;
			case DronesSimulationPackage.DRONES_SIMULATION__DRONE_INSTANCES:
				getDroneInstances().clear();
				getDroneInstances().addAll((Collection<? extends DroneInstance>)newValue);
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
			case DronesSimulationPackage.DRONES_SIMULATION__SCENARIO:
				setScenario((Scenario)null);
				return;
			case DronesSimulationPackage.DRONES_SIMULATION__TASK_INSTANCES:
				getTaskInstances().clear();
				return;
			case DronesSimulationPackage.DRONES_SIMULATION__DRONE_INSTANCES:
				getDroneInstances().clear();
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
			case DronesSimulationPackage.DRONES_SIMULATION__SCENARIO:
				return scenario != null;
			case DronesSimulationPackage.DRONES_SIMULATION__TASK_INSTANCES:
				return taskInstances != null && !taskInstances.isEmpty();
			case DronesSimulationPackage.DRONES_SIMULATION__DRONE_INSTANCES:
				return droneInstances != null && !droneInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DronesSimulationImpl
