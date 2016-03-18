/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage
 * @generated
 */
public class DronesSimulationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DronesSimulationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesSimulationSwitch() {
		if (modelPackage == null) {
			modelPackage = DronesSimulationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DronesSimulationPackage.DRONES_SIMULATION: {
				DronesSimulation dronesSimulation = (DronesSimulation)theEObject;
				T result = caseDronesSimulation(dronesSimulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DronesSimulationPackage.DRONE_INSTANCE: {
				DroneInstance droneInstance = (DroneInstance)theEObject;
				T result = caseDroneInstance(droneInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DronesSimulationPackage.TASK_INSTANCE: {
				TaskInstance taskInstance = (TaskInstance)theEObject;
				T result = caseTaskInstance(taskInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DronesSimulationPackage.ROLE_INSTANCE: {
				RoleInstance roleInstance = (RoleInstance)theEObject;
				T result = caseRoleInstance(roleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DronesSimulationPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DronesSimulationPackage.OBSTACLE_OBSERVATION: {
				ObstacleObservation obstacleObservation = (ObstacleObservation)theEObject;
				T result = caseObstacleObservation(obstacleObservation);
				if (result == null) result = caseObservation(obstacleObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DronesSimulationPackage.DRONE_OBSERVATION: {
				DroneObservation droneObservation = (DroneObservation)theEObject;
				T result = caseDroneObservation(droneObservation);
				if (result == null) result = caseObservation(droneObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drones Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drones Simulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDronesSimulation(DronesSimulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drone Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drone Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDroneInstance(DroneInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInstance(TaskInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleInstance(RoleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstacle Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstacle Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstacleObservation(ObstacleObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drone Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drone Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDroneObservation(DroneObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DronesSimulationSwitch
