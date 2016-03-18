/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getRole <em>Role</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getTaskInstance <em>Task Instance</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getAllocatedDrone <em>Allocated Drone</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getRoleInstance()
 * @model
 * @generated
 */
public interface RoleInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getRoleInstance_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Task Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getRoleInstances <em>Role Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Instance</em>' container reference.
	 * @see #setTaskInstance(TaskInstance)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getRoleInstance_TaskInstance()
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance#getRoleInstances
	 * @model opposite="roleInstances" required="true" transient="false"
	 * @generated
	 */
	TaskInstance getTaskInstance();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getTaskInstance <em>Task Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Instance</em>' container reference.
	 * @see #getTaskInstance()
	 * @generated
	 */
	void setTaskInstance(TaskInstance value);

	/**
	 * Returns the value of the '<em><b>Allocated Drone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getCurrentRole <em>Current Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Drone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Drone</em>' reference.
	 * @see #setAllocatedDrone(DroneInstance)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getRoleInstance_AllocatedDrone()
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance#getCurrentRole
	 * @model opposite="currentRole"
	 * @generated
	 */
	DroneInstance getAllocatedDrone();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance#getAllocatedDrone <em>Allocated Drone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Drone</em>' reference.
	 * @see #getAllocatedDrone()
	 * @generated
	 */
	void setAllocatedDrone(DroneInstance value);

} // RoleInstance
