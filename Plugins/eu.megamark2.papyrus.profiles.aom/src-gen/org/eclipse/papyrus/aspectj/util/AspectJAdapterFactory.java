/**
 */
package org.eclipse.papyrus.aspectj.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.aspectj.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.aspectj.AspectJPackage
 * @generated
 */
public class AspectJAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AspectJPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectJAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AspectJPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectJSwitch<Adapter> modelSwitch =
		new AspectJSwitch<Adapter>() {
			@Override
			public Adapter caseStaticCrossCuttingFeature(StaticCrossCuttingFeature object) {
				return createStaticCrossCuttingFeatureAdapter();
			}
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter casePointCut(PointCut object) {
				return createPointCutAdapter();
			}
			@Override
			public Adapter caseCompositePointCut(CompositePointCut object) {
				return createCompositePointCutAdapter();
			}
			@Override
			public Adapter caseInitializationPointCut(InitializationPointCut object) {
				return createInitializationPointCutAdapter();
			}
			@Override
			public Adapter caseExecutionPointCut(ExecutionPointCut object) {
				return createExecutionPointCutAdapter();
			}
			@Override
			public Adapter caseOperationalPointCut(OperationalPointCut object) {
				return createOperationalPointCutAdapter();
			}
			@Override
			public Adapter casePreInitializationPointCut(PreInitializationPointCut object) {
				return createPreInitializationPointCutAdapter();
			}
			@Override
			public Adapter caseSetPointCut(SetPointCut object) {
				return createSetPointCutAdapter();
			}
			@Override
			public Adapter casePropertyPointCut(PropertyPointCut object) {
				return createPropertyPointCutAdapter();
			}
			@Override
			public Adapter caseGetPointCut(GetPointCut object) {
				return createGetPointCutAdapter();
			}
			@Override
			public Adapter caseCallPointCut(CallPointCut object) {
				return createCallPointCutAdapter();
			}
			@Override
			public Adapter caseWithinCodePointCut(WithinCodePointCut object) {
				return createWithinCodePointCutAdapter();
			}
			@Override
			public Adapter caseArgumentDefiningPointCut(ArgumentDefiningPointCut object) {
				return createArgumentDefiningPointCutAdapter();
			}
			@Override
			public Adapter caseThisPointCut(ThisPointCut object) {
				return createThisPointCutAdapter();
			}
			@Override
			public Adapter caseTypePointCut(TypePointCut object) {
				return createTypePointCutAdapter();
			}
			@Override
			public Adapter caseArgsPointCut(ArgsPointCut object) {
				return createArgsPointCutAdapter();
			}
			@Override
			public Adapter caseTargetPointCut(TargetPointCut object) {
				return createTargetPointCutAdapter();
			}
			@Override
			public Adapter caseAdviceExecutionPointCut(AdviceExecutionPointCut object) {
				return createAdviceExecutionPointCutAdapter();
			}
			@Override
			public Adapter caseAdvice(Advice object) {
				return createAdviceAdapter();
			}
			@Override
			public Adapter caseStaticInitializationPointCut(StaticInitializationPointCut object) {
				return createStaticInitializationPointCutAdapter();
			}
			@Override
			public Adapter caseExceptionPointCut(ExceptionPointCut object) {
				return createExceptionPointCutAdapter();
			}
			@Override
			public Adapter caseWithinPointCut(WithinPointCut object) {
				return createWithinPointCutAdapter();
			}
			@Override
			public Adapter casePointCutPointCut(PointCutPointCut object) {
				return createPointCutPointCutAdapter();
			}
			@Override
			public Adapter caseCFlowBelowPointCut(CFlowBelowPointCut object) {
				return createCFlowBelowPointCutAdapter();
			}
			@Override
			public Adapter caseCrossCuttingConcern(CrossCuttingConcern object) {
				return createCrossCuttingConcernAdapter();
			}
			@Override
			public Adapter caseCFlowPointCut(CFlowPointCut object) {
				return createCFlowPointCutAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature <em>Static Cross Cutting Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature
	 * @generated
	 */
	public Adapter createStaticCrossCuttingFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.PointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.PointCut
	 * @generated
	 */
	public Adapter createPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.CompositePointCut <em>Composite Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.CompositePointCut
	 * @generated
	 */
	public Adapter createCompositePointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.InitializationPointCut <em>Initialization Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.InitializationPointCut
	 * @generated
	 */
	public Adapter createInitializationPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.ExecutionPointCut <em>Execution Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.ExecutionPointCut
	 * @generated
	 */
	public Adapter createExecutionPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.OperationalPointCut <em>Operational Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.OperationalPointCut
	 * @generated
	 */
	public Adapter createOperationalPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.PreInitializationPointCut <em>Pre Initialization Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.PreInitializationPointCut
	 * @generated
	 */
	public Adapter createPreInitializationPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.SetPointCut <em>Set Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.SetPointCut
	 * @generated
	 */
	public Adapter createSetPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.PropertyPointCut <em>Property Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.PropertyPointCut
	 * @generated
	 */
	public Adapter createPropertyPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.GetPointCut <em>Get Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.GetPointCut
	 * @generated
	 */
	public Adapter createGetPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.CallPointCut <em>Call Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.CallPointCut
	 * @generated
	 */
	public Adapter createCallPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.WithinCodePointCut <em>Within Code Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.WithinCodePointCut
	 * @generated
	 */
	public Adapter createWithinCodePointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut <em>Argument Defining Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut
	 * @generated
	 */
	public Adapter createArgumentDefiningPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.ThisPointCut <em>This Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.ThisPointCut
	 * @generated
	 */
	public Adapter createThisPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.TypePointCut <em>Type Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.TypePointCut
	 * @generated
	 */
	public Adapter createTypePointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.ArgsPointCut <em>Args Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.ArgsPointCut
	 * @generated
	 */
	public Adapter createArgsPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.TargetPointCut <em>Target Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.TargetPointCut
	 * @generated
	 */
	public Adapter createTargetPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.AdviceExecutionPointCut <em>Advice Execution Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.AdviceExecutionPointCut
	 * @generated
	 */
	public Adapter createAdviceExecutionPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.Advice
	 * @generated
	 */
	public Adapter createAdviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.StaticInitializationPointCut <em>Static Initialization Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.StaticInitializationPointCut
	 * @generated
	 */
	public Adapter createStaticInitializationPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.ExceptionPointCut <em>Exception Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.ExceptionPointCut
	 * @generated
	 */
	public Adapter createExceptionPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.WithinPointCut <em>Within Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.WithinPointCut
	 * @generated
	 */
	public Adapter createWithinPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.PointCutPointCut <em>Point Cut Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.PointCutPointCut
	 * @generated
	 */
	public Adapter createPointCutPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.CFlowBelowPointCut <em>CFlow Below Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.CFlowBelowPointCut
	 * @generated
	 */
	public Adapter createCFlowBelowPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.CrossCuttingConcern <em>Cross Cutting Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.CrossCuttingConcern
	 * @generated
	 */
	public Adapter createCrossCuttingConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.aspectj.CFlowPointCut <em>CFlow Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.aspectj.CFlowPointCut
	 * @generated
	 */
	public Adapter createCFlowPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AspectJAdapterFactory
