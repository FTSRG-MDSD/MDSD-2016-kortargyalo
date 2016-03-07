/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getDronetype <em>Dronetype</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' containment reference.
	 * @see #setStartPosition(Position)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getDrone_StartPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getStartPosition();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getStartPosition <em>Start Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' containment reference.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Dronetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dronetype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dronetype</em>' reference.
	 * @see #setDronetype(DroneType)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getDrone_Dronetype()
	 * @model required="true"
	 * @generated
	 */
	DroneType getDronetype();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone#getDronetype <em>Dronetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dronetype</em>' reference.
	 * @see #getDronetype()
	 * @generated
	 */
	void setDronetype(DroneType value);

} // Drone
