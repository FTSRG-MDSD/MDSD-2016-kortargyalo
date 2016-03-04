/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getCapability <em>Capability</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getMinimalValue <em>Minimal Value</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRequiredCapability()
 * @model
 * @generated
 */
public interface RequiredCapability extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(Capability)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRequiredCapability_Capability()
	 * @model required="true"
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

	/**
	 * Returns the value of the '<em><b>Minimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimal Value</em>' attribute.
	 * @see #setMinimalValue(double)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRequiredCapability_MinimalValue()
	 * @model
	 * @generated
	 */
	double getMinimalValue();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getMinimalValue <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimal Value</em>' attribute.
	 * @see #getMinimalValue()
	 * @generated
	 */
	void setMinimalValue(double value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' container reference.
	 * @see #setRole(Role)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRequiredCapability_Role()
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role#getRequiredCapabilities
	 * @model opposite="requiredCapabilities" required="true" transient="false"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability#getRole <em>Role</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' container reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // RequiredCapability
