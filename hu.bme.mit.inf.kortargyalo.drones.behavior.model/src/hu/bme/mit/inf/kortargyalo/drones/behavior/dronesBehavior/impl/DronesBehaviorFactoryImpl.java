/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronesBehaviorFactoryImpl extends EFactoryImpl implements DronesBehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DronesBehaviorFactory init() {
		try {
			DronesBehaviorFactory theDronesBehaviorFactory = (DronesBehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(DronesBehaviorPackage.eNS_URI);
			if (theDronesBehaviorFactory != null) {
				return theDronesBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DronesBehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesBehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DronesBehaviorPackage.DRONES_BEHAVIOR: return createDronesBehavior();
			case DronesBehaviorPackage.SCRIPT: return createScript();
			case DronesBehaviorPackage.SEQUENCE: return createSequence();
			case DronesBehaviorPackage.CONDITION: return createCondition();
			case DronesBehaviorPackage.LOOP: return createLoop();
			case DronesBehaviorPackage.COMPOSITE_STATEMENT: return createCompositeStatement();
			case DronesBehaviorPackage.ATOMIC_STATEMENT: return createAtomicStatement();
			case DronesBehaviorPackage.COOPERATE: return createCooperate();
			case DronesBehaviorPackage.MOVE: return createMove();
			case DronesBehaviorPackage.WAIT: return createWait();
			case DronesBehaviorPackage.SEND_SIGNAL: return createSendSignal();
			case DronesBehaviorPackage.SIMPLE_WAIT: return createSimpleWait();
			case DronesBehaviorPackage.COMPLEX_WAIT: return createComplexWait();
			case DronesBehaviorPackage.REACTION: return createReaction();
			case DronesBehaviorPackage.SIGNAL: return createSignal();
			case DronesBehaviorPackage.SEND_MAP: return createSendMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesBehavior createDronesBehavior() {
		DronesBehaviorImpl dronesBehavior = new DronesBehaviorImpl();
		return dronesBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStatement createCompositeStatement() {
		CompositeStatementImpl compositeStatement = new CompositeStatementImpl();
		return compositeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicStatement createAtomicStatement() {
		AtomicStatementImpl atomicStatement = new AtomicStatementImpl();
		return atomicStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cooperate createCooperate() {
		CooperateImpl cooperate = new CooperateImpl();
		return cooperate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignal createSendSignal() {
		SendSignalImpl sendSignal = new SendSignalImpl();
		return sendSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleWait createSimpleWait() {
		SimpleWaitImpl simpleWait = new SimpleWaitImpl();
		return simpleWait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexWait createComplexWait() {
		ComplexWaitImpl complexWait = new ComplexWaitImpl();
		return complexWait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reaction createReaction() {
		ReactionImpl reaction = new ReactionImpl();
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMap createSendMap() {
		SendMapImpl sendMap = new SendMapImpl();
		return sendMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesBehaviorPackage getDronesBehaviorPackage() {
		return (DronesBehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DronesBehaviorPackage getPackage() {
		return DronesBehaviorPackage.eINSTANCE;
	}

} //DronesBehaviorFactoryImpl
