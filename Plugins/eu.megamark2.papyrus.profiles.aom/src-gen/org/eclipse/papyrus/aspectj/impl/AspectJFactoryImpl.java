/**
 */
package org.eclipse.papyrus.aspectj.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.aspectj.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectJFactoryImpl extends EFactoryImpl implements AspectJFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AspectJFactory init() {
		try {
			AspectJFactory theAspectJFactory = (AspectJFactory)EPackage.Registry.INSTANCE.getEFactory(AspectJPackage.eNS_URI);
			if (theAspectJFactory != null) {
				return theAspectJFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AspectJFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectJFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AspectJPackage.STATIC_CROSS_CUTTING_FEATURE: return createStaticCrossCuttingFeature();
			case AspectJPackage.ASPECT: return createAspect();
			case AspectJPackage.COMPOSITE_POINT_CUT: return createCompositePointCut();
			case AspectJPackage.INITIALIZATION_POINT_CUT: return createInitializationPointCut();
			case AspectJPackage.PRE_INITIALIZATION_POINT_CUT: return createPreInitializationPointCut();
			case AspectJPackage.SET_POINT_CUT: return createSetPointCut();
			case AspectJPackage.GET_POINT_CUT: return createGetPointCut();
			case AspectJPackage.CALL_POINT_CUT: return createCallPointCut();
			case AspectJPackage.WITHIN_CODE_POINT_CUT: return createWithinCodePointCut();
			case AspectJPackage.THIS_POINT_CUT: return createThisPointCut();
			case AspectJPackage.ARGS_POINT_CUT: return createArgsPointCut();
			case AspectJPackage.TARGET_POINT_CUT: return createTargetPointCut();
			case AspectJPackage.ADVICE_EXECUTION_POINT_CUT: return createAdviceExecutionPointCut();
			case AspectJPackage.ADVICE: return createAdvice();
			case AspectJPackage.STATIC_INITIALIZATION_POINT_CUT: return createStaticInitializationPointCut();
			case AspectJPackage.EXCEPTION_POINT_CUT: return createExceptionPointCut();
			case AspectJPackage.WITHIN_POINT_CUT: return createWithinPointCut();
			case AspectJPackage.CFLOW_BELOW_POINT_CUT: return createCFlowBelowPointCut();
			case AspectJPackage.CROSS_CUTTING_CONCERN: return createCrossCuttingConcern();
			case AspectJPackage.CFLOW_POINT_CUT: return createCFlowPointCut();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AspectJPackage.ADVICE_EXECUTION_TYPE:
				return createAdviceExecutionTypeFromString(eDataType, initialValue);
			case AspectJPackage.ASPECT_INSTANTIATION_TYPE:
				return createAspectInstantiationTypeFromString(eDataType, initialValue);
			case AspectJPackage.POINT_CUT_COMPOSITION_TYPE:
				return createPointCutCompositionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AspectJPackage.ADVICE_EXECUTION_TYPE:
				return convertAdviceExecutionTypeToString(eDataType, instanceValue);
			case AspectJPackage.ASPECT_INSTANTIATION_TYPE:
				return convertAspectInstantiationTypeToString(eDataType, instanceValue);
			case AspectJPackage.POINT_CUT_COMPOSITION_TYPE:
				return convertPointCutCompositionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticCrossCuttingFeature createStaticCrossCuttingFeature() {
		StaticCrossCuttingFeatureImpl staticCrossCuttingFeature = new StaticCrossCuttingFeatureImpl();
		return staticCrossCuttingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositePointCut createCompositePointCut() {
		CompositePointCutImpl compositePointCut = new CompositePointCutImpl();
		return compositePointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializationPointCut createInitializationPointCut() {
		InitializationPointCutImpl initializationPointCut = new InitializationPointCutImpl();
		return initializationPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreInitializationPointCut createPreInitializationPointCut() {
		PreInitializationPointCutImpl preInitializationPointCut = new PreInitializationPointCutImpl();
		return preInitializationPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPointCut createSetPointCut() {
		SetPointCutImpl setPointCut = new SetPointCutImpl();
		return setPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetPointCut createGetPointCut() {
		GetPointCutImpl getPointCut = new GetPointCutImpl();
		return getPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallPointCut createCallPointCut() {
		CallPointCutImpl callPointCut = new CallPointCutImpl();
		return callPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinCodePointCut createWithinCodePointCut() {
		WithinCodePointCutImpl withinCodePointCut = new WithinCodePointCutImpl();
		return withinCodePointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisPointCut createThisPointCut() {
		ThisPointCutImpl thisPointCut = new ThisPointCutImpl();
		return thisPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgsPointCut createArgsPointCut() {
		ArgsPointCutImpl argsPointCut = new ArgsPointCutImpl();
		return argsPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPointCut createTargetPointCut() {
		TargetPointCutImpl targetPointCut = new TargetPointCutImpl();
		return targetPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceExecutionPointCut createAdviceExecutionPointCut() {
		AdviceExecutionPointCutImpl adviceExecutionPointCut = new AdviceExecutionPointCutImpl();
		return adviceExecutionPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice createAdvice() {
		AdviceImpl advice = new AdviceImpl();
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticInitializationPointCut createStaticInitializationPointCut() {
		StaticInitializationPointCutImpl staticInitializationPointCut = new StaticInitializationPointCutImpl();
		return staticInitializationPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionPointCut createExceptionPointCut() {
		ExceptionPointCutImpl exceptionPointCut = new ExceptionPointCutImpl();
		return exceptionPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinPointCut createWithinPointCut() {
		WithinPointCutImpl withinPointCut = new WithinPointCutImpl();
		return withinPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFlowBelowPointCut createCFlowBelowPointCut() {
		CFlowBelowPointCutImpl cFlowBelowPointCut = new CFlowBelowPointCutImpl();
		return cFlowBelowPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossCuttingConcern createCrossCuttingConcern() {
		CrossCuttingConcernImpl crossCuttingConcern = new CrossCuttingConcernImpl();
		return crossCuttingConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFlowPointCut createCFlowPointCut() {
		CFlowPointCutImpl cFlowPointCut = new CFlowPointCutImpl();
		return cFlowPointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceExecutionType createAdviceExecutionTypeFromString(EDataType eDataType, String initialValue) {
		AdviceExecutionType result = AdviceExecutionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdviceExecutionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectInstantiationType createAspectInstantiationTypeFromString(EDataType eDataType, String initialValue) {
		AspectInstantiationType result = AspectInstantiationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectInstantiationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCutCompositionType createPointCutCompositionTypeFromString(EDataType eDataType, String initialValue) {
		PointCutCompositionType result = PointCutCompositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointCutCompositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectJPackage getAspectJPackage() {
		return (AspectJPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AspectJPackage getPackage() {
		return AspectJPackage.eINSTANCE;
	}

} //AspectJFactoryImpl
