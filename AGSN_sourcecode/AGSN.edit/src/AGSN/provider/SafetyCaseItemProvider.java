/**
 */
package AGSN.provider;


import AGSN.AGSNFactory;
import AGSN.AGSNPackage;
import AGSN.SafetyCase;

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
 * This is the item provider adapter for a {@link AGSN.SafetyCase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyCaseItemProvider 
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
	public SafetyCaseItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyCase_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyCase_description_feature", "_UI_SafetyCase_type"),
				 AGSNPackage.Literals.SAFETY_CASE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyCase_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyCase_id_feature", "_UI_SafetyCase_type"),
				 AGSNPackage.Literals.SAFETY_CASE__ID,
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
			childrenFeatures.add(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE);
			childrenFeatures.add(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_LINK);
			childrenFeatures.add(AGSNPackage.Literals.SAFETY_CASE__ROOT_COMMENDATION);
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
	 * This returns SafetyCase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SafetyCase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SafetyCase)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SafetyCase_type") :
			getString("_UI_SafetyCase_type") + " " + label;
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

		switch (notification.getFeatureID(SafetyCase.class)) {
			case AGSNPackage.SAFETY_CASE__DESCRIPTION:
			case AGSNPackage.SAFETY_CASE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AGSNPackage.SAFETY_CASE__ROOT_BASIC_NODE:
			case AGSNPackage.SAFETY_CASE__ROOT_BASIC_LINK:
			case AGSNPackage.SAFETY_CASE__ROOT_COMMENDATION:
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
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createAdditionalElement()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createModuleElement()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_NODE,
				 AGSNFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_LINK,
				 AGSNFactory.eINSTANCE.createInContextOf()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_LINK,
				 AGSNFactory.eINSTANCE.createSupportedBy()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_BASIC_LINK,
				 AGSNFactory.eINSTANCE.createAdditionalLink()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_COMMENDATION,
				 AGSNFactory.eINSTANCE.createRecommendation()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_COMMENDATION,
				 AGSNFactory.eINSTANCE.createStrength()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_COMMENDATION,
				 AGSNFactory.eINSTANCE.createRequiredAction()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_COMMENDATION,
				 AGSNFactory.eINSTANCE.createWeakness()));

		newChildDescriptors.add
			(createChildParameter
				(AGSNPackage.Literals.SAFETY_CASE__ROOT_COMMENDATION,
				 AGSNFactory.eINSTANCE.createQuestion()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AGSNEditPlugin.INSTANCE;
	}

}
