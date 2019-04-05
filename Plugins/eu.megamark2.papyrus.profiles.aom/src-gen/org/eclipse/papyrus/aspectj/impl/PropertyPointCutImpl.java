/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.PropertyPointCut;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.PropertyPointCutImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyPointCutImpl extends IndividualPointCutImpl implements PropertyPointCut {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyPointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.PROPERTY_POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getField() {
		if (field == null) {
			field = new EObjectResolvingEList<Property>(Property.class, this, AspectJPackage.PROPERTY_POINT_CUT__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getField(String name, Type type) {
		return getField(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getField(String name, Type type, boolean ignoreCase, EClass eClass) {
		fieldLoop: for (Property field : getField()) {
			if (eClass != null && !eClass.isInstance(field))
				continue fieldLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(field.getName()) : name.equals(field.getName())))
				continue fieldLoop;
			if (type != null && !type.equals(field.getType()))
				continue fieldLoop;
			return field;
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
			case AspectJPackage.PROPERTY_POINT_CUT__FIELD:
				return getField();
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
			case AspectJPackage.PROPERTY_POINT_CUT__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends Property>)newValue);
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
			case AspectJPackage.PROPERTY_POINT_CUT__FIELD:
				getField().clear();
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
			case AspectJPackage.PROPERTY_POINT_CUT__FIELD:
				return field != null && !field.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyPointCutImpl
