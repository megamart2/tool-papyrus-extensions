/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.papyrus.aspectj.ArgsPointCut;
import org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut;
import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Args Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl#getBase_StructuralFeature <em>Base Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl#getArgNames <em>Arg Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgsPointCutImpl extends TypePointCutImpl implements ArgsPointCut {
	/**
	 * The cached value of the '{@link #getBase_StructuralFeature() <em>Base Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected StructuralFeature base_StructuralFeature;
	/**
	 * The cached value of the '{@link #getArgNames() <em>Arg Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> argNames;
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
	public StructuralFeature getBase_StructuralFeature() {
		if (base_StructuralFeature != null && base_StructuralFeature.eIsProxy()) {
			InternalEObject oldBase_StructuralFeature = (InternalEObject)base_StructuralFeature;
			base_StructuralFeature = (StructuralFeature)eResolveProxy(oldBase_StructuralFeature);
			if (base_StructuralFeature != oldBase_StructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE, oldBase_StructuralFeature, base_StructuralFeature));
			}
		}
		return base_StructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetBase_StructuralFeature() {
		return base_StructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_StructuralFeature(StructuralFeature newBase_StructuralFeature) {
		StructuralFeature oldBase_StructuralFeature = base_StructuralFeature;
		base_StructuralFeature = newBase_StructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE, oldBase_StructuralFeature, base_StructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgNames() {
		if (argNames == null) {
			argNames = new EDataTypeUniqueEList<String>(String.class, this, AspectJPackage.ARGS_POINT_CUT__ARG_NAMES);
		}
		return argNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE:
				if (resolve) return getBase_StructuralFeature();
				return basicGetBase_StructuralFeature();
			case AspectJPackage.ARGS_POINT_CUT__ARG_NAMES:
				return getArgNames();
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
			case AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE:
				setBase_StructuralFeature((StructuralFeature)newValue);
				return;
			case AspectJPackage.ARGS_POINT_CUT__ARG_NAMES:
				getArgNames().clear();
				getArgNames().addAll((Collection<? extends String>)newValue);
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
			case AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE:
				setBase_StructuralFeature((StructuralFeature)null);
				return;
			case AspectJPackage.ARGS_POINT_CUT__ARG_NAMES:
				getArgNames().clear();
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
			case AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE:
				return base_StructuralFeature != null;
			case AspectJPackage.ARGS_POINT_CUT__ARG_NAMES:
				return argNames != null && !argNames.isEmpty();
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
		if (baseClass == ArgumentDefiningPointCut.class) {
			switch (derivedFeatureID) {
				case AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE: return AspectJPackage.ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE;
				case AspectJPackage.ARGS_POINT_CUT__ARG_NAMES: return AspectJPackage.ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES;
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
		if (baseClass == ArgumentDefiningPointCut.class) {
			switch (baseFeatureID) {
				case AspectJPackage.ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE: return AspectJPackage.ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE;
				case AspectJPackage.ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES: return AspectJPackage.ARGS_POINT_CUT__ARG_NAMES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (argNames: ");
		result.append(argNames);
		result.append(')');
		return result.toString();
	}

} //ArgsPointCutImpl
