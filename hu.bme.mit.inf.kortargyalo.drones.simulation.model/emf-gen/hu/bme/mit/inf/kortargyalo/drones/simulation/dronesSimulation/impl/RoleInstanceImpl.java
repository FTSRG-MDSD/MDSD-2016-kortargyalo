/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.RoleInstanceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.RoleInstanceImpl#getTaskInstance <em>Task Instance</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.impl.RoleInstanceImpl#getAllocatedDrone <em>Allocated Drone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleInstanceImpl extends MinimalEObjectImpl.Container implements RoleInstance {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getAllocatedDrone() <em>Allocated Drone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedDrone()
	 * @generated
	 * @ordered
	 */
	protected DroneInstance allocatedDrone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesSimulationPackage.Literals.ROLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesSimulationPackage.ROLE_INSTANCE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.ROLE_INSTANCE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInstance getTaskInstance() {
		if (eContainerFeatureID() != DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE) return null;
		return (TaskInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskInstance(TaskInstance newTaskInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaskInstance, DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskInstance(TaskInstance newTaskInstance) {
		if (newTaskInstance != eInternalContainer() || (eContainerFeatureID() != DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE && newTaskInstance != null)) {
			if (EcoreUtil.isAncestor(this, newTaskInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaskInstance != null)
				msgs = ((InternalEObject)newTaskInstance).eInverseAdd(this, DronesSimulationPackage.TASK_INSTANCE__ROLE_INSTANCES, TaskInstance.class, msgs);
			msgs = basicSetTaskInstance(newTaskInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE, newTaskInstance, newTaskInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneInstance getAllocatedDrone() {
		if (allocatedDrone != null && allocatedDrone.eIsProxy()) {
			InternalEObject oldAllocatedDrone = (InternalEObject)allocatedDrone;
			allocatedDrone = (DroneInstance)eResolveProxy(oldAllocatedDrone);
			if (allocatedDrone != oldAllocatedDrone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE, oldAllocatedDrone, allocatedDrone));
			}
		}
		return allocatedDrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneInstance basicGetAllocatedDrone() {
		return allocatedDrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedDrone(DroneInstance newAllocatedDrone, NotificationChain msgs) {
		DroneInstance oldAllocatedDrone = allocatedDrone;
		allocatedDrone = newAllocatedDrone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE, oldAllocatedDrone, newAllocatedDrone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedDrone(DroneInstance newAllocatedDrone) {
		if (newAllocatedDrone != allocatedDrone) {
			NotificationChain msgs = null;
			if (allocatedDrone != null)
				msgs = ((InternalEObject)allocatedDrone).eInverseRemove(this, DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE, DroneInstance.class, msgs);
			if (newAllocatedDrone != null)
				msgs = ((InternalEObject)newAllocatedDrone).eInverseAdd(this, DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE, DroneInstance.class, msgs);
			msgs = basicSetAllocatedDrone(newAllocatedDrone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE, newAllocatedDrone, newAllocatedDrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaskInstance((TaskInstance)otherEnd, msgs);
			case DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE:
				if (allocatedDrone != null)
					msgs = ((InternalEObject)allocatedDrone).eInverseRemove(this, DronesSimulationPackage.DRONE_INSTANCE__CURRENT_ROLE, DroneInstance.class, msgs);
				return basicSetAllocatedDrone((DroneInstance)otherEnd, msgs);
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
			case DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE:
				return basicSetTaskInstance(null, msgs);
			case DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE:
				return basicSetAllocatedDrone(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE:
				return eInternalContainer().eInverseRemove(this, DronesSimulationPackage.TASK_INSTANCE__ROLE_INSTANCES, TaskInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesSimulationPackage.ROLE_INSTANCE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE:
				return getTaskInstance();
			case DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE:
				if (resolve) return getAllocatedDrone();
				return basicGetAllocatedDrone();
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
			case DronesSimulationPackage.ROLE_INSTANCE__ROLE:
				setRole((Role)newValue);
				return;
			case DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE:
				setTaskInstance((TaskInstance)newValue);
				return;
			case DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE:
				setAllocatedDrone((DroneInstance)newValue);
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
			case DronesSimulationPackage.ROLE_INSTANCE__ROLE:
				setRole((Role)null);
				return;
			case DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE:
				setTaskInstance((TaskInstance)null);
				return;
			case DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE:
				setAllocatedDrone((DroneInstance)null);
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
			case DronesSimulationPackage.ROLE_INSTANCE__ROLE:
				return role != null;
			case DronesSimulationPackage.ROLE_INSTANCE__TASK_INSTANCE:
				return getTaskInstance() != null;
			case DronesSimulationPackage.ROLE_INSTANCE__ALLOCATED_DRONE:
				return allocatedDrone != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleInstanceImpl
