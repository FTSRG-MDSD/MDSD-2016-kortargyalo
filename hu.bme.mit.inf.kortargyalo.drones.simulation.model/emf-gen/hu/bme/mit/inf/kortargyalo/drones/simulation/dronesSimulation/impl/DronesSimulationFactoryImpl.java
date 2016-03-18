/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DronesSimulationFactoryImpl extends EFactoryImpl implements DronesSimulationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DronesSimulationFactory init() {
		try {
			DronesSimulationFactory theDronesSimulationFactory = (DronesSimulationFactory)EPackage.Registry.INSTANCE.getEFactory(DronesSimulationPackage.eNS_URI);
			if (theDronesSimulationFactory != null) {
				return theDronesSimulationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DronesSimulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesSimulationFactoryImpl() {
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
			case DronesSimulationPackage.DRONES_SIMULATION: return createDronesSimulation();
			case DronesSimulationPackage.DRONE_INSTANCE: return createDroneInstance();
			case DronesSimulationPackage.TASK_INSTANCE: return createTaskInstance();
			case DronesSimulationPackage.ROLE_INSTANCE: return createRoleInstance();
			case DronesSimulationPackage.OBSTACLE_OBSERVATION: return createObstacleObservation();
			case DronesSimulationPackage.DRONE_OBSERVATION: return createDroneObservation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DronesSimulationPackage.TASK_STATE:
				return createTaskStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DronesSimulationPackage.TASK_STATE:
				return convertTaskStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesSimulation createDronesSimulation() {
		DronesSimulationImpl dronesSimulation = new DronesSimulationImpl();
		return dronesSimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneInstance createDroneInstance() {
		DroneInstanceImpl droneInstance = new DroneInstanceImpl();
		return droneInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInstance createTaskInstance() {
		TaskInstanceImpl taskInstance = new TaskInstanceImpl();
		return taskInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstance createRoleInstance() {
		RoleInstanceImpl roleInstance = new RoleInstanceImpl();
		return roleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstacleObservation createObstacleObservation() {
		ObstacleObservationImpl obstacleObservation = new ObstacleObservationImpl();
		return obstacleObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneObservation createDroneObservation() {
		DroneObservationImpl droneObservation = new DroneObservationImpl();
		return droneObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskState createTaskStateFromString(EDataType eDataType, String initialValue) {
		TaskState result = TaskState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesSimulationPackage getDronesSimulationPackage() {
		return (DronesSimulationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DronesSimulationPackage getPackage() {
		return DronesSimulationPackage.eINSTANCE;
	}

} //DronesSimulationFactoryImpl
