/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface DronesStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dronesStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/kortargyalo/dronesStructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dronesStructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronesStructurePackage eINSTANCE = hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl <em>Drones Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDronesStructure()
	 * @generated
	 */
	int DRONES_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_STRUCTURE__SCENARIOS = 0;

	/**
	 * The feature id for the '<em><b>Drone Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_STRUCTURE__DRONE_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Cooperative Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_STRUCTURE__COOPERATIVE_ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_STRUCTURE__CAPABILITIES = 3;

	/**
	 * The number of structural features of the '<em>Drones Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drones Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.NamedElementImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Drones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DRONES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allowed Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ALLOWED_BOUNDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obstacles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OBSTACLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REGIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CapabilityImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl <em>Drone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDroneType()
	 * @generated
	 */
	int DRONE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__WEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Battery Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__MAX_BATTERY_CAPACITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Idle Enery Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__IDLE_ENERY_CONSUMPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__PROVIDED_CAPABILITIES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Movement Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__MOVEMENT_CAPABILITY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__DIMENSION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scanning Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE__SCANNING_CAPABILITY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Drone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Drone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getProvidedCapability()
	 * @generated
	 */
	int PROVIDED_CAPABILITY = 4;

	/**
	 * The feature id for the '<em><b>Maximal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__MAXIMAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Energy Consumption Per Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Drone Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__DRONE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Provided Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Provided Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.MovementCapabilityImpl <em>Movement Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.MovementCapabilityImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getMovementCapability()
	 * @generated
	 */
	int MOVEMENT_CAPABILITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The number of structural features of the '<em>Movement Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Movement Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl <em>Cooperative Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getCooperativeAction()
	 * @generated
	 */
	int COOPERATIVE_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_ACTION__ROLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_ACTION__START_TIMEOUT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_ACTION__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cooperative Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cooperative Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RoleImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REQUIRED_CAPABILITIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cooperative Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COOPERATIVE_ACTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RequiredCapabilityImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getRequiredCapability()
	 * @generated
	 */
	int REQUIRED_CAPABILITY = 8;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__CAPABILITY = 0;

	/**
	 * The feature id for the '<em><b>Minimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__MINIMAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__START_POSITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dronetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DRONETYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.PositionImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Z = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DimensionImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DEPTH = 2;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.AABBImpl <em>AABB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.AABBImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getAABB()
	 * @generated
	 */
	int AABB = 12;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AABB__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AABB__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>AABB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AABB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AABB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AABB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ObstacleImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getObstacle()
	 * @generated
	 */
	int OBSTACLE = 13;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__POSITION = AABB__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__DIMENSION = AABB__DIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__NAME = AABB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_FEATURE_COUNT = AABB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OPERATION_COUNT = AABB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RegionImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 14;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__POSITION = AABB__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__DIMENSION = AABB__DIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = AABB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TASKS = AABB_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = AABB_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = AABB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioBoundsImpl <em>Scenario Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioBoundsImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getScenarioBounds()
	 * @generated
	 */
	int SCENARIO_BOUNDS = 15;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BOUNDS__POSITION = AABB__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BOUNDS__DIMENSION = AABB__DIMENSION;

	/**
	 * The number of structural features of the '<em>Scenario Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BOUNDS_FEATURE_COUNT = AABB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scenario Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BOUNDS_OPERATION_COUNT = AABB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.TaskImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REGION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action To Perform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTION_TO_PERFORM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ChargerImpl <em>Charger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ChargerImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getCharger()
	 * @generated
	 */
	int CHARGER = 17;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGER__POSITION = REGION__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGER__DIMENSION = REGION__DIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGER__NAME = REGION__NAME;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGER__TASKS = REGION__TASKS;

	/**
	 * The number of structural features of the '<em>Charger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGER_FEATURE_COUNT = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Charger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGER_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScanningCapabilityImpl <em>Scanning Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScanningCapabilityImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getScanningCapability()
	 * @generated
	 */
	int SCANNING_CAPABILITY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The number of structural features of the '<em>Scanning Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scanning Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure <em>Drones Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drones Structure</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure
	 * @generated
	 */
	EClass getDronesStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getScenarios()
	 * @see #getDronesStructure()
	 * @generated
	 */
	EReference getDronesStructure_Scenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getDroneTypes <em>Drone Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drone Types</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getDroneTypes()
	 * @see #getDronesStructure()
	 * @generated
	 */
	EReference getDronesStructure_DroneTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getCooperativeActions <em>Cooperative Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cooperative Actions</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getCooperativeActions()
	 * @see #getDronesStructure()
	 * @generated
	 */
	EReference getDronesStructure_CooperativeActions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure#getCapabilities()
	 * @see #getDronesStructure()
	 * @generated
	 */
	EReference getDronesStructure_Capabilities();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getDrones <em>Drones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drones</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getDrones()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Drones();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getAllowedBounds <em>Allowed Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Bounds</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getAllowedBounds()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_AllowedBounds();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getObstacles <em>Obstacles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obstacles</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getObstacles()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Obstacles();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getRegions()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Regions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario#getTasks()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Tasks();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType <em>Drone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone Type</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType
	 * @generated
	 */
	EClass getDroneType();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getWeight()
	 * @see #getDroneType()
	 * @generated
	 */
	EAttribute getDroneType_Weight();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getMaxBatteryCapacity <em>Max Battery Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Battery Capacity</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getMaxBatteryCapacity()
	 * @see #getDroneType()
	 * @generated
	 */
	EAttribute getDroneType_MaxBatteryCapacity();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getIdleEneryConsumption <em>Idle Enery Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idle Enery Consumption</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getIdleEneryConsumption()
	 * @see #getDroneType()
	 * @generated
	 */
	EAttribute getDroneType_IdleEneryConsumption();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getProvidedCapabilities()
	 * @see #getDroneType()
	 * @generated
	 */
	EReference getDroneType_ProvidedCapabilities();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getMovementCapability <em>Movement Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Movement Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getMovementCapability()
	 * @see #getDroneType()
	 * @generated
	 */
	EReference getDroneType_MovementCapability();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getDimension()
	 * @see #getDroneType()
	 * @generated
	 */
	EReference getDroneType_Dimension();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getScanningCapability <em>Scanning Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scanning Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getScanningCapability()
	 * @see #getDroneType()
	 * @generated
	 */
	EReference getDroneType_ScanningCapability();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability <em>Provided Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability
	 * @generated
	 */
	EClass getProvidedCapability();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getMaximalValue <em>Maximal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximal Value</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getMaximalValue()
	 * @see #getProvidedCapability()
	 * @generated
	 */
	EAttribute getProvidedCapability_MaximalValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getEnergyConsumptionPerValue <em>Energy Consumption Per Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Consumption Per Value</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getEnergyConsumptionPerValue()
	 * @see #getProvidedCapability()
	 * @generated
	 */
	EAttribute getProvidedCapability_EnergyConsumptionPerValue();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getCapability()
	 * @see #getProvidedCapability()
	 * @generated
	 */
	EReference getProvidedCapability_Capability();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getDroneType <em>Drone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Drone Type</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getDroneType()
	 * @see #getProvidedCapability()
	 * @generated
	 */
	EReference getProvidedCapability_DroneType();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.MovementCapability <em>Movement Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.MovementCapability
	 * @generated
	 */
	EClass getMovementCapability();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction <em>Cooperative Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooperative Action</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction
	 * @generated
	 */
	EClass getCooperativeAction();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getRoles()
	 * @see #getCooperativeAction()
	 * @generated
	 */
	EReference getCooperativeAction_Roles();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getStartTimeout <em>Start Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Timeout</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getStartTimeout()
	 * @see #getCooperativeAction()
	 * @generated
	 */
	EAttribute getCooperativeAction_StartTimeout();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getDuration()
	 * @see #getCooperativeAction()
	 * @generated
	 */
	EAttribute getCooperativeAction_Duration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getRequiredCapabilities()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RequiredCapabilities();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getCooperativeAction <em>Cooperative Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cooperative Action</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getCooperativeAction()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_CooperativeAction();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability
	 * @generated
	 */
	EClass getRequiredCapability();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getCapability()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EReference getRequiredCapability_Capability();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getMinimalValue <em>Minimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimal Value</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getMinimalValue()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EAttribute getRequiredCapability_MinimalValue();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Role</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getRole()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EReference getRequiredCapability_Role();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Position</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getStartPosition()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_StartPosition();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getDronetype <em>Dronetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dronetype</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getDronetype()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Dronetype();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position#getZ()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Z();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension#getDepth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Depth();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB <em>AABB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AABB</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB
	 * @generated
	 */
	EClass getAABB();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB#getPosition()
	 * @see #getAABB()
	 * @generated
	 */
	EReference getAABB_Position();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.AABB#getDimension()
	 * @see #getAABB()
	 * @generated
	 */
	EReference getAABB_Dimension();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region#getTasks()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Tasks();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScenarioBounds <em>Scenario Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Bounds</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScenarioBounds
	 * @generated
	 */
	EClass getScenarioBounds();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getRegion()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Region();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getActionToPerform <em>Action To Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action To Perform</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getActionToPerform()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ActionToPerform();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger <em>Charger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charger</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger
	 * @generated
	 */
	EClass getCharger();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScanningCapability <em>Scanning Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scanning Capability</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScanningCapability
	 * @generated
	 */
	EClass getScanningCapability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DronesStructureFactory getDronesStructureFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl <em>Drones Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructureImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDronesStructure()
		 * @generated
		 */
		EClass DRONES_STRUCTURE = eINSTANCE.getDronesStructure();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_STRUCTURE__SCENARIOS = eINSTANCE.getDronesStructure_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Drone Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_STRUCTURE__DRONE_TYPES = eINSTANCE.getDronesStructure_DroneTypes();

		/**
		 * The meta object literal for the '<em><b>Cooperative Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_STRUCTURE__COOPERATIVE_ACTIONS = eINSTANCE.getDronesStructure_CooperativeActions();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_STRUCTURE__CAPABILITIES = eINSTANCE.getDronesStructure_Capabilities();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Drones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__DRONES = eINSTANCE.getScenario_Drones();

		/**
		 * The meta object literal for the '<em><b>Allowed Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ALLOWED_BOUNDS = eINSTANCE.getScenario_AllowedBounds();

		/**
		 * The meta object literal for the '<em><b>Obstacles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__OBSTACLES = eINSTANCE.getScenario_Obstacles();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__REGIONS = eINSTANCE.getScenario_Regions();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__TASKS = eINSTANCE.getScenario_Tasks();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CapabilityImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl <em>Drone Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneTypeImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDroneType()
		 * @generated
		 */
		EClass DRONE_TYPE = eINSTANCE.getDroneType();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE_TYPE__WEIGHT = eINSTANCE.getDroneType_Weight();

		/**
		 * The meta object literal for the '<em><b>Max Battery Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE_TYPE__MAX_BATTERY_CAPACITY = eINSTANCE.getDroneType_MaxBatteryCapacity();

		/**
		 * The meta object literal for the '<em><b>Idle Enery Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE_TYPE__IDLE_ENERY_CONSUMPTION = eINSTANCE.getDroneType_IdleEneryConsumption();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_TYPE__PROVIDED_CAPABILITIES = eINSTANCE.getDroneType_ProvidedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Movement Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_TYPE__MOVEMENT_CAPABILITY = eINSTANCE.getDroneType_MovementCapability();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_TYPE__DIMENSION = eINSTANCE.getDroneType_Dimension();

		/**
		 * The meta object literal for the '<em><b>Scanning Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_TYPE__SCANNING_CAPABILITY = eINSTANCE.getDroneType_ScanningCapability();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ProvidedCapabilityImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getProvidedCapability()
		 * @generated
		 */
		EClass PROVIDED_CAPABILITY = eINSTANCE.getProvidedCapability();

		/**
		 * The meta object literal for the '<em><b>Maximal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_CAPABILITY__MAXIMAL_VALUE = eINSTANCE.getProvidedCapability_MaximalValue();

		/**
		 * The meta object literal for the '<em><b>Energy Consumption Per Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_CAPABILITY__ENERGY_CONSUMPTION_PER_VALUE = eINSTANCE.getProvidedCapability_EnergyConsumptionPerValue();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_CAPABILITY__CAPABILITY = eINSTANCE.getProvidedCapability_Capability();

		/**
		 * The meta object literal for the '<em><b>Drone Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_CAPABILITY__DRONE_TYPE = eINSTANCE.getProvidedCapability_DroneType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.MovementCapabilityImpl <em>Movement Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.MovementCapabilityImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getMovementCapability()
		 * @generated
		 */
		EClass MOVEMENT_CAPABILITY = eINSTANCE.getMovementCapability();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl <em>Cooperative Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getCooperativeAction()
		 * @generated
		 */
		EClass COOPERATIVE_ACTION = eINSTANCE.getCooperativeAction();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOPERATIVE_ACTION__ROLES = eINSTANCE.getCooperativeAction_Roles();

		/**
		 * The meta object literal for the '<em><b>Start Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOPERATIVE_ACTION__START_TIMEOUT = eINSTANCE.getCooperativeAction_StartTimeout();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOPERATIVE_ACTION__DURATION = eINSTANCE.getCooperativeAction_Duration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RoleImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__REQUIRED_CAPABILITIES = eINSTANCE.getRole_RequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Cooperative Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__COOPERATIVE_ACTION = eINSTANCE.getRole_CooperativeAction();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RequiredCapabilityImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getRequiredCapability()
		 * @generated
		 */
		EClass REQUIRED_CAPABILITY = eINSTANCE.getRequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_CAPABILITY__CAPABILITY = eINSTANCE.getRequiredCapability_Capability();

		/**
		 * The meta object literal for the '<em><b>Minimal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_CAPABILITY__MINIMAL_VALUE = eINSTANCE.getRequiredCapability_MinimalValue();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_CAPABILITY__ROLE = eINSTANCE.getRequiredCapability_Role();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__START_POSITION = eINSTANCE.getDrone_StartPosition();

		/**
		 * The meta object literal for the '<em><b>Dronetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__DRONETYPE = eINSTANCE.getDrone_Dronetype();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.PositionImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Z = eINSTANCE.getPosition_Z();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DimensionImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__DEPTH = eINSTANCE.getDimension_Depth();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.AABBImpl <em>AABB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.AABBImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getAABB()
		 * @generated
		 */
		EClass AABB = eINSTANCE.getAABB();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AABB__POSITION = eINSTANCE.getAABB_Position();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AABB__DIMENSION = eINSTANCE.getAABB_Dimension();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ObstacleImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getObstacle()
		 * @generated
		 */
		EClass OBSTACLE = eINSTANCE.getObstacle();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.RegionImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TASKS = eINSTANCE.getRegion_Tasks();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioBoundsImpl <em>Scenario Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioBoundsImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getScenarioBounds()
		 * @generated
		 */
		EClass SCENARIO_BOUNDS = eINSTANCE.getScenarioBounds();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.TaskImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__REGION = eINSTANCE.getTask_Region();

		/**
		 * The meta object literal for the '<em><b>Action To Perform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ACTION_TO_PERFORM = eINSTANCE.getTask_ActionToPerform();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ChargerImpl <em>Charger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ChargerImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getCharger()
		 * @generated
		 */
		EClass CHARGER = eINSTANCE.getCharger();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.NamedElementImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScanningCapabilityImpl <em>Scanning Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScanningCapabilityImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DronesStructurePackageImpl#getScanningCapability()
		 * @generated
		 */
		EClass SCANNING_CAPABILITY = eINSTANCE.getScanningCapability();

	}

} //DronesStructurePackage
