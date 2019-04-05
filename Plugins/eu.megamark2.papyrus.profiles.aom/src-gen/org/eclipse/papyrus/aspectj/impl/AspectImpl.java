/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.aspectj.Aspect;
import org.eclipse.papyrus.aspectj.AspectInstantiationType;
import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.PointCut;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#isPrivileged <em>Is Privileged</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#getPerType <em>Per Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#getPerPointCut <em>Per Point Cut</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#getDeclaredParents <em>Declared Parents</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#getDeclaredImplements <em>Declared Implements</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#getPrecedes <em>Precedes</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.AspectImpl#getPrecededBy <em>Preceded By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AspectImpl extends MinimalEObjectImpl.Container implements Aspect {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #isPrivileged() <em>Is Privileged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivileged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIVILEGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivileged() <em>Is Privileged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivileged()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrivileged = IS_PRIVILEGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerType() <em>Per Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerType()
	 * @generated
	 * @ordered
	 */
	protected static final AspectInstantiationType PER_TYPE_EDEFAULT = AspectInstantiationType.PERTHIS;

	/**
	 * The cached value of the '{@link #getPerType() <em>Per Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerType()
	 * @generated
	 * @ordered
	 */
	protected AspectInstantiationType perType = PER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerPointCut() <em>Per Point Cut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerPointCut()
	 * @generated
	 * @ordered
	 */
	protected PointCut perPointCut;

	/**
	 * The cached value of the '{@link #getDeclaredParents() <em>Declared Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> declaredParents;

	/**
	 * The cached value of the '{@link #getDeclaredImplements() <em>Declared Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRealization> declaredImplements;

	/**
	 * The cached value of the '{@link #getPrecedes() <em>Precedes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedes()
	 * @generated
	 * @ordered
	 */
	protected Aspect precedes;

	/**
	 * The cached value of the '{@link #getPrecededBy() <em>Preceded By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecededBy()
	 * @generated
	 * @ordered
	 */
	protected Aspect precededBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ASPECT__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivileged() {
		return isPrivileged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrivileged(boolean newIsPrivileged) {
		boolean oldIsPrivileged = isPrivileged;
		isPrivileged = newIsPrivileged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__IS_PRIVILEGED, oldIsPrivileged, isPrivileged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectInstantiationType getPerType() {
		return perType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerType(AspectInstantiationType newPerType) {
		AspectInstantiationType oldPerType = perType;
		perType = newPerType == null ? PER_TYPE_EDEFAULT : newPerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__PER_TYPE, oldPerType, perType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut getPerPointCut() {
		if (perPointCut != null && perPointCut.eIsProxy()) {
			InternalEObject oldPerPointCut = (InternalEObject)perPointCut;
			perPointCut = (PointCut)eResolveProxy(oldPerPointCut);
			if (perPointCut != oldPerPointCut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ASPECT__PER_POINT_CUT, oldPerPointCut, perPointCut));
			}
		}
		return perPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut basicGetPerPointCut() {
		return perPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerPointCut(PointCut newPerPointCut) {
		PointCut oldPerPointCut = perPointCut;
		perPointCut = newPerPointCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__PER_POINT_CUT, oldPerPointCut, perPointCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getDeclaredParents() {
		if (declaredParents == null) {
			declaredParents = new EObjectResolvingEList<Generalization>(Generalization.class, this, AspectJPackage.ASPECT__DECLARED_PARENTS);
		}
		return declaredParents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getDeclaredParents(Classifier general) {
		declaredParentsLoop: for (Generalization declaredParents : getDeclaredParents()) {
			if (general != null && !general.equals(declaredParents.getGeneral()))
				continue declaredParentsLoop;
			return declaredParents;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getDeclaredImplements() {
		if (declaredImplements == null) {
			declaredImplements = new EObjectResolvingEList<InterfaceRealization>(InterfaceRealization.class, this, AspectJPackage.ASPECT__DECLARED_IMPLEMENTS);
		}
		return declaredImplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getDeclaredImplements(String name, Interface contract) {
		return getDeclaredImplements(name, contract, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getDeclaredImplements(String name, Interface contract, boolean ignoreCase) {
		declaredImplementsLoop: for (InterfaceRealization declaredImplements : getDeclaredImplements()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(declaredImplements.getName()) : name.equals(declaredImplements.getName())))
				continue declaredImplementsLoop;
			if (contract != null && !contract.equals(declaredImplements.getContract()))
				continue declaredImplementsLoop;
			return declaredImplements;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect getPrecedes() {
		if (precedes != null && precedes.eIsProxy()) {
			InternalEObject oldPrecedes = (InternalEObject)precedes;
			precedes = (Aspect)eResolveProxy(oldPrecedes);
			if (precedes != oldPrecedes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ASPECT__PRECEDES, oldPrecedes, precedes));
			}
		}
		return precedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect basicGetPrecedes() {
		return precedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedes(Aspect newPrecedes, NotificationChain msgs) {
		Aspect oldPrecedes = precedes;
		precedes = newPrecedes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__PRECEDES, oldPrecedes, newPrecedes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedes(Aspect newPrecedes) {
		if (newPrecedes != precedes) {
			NotificationChain msgs = null;
			if (precedes != null)
				msgs = ((InternalEObject)precedes).eInverseRemove(this, AspectJPackage.ASPECT__PRECEDED_BY, Aspect.class, msgs);
			if (newPrecedes != null)
				msgs = ((InternalEObject)newPrecedes).eInverseAdd(this, AspectJPackage.ASPECT__PRECEDED_BY, Aspect.class, msgs);
			msgs = basicSetPrecedes(newPrecedes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__PRECEDES, newPrecedes, newPrecedes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect getPrecededBy() {
		if (precededBy != null && precededBy.eIsProxy()) {
			InternalEObject oldPrecededBy = (InternalEObject)precededBy;
			precededBy = (Aspect)eResolveProxy(oldPrecededBy);
			if (precededBy != oldPrecededBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectJPackage.ASPECT__PRECEDED_BY, oldPrecededBy, precededBy));
			}
		}
		return precededBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect basicGetPrecededBy() {
		return precededBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecededBy(Aspect newPrecededBy, NotificationChain msgs) {
		Aspect oldPrecededBy = precededBy;
		precededBy = newPrecededBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__PRECEDED_BY, oldPrecededBy, newPrecededBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecededBy(Aspect newPrecededBy) {
		if (newPrecededBy != precededBy) {
			NotificationChain msgs = null;
			if (precededBy != null)
				msgs = ((InternalEObject)precededBy).eInverseRemove(this, AspectJPackage.ASPECT__PRECEDES, Aspect.class, msgs);
			if (newPrecededBy != null)
				msgs = ((InternalEObject)newPrecededBy).eInverseAdd(this, AspectJPackage.ASPECT__PRECEDES, Aspect.class, msgs);
			msgs = basicSetPrecededBy(newPrecededBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectJPackage.ASPECT__PRECEDED_BY, newPrecededBy, newPrecededBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectJPackage.ASPECT__PRECEDES:
				if (precedes != null)
					msgs = ((InternalEObject)precedes).eInverseRemove(this, AspectJPackage.ASPECT__PRECEDED_BY, Aspect.class, msgs);
				return basicSetPrecedes((Aspect)otherEnd, msgs);
			case AspectJPackage.ASPECT__PRECEDED_BY:
				if (precededBy != null)
					msgs = ((InternalEObject)precededBy).eInverseRemove(this, AspectJPackage.ASPECT__PRECEDES, Aspect.class, msgs);
				return basicSetPrecededBy((Aspect)otherEnd, msgs);
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
			case AspectJPackage.ASPECT__PRECEDES:
				return basicSetPrecedes(null, msgs);
			case AspectJPackage.ASPECT__PRECEDED_BY:
				return basicSetPrecededBy(null, msgs);
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
			case AspectJPackage.ASPECT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case AspectJPackage.ASPECT__IS_PRIVILEGED:
				return isPrivileged();
			case AspectJPackage.ASPECT__PER_TYPE:
				return getPerType();
			case AspectJPackage.ASPECT__PER_POINT_CUT:
				if (resolve) return getPerPointCut();
				return basicGetPerPointCut();
			case AspectJPackage.ASPECT__DECLARED_PARENTS:
				return getDeclaredParents();
			case AspectJPackage.ASPECT__DECLARED_IMPLEMENTS:
				return getDeclaredImplements();
			case AspectJPackage.ASPECT__PRECEDES:
				if (resolve) return getPrecedes();
				return basicGetPrecedes();
			case AspectJPackage.ASPECT__PRECEDED_BY:
				if (resolve) return getPrecededBy();
				return basicGetPrecededBy();
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
			case AspectJPackage.ASPECT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case AspectJPackage.ASPECT__IS_PRIVILEGED:
				setIsPrivileged((Boolean)newValue);
				return;
			case AspectJPackage.ASPECT__PER_TYPE:
				setPerType((AspectInstantiationType)newValue);
				return;
			case AspectJPackage.ASPECT__PER_POINT_CUT:
				setPerPointCut((PointCut)newValue);
				return;
			case AspectJPackage.ASPECT__DECLARED_PARENTS:
				getDeclaredParents().clear();
				getDeclaredParents().addAll((Collection<? extends Generalization>)newValue);
				return;
			case AspectJPackage.ASPECT__DECLARED_IMPLEMENTS:
				getDeclaredImplements().clear();
				getDeclaredImplements().addAll((Collection<? extends InterfaceRealization>)newValue);
				return;
			case AspectJPackage.ASPECT__PRECEDES:
				setPrecedes((Aspect)newValue);
				return;
			case AspectJPackage.ASPECT__PRECEDED_BY:
				setPrecededBy((Aspect)newValue);
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
			case AspectJPackage.ASPECT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case AspectJPackage.ASPECT__IS_PRIVILEGED:
				setIsPrivileged(IS_PRIVILEGED_EDEFAULT);
				return;
			case AspectJPackage.ASPECT__PER_TYPE:
				setPerType(PER_TYPE_EDEFAULT);
				return;
			case AspectJPackage.ASPECT__PER_POINT_CUT:
				setPerPointCut((PointCut)null);
				return;
			case AspectJPackage.ASPECT__DECLARED_PARENTS:
				getDeclaredParents().clear();
				return;
			case AspectJPackage.ASPECT__DECLARED_IMPLEMENTS:
				getDeclaredImplements().clear();
				return;
			case AspectJPackage.ASPECT__PRECEDES:
				setPrecedes((Aspect)null);
				return;
			case AspectJPackage.ASPECT__PRECEDED_BY:
				setPrecededBy((Aspect)null);
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
			case AspectJPackage.ASPECT__BASE_CLASS:
				return base_Class != null;
			case AspectJPackage.ASPECT__IS_PRIVILEGED:
				return isPrivileged != IS_PRIVILEGED_EDEFAULT;
			case AspectJPackage.ASPECT__PER_TYPE:
				return perType != PER_TYPE_EDEFAULT;
			case AspectJPackage.ASPECT__PER_POINT_CUT:
				return perPointCut != null;
			case AspectJPackage.ASPECT__DECLARED_PARENTS:
				return declaredParents != null && !declaredParents.isEmpty();
			case AspectJPackage.ASPECT__DECLARED_IMPLEMENTS:
				return declaredImplements != null && !declaredImplements.isEmpty();
			case AspectJPackage.ASPECT__PRECEDES:
				return precedes != null;
			case AspectJPackage.ASPECT__PRECEDED_BY:
				return precededBy != null;
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
		result.append(" (isPrivileged: ");
		result.append(isPrivileged);
		result.append(", perType: ");
		result.append(perType);
		result.append(')');
		return result.toString();
	}

} //AspectImpl
