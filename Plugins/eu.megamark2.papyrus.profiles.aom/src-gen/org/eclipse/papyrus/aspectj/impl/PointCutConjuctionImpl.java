/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.PointCut;
import org.eclipse.papyrus.aspectj.PointCutConjuction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Cut Conjuction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.PointCutConjuctionImpl#getComposee <em>Composee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointCutConjuctionImpl extends PointCutImpl implements PointCutConjuction {
	/**
	 * The cached value of the '{@link #getComposee() <em>Composee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposee()
	 * @generated
	 * @ordered
	 */
	protected EList<PointCut> composee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointCutConjuctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.POINT_CUT_CONJUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointCut> getComposee() {
		if (composee == null) {
			composee = new EObjectResolvingEList<PointCut>(PointCut.class, this, AspectJPackage.POINT_CUT_CONJUCTION__COMPOSEE);
		}
		return composee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.POINT_CUT_CONJUCTION__COMPOSEE:
				return getComposee();
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
			case AspectJPackage.POINT_CUT_CONJUCTION__COMPOSEE:
				getComposee().clear();
				getComposee().addAll((Collection<? extends PointCut>)newValue);
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
			case AspectJPackage.POINT_CUT_CONJUCTION__COMPOSEE:
				getComposee().clear();
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
			case AspectJPackage.POINT_CUT_CONJUCTION__COMPOSEE:
				return composee != null && !composee.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PointCutConjuctionImpl
