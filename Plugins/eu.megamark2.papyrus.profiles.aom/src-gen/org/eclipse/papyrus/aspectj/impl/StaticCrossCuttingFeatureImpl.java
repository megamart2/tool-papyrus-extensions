/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature;

import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Cross Cutting Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.StaticCrossCuttingFeatureImpl#getOnType <em>On Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.StaticCrossCuttingFeatureImpl#getBase_Feature <em>Base Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticCrossCuttingFeatureImpl extends MinimalEObjectImpl.Container implements StaticCrossCuttingFeature {
	/**
	 * The cached value of the '{@link #getOnType() <em>On Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> onType;

	/**
	 * The cached value of the '{@link #getBase_Feature() <em>Base Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Feature()
	 * @generated
	 * @ordered
	 */
	protected Feature base_Feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticCrossCuttingFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.STATIC_CROSS_CUTTING_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOnType() {
		if (onType == null) {
			onType = new EObjectResolvingEList<Type>(Type.class, this, AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__ON_TYPE);
		}
		return onType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOnType(String name) {
		return getOnType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOnType(String name, boolean ignoreCase, EClass eClass) {
		onTypeLoop: for (Type onType : getOnType()) {
			if (eClass != null && !eClass.isInstance(onType))
				continue onTypeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(onType.getName()) : name.equals(onType.getName())))
				continue onTypeLoop;
			return onType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getBase_Feature() {
		if (base_Feature != null && base_Feature.eIsProxy()) {
			InternalEObject oldBase_Feature = (InternalEObject)base_Feature;
			base_Feature = (Feature)eResolveProxy(oldBase_Feature);
			if (base_Feature != oldBase_Feature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE, oldBase_Feature, base_Feature));
			}
		}
		return base_Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetBase_Feature() {
		return base_Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Feature(Feature newBase_Feature) {
		Feature oldBase_Feature = base_Feature;
		base_Feature = newBase_Feature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE, oldBase_Feature, base_Feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__ON_TYPE:
				return getOnType();
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE:
				if (resolve) return getBase_Feature();
				return basicGetBase_Feature();
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
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__ON_TYPE:
				getOnType().clear();
				getOnType().addAll((Collection<? extends Type>)newValue);
				return;
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE:
				setBase_Feature((Feature)newValue);
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
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__ON_TYPE:
				getOnType().clear();
				return;
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE:
				setBase_Feature((Feature)null);
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
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__ON_TYPE:
				return onType != null && !onType.isEmpty();
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE:
				return base_Feature != null;
		}
		return super.eIsSet(featureID);
	}

} //StaticCrossCuttingFeatureImpl
