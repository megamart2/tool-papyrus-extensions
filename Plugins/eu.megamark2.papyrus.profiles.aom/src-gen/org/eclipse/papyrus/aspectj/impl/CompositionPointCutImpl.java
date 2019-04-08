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
 * An implementation of the model object '<em><b>Composition Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.CompositionPointCutImpl#getComposee <em>Composee</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompositionPointCutImpl extends PointCutImpl implements CompositionPointCut {
	/**
	 * The cached value of the '{@link #getComposee() <em>Composee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposee()
	 * @generated
	 * @ordered
	 */
	protected EList<IndividualPointCut> composee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionPointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.COMPOSITION_POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndividualPointCut> getComposee() {
		if (composee == null) {
			composee = new EObjectResolvingEList<IndividualPointCut>(IndividualPointCut.class, this, AspectJPackage.COMPOSITION_POINT_CUT__COMPOSEE);
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
			case AspectJPackage.COMPOSITION_POINT_CUT__COMPOSEE:
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
			case AspectJPackage.COMPOSITION_POINT_CUT__COMPOSEE:
				getComposee().clear();
				getComposee().addAll((Collection<? extends IndividualPointCut>)newValue);
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
			case AspectJPackage.COMPOSITION_POINT_CUT__COMPOSEE:
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
			case AspectJPackage.COMPOSITION_POINT_CUT__COMPOSEE:
				return composee != null && !composee.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositionPointCutImpl
