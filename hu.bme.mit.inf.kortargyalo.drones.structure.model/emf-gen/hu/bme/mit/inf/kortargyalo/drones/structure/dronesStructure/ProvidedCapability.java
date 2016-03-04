/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getMaximalValue <em>Maximal Value</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getEnergyConsumptionPerValue <em>Energy Consumption Per Value</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getCapability <em>Capability</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getDroneType <em>Drone Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getProvidedCapability()
 * @model
 * @generated
 */
public interface ProvidedCapability extends EObject {
	/**
	 * Returns the value of the '<em><b>Maximal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximal Value</em>' attribute.
	 * @see #setMaximalValue(double)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getProvidedCapability_MaximalValue()
	 * @model
	 * @generated
	 */
	double getMaximalValue();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getMaximalValue <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximal Value</em>' attribute.
	 * @see #getMaximalValue()
	 * @generated
	 */
	void setMaximalValue(double value);

	/**
	 * Returns the value of the '<em><b>Energy Consumption Per Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumption Per Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumption Per Value</em>' attribute.
	 * @see #setEnergyConsumptionPerValue(double)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getProvidedCapability_EnergyConsumptionPerValue()
	 * @model
	 * @generated
	 */
	double getEnergyConsumptionPerValue();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getEnergyConsumptionPerValue <em>Energy Consumption Per Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Consumption Per Value</em>' attribute.
	 * @see #getEnergyConsumptionPerValue()
	 * @generated
	 */
	void setEnergyConsumptionPerValue(double value);

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
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getProvidedCapability_Capability()
	 * @model required="true"
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

	/**
	 * Returns the value of the '<em><b>Drone Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drone Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drone Type</em>' container reference.
	 * @see #setDroneType(DroneType)
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getProvidedCapability_DroneType()
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType#getProvidedCapabilities
	 * @model opposite="providedCapabilities" required="true" transient="false"
	 * @generated
	 */
	DroneType getDroneType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability#getDroneType <em>Drone Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drone Type</em>' container reference.
	 * @see #getDroneType()
	 * @generated
	 */
	void setDroneType(DroneType value);

} // ProvidedCapability
