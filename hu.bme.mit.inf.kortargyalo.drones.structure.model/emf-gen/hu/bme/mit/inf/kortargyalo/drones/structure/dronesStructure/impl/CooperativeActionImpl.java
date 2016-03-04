/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cooperative Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl#getStartTimeout <em>Start Timeout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.CooperativeActionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CooperativeActionImpl extends MinimalEObjectImpl.Container implements CooperativeAction {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The default value of the '{@link #getStartTimeout() <em>Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final double START_TIMEOUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartTimeout() <em>Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected double startTimeout = START_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CooperativeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.COOPERATIVE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<Role>(Role.class, this, DronesStructurePackage.COOPERATIVE_ACTION__ROLES, DronesStructurePackage.ROLE__COOPERATIVE_ACTION);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartTimeout() {
		return startTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTimeout(double newStartTimeout) {
		double oldStartTimeout = startTimeout;
		startTimeout = newStartTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.COOPERATIVE_ACTION__START_TIMEOUT, oldStartTimeout, startTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.COOPERATIVE_ACTION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.COOPERATIVE_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesStructurePackage.COOPERATIVE_ACTION__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
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
			case DronesStructurePackage.COOPERATIVE_ACTION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case DronesStructurePackage.COOPERATIVE_ACTION__ROLES:
				return getRoles();
			case DronesStructurePackage.COOPERATIVE_ACTION__START_TIMEOUT:
				return getStartTimeout();
			case DronesStructurePackage.COOPERATIVE_ACTION__DURATION:
				return getDuration();
			case DronesStructurePackage.COOPERATIVE_ACTION__NAME:
				return getName();
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
			case DronesStructurePackage.COOPERATIVE_ACTION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case DronesStructurePackage.COOPERATIVE_ACTION__START_TIMEOUT:
				setStartTimeout((Double)newValue);
				return;
			case DronesStructurePackage.COOPERATIVE_ACTION__DURATION:
				setDuration((Double)newValue);
				return;
			case DronesStructurePackage.COOPERATIVE_ACTION__NAME:
				setName((String)newValue);
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
			case DronesStructurePackage.COOPERATIVE_ACTION__ROLES:
				getRoles().clear();
				return;
			case DronesStructurePackage.COOPERATIVE_ACTION__START_TIMEOUT:
				setStartTimeout(START_TIMEOUT_EDEFAULT);
				return;
			case DronesStructurePackage.COOPERATIVE_ACTION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case DronesStructurePackage.COOPERATIVE_ACTION__NAME:
				setName(NAME_EDEFAULT);
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
			case DronesStructurePackage.COOPERATIVE_ACTION__ROLES:
				return roles != null && !roles.isEmpty();
			case DronesStructurePackage.COOPERATIVE_ACTION__START_TIMEOUT:
				return startTimeout != START_TIMEOUT_EDEFAULT;
			case DronesStructurePackage.COOPERATIVE_ACTION__DURATION:
				return duration != DURATION_EDEFAULT;
			case DronesStructurePackage.COOPERATIVE_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (startTimeout: ");
		result.append(startTimeout);
		result.append(", duration: ");
		result.append(duration);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CooperativeActionImpl
