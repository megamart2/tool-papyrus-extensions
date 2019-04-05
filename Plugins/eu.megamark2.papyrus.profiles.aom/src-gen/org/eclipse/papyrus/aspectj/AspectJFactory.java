/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.aspectj.AspectJPackage
 * @generated
 */
public interface AspectJFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectJFactory eINSTANCE = org.eclipse.papyrus.aspectj.impl.AspectJFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Static Cross Cutting Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Cross Cutting Feature</em>'.
	 * @generated
	 */
	StaticCrossCuttingFeature createStaticCrossCuttingFeature();

	/**
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	Aspect createAspect();

	/**
	 * Returns a new object of class '<em>Initialization Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialization Point Cut</em>'.
	 * @generated
	 */
	InitializationPointCut createInitializationPointCut();

	/**
	 * Returns a new object of class '<em>Pre Initialization Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Initialization Point Cut</em>'.
	 * @generated
	 */
	PreInitializationPointCut createPreInitializationPointCut();

	/**
	 * Returns a new object of class '<em>Set Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Point Cut</em>'.
	 * @generated
	 */
	SetPointCut createSetPointCut();

	/**
	 * Returns a new object of class '<em>Get Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Point Cut</em>'.
	 * @generated
	 */
	GetPointCut createGetPointCut();

	/**
	 * Returns a new object of class '<em>Call Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Point Cut</em>'.
	 * @generated
	 */
	CallPointCut createCallPointCut();

	/**
	 * Returns a new object of class '<em>Within Code Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Within Code Point Cut</em>'.
	 * @generated
	 */
	WithinCodePointCut createWithinCodePointCut();

	/**
	 * Returns a new object of class '<em>This Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This Point Cut</em>'.
	 * @generated
	 */
	ThisPointCut createThisPointCut();

	/**
	 * Returns a new object of class '<em>Args Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Args Point Cut</em>'.
	 * @generated
	 */
	ArgsPointCut createArgsPointCut();

	/**
	 * Returns a new object of class '<em>Target Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Point Cut</em>'.
	 * @generated
	 */
	TargetPointCut createTargetPointCut();

	/**
	 * Returns a new object of class '<em>Advice Execution Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advice Execution Point Cut</em>'.
	 * @generated
	 */
	AdviceExecutionPointCut createAdviceExecutionPointCut();

	/**
	 * Returns a new object of class '<em>Advice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advice</em>'.
	 * @generated
	 */
	Advice createAdvice();

	/**
	 * Returns a new object of class '<em>Static Initialization Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Initialization Point Cut</em>'.
	 * @generated
	 */
	StaticInitializationPointCut createStaticInitializationPointCut();

	/**
	 * Returns a new object of class '<em>Exception Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Point Cut</em>'.
	 * @generated
	 */
	ExceptionPointCut createExceptionPointCut();

	/**
	 * Returns a new object of class '<em>Within Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Within Point Cut</em>'.
	 * @generated
	 */
	WithinPointCut createWithinPointCut();

	/**
	 * Returns a new object of class '<em>CFlow Below Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFlow Below Point Cut</em>'.
	 * @generated
	 */
	CFlowBelowPointCut createCFlowBelowPointCut();

	/**
	 * Returns a new object of class '<em>Cross Cutting Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Cutting Concern</em>'.
	 * @generated
	 */
	CrossCuttingConcern createCrossCuttingConcern();

	/**
	 * Returns a new object of class '<em>Point Cut Disjuction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Cut Disjuction</em>'.
	 * @generated
	 */
	PointCutDisjuction createPointCutDisjuction();

	/**
	 * Returns a new object of class '<em>Point Cut Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Cut Negation</em>'.
	 * @generated
	 */
	PointCutNegation createPointCutNegation();

	/**
	 * Returns a new object of class '<em>CFlow Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFlow Point Cut</em>'.
	 * @generated
	 */
	CFlowPointCut createCFlowPointCut();

	/**
	 * Returns a new object of class '<em>Point Cut Conjuction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Cut Conjuction</em>'.
	 * @generated
	 */
	PointCutConjuction createPointCutConjuction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AspectJPackage getAspectJPackage();

} //AspectJFactory
