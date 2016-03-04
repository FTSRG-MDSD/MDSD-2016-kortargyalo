/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior;

import org.eclipse.emf.common.util.EList;

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

} // ComplexWait
