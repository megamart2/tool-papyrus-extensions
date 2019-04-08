/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.CompositionPointCut;
import org.eclipse.papyrus.aspectj.IndividualPointCut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.IndividualPointCutImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IndividualPointCutImpl extends PointCutImpl implements IndividualPointCut {
	/**
	 * The cached value of the '{@link #getComposite() <em>Composite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionPointCut> composite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualPointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.INDIVIDUAL_POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionPointCut> getComposite() {
		if (composite == null) {
			composite = new EObjectResolvingEList<CompositionPointCut>(CompositionPointCut.class, this, AspectJPackage.INDIVIDUAL_POINT_CUT__COMPOSITE);
		}
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.INDIVIDUAL_POINT_CUT__COMPOSITE:
				return getComposite();
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
			case AspectJPackage.INDIVIDUAL_POINT_CUT__COMPOSITE:
				getComposite().clear();
				getComposite().addAll((Collection<? extends CompositionPointCut>)newValue);
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
			case AspectJPackage.INDIVIDUAL_POINT_CUT__COMPOSITE:
				getComposite().clear();
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
			case AspectJPackage.INDIVIDUAL_POINT_CUT__COMPOSITE:
				return composite != null && !composite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualPointCutImpl
