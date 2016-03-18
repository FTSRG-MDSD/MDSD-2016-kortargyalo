/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation#getObstacle <em>Obstacle</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getObstacleObservation()
 * @model
 * @generated
 */
public interface ObstacleObservation extends Observation {
	/**
	 * Returns the value of the '<em><b>Obstacle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstacle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstacle</em>' reference.
	 * @see #setObstacle(Obstacle)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getObstacleObservation_Obstacle()
	 * @model required="true"
	 * @generated
	 */
	Obstacle getObstacle();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation#getObstacle <em>Obstacle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obstacle</em>' reference.
	 * @see #getObstacle()
	 * @generated
	 */
	void setObstacle(Obstacle value);

} // ObstacleObservation
