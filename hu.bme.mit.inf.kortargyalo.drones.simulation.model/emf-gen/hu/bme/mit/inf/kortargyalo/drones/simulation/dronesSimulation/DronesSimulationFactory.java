/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage
 * @generated
 */
public interface DronesSimulationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronesSimulationFactory eINSTANCE = hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DronesSimulationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Drones Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drones Simulation</em>'.
	 * @generated
	 */
	DronesSimulation createDronesSimulation();

	/**
	 * Returns a new object of class '<em>Drone Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drone Instance</em>'.
	 * @generated
	 */
	DroneInstance createDroneInstance();

	/**
	 * Returns a new object of class '<em>Task Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Instance</em>'.
	 * @generated
	 */
	TaskInstance createTaskInstance();

	/**
	 * Returns a new object of class '<em>Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Instance</em>'.
	 * @generated
	 */
	RoleInstance createRoleInstance();

	/**
	 * Returns a new object of class '<em>Obstacle Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle Observation</em>'.
	 * @generated
	 */
	ObstacleObservation createObstacleObservation();

	/**
	 * Returns a new object of class '<em>Drone Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drone Observation</em>'.
	 * @generated
	 */
	DroneObservation createDroneObservation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DronesSimulationPackage getDronesSimulationPackage();

} //DronesSimulationFactory
