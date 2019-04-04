/**
 */
package org.eclipse.papyrus.aspectj.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.aspectj.Advice;
import org.eclipse.papyrus.aspectj.AdviceExecutionType;
import org.eclipse.papyrus.aspectj.AspectJPackage;

import org.eclipse.papyrus.aspectj.PointCut;
import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AdviceImpl#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AdviceImpl#getAdviceExecution <em>Advice Execution</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AdviceImpl#getPointcut <em>Pointcut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdviceImpl extends MinimalEObjectImpl.Container implements Advice {
	/**
	 * The cached value of the '{@link #getBase_BehavioralFeature() <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature base_BehavioralFeature;

	/**
	 * The default value of the '{@link #getAdviceExecution() <em>Advice Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdviceExecution()
	 * @generated
	 * @ordered
	 */
	protected static final AdviceExecutionType ADVICE_EXECUTION_EDEFAULT = AdviceExecutionType.AROUND_ADVICE;

	/**
	 * The cached value of the '{@link #getAdviceExecution() <em>Advice Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdviceExecution()
	 * @generated
	 * @ordered
	 */
	protected AdviceExecutionType adviceExecution = ADVICE_EXECUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcut()
	 * @generated
	 * @ordered
	 */
	protected PointCut pointcut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.ADVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceExecutionType getAdviceExecution() {
		return adviceExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdviceExecution(AdviceExecutionType newAdviceExecution) {
		AdviceExecutionType oldAdviceExecution = adviceExecution;
		adviceExecution = newAdviceExecution == null ? ADVICE_EXECUTION_EDEFAULT : newAdviceExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ADVICE__ADVICE_EXECUTION, oldAdviceExecution, adviceExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut getPointcut() {
		if (pointcut != null && pointcut.eIsProxy()) {
			InternalEObject oldPointcut = (InternalEObject)pointcut;
			pointcut = (PointCut)eResolveProxy(oldPointcut);
			if (pointcut != oldPointcut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ADVICE__POINTCUT, oldPointcut, pointcut));
			}
		}
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut basicGetPointcut() {
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcut(PointCut newPointcut) {
		PointCut oldPointcut = pointcut;
		pointcut = newPointcut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ADVICE__POINTCUT, oldPointcut, pointcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getBase_BehavioralFeature() {
		if (base_BehavioralFeature != null && base_BehavioralFeature.eIsProxy()) {
			InternalEObject oldBase_BehavioralFeature = (InternalEObject)base_BehavioralFeature;
			base_BehavioralFeature = (BehavioralFeature)eResolveProxy(oldBase_BehavioralFeature);
			if (base_BehavioralFeature != oldBase_BehavioralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ADVICE__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
			}
		}
		return base_BehavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetBase_BehavioralFeature() {
		return base_BehavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_BehavioralFeature(BehavioralFeature newBase_BehavioralFeature) {
		BehavioralFeature oldBase_BehavioralFeature = base_BehavioralFeature;
		base_BehavioralFeature = newBase_BehavioralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ADVICE__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectJPackage.ADVICE__BASE_BEHAVIORAL_FEATURE:
				if (resolve) return getBase_BehavioralFeature();
				return basicGetBase_BehavioralFeature();
			case AspectJPackage.ADVICE__ADVICE_EXECUTION:
				return getAdviceExecution();
			case AspectJPackage.ADVICE__POINTCUT:
				if (resolve) return getPointcut();
				return basicGetPointcut();
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
			case AspectJPackage.ADVICE__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)newValue);
				return;
			case AspectJPackage.ADVICE__ADVICE_EXECUTION:
				setAdviceExecution((AdviceExecutionType)newValue);
				return;
			case AspectJPackage.ADVICE__POINTCUT:
				setPointcut((PointCut)newValue);
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
			case AspectJPackage.ADVICE__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)null);
				return;
			case AspectJPackage.ADVICE__ADVICE_EXECUTION:
				setAdviceExecution(ADVICE_EXECUTION_EDEFAULT);
				return;
			case AspectJPackage.ADVICE__POINTCUT:
				setPointcut((PointCut)null);
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
			case AspectJPackage.ADVICE__BASE_BEHAVIORAL_FEATURE:
				return base_BehavioralFeature != null;
			case AspectJPackage.ADVICE__ADVICE_EXECUTION:
				return adviceExecution != ADVICE_EXECUTION_EDEFAULT;
			case AspectJPackage.ADVICE__POINTCUT:
				return pointcut != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (adviceExecution: ");
		result.append(adviceExecution);
		result.append(')');
		return result.toString();
	}

} //AdviceImpl
