/**
 */
package org.eclipse.papyrus.aspectj.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.InitializationPointCut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initialization Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InitializationPointCutImpl extends ExecutionPointCutImpl implements InitializationPointCut {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializationPointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectJPackage.Literals.INITIALIZATION_POINT_CUT;
	}

} //InitializationPointCutImpl
