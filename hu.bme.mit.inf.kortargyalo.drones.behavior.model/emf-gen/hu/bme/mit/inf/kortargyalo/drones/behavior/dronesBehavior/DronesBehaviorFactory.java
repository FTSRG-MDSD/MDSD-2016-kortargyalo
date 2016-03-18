/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage
 * @generated
 */
public interface DronesBehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronesBehaviorFactory eINSTANCE = hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Drones Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drones Behavior</em>'.
	 * @generated
	 */
	DronesBehavior createDronesBehavior();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Composite Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Statement</em>'.
	 * @generated
	 */
	CompositeStatement createCompositeStatement();

	/**
	 * Returns a new object of class '<em>Atomic Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Statement</em>'.
	 * @generated
	 */
	AtomicStatement createAtomicStatement();

	/**
	 * Returns a new object of class '<em>Cooperate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooperate</em>'.
	 * @generated
	 */
	Cooperate createCooperate();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	Move createMove();

	/**
	 * Returns a new object of class '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait</em>'.
	 * @generated
	 */
	Wait createWait();

	/**
	 * Returns a new object of class '<em>Send Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Signal</em>'.
	 * @generated
	 */
	SendSignal createSendSignal();

	/**
	 * Returns a new object of class '<em>Simple Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Wait</em>'.
	 * @generated
	 */
	SimpleWait createSimpleWait();

	/**
	 * Returns a new object of class '<em>Complex Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Wait</em>'.
	 * @generated
	 */
	ComplexWait createComplexWait();

	/**
	 * Returns a new object of class '<em>Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction</em>'.
	 * @generated
	 */
	Reaction createReaction();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>Send Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Map</em>'.
	 * @generated
	 */
	SendMap createSendMap();

	/**
	 * Returns a new object of class '<em>Scan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan</em>'.
	 * @generated
	 */
	Scan createScan();

	/**
	 * Returns a new object of class '<em>Charge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge</em>'.
	 * @generated
	 */
	Charge createCharge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DronesBehaviorPackage getDronesBehaviorPackage();

} //DronesBehaviorFactory
