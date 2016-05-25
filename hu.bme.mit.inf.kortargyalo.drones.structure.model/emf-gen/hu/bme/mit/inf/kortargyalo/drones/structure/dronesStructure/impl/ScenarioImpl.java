/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Region;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScenarioBounds;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Task;

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
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl#getDrones <em>Drones</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl#getAllowedBounds <em>Allowed Bounds</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl#getObstacles <em>Obstacles</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl#getSafeCommunicationDistance <em>Safe Communication Distance</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.impl.ScenarioImpl#getMaximumCommunicationDistance <em>Maximum Communication Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends NamedElementImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getDrones() <em>Drones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrones()
	 * @generated
	 * @ordered
	 */
	protected EList<Drone> drones;

	/**
	 * The cached value of the '{@link #getAllowedBounds() <em>Allowed Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedBounds()
	 * @generated
	 * @ordered
	 */
	protected ScenarioBounds allowedBounds;

	/**
	 * The cached value of the '{@link #getObstacles() <em>Obstacles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstacles()
	 * @generated
	 * @ordered
	 */
	protected EList<Obstacle> obstacles;

	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getSafeCommunicationDistance() <em>Safe Communication Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeCommunicationDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double SAFE_COMMUNICATION_DISTANCE_EDEFAULT = 500.0;

	/**
	 * The cached value of the '{@link #getSafeCommunicationDistance() <em>Safe Communication Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeCommunicationDistance()
	 * @generated
	 * @ordered
	 */
	protected double safeCommunicationDistance = SAFE_COMMUNICATION_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumCommunicationDistance() <em>Maximum Communication Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCommunicationDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_COMMUNICATION_DISTANCE_EDEFAULT = 2000.0;

	/**
	 * The cached value of the '{@link #getMaximumCommunicationDistance() <em>Maximum Communication Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCommunicationDistance()
	 * @generated
	 * @ordered
	 */
	protected double maximumCommunicationDistance = MAXIMUM_COMMUNICATION_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesStructurePackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drone> getDrones() {
		if (drones == null) {
			drones = new EObjectContainmentEList<Drone>(Drone.class, this, DronesStructurePackage.SCENARIO__DRONES);
		}
		return drones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioBounds getAllowedBounds() {
		return allowedBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedBounds(ScenarioBounds newAllowedBounds, NotificationChain msgs) {
		ScenarioBounds oldAllowedBounds = allowedBounds;
		allowedBounds = newAllowedBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS, oldAllowedBounds, newAllowedBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedBounds(ScenarioBounds newAllowedBounds) {
		if (newAllowedBounds != allowedBounds) {
			NotificationChain msgs = null;
			if (allowedBounds != null)
				msgs = ((InternalEObject)allowedBounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS, null, msgs);
			if (newAllowedBounds != null)
				msgs = ((InternalEObject)newAllowedBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS, null, msgs);
			msgs = basicSetAllowedBounds(newAllowedBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS, newAllowedBounds, newAllowedBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstacle> getObstacles() {
		if (obstacles == null) {
			obstacles = new EObjectContainmentEList<Obstacle>(Obstacle.class, this, DronesStructurePackage.SCENARIO__OBSTACLES);
		}
		return obstacles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentEList<Region>(Region.class, this, DronesStructurePackage.SCENARIO__REGIONS);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, DronesStructurePackage.SCENARIO__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSafeCommunicationDistance() {
		return safeCommunicationDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafeCommunicationDistance(double newSafeCommunicationDistance) {
		double oldSafeCommunicationDistance = safeCommunicationDistance;
		safeCommunicationDistance = newSafeCommunicationDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.SCENARIO__SAFE_COMMUNICATION_DISTANCE, oldSafeCommunicationDistance, safeCommunicationDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumCommunicationDistance() {
		return maximumCommunicationDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumCommunicationDistance(double newMaximumCommunicationDistance) {
		double oldMaximumCommunicationDistance = maximumCommunicationDistance;
		maximumCommunicationDistance = newMaximumCommunicationDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesStructurePackage.SCENARIO__MAXIMUM_COMMUNICATION_DISTANCE, oldMaximumCommunicationDistance, maximumCommunicationDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesStructurePackage.SCENARIO__DRONES:
				return ((InternalEList<?>)getDrones()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS:
				return basicSetAllowedBounds(null, msgs);
			case DronesStructurePackage.SCENARIO__OBSTACLES:
				return ((InternalEList<?>)getObstacles()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.SCENARIO__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
			case DronesStructurePackage.SCENARIO__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case DronesStructurePackage.SCENARIO__DRONES:
				return getDrones();
			case DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS:
				return getAllowedBounds();
			case DronesStructurePackage.SCENARIO__OBSTACLES:
				return getObstacles();
			case DronesStructurePackage.SCENARIO__REGIONS:
				return getRegions();
			case DronesStructurePackage.SCENARIO__TASKS:
				return getTasks();
			case DronesStructurePackage.SCENARIO__SAFE_COMMUNICATION_DISTANCE:
				return getSafeCommunicationDistance();
			case DronesStructurePackage.SCENARIO__MAXIMUM_COMMUNICATION_DISTANCE:
				return getMaximumCommunicationDistance();
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
			case DronesStructurePackage.SCENARIO__DRONES:
				getDrones().clear();
				getDrones().addAll((Collection<? extends Drone>)newValue);
				return;
			case DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS:
				setAllowedBounds((ScenarioBounds)newValue);
				return;
			case DronesStructurePackage.SCENARIO__OBSTACLES:
				getObstacles().clear();
				getObstacles().addAll((Collection<? extends Obstacle>)newValue);
				return;
			case DronesStructurePackage.SCENARIO__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case DronesStructurePackage.SCENARIO__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case DronesStructurePackage.SCENARIO__SAFE_COMMUNICATION_DISTANCE:
				setSafeCommunicationDistance((Double)newValue);
				return;
			case DronesStructurePackage.SCENARIO__MAXIMUM_COMMUNICATION_DISTANCE:
				setMaximumCommunicationDistance((Double)newValue);
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
			case DronesStructurePackage.SCENARIO__DRONES:
				getDrones().clear();
				return;
			case DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS:
				setAllowedBounds((ScenarioBounds)null);
				return;
			case DronesStructurePackage.SCENARIO__OBSTACLES:
				getObstacles().clear();
				return;
			case DronesStructurePackage.SCENARIO__REGIONS:
				getRegions().clear();
				return;
			case DronesStructurePackage.SCENARIO__TASKS:
				getTasks().clear();
				return;
			case DronesStructurePackage.SCENARIO__SAFE_COMMUNICATION_DISTANCE:
				setSafeCommunicationDistance(SAFE_COMMUNICATION_DISTANCE_EDEFAULT);
				return;
			case DronesStructurePackage.SCENARIO__MAXIMUM_COMMUNICATION_DISTANCE:
				setMaximumCommunicationDistance(MAXIMUM_COMMUNICATION_DISTANCE_EDEFAULT);
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
			case DronesStructurePackage.SCENARIO__DRONES:
				return drones != null && !drones.isEmpty();
			case DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS:
				return allowedBounds != null;
			case DronesStructurePackage.SCENARIO__OBSTACLES:
				return obstacles != null && !obstacles.isEmpty();
			case DronesStructurePackage.SCENARIO__REGIONS:
				return regions != null && !regions.isEmpty();
			case DronesStructurePackage.SCENARIO__TASKS:
				return tasks != null && !tasks.isEmpty();
			case DronesStructurePackage.SCENARIO__SAFE_COMMUNICATION_DISTANCE:
				return safeCommunicationDistance != SAFE_COMMUNICATION_DISTANCE_EDEFAULT;
			case DronesStructurePackage.SCENARIO__MAXIMUM_COMMUNICATION_DISTANCE:
				return maximumCommunicationDistance != MAXIMUM_COMMUNICATION_DISTANCE_EDEFAULT;
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
		result.append(" (safeCommunicationDistance: ");
		result.append(safeCommunicationDistance);
		result.append(", maximumCommunicationDistance: ");
		result.append(maximumCommunicationDistance);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
