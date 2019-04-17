/**
 */
package org.eclipse.papyrus.aspectj.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.OperationalPointCut;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.impl.OperationalPointCutImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationalPointCutImpl extends PointCutImpl implements OperationalPointCut {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalPointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.OPERATIONAL_POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectResolvingEList<Operation>(Operation.class, this, AspectJPackage.OPERATIONAL_POINT_CUT__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		return getOperation(name, ownedParameterNames, ownedParameterTypes, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes, boolean ignoreCase) {
		operationLoop: for (Operation operation : getOperation()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(operation.getName()) : name.equals(operation.getName())))
				continue operationLoop;
			EList<Parameter> ownedParameterList = operation.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null && ownedParameterNames.size() != ownedParameterListSize || (ownedParameterTypes != null && ownedParameterTypes.size() != ownedParameterListSize))
				continue  operationLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null && !(ignoreCase ? (ownedParameterNames.get(j)).equalsIgnoreCase(ownedParameter.getName()) : ownedParameterNames.get(j).equals(ownedParameter.getName())))
					continue operationLoop;
				if (ownedParameterTypes != null && !ownedParameterTypes.get(j).equals(ownedParameter.getType()))
					continue operationLoop;
			}
			return operation;
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
			case AspectJPackage.OPERATIONAL_POINT_CUT__OPERATION:
				return getOperation();
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
			case AspectJPackage.OPERATIONAL_POINT_CUT__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
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
			case AspectJPackage.OPERATIONAL_POINT_CUT__OPERATION:
				getOperation().clear();
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
			case AspectJPackage.OPERATIONAL_POINT_CUT__OPERATION:
				return operation != null && !operation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalPointCutImpl
