/**
 */
package org.eclipse.papyrus.aspectj.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.PointCut;

import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.PointCutImpl#getBase_PointCut_StructuralFeature <em>Base Structural Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointCutImpl extends MinimalEObjectImpl.Container implements PointCut {
	/**
	 * The cached value of the '{@link #getBase_PointCut_StructuralFeature() <em>Base Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected StructuralFeature base_PointCut_StructuralFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getBase_PointCut_StructuralFeature() {
		if (base_PointCut_StructuralFeature != null && base_PointCut_StructuralFeature.eIsProxy()) {
			InternalEObject oldBase_StructuralFeature = (InternalEObject)base_PointCut_StructuralFeature;
			base_PointCut_StructuralFeature = (StructuralFeature)eResolveProxy(oldBase_StructuralFeature);
			if (base_PointCut_StructuralFeature != oldBase_StructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.POINT_CUT__BASE_STRUCTURAL_FEATURE, oldBase_StructuralFeature, base_PointCut_StructuralFeature));
			}
		}
		return base_PointCut_StructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetBase_StructuralFeature() {
		return base_PointCut_StructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_PointCut_StructuralFeature(StructuralFeature newBase_StructuralFeature) {
		StructuralFeature oldBase_StructuralFeature = base_PointCut_StructuralFeature;
		base_PointCut_StructuralFeature = newBase_StructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.POINT_CUT__BASE_STRUCTURAL_FEATURE, oldBase_StructuralFeature, base_PointCut_StructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.POINT_CUT__BASE_STRUCTURAL_FEATURE:
				if (resolve) return getBase_PointCut_StructuralFeature();
				return basicGetBase_StructuralFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectJPackage.POINT_CUT__BASE_STRUCTURAL_FEATURE:
				setBase_PointCut_StructuralFeature((StructuralFeature)newValue);
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
			case AspectJPackage.POINT_CUT__BASE_STRUCTURAL_FEATURE:
				setBase_PointCut_StructuralFeature((StructuralFeature)null);
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
			case AspectJPackage.POINT_CUT__BASE_STRUCTURAL_FEATURE:
				return base_PointCut_StructuralFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //PointCutImpl
