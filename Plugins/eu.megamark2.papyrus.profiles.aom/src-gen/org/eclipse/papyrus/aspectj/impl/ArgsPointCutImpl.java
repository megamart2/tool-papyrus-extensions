/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.aspectj.ArgsPointCut;
import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.PointCut;
import org.eclipse.papyrus.aspectj.TypePointCut;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Args Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl#getBase_PointCut_StructuralFeature <em>Base Point Cut Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgsPointCutImpl extends ArgumentDefiningPointCutImpl implements ArgsPointCut {
	/**
	 * The cached value of the '{@link #getBase_PointCut_StructuralFeature() <em>Base Point Cut Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_PointCut_StructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected StructuralFeature base_PointCut_StructuralFeature;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgsPointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.ARGS_POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getBase_PointCut_StructuralFeature() {
		if (base_PointCut_StructuralFeature != null && base_PointCut_StructuralFeature.eIsProxy()) {
			InternalEObject oldBase_PointCut_StructuralFeature = (InternalEObject)base_PointCut_StructuralFeature;
			base_PointCut_StructuralFeature = (StructuralFeature)eResolveProxy(oldBase_PointCut_StructuralFeature);
			if (base_PointCut_StructuralFeature != oldBase_PointCut_StructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE, oldBase_PointCut_StructuralFeature, base_PointCut_StructuralFeature));
			}
		}
		return base_PointCut_StructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetBase_PointCut_StructuralFeature() {
		return base_PointCut_StructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_PointCut_StructuralFeature(StructuralFeature newBase_PointCut_StructuralFeature) {
		StructuralFeature oldBase_PointCut_StructuralFeature = base_PointCut_StructuralFeature;
		base_PointCut_StructuralFeature = newBase_PointCut_StructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE, oldBase_PointCut_StructuralFeature, base_PointCut_StructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<Type>(Type.class, this, AspectJPackage.ARGS_POINT_CUT__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType(String name) {
		return getType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType(String name, boolean ignoreCase, EClass eClass) {
		typeLoop: for (Type type : getType()) {
			if (eClass != null && !eClass.isInstance(type))
				continue typeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(type.getName()) : name.equals(type.getName())))
				continue typeLoop;
			return type;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE:
				if (resolve) return getBase_PointCut_StructuralFeature();
				return basicGetBase_PointCut_StructuralFeature();
			case AspectJPackage.ARGS_POINT_CUT__TYPE:
				return getType();
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
			case AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE:
				setBase_PointCut_StructuralFeature((StructuralFeature)newValue);
				return;
			case AspectJPackage.ARGS_POINT_CUT__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Type>)newValue);
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
			case AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE:
				setBase_PointCut_StructuralFeature((StructuralFeature)null);
				return;
			case AspectJPackage.ARGS_POINT_CUT__TYPE:
				getType().clear();
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
			case AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE:
				return base_PointCut_StructuralFeature != null;
			case AspectJPackage.ARGS_POINT_CUT__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PointCut.class) {
			switch (derivedFeatureID) {
				case AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE: return AspectJPackage.POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == TypePointCut.class) {
			switch (derivedFeatureID) {
				case AspectJPackage.ARGS_POINT_CUT__TYPE: return AspectJPackage.TYPE_POINT_CUT__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PointCut.class) {
			switch (baseFeatureID) {
				case AspectJPackage.POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE: return AspectJPackage.ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == TypePointCut.class) {
			switch (baseFeatureID) {
				case AspectJPackage.TYPE_POINT_CUT__TYPE: return AspectJPackage.ARGS_POINT_CUT__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ArgsPointCutImpl
