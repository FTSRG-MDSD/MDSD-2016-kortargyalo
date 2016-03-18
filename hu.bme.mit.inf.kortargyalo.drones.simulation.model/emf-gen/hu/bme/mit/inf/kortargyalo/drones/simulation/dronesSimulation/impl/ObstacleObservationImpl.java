/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstacle Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.ObstacleObservationImpl#getObstacle <em>Obstacle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObstacleObservationImpl extends ObservationImpl implements ObstacleObservation {
	/**
	 * The cached value of the '{@link #getObstacle() <em>Obstacle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstacle()
	 * @generated
	 * @ordered
	 */
	protected Obstacle obstacle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesSimulationPackage.Literals.OBSTACLE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle getObstacle() {
		if (obstacle != null && obstacle.eIsProxy()) {
			InternalEObject oldObstacle = (InternalEObject)obstacle;
			obstacle = (Obstacle)eResolveProxy(oldObstacle);
			if (obstacle != oldObstacle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesSimulationPackage.OBSTACLE_OBSERVATION__OBSTACLE, oldObstacle, obstacle));
			}
		}
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle basicGetObstacle() {
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObstacle(Obstacle newObstacle) {
		Obstacle oldObstacle = obstacle;
		obstacle = newObstacle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.OBSTACLE_OBSERVATION__OBSTACLE, oldObstacle, obstacle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesSimulationPackage.OBSTACLE_OBSERVATION__OBSTACLE:
				if (resolve) return getObstacle();
				return basicGetObstacle();
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
			case DronesSimulationPackage.OBSTACLE_OBSERVATION__OBSTACLE:
				setObstacle((Obstacle)newValue);
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
			case DronesSimulationPackage.OBSTACLE_OBSERVATION__OBSTACLE:
				setObstacle((Obstacle)null);
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
			case DronesSimulationPackage.OBSTACLE_OBSERVATION__OBSTACLE:
				return obstacle != null;
		}
		return super.eIsSet(featureID);
	}

} //ObstacleObservationImpl
