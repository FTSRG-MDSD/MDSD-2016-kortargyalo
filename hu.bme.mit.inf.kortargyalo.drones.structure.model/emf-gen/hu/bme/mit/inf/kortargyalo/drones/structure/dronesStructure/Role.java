/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getCooperativeAction <em>Cooperative Action</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capabilities</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRole_RequiredCapabilities()
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getRole
	 * @model opposite="role" containment="true"
	 * @generated
	 */
	EList<RequiredCapability> getRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Cooperative Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooperative Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooperative Action</em>' container reference.
	 * @see #setCooperativeAction(CooperativeAction)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRole_CooperativeAction()
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	CooperativeAction getCooperativeAction();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getCooperativeAction <em>Cooperative Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooperative Action</em>' container reference.
	 * @see #getCooperativeAction()
	 * @generated
	 */
	void setCooperativeAction(CooperativeAction value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Role
