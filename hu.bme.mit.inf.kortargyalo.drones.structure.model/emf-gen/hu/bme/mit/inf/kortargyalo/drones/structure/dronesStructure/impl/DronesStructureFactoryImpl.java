/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronesStructureFactoryImpl extends EFactoryImpl implements DronesStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DronesStructureFactory init() {
		try {
			DronesStructureFactory theDronesStructureFactory = (DronesStructureFactory)EPackage.Registry.INSTANCE.getEFactory(DronesStructurePackage.eNS_URI);
			if (theDronesStructureFactory != null) {
				return theDronesStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DronesStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesStructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DronesStructurePackage.DRONES_STRUCTURE: return createDronesStructure();
			case DronesStructurePackage.SCENARIO: return createScenario();
			case DronesStructurePackage.CAPABILITY: return createCapability();
			case DronesStructurePackage.DRONE_TYPE: return createDroneType();
			case DronesStructurePackage.PROVIDED_CAPABILITY: return createProvidedCapability();
			case DronesStructurePackage.MOVEMENT_CAPABILITY: return createMovementCapability();
			case DronesStructurePackage.COOPERATIVE_ACTION: return createCooperativeAction();
			case DronesStructurePackage.ROLE: return createRole();
			case DronesStructurePackage.REQUIRED_CAPABILITY: return createRequiredCapability();
			case DronesStructurePackage.DRONE: return createDrone();
			case DronesStructurePackage.POSITION: return createPosition();
			case DronesStructurePackage.DIMENSION: return createDimension();
			case DronesStructurePackage.OBSTACLE: return createObstacle();
			case DronesStructurePackage.REGION: return createRegion();
			case DronesStructurePackage.SCENARIO_BOUNDS: return createScenarioBounds();
			case DronesStructurePackage.TASK: return createTask();
			case DronesStructurePackage.CHARGER: return createCharger();
			case DronesStructurePackage.SCANNING_CAPABILITY: return createScanningCapability();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesStructure createDronesStructure() {
		DronesStructureImpl dronesStructure = new DronesStructureImpl();
		return dronesStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneType createDroneType() {
		DroneTypeImpl droneType = new DroneTypeImpl();
		return droneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCapability createProvidedCapability() {
		ProvidedCapabilityImpl providedCapability = new ProvidedCapabilityImpl();
		return providedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementCapability createMovementCapability() {
		MovementCapabilityImpl movementCapability = new MovementCapabilityImpl();
		return movementCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooperativeAction createCooperativeAction() {
		CooperativeActionImpl cooperativeAction = new CooperativeActionImpl();
		return cooperativeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability createRequiredCapability() {
		RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone createDrone() {
		DroneImpl drone = new DroneImpl();
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle createObstacle() {
		ObstacleImpl obstacle = new ObstacleImpl();
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioBounds createScenarioBounds() {
		ScenarioBoundsImpl scenarioBounds = new ScenarioBoundsImpl();
		return scenarioBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charger createCharger() {
		ChargerImpl charger = new ChargerImpl();
		return charger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanningCapability createScanningCapability() {
		ScanningCapabilityImpl scanningCapability = new ScanningCapabilityImpl();
		return scanningCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesStructurePackage getDronesStructurePackage() {
		return (DronesStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DronesStructurePackage getPackage() {
		return DronesStructurePackage.eINSTANCE;
	}

} //DronesStructureFactoryImpl
