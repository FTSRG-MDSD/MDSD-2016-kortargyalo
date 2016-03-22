/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.DroneImpl#getDronetype <em>Dronetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneImpl extends NamedElementImpl implements Drone {
	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected Position startPosition;

	/**
	 * The cached value of the '{@link #getDronetype() <em>Dronetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDronetype()
	 * @generated
	 * @ordered
	 */
	protected DroneType dronetype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.DRONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartPosition(Position newStartPosition, NotificationChain msgs) {
		Position oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE__START_POSITION, oldStartPosition, newStartPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(Position newStartPosition) {
		if (newStartPosition != startPosition) {
			NotificationChain msgs = null;
			if (startPosition != null)
				msgs = ((InternalEObject)startPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesStructurePackage.DRONE__START_POSITION, null, msgs);
			if (newStartPosition != null)
				msgs = ((InternalEObject)newStartPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesStructurePackage.DRONE__START_POSITION, null, msgs);
			msgs = basicSetStartPosition(newStartPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE__START_POSITION, newStartPosition, newStartPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneType getDronetype() {
		if (dronetype != null && dronetype.eIsProxy()) {
			InternalEObject oldDronetype = (InternalEObject)dronetype;
			dronetype = (DroneType)eResolveProxy(oldDronetype);
			if (dronetype != oldDronetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesStructurePackage.DRONE__DRONETYPE, oldDronetype, dronetype));
			}
		}
		return dronetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneType basicGetDronetype() {
		return dronetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDronetype(DroneType newDronetype) {
		DroneType oldDronetype = dronetype;
		dronetype = newDronetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.DRONE__DRONETYPE, oldDronetype, dronetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesStructurePackage.DRONE__START_POSITION:
				return basicSetStartPosition(null, msgs);
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
			case DronesStructurePackage.DRONE__START_POSITION:
				return getStartPosition();
			case DronesStructurePackage.DRONE__DRONETYPE:
				if (resolve) return getDronetype();
				return basicGetDronetype();
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
			case DronesStructurePackage.DRONE__START_POSITION:
				setStartPosition((Position)newValue);
				return;
			case DronesStructurePackage.DRONE__DRONETYPE:
				setDronetype((DroneType)newValue);
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
			case DronesStructurePackage.DRONE__START_POSITION:
				setStartPosition((Position)null);
				return;
			case DronesStructurePackage.DRONE__DRONETYPE:
				setDronetype((DroneType)null);
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
			case DronesStructurePackage.DRONE__START_POSITION:
				return startPosition != null;
			case DronesStructurePackage.DRONE__DRONETYPE:
				return dronetype != null;
		}
		return super.eIsSet(featureID);
	}

} //DroneImpl
