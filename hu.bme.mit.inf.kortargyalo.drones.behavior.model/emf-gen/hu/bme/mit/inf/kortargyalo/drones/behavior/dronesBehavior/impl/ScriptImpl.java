/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScriptImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ScriptImpl#getDrone <em>Drone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement statement;

	/**
	 * The cached value of the '{@link #getDrone() <em>Drone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrone()
	 * @generated
	 * @ordered
	 */
	protected Drone drone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesBehaviorPackage.Literals.SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.SCRIPT__STATEMENT, oldStatement, newStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(Statement newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesBehaviorPackage.SCRIPT__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesBehaviorPackage.SCRIPT__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.SCRIPT__STATEMENT, newStatement, newStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone getDrone() {
		if (drone != null && drone.eIsProxy()) {
			InternalEObject oldDrone = (InternalEObject)drone;
			drone = (Drone)eResolveProxy(oldDrone);
			if (drone != oldDrone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesBehaviorPackage.SCRIPT__DRONE, oldDrone, drone));
			}
		}
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone basicGetDrone() {
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrone(Drone newDrone) {
		Drone oldDrone = drone;
		drone = newDrone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.SCRIPT__DRONE, oldDrone, drone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesBehaviorPackage.SCRIPT__STATEMENT:
				return basicSetStatement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesBehaviorPackage.SCRIPT__STATEMENT:
				return getStatement();
			case DronesBehaviorPackage.SCRIPT__DRONE:
				if (resolve) return getDrone();
				return basicGetDrone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DronesBehaviorPackage.SCRIPT__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case DronesBehaviorPackage.SCRIPT__DRONE:
				setDrone((Drone)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DronesBehaviorPackage.SCRIPT__STATEMENT:
				setStatement((Statement)null);
				return;
			case DronesBehaviorPackage.SCRIPT__DRONE:
				setDrone((Drone)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DronesBehaviorPackage.SCRIPT__STATEMENT:
				return statement != null;
			case DronesBehaviorPackage.SCRIPT__DRONE:
				return drone != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptImpl
