/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl#getScript <em>Script</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl#getCurrentRole <em>Current Role</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl#getObservations <em>Observations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneInstanceImpl#getCurrentBattery <em>Current Battery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneInstanceImpl extends MinimalEObjectImpl.Container implements DroneInstance {
	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Script script;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getCurrentRole() <em>Current Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRole()
	 * @generated
	 * @ordered
	 */
	protected RoleInstance currentRole;

	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> observations;

	/**
	 * The default value of the '{@link #getCurrentBattery() <em>Current Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBattery()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_BATTERY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentBattery() <em>Current Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBattery()
	 * @generated
	 * @ordered
	 */
	protected double currentBattery = CURRENT_BATTERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesSimulationPackage.Literals.DRONE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScript() {
		if (script != null && script.eIsProxy()) {
			InternalEObject oldScript = (InternalEObject)script;
			script = (Script)eResolveProxy(oldScript);
			if (script != oldScript) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesSimulationPackage.DRONE_INSTANCE__SCRIPT, oldScript, script));
			}
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Script newScript) {
		Script oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_INSTANCE__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_INSTANCE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesSimulationPackage.DRONE_INSTANCE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesSimulationPackage.DRONE_INSTANCE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_INSTANCE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstance getCurrentRole() {
		if (currentRole != null && currentRole.eIsProxy()) {
			InternalEObject oldCurrentRole = (InternalEObject)currentRole;
			currentRole = (RoleInstance)eResolveProxy(oldCurrentRole);
			if (currentRole != oldCurrentRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE, oldCurrentRole, currentRole));
			}
		}
		return currentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstance basicGetCurrentRole() {
		return currentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentRole(RoleInstance newCurrentRole, NotificationChain msgs) {
		RoleInstance oldCurrentRole = currentRole;
		currentRole = newCurrentRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE, oldCurrentRole, newCurrentRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentRole(RoleInstance newCurrentRole) {
		if (newCurrentRole != currentRole) {
			NotificationChain msgs = null;
			if (currentRole != null)
				msgs = ((InternalEObject)currentRole).eInverseRemove(this, DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE, RoleInstance.class, msgs);
			if (newCurrentRole != null)
				msgs = ((InternalEObject)newCurrentRole).eInverseAdd(this, DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE, RoleInstance.class, msgs);
			msgs = basicSetCurrentRole(newCurrentRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE, newCurrentRole, newCurrentRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservations() {
		if (observations == null) {
			observations = new EObjectContainmentEList<Observation>(Observation.class, this, DronesSimulationPackage.DRONE_INSTANCE__OBSERVATIONS);
		}
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentBattery() {
		return currentBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentBattery(double newCurrentBattery) {
		double oldCurrentBattery = currentBattery;
		currentBattery = newCurrentBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_INSTANCE__CURRENT_BATTERY, oldCurrentBattery, currentBattery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE:
				if (currentRole != null)
					msgs = ((InternalEObject)currentRole).eInverseRemove(this, DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE, RoleInstance.class, msgs);
				return basicSetCurrentRole((RoleInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesSimulationPackage.DRONE_INSTANCE__POSITION:
				return basicSetPosition(null, msgs);
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE:
				return basicSetCurrentRole(null, msgs);
			case DronesSimulationPackage.DRONE_INSTANCE__OBSERVATIONS:
				return ((InternalEList<?>)getObservations()).basicRemove(otherEnd, msgs);
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
			case DronesSimulationPackage.DRONE_INSTANCE__SCRIPT:
				if (resolve) return getScript();
				return basicGetScript();
			case DronesSimulationPackage.DRONE_INSTANCE__POSITION:
				return getPosition();
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE:
				if (resolve) return getCurrentRole();
				return basicGetCurrentRole();
			case DronesSimulationPackage.DRONE_INSTANCE__OBSERVATIONS:
				return getObservations();
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_BATTERY:
				return getCurrentBattery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DronesSimulationPackage.DRONE_INSTANCE__SCRIPT:
				setScript((Script)newValue);
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__POSITION:
				setPosition((Position)newValue);
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE:
				setCurrentRole((RoleInstance)newValue);
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__OBSERVATIONS:
				getObservations().clear();
				getObservations().addAll((Collection<? extends Observation>)newValue);
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_BATTERY:
				setCurrentBattery((Double)newValue);
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
			case DronesSimulationPackage.DRONE_INSTANCE__SCRIPT:
				setScript((Script)null);
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__POSITION:
				setPosition((Position)null);
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE:
				setCurrentRole((RoleInstance)null);
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__OBSERVATIONS:
				getObservations().clear();
				return;
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_BATTERY:
				setCurrentBattery(CURRENT_BATTERY_EDEFAULT);
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
			case DronesSimulationPackage.DRONE_INSTANCE__SCRIPT:
				return script != null;
			case DronesSimulationPackage.DRONE_INSTANCE__POSITION:
				return position != null;
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE:
				return currentRole != null;
			case DronesSimulationPackage.DRONE_INSTANCE__OBSERVATIONS:
				return observations != null && !observations.isEmpty();
			case DronesSimulationPackage.DRONE_INSTANCE__CURRENT_BATTERY:
				return currentBattery != CURRENT_BATTERY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentBattery: ");
		result.append(currentBattery);
		result.append(')');
		return result.toString();
	}

} //DroneInstanceImpl
