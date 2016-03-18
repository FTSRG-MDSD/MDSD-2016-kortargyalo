/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Wait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ComplexWaitImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.ComplexWaitImpl#getOnTimeout <em>On Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexWaitImpl extends WaitImpl implements ComplexWait {
	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reaction> reactions;

	/**
	 * The cached value of the '{@link #getOnTimeout() <em>On Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTimeout()
	 * @generated
	 * @ordered
	 */
	protected Statement onTimeout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexWaitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesBehaviorPackage.Literals.COMPLEX_WAIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<Reaction>(Reaction.class, this, DronesBehaviorPackage.COMPLEX_WAIT__REACTIONS);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getOnTimeout() {
		return onTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnTimeout(Statement newOnTimeout, NotificationChain msgs) {
		Statement oldOnTimeout = onTimeout;
		onTimeout = newOnTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT, oldOnTimeout, newOnTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTimeout(Statement newOnTimeout) {
		if (newOnTimeout != onTimeout) {
			NotificationChain msgs = null;
			if (onTimeout != null)
				msgs = ((InternalEObject)onTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT, null, msgs);
			if (newOnTimeout != null)
				msgs = ((InternalEObject)newOnTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT, null, msgs);
			msgs = basicSetOnTimeout(newOnTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT, newOnTimeout, newOnTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesBehaviorPackage.COMPLEX_WAIT__REACTIONS:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
			case DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT:
				return basicSetOnTimeout(null, msgs);
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
			case DronesBehaviorPackage.COMPLEX_WAIT__REACTIONS:
				return getReactions();
			case DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT:
				return getOnTimeout();
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
			case DronesBehaviorPackage.COMPLEX_WAIT__REACTIONS:
				getReactions().clear();
				getReactions().addAll((Collection<? extends Reaction>)newValue);
				return;
			case DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT:
				setOnTimeout((Statement)newValue);
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
			case DronesBehaviorPackage.COMPLEX_WAIT__REACTIONS:
				getReactions().clear();
				return;
			case DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT:
				setOnTimeout((Statement)null);
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
			case DronesBehaviorPackage.COMPLEX_WAIT__REACTIONS:
				return reactions != null && !reactions.isEmpty();
			case DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT:
				return onTimeout != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexWaitImpl
