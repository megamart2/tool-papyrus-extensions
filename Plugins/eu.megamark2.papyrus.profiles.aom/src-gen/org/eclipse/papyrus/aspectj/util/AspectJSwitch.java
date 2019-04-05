/**
 */
package org.eclipse.papyrus.aspectj.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.aspectj.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.aspectj.AspectJPackage
 * @generated
 */
public class AspectJSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AspectJPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectJSwitch() {
		if (modelPackage == null) {
			modelPackage = AspectJPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE: {
				StaticCrossCuttingFeature staticCrossCuttingFeature = (StaticCrossCuttingFeature)theEObject;
				T result = caseStaticCrossCuttingFeature(staticCrossCuttingFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				T result = caseAspect(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.POINT_CUT: {
				PointCut pointCut = (PointCut)theEObject;
				T result = casePointCut(pointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.INITIALIZATION_POINT_CUT: {
				InitializationPointCut initializationPointCut = (InitializationPointCut)theEObject;
				T result = caseInitializationPointCut(initializationPointCut);
				if (result == null) result = caseExecutionPointCut(initializationPointCut);
				if (result == null) result = caseOperationalPointCut(initializationPointCut);
				if (result == null) result = casePointCut(initializationPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.EXECUTION_POINT_CUT: {
				ExecutionPointCut executionPointCut = (ExecutionPointCut)theEObject;
				T result = caseExecutionPointCut(executionPointCut);
				if (result == null) result = caseOperationalPointCut(executionPointCut);
				if (result == null) result = casePointCut(executionPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.OPERATIONAL_POINT_CUT: {
				OperationalPointCut operationalPointCut = (OperationalPointCut)theEObject;
				T result = caseOperationalPointCut(operationalPointCut);
				if (result == null) result = casePointCut(operationalPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.PRE_INITIALIZATION_POINT_CUT: {
				PreInitializationPointCut preInitializationPointCut = (PreInitializationPointCut)theEObject;
				T result = casePreInitializationPointCut(preInitializationPointCut);
				if (result == null) result = caseExecutionPointCut(preInitializationPointCut);
				if (result == null) result = caseOperationalPointCut(preInitializationPointCut);
				if (result == null) result = casePointCut(preInitializationPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.SET_POINT_CUT: {
				SetPointCut setPointCut = (SetPointCut)theEObject;
				T result = caseSetPointCut(setPointCut);
				if (result == null) result = casePropertyPointCut(setPointCut);
				if (result == null) result = casePointCut(setPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.PROPERTY_POINT_CUT: {
				PropertyPointCut propertyPointCut = (PropertyPointCut)theEObject;
				T result = casePropertyPointCut(propertyPointCut);
				if (result == null) result = casePointCut(propertyPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.GET_POINT_CUT: {
				GetPointCut getPointCut = (GetPointCut)theEObject;
				T result = caseGetPointCut(getPointCut);
				if (result == null) result = casePropertyPointCut(getPointCut);
				if (result == null) result = casePointCut(getPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.CALL_POINT_CUT: {
				CallPointCut callPointCut = (CallPointCut)theEObject;
				T result = caseCallPointCut(callPointCut);
				if (result == null) result = caseOperationalPointCut(callPointCut);
				if (result == null) result = casePointCut(callPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.WITHIN_CODE_POINT_CUT: {
				WithinCodePointCut withinCodePointCut = (WithinCodePointCut)theEObject;
				T result = caseWithinCodePointCut(withinCodePointCut);
				if (result == null) result = caseOperationalPointCut(withinCodePointCut);
				if (result == null) result = casePointCut(withinCodePointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.ARGUMENT_DEFINING_POINT_CUT: {
				ArgumentDefiningPointCut argumentDefiningPointCut = (ArgumentDefiningPointCut)theEObject;
				T result = caseArgumentDefiningPointCut(argumentDefiningPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.THIS_POINT_CUT: {
				ThisPointCut thisPointCut = (ThisPointCut)theEObject;
				T result = caseThisPointCut(thisPointCut);
				if (result == null) result = caseArgumentDefiningPointCut(thisPointCut);
				if (result == null) result = caseTypePointCut(thisPointCut);
				if (result == null) result = casePointCut(thisPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.TYPE_POINT_CUT: {
				TypePointCut typePointCut = (TypePointCut)theEObject;
				T result = caseTypePointCut(typePointCut);
				if (result == null) result = casePointCut(typePointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.ARGS_POINT_CUT: {
				ArgsPointCut argsPointCut = (ArgsPointCut)theEObject;
				T result = caseArgsPointCut(argsPointCut);
				if (result == null) result = caseArgumentDefiningPointCut(argsPointCut);
				if (result == null) result = caseTypePointCut(argsPointCut);
				if (result == null) result = casePointCut(argsPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.TARGET_POINT_CUT: {
				TargetPointCut targetPointCut = (TargetPointCut)theEObject;
				T result = caseTargetPointCut(targetPointCut);
				if (result == null) result = caseArgumentDefiningPointCut(targetPointCut);
				if (result == null) result = caseTypePointCut(targetPointCut);
				if (result == null) result = casePointCut(targetPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.ADVICE_EXECUTION_POINT_CUT: {
				AdviceExecutionPointCut adviceExecutionPointCut = (AdviceExecutionPointCut)theEObject;
				T result = caseAdviceExecutionPointCut(adviceExecutionPointCut);
				if (result == null) result = casePointCut(adviceExecutionPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.ADVICE: {
				Advice advice = (Advice)theEObject;
				T result = caseAdvice(advice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.STATIC_INITIALIZATION_POINT_CUT: {
				StaticInitializationPointCut staticInitializationPointCut = (StaticInitializationPointCut)theEObject;
				T result = caseStaticInitializationPointCut(staticInitializationPointCut);
				if (result == null) result = caseTypePointCut(staticInitializationPointCut);
				if (result == null) result = casePointCut(staticInitializationPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.EXCEPTION_POINT_CUT: {
				ExceptionPointCut exceptionPointCut = (ExceptionPointCut)theEObject;
				T result = caseExceptionPointCut(exceptionPointCut);
				if (result == null) result = caseTypePointCut(exceptionPointCut);
				if (result == null) result = casePointCut(exceptionPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.WITHIN_POINT_CUT: {
				WithinPointCut withinPointCut = (WithinPointCut)theEObject;
				T result = caseWithinPointCut(withinPointCut);
				if (result == null) result = caseTypePointCut(withinPointCut);
				if (result == null) result = casePointCut(withinPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.POINT_CUT_POINT_CUT: {
				PointCutPointCut pointCutPointCut = (PointCutPointCut)theEObject;
				T result = casePointCutPointCut(pointCutPointCut);
				if (result == null) result = casePointCut(pointCutPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.CFLOW_BELOW_POINT_CUT: {
				CFlowBelowPointCut cFlowBelowPointCut = (CFlowBelowPointCut)theEObject;
				T result = caseCFlowBelowPointCut(cFlowBelowPointCut);
				if (result == null) result = casePointCutPointCut(cFlowBelowPointCut);
				if (result == null) result = casePointCut(cFlowBelowPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.CROSS_CUTTING_CONCERN: {
				CrossCuttingConcern crossCuttingConcern = (CrossCuttingConcern)theEObject;
				T result = caseCrossCuttingConcern(crossCuttingConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.POINT_CUT_DISJUCTION: {
				PointCutDisjuction pointCutDisjuction = (PointCutDisjuction)theEObject;
				T result = casePointCutDisjuction(pointCutDisjuction);
				if (result == null) result = casePointCut(pointCutDisjuction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.POINT_CUT_NEGATION: {
				PointCutNegation pointCutNegation = (PointCutNegation)theEObject;
				T result = casePointCutNegation(pointCutNegation);
				if (result == null) result = casePointCut(pointCutNegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.CFLOW_POINT_CUT: {
				CFlowPointCut cFlowPointCut = (CFlowPointCut)theEObject;
				T result = caseCFlowPointCut(cFlowPointCut);
				if (result == null) result = casePointCutPointCut(cFlowPointCut);
				if (result == null) result = casePointCut(cFlowPointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AspectJPackage.POINT_CUT_CONJUCTION: {
				PointCutConjuction pointCutConjuction = (PointCutConjuction)theEObject;
				T result = casePointCutConjuction(pointCutConjuction);
				if (result == null) result = casePointCut(pointCutConjuction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Cross Cutting Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Cross Cutting Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticCrossCuttingFeature(StaticCrossCuttingFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointCut(PointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializationPointCut(InitializationPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPointCut(ExecutionPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalPointCut(OperationalPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Initialization Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Initialization Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreInitializationPointCut(PreInitializationPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetPointCut(SetPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyPointCut(PropertyPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPointCut(GetPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallPointCut(CallPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Within Code Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Within Code Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithinCodePointCut(WithinCodePointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Defining Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Defining Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentDefiningPointCut(ArgumentDefiningPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThisPointCut(ThisPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointCut(TypePointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Args Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Args Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgsPointCut(ArgsPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPointCut(TargetPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advice Execution Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advice Execution Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdviceExecutionPointCut(AdviceExecutionPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvice(Advice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Initialization Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Initialization Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticInitializationPointCut(StaticInitializationPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionPointCut(ExceptionPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Within Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Within Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithinPointCut(WithinPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Cut Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Cut Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointCutPointCut(PointCutPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFlow Below Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFlow Below Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFlowBelowPointCut(CFlowBelowPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Cutting Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Cutting Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossCuttingConcern(CrossCuttingConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Cut Disjuction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Cut Disjuction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointCutDisjuction(PointCutDisjuction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Cut Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Cut Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointCutNegation(PointCutNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFlow Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFlow Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFlowPointCut(CFlowPointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Cut Conjuction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Cut Conjuction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointCutConjuction(PointCutConjuction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AspectJSwitch
