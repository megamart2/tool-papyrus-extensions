/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.CompositePointCut;
import org.eclipse.papyrus.aspectj.PointCut;
import org.eclipse.papyrus.aspectj.PointCutCompositionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.CompositePointCutImpl#getComposee <em>Composee</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.CompositePointCutImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositePointCutImpl extends PointCutImpl implements CompositePointCut {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PointCutCompositionType TYPE_EDEFAULT = PointCutCompositionType.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PointCutCompositionType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.COMPOSITE_POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointCut> getComposee() {
		if (composee == null) {
			composee = new EObjectResolvingEList<PointCut>(PointCut.class, this, AspectJPackage.COMPOSITE_POINT_CUT__COMPOSEE);
		}
		return composee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCutCompositionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PointCutCompositionType newType) {
		PointCutCompositionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.COMPOSITE_POINT_CUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.COMPOSITE_POINT_CUT__COMPOSEE:
				return getComposee();
			case AspectJPackage.COMPOSITE_POINT_CUT__TYPE:
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
			case AspectJPackage.COMPOSITE_POINT_CUT__COMPOSEE:
				getComposee().clear();
				getComposee().addAll((Collection<? extends PointCut>)newValue);
				return;
			case AspectJPackage.COMPOSITE_POINT_CUT__TYPE:
				setType((PointCutCompositionType)newValue);
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
			case AspectJPackage.COMPOSITE_POINT_CUT__COMPOSEE:
				getComposee().clear();
				return;
			case AspectJPackage.COMPOSITE_POINT_CUT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case AspectJPackage.COMPOSITE_POINT_CUT__COMPOSEE:
				return composee != null && !composee.isEmpty();
			case AspectJPackage.COMPOSITE_POINT_CUT__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CompositePointCutImpl
