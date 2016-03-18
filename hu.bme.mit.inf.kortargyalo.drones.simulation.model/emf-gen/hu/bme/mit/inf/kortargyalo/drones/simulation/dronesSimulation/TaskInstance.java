/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getTask <em>Task</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getRoleInstances <em>Role Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getState <em>State</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getTaskInstance()
 * @model
 * @generated
 */
public interface TaskInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getTaskInstance_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Role Instances</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getTaskInstance <em>Task Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Instances</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getTaskInstance_RoleInstances()
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getTaskInstance
	 * @model opposite="taskInstance" containment="true" required="true"
	 * @generated
	 */
	EList<RoleInstance> getRoleInstances();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"NOT_STARTED"</code>.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
	 * @see #setState(TaskState)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getTaskInstance_State()
	 * @model default="NOT_STARTED"
	 * @generated
	 */
	TaskState getState();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
	 * @see #getState()
	 * @generated
	 */
	void setState(TaskState value);

} // TaskInstance
