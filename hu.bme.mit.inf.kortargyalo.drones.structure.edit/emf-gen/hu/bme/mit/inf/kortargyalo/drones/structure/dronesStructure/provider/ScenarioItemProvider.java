/**
 */
package hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.provider;


import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider 
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
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addDronesPropertyDescriptor(object);
			addAllowedBoundsPropertyDescriptor(object);
			addRegionsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Drones feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDronesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_drones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_drones_feature", "_UI_Scenario_type"),
				 DronesStructurePackage.Literals.SCENARIO__DRONES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allowed Bounds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedBoundsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_allowedBounds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_allowedBounds_feature", "_UI_Scenario_type"),
				 DronesStructurePackage.Literals.SCENARIO__ALLOWED_BOUNDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_regions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_regions_feature", "_UI_Scenario_type"),
				 DronesStructurePackage.Literals.SCENARIO__REGIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_name_feature", "_UI_Scenario_type"),
				 DronesStructurePackage.Literals.SCENARIO__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(DronesStructurePackage.Literals.SCENARIO__DRONES);
			childrenFeatures.add(DronesStructurePackage.Literals.SCENARIO__ALLOWED_BOUNDS);
			childrenFeatures.add(DronesStructurePackage.Literals.SCENARIO__OBSTACLES);
			childrenFeatures.add(DronesStructurePackage.Literals.SCENARIO__REGIONS);
			childrenFeatures.add(DronesStructurePackage.Literals.SCENARIO__TASKS);
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
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scenario)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scenario_type") :
			getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
			case DronesStructurePackage.SCENARIO__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DronesStructurePackage.SCENARIO__DRONES:
			case DronesStructurePackage.SCENARIO__ALLOWED_BOUNDS:
			case DronesStructurePackage.SCENARIO__OBSTACLES:
			case DronesStructurePackage.SCENARIO__REGIONS:
			case DronesStructurePackage.SCENARIO__TASKS:
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
				(DronesStructurePackage.Literals.SCENARIO__DRONES,
				 DronesStructureFactory.eINSTANCE.createDrone()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.SCENARIO__ALLOWED_BOUNDS,
				 DronesStructureFactory.eINSTANCE.createScenarioBounds()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.SCENARIO__OBSTACLES,
				 DronesStructureFactory.eINSTANCE.createObstacle()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.SCENARIO__REGIONS,
				 DronesStructureFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.SCENARIO__REGIONS,
				 DronesStructureFactory.eINSTANCE.createCharger()));

		newChildDescriptors.add
			(createChildParameter
				(DronesStructurePackage.Literals.SCENARIO__TASKS,
				 DronesStructureFactory.eINSTANCE.createTask()));
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
