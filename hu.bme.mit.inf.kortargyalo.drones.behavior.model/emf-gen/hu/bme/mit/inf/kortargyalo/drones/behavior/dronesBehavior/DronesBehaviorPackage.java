/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface DronesBehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dronesBehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/kortargyalo/dronesBehavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dronesBehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronesBehaviorPackage eINSTANCE = hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl <em>Drones Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getDronesBehavior()
	 * @generated
	 */
	int DRONES_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_BEHAVIOR__SCRIPTS = 0;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_BEHAVIOR__SIGNALS = 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_BEHAVIOR__SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_BEHAVIOR__IMPORTS = 3;

	/**
	 * The number of structural features of the '<em>Drones Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_BEHAVIOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drones Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONES_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScriptImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Drone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__DRONE = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.StatementImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * The generated code looks for XbasePackage.XEXPRESSION_OPERATION_COUNT, but it does not exist.
	 * We override the generated code manually to compile.
	 * @generated NOT
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.AtomicStatementImpl <em>Atomic Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.AtomicStatementImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getAtomicStatement()
	 * @generated
	 */
	int ATOMIC_STATEMENT = 3;

	/**
	 * The number of structural features of the '<em>Atomic Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomic Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.CooperateImpl <em>Cooperate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.CooperateImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getCooperate()
	 * @generated
	 */
	int COOPERATE = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATE__ROLE = ATOMIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATE__TASK = ATOMIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cooperate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATE_FEATURE_COUNT = ATOMIC_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cooperate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATE_OPERATION_COUNT = ATOMIC_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.MoveImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 5;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DESTINATION = ATOMIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = ATOMIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = ATOMIC_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.WaitImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 6;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TIMEOUT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendSignalImpl <em>Send Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendSignalImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSendSignal()
	 * @generated
	 */
	int SEND_SIGNAL = 7;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL__SIGNAL = ATOMIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recipent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL__RECIPENT = ATOMIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_FEATURE_COUNT = ATOMIC_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Send Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_OPERATION_COUNT = ATOMIC_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SimpleWaitImpl <em>Simple Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SimpleWaitImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSimpleWait()
	 * @generated
	 */
	int SIMPLE_WAIT = 8;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_WAIT__TIMEOUT = WAIT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_WAIT__SIGNAL = WAIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_WAIT_FEATURE_COUNT = WAIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_WAIT_OPERATION_COUNT = WAIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ComplexWaitImpl <em>Complex Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ComplexWaitImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getComplexWait()
	 * @generated
	 */
	int COMPLEX_WAIT = 9;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_WAIT__TIMEOUT = WAIT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_WAIT__REACTIONS = WAIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_WAIT__ON_TIMEOUT = WAIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_WAIT_FEATURE_COUNT = WAIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complex Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_WAIT_OPERATION_COUNT = WAIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ReactionImpl <em>Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ReactionImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getReaction()
	 * @generated
	 */
	int REACTION = 10;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__SIGNAL = 1;

	/**
	 * The number of structural features of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SignalImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = DronesStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = DronesStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = DronesStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendMapImpl <em>Send Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendMapImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSendMap()
	 * @generated
	 */
	int SEND_MAP = 12;

	/**
	 * The feature id for the '<em><b>Recipent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MAP__RECIPENT = ATOMIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MAP_FEATURE_COUNT = ATOMIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MAP_OPERATION_COUNT = ATOMIC_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScanImpl <em>Scan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScanImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getScan()
	 * @generated
	 */
	int SCAN = 13;

	/**
	 * The number of structural features of the '<em>Scan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_FEATURE_COUNT = ATOMIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_OPERATION_COUNT = ATOMIC_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ChargeImpl <em>Charge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ChargeImpl
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getCharge()
	 * @generated
	 */
	int CHARGE = 14;

	/**
	 * The number of structural features of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_FEATURE_COUNT = ATOMIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OPERATION_COUNT = ATOMIC_STATEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior <em>Drones Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drones Behavior</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior
	 * @generated
	 */
	EClass getDronesBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getScripts()
	 * @see #getDronesBehavior()
	 * @generated
	 */
	EReference getDronesBehavior_Scripts();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getSignals()
	 * @see #getDronesBehavior()
	 * @generated
	 */
	EReference getDronesBehavior_Signals();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getScenario()
	 * @see #getDronesBehavior()
	 * @generated
	 */
	EReference getDronesBehavior_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imports</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior#getImports()
	 * @see #getDronesBehavior()
	 * @generated
	 */
	EReference getDronesBehavior_Imports();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script#getStatement()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Statement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script#getDrone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drone</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script#getDrone()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Drone();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.AtomicStatement <em>Atomic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Statement</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.AtomicStatement
	 * @generated
	 */
	EClass getAtomicStatement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate <em>Cooperate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooperate</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate
	 * @generated
	 */
	EClass getCooperate();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate#getRole()
	 * @see #getCooperate()
	 * @generated
	 */
	EReference getCooperate_Role();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate#getTask()
	 * @see #getCooperate()
	 * @generated
	 */
	EReference getCooperate_Task();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Move#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Move#getDestination()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Destination();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Wait#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Wait#getTimeout()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Timeout();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal <em>Send Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Signal</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal
	 * @generated
	 */
	EClass getSendSignal();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getSignal()
	 * @see #getSendSignal()
	 * @generated
	 */
	EReference getSendSignal_Signal();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getRecipent <em>Recipent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recipent</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal#getRecipent()
	 * @see #getSendSignal()
	 * @generated
	 */
	EReference getSendSignal_Recipent();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SimpleWait <em>Simple Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Wait</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SimpleWait
	 * @generated
	 */
	EClass getSimpleWait();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SimpleWait#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SimpleWait#getSignal()
	 * @see #getSimpleWait()
	 * @generated
	 */
	EReference getSimpleWait_Signal();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait <em>Complex Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Wait</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait
	 * @generated
	 */
	EClass getComplexWait();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait#getReactions()
	 * @see #getComplexWait()
	 * @generated
	 */
	EReference getComplexWait_Reactions();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait#getOnTimeout <em>On Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Timeout</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait#getOnTimeout()
	 * @see #getComplexWait()
	 * @generated
	 */
	EReference getComplexWait_OnTimeout();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction
	 * @generated
	 */
	EClass getReaction();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction#getStatement()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Statement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction#getSignal()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Signal();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendMap <em>Send Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Map</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendMap
	 * @generated
	 */
	EClass getSendMap();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendMap#getRecipent <em>Recipent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recipent</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendMap#getRecipent()
	 * @see #getSendMap()
	 * @generated
	 */
	EReference getSendMap_Recipent();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Scan <em>Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Scan
	 * @generated
	 */
	EClass getScan();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Charge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge</em>'.
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Charge
	 * @generated
	 */
	EClass getCharge();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DronesBehaviorFactory getDronesBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl <em>Drones Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getDronesBehavior()
		 * @generated
		 */
		EClass DRONES_BEHAVIOR = eINSTANCE.getDronesBehavior();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_BEHAVIOR__SCRIPTS = eINSTANCE.getDronesBehavior_Scripts();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_BEHAVIOR__SIGNALS = eINSTANCE.getDronesBehavior_Signals();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_BEHAVIOR__SCENARIO = eINSTANCE.getDronesBehavior_Scenario();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONES_BEHAVIOR__IMPORTS = eINSTANCE.getDronesBehavior_Imports();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScriptImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__STATEMENT = eINSTANCE.getScript_Statement();

		/**
		 * The meta object literal for the '<em><b>Drone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__DRONE = eINSTANCE.getScript_Drone();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.StatementImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.AtomicStatementImpl <em>Atomic Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.AtomicStatementImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getAtomicStatement()
		 * @generated
		 */
		EClass ATOMIC_STATEMENT = eINSTANCE.getAtomicStatement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.CooperateImpl <em>Cooperate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.CooperateImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getCooperate()
		 * @generated
		 */
		EClass COOPERATE = eINSTANCE.getCooperate();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOPERATE__ROLE = eINSTANCE.getCooperate_Role();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOPERATE__TASK = eINSTANCE.getCooperate_Task();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.MoveImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__DESTINATION = eINSTANCE.getMove_Destination();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.WaitImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__TIMEOUT = eINSTANCE.getWait_Timeout();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendSignalImpl <em>Send Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendSignalImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSendSignal()
		 * @generated
		 */
		EClass SEND_SIGNAL = eINSTANCE.getSendSignal();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL__SIGNAL = eINSTANCE.getSendSignal_Signal();

		/**
		 * The meta object literal for the '<em><b>Recipent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL__RECIPENT = eINSTANCE.getSendSignal_Recipent();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SimpleWaitImpl <em>Simple Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SimpleWaitImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSimpleWait()
		 * @generated
		 */
		EClass SIMPLE_WAIT = eINSTANCE.getSimpleWait();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_WAIT__SIGNAL = eINSTANCE.getSimpleWait_Signal();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ComplexWaitImpl <em>Complex Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ComplexWaitImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getComplexWait()
		 * @generated
		 */
		EClass COMPLEX_WAIT = eINSTANCE.getComplexWait();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_WAIT__REACTIONS = eINSTANCE.getComplexWait_Reactions();

		/**
		 * The meta object literal for the '<em><b>On Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_WAIT__ON_TIMEOUT = eINSTANCE.getComplexWait_OnTimeout();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ReactionImpl <em>Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ReactionImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getReaction()
		 * @generated
		 */
		EClass REACTION = eINSTANCE.getReaction();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__STATEMENT = eINSTANCE.getReaction_Statement();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__SIGNAL = eINSTANCE.getReaction_Signal();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SignalImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendMapImpl <em>Send Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendMapImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getSendMap()
		 * @generated
		 */
		EClass SEND_MAP = eINSTANCE.getSendMap();

		/**
		 * The meta object literal for the '<em><b>Recipent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MAP__RECIPENT = eINSTANCE.getSendMap_Recipent();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScanImpl <em>Scan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScanImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getScan()
		 * @generated
		 */
		EClass SCAN = eINSTANCE.getScan();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ChargeImpl <em>Charge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ChargeImpl
		 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorPackageImpl#getCharge()
		 * @generated
		 */
		EClass CHARGE = eINSTANCE.getCharge();

	}

} //DronesBehaviorPackage
