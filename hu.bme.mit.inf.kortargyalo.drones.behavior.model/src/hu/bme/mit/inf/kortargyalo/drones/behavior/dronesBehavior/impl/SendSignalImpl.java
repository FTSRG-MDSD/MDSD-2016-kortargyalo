/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendSignalImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.SendSignalImpl#getRecipent <em>Recipent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendSignalImpl extends AtomicStatementImpl implements SendSignal {
	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal;

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
	protected SendSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesBehaviorPackage.Literals.SEND_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject)signal;
			signal = (Signal)eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesBehaviorPackage.SEND_SIGNAL__SIGNAL, oldSignal, signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.SEND_SIGNAL__SIGNAL, oldSignal, signal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesBehaviorPackage.SEND_SIGNAL__RECIPENT, oldRecipent, recipent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.SEND_SIGNAL__RECIPENT, oldRecipent, recipent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesBehaviorPackage.SEND_SIGNAL__SIGNAL:
				if (resolve) return getSignal();
				return basicGetSignal();
			case DronesBehaviorPackage.SEND_SIGNAL__RECIPENT:
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
			case DronesBehaviorPackage.SEND_SIGNAL__SIGNAL:
				setSignal((Signal)newValue);
				return;
			case DronesBehaviorPackage.SEND_SIGNAL__RECIPENT:
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
			case DronesBehaviorPackage.SEND_SIGNAL__SIGNAL:
				setSignal((Signal)null);
				return;
			case DronesBehaviorPackage.SEND_SIGNAL__RECIPENT:
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
			case DronesBehaviorPackage.SEND_SIGNAL__SIGNAL:
				return signal != null;
			case DronesBehaviorPackage.SEND_SIGNAL__RECIPENT:
				return recipent != null;
		}
		return super.eIsSet(featureID);
	}

} //SendSignalImpl
