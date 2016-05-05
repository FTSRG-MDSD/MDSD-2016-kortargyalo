/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.provider;


import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorFactory;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script;

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
import org.eclipse.xtext.xbase.XbaseFactory;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptItemProvider 
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
	public ScriptItemProvider(AdapterFactory adapterFactory) {
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

			addDronePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Drone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDronePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Script_drone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Script_drone_feature", "_UI_Script_type"),
				 DronesBehaviorPackage.Literals.SCRIPT__DRONE,
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
			childrenFeatures.add(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT);
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
	 * This returns Script.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Script"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Script_type");
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

		switch (notification.getFeatureID(Script.class)) {
			case DronesBehaviorPackage.SCRIPT__STATEMENT:
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
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createAtomicStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createCooperate()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createSendSignal()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createSimpleWait()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createComplexWait()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createSendMap()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createScan()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 DronesBehaviorFactory.eINSTANCE.createCharge()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DronesBehaviorPackage.Literals.SCRIPT__STATEMENT,
				 XbaseFactory.eINSTANCE.createXSynchronizedExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DronesBehaviorEditPlugin.INSTANCE;
	}

}
