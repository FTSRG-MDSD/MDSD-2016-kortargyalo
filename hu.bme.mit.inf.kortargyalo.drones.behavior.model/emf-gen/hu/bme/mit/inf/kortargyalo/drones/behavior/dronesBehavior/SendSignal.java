/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getSignal <em>Signal</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getRecipent <em>Recipent</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getSendSignal()
 * @model
 * @generated
 */
public interface SendSignal extends AtomicStatement {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getSendSignal_Signal()
	 * @model
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Recipent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipent</em>' reference.
	 * @see #setRecipent(Drone)
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getSendSignal_Recipent()
	 * @model
	 * @generated
	 */
	Drone getRecipent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getRecipent <em>Recipent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipent</em>' reference.
	 * @see #getRecipent()
	 * @generated
	 */
	void setRecipent(Drone value);

} // SendSignal
