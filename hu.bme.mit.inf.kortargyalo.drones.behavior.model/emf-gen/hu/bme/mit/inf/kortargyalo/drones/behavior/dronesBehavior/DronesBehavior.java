/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drones Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getScripts <em>Scripts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getSignals <em>Signals</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getDronesBehavior()
 * @model
 * @generated
 */
public interface DronesBehavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getDronesBehavior_Scripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Script> getScripts();

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getDronesBehavior_Signals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignals();

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
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getDronesBehavior_Scenario()
	 * @model
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // DronesBehavior
