/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Wait#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends Statement {

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getWait_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Wait#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);
} // Wait
