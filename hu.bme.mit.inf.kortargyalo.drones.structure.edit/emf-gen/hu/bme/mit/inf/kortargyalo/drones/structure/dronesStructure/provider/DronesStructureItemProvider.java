/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.provider;


import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DronesStructureItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesStructureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addScenariosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scenarios feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenariosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DronesStructure_scenarios_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DronesStructure_scenarios_feature", "_UI_DronesStructure_type"),
				 DronesStructurePackage.Literals.DRONES_STRUCTURE__SCENARIOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DronesStructurePackage.Literals.DRONES_STRUCTURE__SCENARIOS);
			childrenFeatures.add(DronesStructurePackage.Literals.DRONES_STRUCTURE__DRONE_TYPES);
			childrenFeatures.add(DronesStructurePackage.Literals.DRONES_STRUCTURE__COOPERATIVE_ACTIONS);
			childrenFeatures.add(DronesStructurePackage.Literals.DRONES_STRUCTURE__CAPABILITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DronesStructure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DronesStructure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DronesStructure_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DronesStructure.class)) {
			case DronesStructurePackage.DRONES_STRUCTURE__SCENARIOS:
			case DronesStructurePackage.DRONES_STRUCTURE__DRONE_TYPES:
			case DronesStructurePackage.DRONES_STRUCTURE__COOPERATIVE_ACTIONS:
			case DronesStructurePackage.DRONES_STRUCTURE__CAPABILITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.DRONES_STRUCTURE__SCENARIOS,
				 DronesStructureFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.DRONES_STRUCTURE__DRONE_TYPES,
				 DronesStructureFactory.eINSTANCE.createDroneType()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.DRONES_STRUCTURE__COOPERATIVE_ACTIONS,
				 DronesStructureFactory.eINSTANCE.createCooperativeAction()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.DRONES_STRUCTURE__CAPABILITIES,
				 DronesStructureFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.DRONES_STRUCTURE__CAPABILITIES,
				 DronesStructureFactory.eINSTANCE.createMovementCapability()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.DRONES_STRUCTURE__CAPABILITIES,
				 DronesStructureFactory.eINSTANCE.createScanningCapability()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DronesStructureEditPlugin.INSTANCE;
	}

}
