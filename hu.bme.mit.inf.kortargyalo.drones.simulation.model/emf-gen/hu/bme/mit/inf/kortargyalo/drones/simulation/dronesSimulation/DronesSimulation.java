/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drones Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getScenario <em>Scenario</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getTaskInstances <em>Task Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getDroneInstances <em>Drone Instances</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getDronesSimulation()
 * @model
 * @generated
 */
public interface DronesSimulation extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(Scenario)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getDronesSimulation_Scenario()
	 * @model required="true"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Task Instances</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Instances</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getDronesSimulation_TaskInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInstance> getTaskInstances();

	/**
	 * Returns the value of the '<em><b>Drone Instances</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drone Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drone Instances</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getDronesSimulation_DroneInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<DroneInstance> getDroneInstances();

} // DronesSimulation
