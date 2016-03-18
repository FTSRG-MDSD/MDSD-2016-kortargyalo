/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneObservationImpl#getDrone <em>Drone</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.DroneObservationImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneObservationImpl extends ObservationImpl implements DroneObservation {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesSimulationPackage.Literals.DRONE_OBSERVATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesSimulationPackage.DRONE_OBSERVATION__DRONE, oldDrone, drone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_OBSERVATION__DRONE, oldDrone, drone));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_OBSERVATION__POSITION, oldPosition, newPosition);
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
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesSimulationPackage.DRONE_OBSERVATION__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesSimulationPackage.DRONE_OBSERVATION__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.DRONE_OBSERVATION__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesSimulationPackage.DRONE_OBSERVATION__POSITION:
				return basicSetPosition(null, msgs);
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
			case DronesSimulationPackage.DRONE_OBSERVATION__DRONE:
				if (resolve) return getDrone();
				return basicGetDrone();
			case DronesSimulationPackage.DRONE_OBSERVATION__POSITION:
				return getPosition();
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
			case DronesSimulationPackage.DRONE_OBSERVATION__DRONE:
				setDrone((Drone)newValue);
				return;
			case DronesSimulationPackage.DRONE_OBSERVATION__POSITION:
				setPosition((Position)newValue);
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
			case DronesSimulationPackage.DRONE_OBSERVATION__DRONE:
				setDrone((Drone)null);
				return;
			case DronesSimulationPackage.DRONE_OBSERVATION__POSITION:
				setPosition((Position)null);
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
			case DronesSimulationPackage.DRONE_OBSERVATION__DRONE:
				return drone != null;
			case DronesSimulationPackage.DRONE_OBSERVATION__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

} //DroneObservationImpl
