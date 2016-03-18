/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage#getTaskState()
 * @model
 * @generated
 */
public enum TaskState implements Enumerator {
	/**
	 * The '<em><b>NOT STARTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_STARTED(0, "NOT_STARTED", "NOT_STARTED"),

	/**
	 * The '<em><b>WAITING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	WAITING(1, "WAITING", "WAITING"),

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(2, "IN_PROGRESS", "IN_PROGRESS"),

	/**
	 * The '<em><b>DONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONE_VALUE
	 * @generated
	 * @ordered
	 */
	DONE(3, "DONE", "DONE");

	/**
	 * The '<em><b>NOT STARTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT STARTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_STARTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_STARTED_VALUE = 0;

	/**
	 * The '<em><b>WAITING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAITING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAITING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAITING_VALUE = 1;

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN PROGRESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 2;

	/**
	 * The '<em><b>DONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Task State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskState[] VALUES_ARRAY =
		new TaskState[] {
			NOT_STARTED,
			WAITING,
			IN_PROGRESS,
			DONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Task State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskState get(int value) {
		switch (value) {
			case NOT_STARTED_VALUE: return NOT_STARTED;
			case WAITING_VALUE: return WAITING;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case DONE_VALUE: return DONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TaskState
