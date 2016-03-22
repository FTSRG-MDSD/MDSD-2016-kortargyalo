/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends AABB, NamedElement {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage#getRegion_Tasks()
	 * @see hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task#getRegion
	 * @model opposite="region"
	 * @generated
	 */
	EList<Task> getTasks();

} // Region
