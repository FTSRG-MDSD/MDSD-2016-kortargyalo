/**
 */
package hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.provider;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.util.DronesSimulationAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DronesSimulationItemProviderAdapterFactory extends DronesSimulationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesSimulationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DronesSimulationItemProvider dronesSimulationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDronesSimulationAdapter() {
		if (dronesSimulationItemProvider == null) {
			dronesSimulationItemProvider = new DronesSimulationItemProvider(this);
		}

		return dronesSimulationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneInstanceItemProvider droneInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDroneInstanceAdapter() {
		if (droneInstanceItemProvider == null) {
			droneInstanceItemProvider = new DroneInstanceItemProvider(this);
		}

		return droneInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInstanceItemProvider taskInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskInstanceAdapter() {
		if (taskInstanceItemProvider == null) {
			taskInstanceItemProvider = new TaskInstanceItemProvider(this);
		}

		return taskInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleInstanceItemProvider roleInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleInstanceAdapter() {
		if (roleInstanceItemProvider == null) {
			roleInstanceItemProvider = new RoleInstanceItemProvider(this);
		}

		return roleInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleObservationItemProvider obstacleObservationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.ObstacleObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObstacleObservationAdapter() {
		if (obstacleObservationItemProvider == null) {
			obstacleObservationItemProvider = new ObstacleObservationItemProvider(this);
		}

		return obstacleObservationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneObservationItemProvider droneObservationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDroneObservationAdapter() {
		if (droneObservationItemProvider == null) {
			droneObservationItemProvider = new DroneObservationItemProvider(this);
		}

		return droneObservationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dronesSimulationItemProvider != null) dronesSimulationItemProvider.dispose();
		if (droneInstanceItemProvider != null) droneInstanceItemProvider.dispose();
		if (taskInstanceItemProvider != null) taskInstanceItemProvider.dispose();
		if (roleInstanceItemProvider != null) roleInstanceItemProvider.dispose();
		if (obstacleObservationItemProvider != null) obstacleObservationItemProvider.dispose();
		if (droneObservationItemProvider != null) droneObservationItemProvider.dispose();
	}

}
