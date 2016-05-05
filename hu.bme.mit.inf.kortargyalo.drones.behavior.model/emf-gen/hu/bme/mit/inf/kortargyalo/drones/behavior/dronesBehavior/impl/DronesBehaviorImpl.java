/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;

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
import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drones Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl.DronesBehaviorImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DronesBehaviorImpl extends MinimalEObjectImpl.Container implements DronesBehavior {
	/**
	 * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> scripts;

	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenario;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected XImportSection imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DronesBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesBehaviorPackage.Literals.DRONES_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScripts() {
		if (scripts == null) {
			scripts = new EObjectContainmentEList<Script>(Script.class, this, DronesBehaviorPackage.DRONES_BEHAVIOR__SCRIPTS);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectContainmentEList<Signal>(Signal.class, this, DronesBehaviorPackage.DRONES_BEHAVIOR__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (Scenario)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesBehaviorPackage.DRONES_BEHAVIOR__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		Scenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.DRONES_BEHAVIOR__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XImportSection getImports() {
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImports(XImportSection newImports, NotificationChain msgs) {
		XImportSection oldImports = imports;
		imports = newImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS, oldImports, newImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImports(XImportSection newImports) {
		if (newImports != imports) {
			NotificationChain msgs = null;
			if (imports != null)
				msgs = ((InternalEObject)imports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS, null, msgs);
			if (newImports != null)
				msgs = ((InternalEObject)newImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS, null, msgs);
			msgs = basicSetImports(newImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS, newImports, newImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SIGNALS:
				return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
			case DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS:
				return basicSetImports(null, msgs);
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
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCRIPTS:
				return getScripts();
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SIGNALS:
				return getSignals();
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
			case DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS:
				return getImports();
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
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Script>)newValue);
				return;
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS:
				setImports((XImportSection)newValue);
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
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCRIPTS:
				getScripts().clear();
				return;
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SIGNALS:
				getSignals().clear();
				return;
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCENARIO:
				setScenario((Scenario)null);
				return;
			case DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS:
				setImports((XImportSection)null);
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
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCRIPTS:
				return scripts != null && !scripts.isEmpty();
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SIGNALS:
				return signals != null && !signals.isEmpty();
			case DronesBehaviorPackage.DRONES_BEHAVIOR__SCENARIO:
				return scenario != null;
			case DronesBehaviorPackage.DRONES_BEHAVIOR__IMPORTS:
				return imports != null;
		}
		return super.eIsSet(featureID);
	}

} //DronesBehaviorImpl
