/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.MovementCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScanningCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScenarioBounds;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronesStructurePackageImpl extends EPackageImpl implements DronesStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dronesStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movementCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooperativeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aabbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioBoundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanningCapabilityEClass = null;

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
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DronesStructurePackageImpl() {
		super(eNS_URI, DronesStructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DronesStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DronesStructurePackage init() {
		if (isInited) return (DronesStructurePackage)EPackage.Registry.INSTANCE.getEPackage(DronesStructurePackage.eNS_URI);

		// Obtain or create and register package
		DronesStructurePackageImpl theDronesStructurePackage = (DronesStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DronesStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DronesStructurePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDronesStructurePackage.createPackageContents();

		// Initialize created meta-data
		theDronesStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDronesStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DronesStructurePackage.eNS_URI, theDronesStructurePackage);
		return theDronesStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDronesStructure() {
		return dronesStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesStructure_Scenarios() {
		return (EReference)dronesStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesStructure_DroneTypes() {
		return (EReference)dronesStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesStructure_CooperativeActions() {
		return (EReference)dronesStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesStructure_Capabilities() {
		return (EReference)dronesStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Drones() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_AllowedBounds() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Obstacles() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Regions() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Tasks() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDroneType() {
		return droneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDroneType_Weight() {
		return (EAttribute)droneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDroneType_MaxBatteryCapacity() {
		return (EAttribute)droneTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDroneType_IdleEneryConsumption() {
		return (EAttribute)droneTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneType_ProvidedCapabilities() {
		return (EReference)droneTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneType_MovementCapability() {
		return (EReference)droneTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneType_Dimension() {
		return (EReference)droneTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroneType_ScanningCapability() {
		return (EReference)droneTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedCapability() {
		return providedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidedCapability_MaximalValue() {
		return (EAttribute)providedCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidedCapability_EnergyConsumptionPerValue() {
		return (EAttribute)providedCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedCapability_Capability() {
		return (EReference)providedCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedCapability_DroneType() {
		return (EReference)providedCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovementCapability() {
		return movementCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooperativeAction() {
		return cooperativeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCooperativeAction_Roles() {
		return (EReference)cooperativeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCooperativeAction_StartTimeout() {
		return (EAttribute)cooperativeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCooperativeAction_Duration() {
		return (EAttribute)cooperativeActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RequiredCapabilities() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_CooperativeAction() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredCapability() {
		return requiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredCapability_Capability() {
		return (EReference)requiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredCapability_MinimalValue() {
		return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredCapability_Role() {
		return (EReference)requiredCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrone() {
		return droneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_StartPosition() {
		return (EReference)droneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_Dronetype() {
		return (EReference)droneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_X() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Y() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Z() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Width() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Height() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Depth() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAABB() {
		return aabbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAABB_Position() {
		return (EReference)aabbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAABB_Dimension() {
		return (EReference)aabbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacle() {
		return obstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Tasks() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioBounds() {
		return scenarioBoundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Region() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ActionToPerform() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharger() {
		return chargerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanningCapability() {
		return scanningCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesStructureFactory getDronesStructureFactory() {
		return (DronesStructureFactory)getEFactoryInstance();
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
		dronesStructureEClass = createEClass(DRONES_STRUCTURE);
		createEReference(dronesStructureEClass, DRONES_STRUCTURE__SCENARIOS);
		createEReference(dronesStructureEClass, DRONES_STRUCTURE__DRONE_TYPES);
		createEReference(dronesStructureEClass, DRONES_STRUCTURE__COOPERATIVE_ACTIONS);
		createEReference(dronesStructureEClass, DRONES_STRUCTURE__CAPABILITIES);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__DRONES);
		createEReference(scenarioEClass, SCENARIO__ALLOWED_BOUNDS);
		createEReference(scenarioEClass, SCENARIO__OBSTACLES);
		createEReference(scenarioEClass, SCENARIO__REGIONS);
		createEReference(scenarioEClass, SCENARIO__TASKS);

		capabilityEClass = createEClass(CAPABILITY);

		droneTypeEClass = createEClass(DRONE_TYPE);
		createEAttribute(droneTypeEClass, DRONE_TYPE__WEIGHT);
		createEAttribute(droneTypeEClass, DRONE_TYPE__MAX_BATTERY_CAPACITY);
		createEAttribute(droneTypeEClass, DRONE_TYPE__IDLE_ENERY_CONSUMPTION);
		createEReference(droneTypeEClass, DRONE_TYPE__PROVIDED_CAPABILITIES);
		createEReference(droneTypeEClass, DRONE_TYPE__MOVEMENT_CAPABILITY);
		createEReference(droneTypeEClass, DRONE_TYPE__DIMENSION);
		createEReference(droneTypeEClass, DRONE_TYPE__SCANNING_CAPABILITY);

		providedCapabilityEClass = createEClass(PROVIDED_CAPABILITY);
		createEAttribute(providedCapabilityEClass, PROVIDED_CAPABILITY__MAXIMAL_VALUE);
		createEAttribute(providedCapabilityEClass, PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE);
		createEReference(providedCapabilityEClass, PROVIDED_CAPABILITY__CAPABILITY);
		createEReference(providedCapabilityEClass, PROVIDED_CAPABILITY__DRONE_TYPE);

		movementCapabilityEClass = createEClass(MOVEMENT_CAPABILITY);

		cooperativeActionEClass = createEClass(COOPERATIVE_ACTION);
		createEReference(cooperativeActionEClass, COOPERATIVE_ACTION__ROLES);
		createEAttribute(cooperativeActionEClass, COOPERATIVE_ACTION__START_TIMEOUT);
		createEAttribute(cooperativeActionEClass, COOPERATIVE_ACTION__DURATION);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__REQUIRED_CAPABILITIES);
		createEReference(roleEClass, ROLE__COOPERATIVE_ACTION);

		requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
		createEReference(requiredCapabilityEClass, REQUIRED_CAPABILITY__CAPABILITY);
		createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__MINIMAL_VALUE);
		createEReference(requiredCapabilityEClass, REQUIRED_CAPABILITY__ROLE);

		droneEClass = createEClass(DRONE);
		createEReference(droneEClass, DRONE__START_POSITION);
		createEReference(droneEClass, DRONE__DRONETYPE);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);
		createEAttribute(positionEClass, POSITION__Z);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__WIDTH);
		createEAttribute(dimensionEClass, DIMENSION__HEIGHT);
		createEAttribute(dimensionEClass, DIMENSION__DEPTH);

		aabbEClass = createEClass(AABB);
		createEReference(aabbEClass, AABB__POSITION);
		createEReference(aabbEClass, AABB__DIMENSION);

		obstacleEClass = createEClass(OBSTACLE);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__TASKS);

		scenarioBoundsEClass = createEClass(SCENARIO_BOUNDS);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__REGION);
		createEReference(taskEClass, TASK__ACTION_TO_PERFORM);

		chargerEClass = createEClass(CHARGER);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		scanningCapabilityEClass = createEClass(SCANNING_CAPABILITY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scenarioEClass.getESuperTypes().add(this.getNamedElement());
		capabilityEClass.getESuperTypes().add(this.getNamedElement());
		droneTypeEClass.getESuperTypes().add(this.getNamedElement());
		movementCapabilityEClass.getESuperTypes().add(this.getCapability());
		cooperativeActionEClass.getESuperTypes().add(this.getNamedElement());
		roleEClass.getESuperTypes().add(this.getNamedElement());
		droneEClass.getESuperTypes().add(this.getNamedElement());
		obstacleEClass.getESuperTypes().add(this.getAABB());
		obstacleEClass.getESuperTypes().add(this.getNamedElement());
		regionEClass.getESuperTypes().add(this.getAABB());
		regionEClass.getESuperTypes().add(this.getNamedElement());
		scenarioBoundsEClass.getESuperTypes().add(this.getAABB());
		taskEClass.getESuperTypes().add(this.getNamedElement());
		chargerEClass.getESuperTypes().add(this.getRegion());
		scanningCapabilityEClass.getESuperTypes().add(this.getCapability());

		// Initialize classes, features, and operations; add parameters
		initEClass(dronesStructureEClass, DronesStructure.class, "DronesStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDronesStructure_Scenarios(), this.getScenario(), null, "scenarios", null, 0, -1, DronesStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesStructure_DroneTypes(), this.getDroneType(), null, "droneTypes", null, 0, -1, DronesStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesStructure_CooperativeActions(), this.getCooperativeAction(), null, "cooperativeActions", null, 0, -1, DronesStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesStructure_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, DronesStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Drones(), this.getDrone(), null, "drones", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_AllowedBounds(), this.getScenarioBounds(), null, "allowedBounds", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Obstacles(), this.getObstacle(), null, "obstacles", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Regions(), this.getRegion(), null, "regions", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(droneTypeEClass, DroneType.class, "DroneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDroneType_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, DroneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDroneType_MaxBatteryCapacity(), ecorePackage.getEDouble(), "maxBatteryCapacity", null, 0, 1, DroneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDroneType_IdleEneryConsumption(), ecorePackage.getEDouble(), "idleEneryConsumption", null, 0, 1, DroneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDroneType_ProvidedCapabilities(), this.getProvidedCapability(), this.getProvidedCapability_DroneType(), "providedCapabilities", null, 0, -1, DroneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDroneType_MovementCapability(), this.getProvidedCapability(), null, "movementCapability", null, 0, 1, DroneType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDroneType_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, DroneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDroneType_ScanningCapability(), this.getProvidedCapability(), null, "scanningCapability", null, 0, 1, DroneType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(providedCapabilityEClass, ProvidedCapability.class, "ProvidedCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvidedCapability_MaximalValue(), ecorePackage.getEDouble(), "maximalValue", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidedCapability_EnergyConsumptionPerValue(), ecorePackage.getEDouble(), "energyConsumptionPerValue", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedCapability_Capability(), this.getCapability(), null, "capability", null, 1, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedCapability_DroneType(), this.getDroneType(), this.getDroneType_ProvidedCapabilities(), "droneType", null, 1, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(movementCapabilityEClass, MovementCapability.class, "MovementCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cooperativeActionEClass, CooperativeAction.class, "CooperativeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCooperativeAction_Roles(), this.getRole(), this.getRole_CooperativeAction(), "roles", null, 1, -1, CooperativeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCooperativeAction_StartTimeout(), ecorePackage.getEDouble(), "startTimeout", null, 0, 1, CooperativeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCooperativeAction_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, CooperativeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_RequiredCapabilities(), this.getRequiredCapability(), this.getRequiredCapability_Role(), "requiredCapabilities", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_CooperativeAction(), this.getCooperativeAction(), this.getCooperativeAction_Roles(), "cooperativeAction", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredCapability_Capability(), this.getCapability(), null, "capability", null, 1, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredCapability_MinimalValue(), ecorePackage.getEDouble(), "minimalValue", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredCapability_Role(), this.getRole(), this.getRole_RequiredCapabilities(), "role", null, 1, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droneEClass, Drone.class, "Drone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrone_StartPosition(), this.getPosition(), null, "startPosition", null, 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrone_Dronetype(), this.getDroneType(), null, "dronetype", null, 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Depth(), ecorePackage.getEDouble(), "depth", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aabbEClass, hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB.class, "AABB", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAABB_Position(), this.getPosition(), null, "position", null, 1, 1, hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAABB_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obstacleEClass, Obstacle.class, "Obstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Tasks(), this.getTask(), this.getTask_Region(), "tasks", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioBoundsEClass, ScenarioBounds.class, "ScenarioBounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Region(), this.getRegion(), this.getRegion_Tasks(), "region", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ActionToPerform(), this.getCooperativeAction(), null, "actionToPerform", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chargerEClass, Charger.class, "Charger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scanningCapabilityEClass, ScanningCapability.class, "ScanningCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "org.eclipse.incquery.querybasedfeature"
		   });
	}

} //DronesStructurePackageImpl
