/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.provider;


import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorFactory;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexWaitItemProvider extends WaitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexWaitItemProvider(AdapterFactory adapterFactory) {
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

			addOnTimeoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexWait_onTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexWait_onTimeout_feature", "_UI_ComplexWait_type"),
				 DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
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
			childrenFeatures.add(DronesBehaviorPackage.Literals.COMPLEX_WAIT__REACTIONS);
			childrenFeatures.add(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT);
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
	 * This returns ComplexWait.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexWait"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ComplexWait complexWait = (ComplexWait)object;
		return getString("_UI_ComplexWait_type") + " " + complexWait.getTimeout();
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

		switch (notification.getFeatureID(ComplexWait.class)) {
			case DronesBehaviorPackage.COMPLEX_WAIT__REACTIONS:
			case DronesBehaviorPackage.COMPLEX_WAIT__ON_TIMEOUT:
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
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__REACTIONS,
				 DronesBehaviorFactory.eINSTANCE.createReaction()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createCompositeStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createAtomicStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createCooperate()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createSendSignal()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createSimpleWait()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createComplexWait()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createSendMap()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createScan()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.COMPLEX_WAIT__ON_TIMEOUT,
				 DronesBehaviorFactory.eINSTANCE.createCharge()));
	}

}
