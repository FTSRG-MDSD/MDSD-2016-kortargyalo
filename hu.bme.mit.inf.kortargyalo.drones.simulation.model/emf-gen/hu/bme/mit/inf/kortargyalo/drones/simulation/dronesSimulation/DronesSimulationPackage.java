/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationFactory
 * @model kind="package"
 * @generated
 */
public interface DronesSimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dronesSimulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/kortargyalo/dronesSimulation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dronesSimulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronesSimulationPackage eINSTANCE = hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationImpl <em>Drones Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDronesSimulation()
	 * @generated
	 */
	int DRONES_SIMULATION = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_SIMULATION__SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Task Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_SIMULATION__TASK_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Drone Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_SIMULATION__DRONE_INSTANCES = 2;

	/**
	 * The number of structural features of the '<em>Drones Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_SIMULATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Drones Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_SIMULATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl <em>Drone Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDroneInstance()
	 * @generated
	 */
	int DRONE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Drone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE__DRONE = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Current Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE__CURRENT_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE__OBSERVATIONS = 3;

	/**
	 * The feature id for the '<em><b>Current Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE__CURRENT_BATTERY = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE__STATE = 5;

	/**
	 * The number of structural features of the '<em>Drone Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Drone Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.TaskInstanceImpl <em>Task Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.TaskInstanceImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getTaskInstance()
	 * @generated
	 */
	int TASK_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__TASK = 0;

	/**
	 * The feature id for the '<em><b>Role Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__ROLE_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__STATE = 2;

	/**
	 * The number of structural features of the '<em>Task Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.RoleInstanceImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getRoleInstance()
	 * @generated
	 */
	int ROLE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Task Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__TASK_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Allocated Drone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ALLOCATED_DRONE = 2;

	/**
	 * The number of structural features of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObservationImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TIME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ID = 1;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObstacleObservationImpl <em>Obstacle Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObstacleObservationImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getObstacleObservation()
	 * @generated
	 */
	int OBSTACLE_OBSERVATION = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OBSERVATION__TIME = OBSERVATION__TIME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OBSERVATION__ID = OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Obstacle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OBSERVATION__OBSTACLE = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obstacle Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OBSERVATION_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obstacle Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OBSERVATION_OPERATION_COUNT = OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneObservationImpl <em>Drone Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneObservationImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDroneObservation()
	 * @generated
	 */
	int DRONE_OBSERVATION = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OBSERVATION__TIME = OBSERVATION__TIME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OBSERVATION__ID = OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Drone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OBSERVATION__DRONE = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OBSERVATION__POSITION = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Drone Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OBSERVATION_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Drone Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OBSERVATION_OPERATION_COUNT = OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState <em>Task State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getTaskState()
	 * @generated
	 */
	int TASK_STATE = 7;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState <em>Drone State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDroneState()
	 * @generated
	 */
	int DRONE_STATE = 8;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation <em>Drones Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drones Simulation</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation
	 * @generated
	 */
	EClass getDronesSimulation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getScenario()
	 * @see #getDronesSimulation()
	 * @generated
	 */
	EReference getDronesSimulation_Scenario();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getTaskInstances <em>Task Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Instances</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getTaskInstances()
	 * @see #getDronesSimulation()
	 * @generated
	 */
	EReference getDronesSimulation_TaskInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getDroneInstances <em>Drone Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drone Instances</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getDroneInstances()
	 * @see #getDronesSimulation()
	 * @generated
	 */
	EReference getDronesSimulation_DroneInstances();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance <em>Drone Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone Instance</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance
	 * @generated
	 */
	EClass getDroneInstance();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getDrone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drone</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getDrone()
	 * @see #getDroneInstance()
	 * @generated
	 */
	EReference getDroneInstance_Drone();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getPosition()
	 * @see #getDroneInstance()
	 * @generated
	 */
	EReference getDroneInstance_Position();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getCurrentRole <em>Current Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Role</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getCurrentRole()
	 * @see #getDroneInstance()
	 * @generated
	 */
	EReference getDroneInstance_CurrentRole();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observations</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getObservations()
	 * @see #getDroneInstance()
	 * @generated
	 */
	EReference getDroneInstance_Observations();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getCurrentBattery <em>Current Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Battery</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getCurrentBattery()
	 * @see #getDroneInstance()
	 * @generated
	 */
	EAttribute getDroneInstance_CurrentBattery();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getState()
	 * @see #getDroneInstance()
	 * @generated
	 */
	EAttribute getDroneInstance_State();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance <em>Task Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Instance</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance
	 * @generated
	 */
	EClass getTaskInstance();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getTask()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EReference getTaskInstance_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getRoleInstances <em>Role Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Instances</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getRoleInstances()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EReference getTaskInstance_RoleInstances();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getState()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EAttribute getTaskInstance_State();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Instance</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance
	 * @generated
	 */
	EClass getRoleInstance();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getRole()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_Role();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getTaskInstance <em>Task Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task Instance</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getTaskInstance()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_TaskInstance();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getAllocatedDrone <em>Allocated Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated Drone</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getAllocatedDrone()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_AllocatedDrone();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation#getTime()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Time();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation#getId()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation <em>Obstacle Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle Observation</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation
	 * @generated
	 */
	EClass getObstacleObservation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation#getObstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obstacle</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation#getObstacle()
	 * @see #getObstacleObservation()
	 * @generated
	 */
	EReference getObstacleObservation_Obstacle();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation <em>Drone Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone Observation</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation
	 * @generated
	 */
	EClass getDroneObservation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getDrone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drone</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getDrone()
	 * @see #getDroneObservation()
	 * @generated
	 */
	EReference getDroneObservation_Drone();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getPosition()
	 * @see #getDroneObservation()
	 * @generated
	 */
	EReference getDroneObservation_Position();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task State</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
	 * @generated
	 */
	EEnum getTaskState();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState <em>Drone State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drone State</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState
	 * @generated
	 */
	EEnum getDroneState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DronesSimulationFactory getDronesSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationImpl <em>Drones Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDronesSimulation()
		 * @generated
		 */
		EClass DRONES_SIMULATION = eINSTANCE.getDronesSimulation();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_SIMULATION__SCENARIO = eINSTANCE.getDronesSimulation_Scenario();

		/**
		 * The meta object literal for the '<em><b>Task Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_SIMULATION__TASK_INSTANCES = eINSTANCE.getDronesSimulation_TaskInstances();

		/**
		 * The meta object literal for the '<em><b>Drone Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_SIMULATION__DRONE_INSTANCES = eINSTANCE.getDronesSimulation_DroneInstances();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl <em>Drone Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDroneInstance()
		 * @generated
		 */
		EClass DRONE_INSTANCE = eINSTANCE.getDroneInstance();

		/**
		 * The meta object literal for the '<em><b>Drone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_INSTANCE__DRONE = eINSTANCE.getDroneInstance_Drone();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_INSTANCE__POSITION = eINSTANCE.getDroneInstance_Position();

		/**
		 * The meta object literal for the '<em><b>Current Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_INSTANCE__CURRENT_ROLE = eINSTANCE.getDroneInstance_CurrentRole();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_INSTANCE__OBSERVATIONS = eINSTANCE.getDroneInstance_Observations();

		/**
		 * The meta object literal for the '<em><b>Current Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE_INSTANCE__CURRENT_BATTERY = eINSTANCE.getDroneInstance_CurrentBattery();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE_INSTANCE__STATE = eINSTANCE.getDroneInstance_State();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.TaskInstanceImpl <em>Task Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.TaskInstanceImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getTaskInstance()
		 * @generated
		 */
		EClass TASK_INSTANCE = eINSTANCE.getTaskInstance();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INSTANCE__TASK = eINSTANCE.getTaskInstance_Task();

		/**
		 * The meta object literal for the '<em><b>Role Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INSTANCE__ROLE_INSTANCES = eINSTANCE.getTaskInstance_RoleInstances();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_INSTANCE__STATE = eINSTANCE.getTaskInstance_State();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.RoleInstanceImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getRoleInstance()
		 * @generated
		 */
		EClass ROLE_INSTANCE = eINSTANCE.getRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__ROLE = eINSTANCE.getRoleInstance_Role();

		/**
		 * The meta object literal for the '<em><b>Task Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__TASK_INSTANCE = eINSTANCE.getRoleInstance_TaskInstance();

		/**
		 * The meta object literal for the '<em><b>Allocated Drone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__ALLOCATED_DRONE = eINSTANCE.getRoleInstance_AllocatedDrone();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObservationImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__TIME = eINSTANCE.getObservation_Time();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__ID = eINSTANCE.getObservation_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObstacleObservationImpl <em>Obstacle Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObstacleObservationImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getObstacleObservation()
		 * @generated
		 */
		EClass OBSTACLE_OBSERVATION = eINSTANCE.getObstacleObservation();

		/**
		 * The meta object literal for the '<em><b>Obstacle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTACLE_OBSERVATION__OBSTACLE = eINSTANCE.getObstacleObservation_Obstacle();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneObservationImpl <em>Drone Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneObservationImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDroneObservation()
		 * @generated
		 */
		EClass DRONE_OBSERVATION = eINSTANCE.getDroneObservation();

		/**
		 * The meta object literal for the '<em><b>Drone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_OBSERVATION__DRONE = eINSTANCE.getDroneObservation_Drone();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_OBSERVATION__POSITION = eINSTANCE.getDroneObservation_Position();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState <em>Task State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getTaskState()
		 * @generated
		 */
		EEnum TASK_STATE = eINSTANCE.getTaskState();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState <em>Drone State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState
		 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationPackageImpl#getDroneState()
		 * @generated
		 */
		EEnum DRONE_STATE = eINSTANCE.getDroneState();

	}

} //DronesSimulationPackage
