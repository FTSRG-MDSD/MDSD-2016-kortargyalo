/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendMap;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendMapImpl#getRecipent <em>Recipent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendMapImpl extends AtomicStatementImpl implements SendMap {
	/**
	 * The cached value of the '{@link #getRecipent() <em>Recipent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipent()
	 * @generated
	 * @ordered
	 */
	protected Drone recipent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesBehaviorPackage.Literals.SEND_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone getRecipent() {
		if (recipent != null && recipent.eIsProxy()) {
			InternalEObject oldRecipent = (InternalEObject)recipent;
			recipent = (Drone)eResolveProxy(oldRecipent);
			if (recipent != oldRecipent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesBehaviorPackage.SEND_MAP__RECIPENT, oldRecipent, recipent));
			}
		}
		return recipent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone basicGetRecipent() {
		return recipent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipent(Drone newRecipent) {
		Drone oldRecipent = recipent;
		recipent = newRecipent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.SEND_MAP__RECIPENT, oldRecipent, recipent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesBehaviorPackage.SEND_MAP__RECIPENT:
				if (resolve) return getRecipent();
				return basicGetRecipent();
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
			case DronesBehaviorPackage.SEND_MAP__RECIPENT:
				setRecipent((Drone)newValue);
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
			case DronesBehaviorPackage.SEND_MAP__RECIPENT:
				setRecipent((Drone)null);
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
			case DronesBehaviorPackage.SEND_MAP__RECIPENT:
				return recipent != null;
		}
		return super.eIsSet(featureID);
	}

} //SendMapImpl
