/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationPackage
 * @generated
 */
public class DronesSimulationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DronesSimulationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesSimulationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DronesSimulationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DronesSimulationSwitch<Adapter> modelSwitch =
		new DronesSimulationSwitch<Adapter>() {
			@Override
			public Adapter caseDronesSimulation(DronesSimulation object) {
				return createDronesSimulationAdapter();
			}
			@Override
			public Adapter caseDroneInstance(DroneInstance object) {
				return createDroneInstanceAdapter();
			}
			@Override
			public Adapter caseTaskInstance(TaskInstance object) {
				return createTaskInstanceAdapter();
			}
			@Override
			public Adapter caseRoleInstance(RoleInstance object) {
				return createRoleInstanceAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseObstacleObservation(ObstacleObservation object) {
				return createObstacleObservationAdapter();
			}
			@Override
			public Adapter caseDroneObservation(DroneObservation object) {
				return createDroneObservationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation <em>Drones Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation
	 * @generated
	 */
	public Adapter createDronesSimulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance <em>Drone Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance
	 * @generated
	 */
	public Adapter createDroneInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance <em>Task Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance
	 * @generated
	 */
	public Adapter createTaskInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance
	 * @generated
	 */
	public Adapter createRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation <em>Obstacle Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation
	 * @generated
	 */
	public Adapter createObstacleObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation <em>Drone Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation
	 * @generated
	 */
	public Adapter createDroneObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DronesSimulationAdapterFactory
