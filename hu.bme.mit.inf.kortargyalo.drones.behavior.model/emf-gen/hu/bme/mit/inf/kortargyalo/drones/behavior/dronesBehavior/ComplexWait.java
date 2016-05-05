/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait#getReactions <em>Reactions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait#getOnTimeout <em>On Timeout</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getComplexWait()
 * @model
 * @generated
 */
public interface ComplexWait extends Wait {
	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getComplexWait_Reactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reaction> getReactions();

	/**
	 * Returns the value of the '<em><b>On Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Timeout</em>' containment reference.
	 * @see #setOnTimeout(XExpression)
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#getComplexWait_OnTimeout()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getOnTimeout();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait#getOnTimeout <em>On Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Timeout</em>' containment reference.
	 * @see #getOnTimeout()
	 * @generated
	 */
	void setOnTimeout(XExpression value);

} // ComplexWait
