/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cooperative Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getRoles <em>Roles</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getStartTimeout <em>Start Timeout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getCooperativeAction()
 * @model
 * @generated
 */
public interface CooperativeAction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getCooperativeAction <em>Cooperative Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getCooperativeAction_Roles()
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getCooperativeAction
	 * @model opposite="cooperativeAction" containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Start Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Timeout</em>' attribute.
	 * @see #setStartTimeout(double)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getCooperativeAction_StartTimeout()
	 * @model
	 * @generated
	 */
	double getStartTimeout();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getStartTimeout <em>Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Timeout</em>' attribute.
	 * @see #getStartTimeout()
	 * @generated
	 */
	void setStartTimeout(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getCooperativeAction_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

} // CooperativeAction
