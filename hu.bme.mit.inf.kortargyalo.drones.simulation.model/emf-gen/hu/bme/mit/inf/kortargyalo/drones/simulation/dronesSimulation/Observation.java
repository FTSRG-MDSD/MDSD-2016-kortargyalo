/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getObservation()
 * @model abstract="true"
 * @generated
 */
public interface Observation extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getObservation_Time()
	 * @model default="0"
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

} // Observation
