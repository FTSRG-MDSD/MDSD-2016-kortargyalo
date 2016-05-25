/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationFactory;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronesSimulationPackageImpl extends EPackageImpl implements DronesSimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dronesSimulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum droneStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DronesSimulationPackageImpl() {
		super(eNS_URI, DronesSimulationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DronesSimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DronesSimulationPackage init() {
		if (isInited) return (DronesSimulationPackage)EPackage.Registry.INSTANCE.getEPackage(DronesSimulationPackage.eNS_URI);

		// Obtain or create and register package
		DronesSimulationPackageImpl theDronesSimulationPackage = (DronesSimulationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DronesSimulationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DronesSimulationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DronesStructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDronesSimulationPackage.createPackageContents();

		// Initialize created meta-data
		theDronesSimulationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDronesSimulationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DronesSimulationPackage.eNS_URI, theDronesSimulationPackage);
		return theDronesSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDronesSimulation() {
		return dronesSimulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesSimulation_Scenario() {
		return (EReference)dronesSimulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesSimulation_TaskInstances() {
		return (EReference)dronesSimulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesSimulation_DroneInstances() {
		return (EReference)dronesSimulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDroneInstance() {
		return droneInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneInstance_Drone() {
		return (EReference)droneInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneInstance_Position() {
		return (EReference)droneInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneInstance_CurrentRole() {
		return (EReference)droneInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneInstance_Observations() {
		return (EReference)droneInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDroneInstance_CurrentBattery() {
		return (EAttribute)droneInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDroneInstance_State() {
		return (EAttribute)droneInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskInstance() {
		return taskInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskInstance_Task() {
		return (EReference)taskInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskInstance_RoleInstances() {
		return (EReference)taskInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskInstance_State() {
		return (EAttribute)taskInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstance() {
		return roleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstance_Role() {
		return (EReference)roleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstance_TaskInstance() {
		return (EReference)roleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstance_AllocatedDrone() {
		return (EReference)roleInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_Time() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_Id() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacleObservation() {
		return obstacleObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstacleObservation_Obstacle() {
		return (EReference)obstacleObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDroneObservation() {
		return droneObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneObservation_Drone() {
		return (EReference)droneObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneObservation_Position() {
		return (EReference)droneObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskState() {
		return taskStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDroneState() {
		return droneStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesSimulationFactory getDronesSimulationFactory() {
		return (DronesSimulationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dronesSimulationEClass = createEClass(DRONES_SIMULATION);
		createEReference(dronesSimulationEClass, DRONES_SIMULATION__SCENARIO);
		createEReference(dronesSimulationEClass, DRONES_SIMULATION__TASK_INSTANCES);
		createEReference(dronesSimulationEClass, DRONES_SIMULATION__DRONE_INSTANCES);

		droneInstanceEClass = createEClass(DRONE_INSTANCE);
		createEReference(droneInstanceEClass, DRONE_INSTANCE__DRONE);
		createEReference(droneInstanceEClass, DRONE_INSTANCE__POSITION);
		createEReference(droneInstanceEClass, DRONE_INSTANCE__CURRENT_ROLE);
		createEReference(droneInstanceEClass, DRONE_INSTANCE__OBSERVATIONS);
		createEAttribute(droneInstanceEClass, DRONE_INSTANCE__CURRENT_BATTERY);
		createEAttribute(droneInstanceEClass, DRONE_INSTANCE__STATE);

		taskInstanceEClass = createEClass(TASK_INSTANCE);
		createEReference(taskInstanceEClass, TASK_INSTANCE__TASK);
		createEReference(taskInstanceEClass, TASK_INSTANCE__ROLE_INSTANCES);
		createEAttribute(taskInstanceEClass, TASK_INSTANCE__STATE);

		roleInstanceEClass = createEClass(ROLE_INSTANCE);
		createEReference(roleInstanceEClass, ROLE_INSTANCE__ROLE);
		createEReference(roleInstanceEClass, ROLE_INSTANCE__TASK_INSTANCE);
		createEReference(roleInstanceEClass, ROLE_INSTANCE__ALLOCATED_DRONE);

		observationEClass = createEClass(OBSERVATION);
		createEAttribute(observationEClass, OBSERVATION__TIME);
		createEAttribute(observationEClass, OBSERVATION__ID);

		obstacleObservationEClass = createEClass(OBSTACLE_OBSERVATION);
		createEReference(obstacleObservationEClass, OBSTACLE_OBSERVATION__OBSTACLE);

		droneObservationEClass = createEClass(DRONE_OBSERVATION);
		createEReference(droneObservationEClass, DRONE_OBSERVATION__DRONE);
		createEReference(droneObservationEClass, DRONE_OBSERVATION__POSITION);

		// Create enums
		taskStateEEnum = createEEnum(TASK_STATE);
		droneStateEEnum = createEEnum(DRONE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DronesStructurePackage theDronesStructurePackage = (DronesStructurePackage)EPackage.Registry.INSTANCE.getEPackage(DronesStructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		obstacleObservationEClass.getESuperTypes().add(this.getObservation());
		droneObservationEClass.getESuperTypes().add(this.getObservation());

		// Initialize classes, features, and operations; add parameters
		initEClass(dronesSimulationEClass, DronesSimulation.class, "DronesSimulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDronesSimulation_Scenario(), theDronesStructurePackage.getScenario(), null, "scenario", null, 1, 1, DronesSimulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesSimulation_TaskInstances(), this.getTaskInstance(), null, "taskInstances", null, 0, -1, DronesSimulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesSimulation_DroneInstances(), this.getDroneInstance(), null, "droneInstances", null, 0, -1, DronesSimulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droneInstanceEClass, DroneInstance.class, "DroneInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDroneInstance_Drone(), theDronesStructurePackage.getDrone(), null, "drone", null, 1, 1, DroneInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDroneInstance_Position(), theDronesStructurePackage.getPosition(), null, "position", null, 1, 1, DroneInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDroneInstance_CurrentRole(), this.getRoleInstance(), this.getRoleInstance_AllocatedDrone(), "currentRole", null, 0, 1, DroneInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDroneInstance_Observations(), this.getObservation(), null, "observations", null, 0, -1, DroneInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDroneInstance_CurrentBattery(), ecorePackage.getEDouble(), "currentBattery", null, 0, 1, DroneInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDroneInstance_State(), this.getDroneState(), "state", null, 0, 1, DroneInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskInstanceEClass, TaskInstance.class, "TaskInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskInstance_Task(), theDronesStructurePackage.getTask(), null, "task", null, 0, 1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskInstance_RoleInstances(), this.getRoleInstance(), this.getRoleInstance_TaskInstance(), "roleInstances", null, 1, -1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskInstance_State(), this.getTaskState(), "state", "NOT_STARTED", 0, 1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleInstanceEClass, RoleInstance.class, "RoleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleInstance_Role(), theDronesStructurePackage.getRole(), null, "role", null, 0, 1, RoleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleInstance_TaskInstance(), this.getTaskInstance(), this.getTaskInstance_RoleInstances(), "taskInstance", null, 1, 1, RoleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleInstance_AllocatedDrone(), this.getDroneInstance(), this.getDroneInstance_CurrentRole(), "allocatedDrone", null, 0, 1, RoleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObservation_Time(), ecorePackage.getELong(), "time", "0", 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservation_Id(), ecorePackage.getELong(), "id", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obstacleObservationEClass, ObstacleObservation.class, "ObstacleObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObstacleObservation_Obstacle(), theDronesStructurePackage.getObstacle(), null, "obstacle", null, 1, 1, ObstacleObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droneObservationEClass, DroneObservation.class, "DroneObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDroneObservation_Drone(), theDronesStructurePackage.getDrone(), null, "drone", null, 1, 1, DroneObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDroneObservation_Position(), theDronesStructurePackage.getPosition(), null, "position", null, 1, 1, DroneObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(taskStateEEnum, TaskState.class, "TaskState");
		addEEnumLiteral(taskStateEEnum, TaskState.NOT_STARTED);
		addEEnumLiteral(taskStateEEnum, TaskState.WAITING);
		addEEnumLiteral(taskStateEEnum, TaskState.IN_PROGRESS);
		addEEnumLiteral(taskStateEEnum, TaskState.DONE);

		initEEnum(droneStateEEnum, DroneState.class, "DroneState");
		addEEnumLiteral(droneStateEEnum, DroneState.CREATED);
		addEEnumLiteral(droneStateEEnum, DroneState.HOVERING);
		addEEnumLiteral(droneStateEEnum, DroneState.MOVING);
		addEEnumLiteral(droneStateEEnum, DroneState.DONE);

		// Create resource
		createResource(eNS_URI);
	}

} //DronesSimulationPackageImpl
