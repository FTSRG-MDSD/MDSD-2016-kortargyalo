/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getRegion <em>Region</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getActionToPerform <em>Action To Perform</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(Region)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getTask_Region()
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region#getTasks
	 * @model opposite="tasks" required="true"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Action To Perform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action To Perform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action To Perform</em>' reference.
	 * @see #setActionToPerform(CooperativeAction)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getTask_ActionToPerform()
	 * @model
	 * @generated
	 */
	CooperativeAction getActionToPerform();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getActionToPerform <em>Action To Perform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action To Perform</em>' reference.
	 * @see #getActionToPerform()
	 * @generated
	 */
	void setActionToPerform(CooperativeAction value);

} // Task
