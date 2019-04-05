/**
 */
package org.eclipse.papyrus.aspectj.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.PointCut;
import org.eclipse.papyrus.aspectj.PointCutPointCut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Cut Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.PointCutPointCutImpl#getSelectedPointCut <em>Selected Point Cut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointCutPointCutImpl extends PointCutImpl implements PointCutPointCut {
	/**
	 * The cached value of the '{@link #getSelectedPointCut() <em>Selected Point Cut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedPointCut()
	 * @generated
	 * @ordered
	 */
	protected PointCut selectedPointCut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointCutPointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.POINT_CUT_POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut getSelectedPointCut() {
		if (selectedPointCut != null && selectedPointCut.eIsProxy()) {
			InternalEObject oldSelectedPointCut = (InternalEObject)selectedPointCut;
			selectedPointCut = (PointCut)eResolveProxy(oldSelectedPointCut);
			if (selectedPointCut != oldSelectedPointCut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT, oldSelectedPointCut, selectedPointCut));
			}
		}
		return selectedPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut basicGetSelectedPointCut() {
		return selectedPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedPointCut(PointCut newSelectedPointCut, NotificationChain msgs) {
		PointCut oldSelectedPointCut = selectedPointCut;
		selectedPointCut = newSelectedPointCut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT, oldSelectedPointCut, newSelectedPointCut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedPointCut(PointCut newSelectedPointCut) {
		if (newSelectedPointCut != selectedPointCut) {
			NotificationChain msgs = null;
			if (selectedPointCut != null)
				msgs = ((InternalEObject)selectedPointCut).eInverseRemove(this, AspectJPackage.POINT_CUT__SELECTED_BY, PointCut.class, msgs);
			if (newSelectedPointCut != null)
				msgs = ((InternalEObject)newSelectedPointCut).eInverseAdd(this, AspectJPackage.POINT_CUT__SELECTED_BY, PointCut.class, msgs);
			msgs = basicSetSelectedPointCut(newSelectedPointCut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT, newSelectedPointCut, newSelectedPointCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT:
				if (selectedPointCut != null)
					msgs = ((InternalEObject)selectedPointCut).eInverseRemove(this, AspectJPackage.POINT_CUT__SELECTED_BY, PointCut.class, msgs);
				return basicSetSelectedPointCut((PointCut)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT:
				return basicSetSelectedPointCut(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT:
				if (resolve) return getSelectedPointCut();
				return basicGetSelectedPointCut();
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
			case AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT:
				setSelectedPointCut((PointCut)newValue);
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
			case AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT:
				setSelectedPointCut((PointCut)null);
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
			case AspectJPackage.POINT_CUT_POINT_CUT__SELECTED_POINT_CUT:
				return selectedPointCut != null;
		}
		return super.eIsSet(featureID);
	}

} //PointCutPointCutImpl
