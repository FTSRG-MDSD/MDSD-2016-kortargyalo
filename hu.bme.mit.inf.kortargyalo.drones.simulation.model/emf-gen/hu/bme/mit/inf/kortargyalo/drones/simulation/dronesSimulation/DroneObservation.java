/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getDrone <em>Drone</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getDroneObservation()
 * @model
 * @generated
 */
public interface DroneObservation extends Observation {
	/**
	 * Returns the value of the '<em><b>Drone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drone</em>' reference.
	 * @see #setDrone(Drone)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getDroneObservation_Drone()
	 * @model required="true"
	 * @generated
	 */
	Drone getDrone();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getDrone <em>Drone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drone</em>' reference.
	 * @see #getDrone()
	 * @generated
	 */
	void setDrone(Drone value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getDroneObservation_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // DroneObservation
