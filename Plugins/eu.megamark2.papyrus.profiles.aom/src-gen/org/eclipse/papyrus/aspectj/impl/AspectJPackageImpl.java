/**
 */
package org.eclipse.papyrus.aspectj.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.aspectj.Advice;
import org.eclipse.papyrus.aspectj.AdviceExecutionPointCut;
import org.eclipse.papyrus.aspectj.AdviceExecutionType;
import org.eclipse.papyrus.aspectj.ArgsPointCut;
import org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut;
import org.eclipse.papyrus.aspectj.Aspect;
import org.eclipse.papyrus.aspectj.AspectInstantiationType;
import org.eclipse.papyrus.aspectj.AspectJFactory;
import org.eclipse.papyrus.aspectj.AspectJPackage;
import org.eclipse.papyrus.aspectj.CFlowBelowPointCut;
import org.eclipse.papyrus.aspectj.CFlowPointCut;
import org.eclipse.papyrus.aspectj.CallPointCut;
import org.eclipse.papyrus.aspectj.CompositionPointCut;
import org.eclipse.papyrus.aspectj.CrossCuttingConcern;
import org.eclipse.papyrus.aspectj.ExceptionPointCut;
import org.eclipse.papyrus.aspectj.ExecutionPointCut;
import org.eclipse.papyrus.aspectj.GetPointCut;
import org.eclipse.papyrus.aspectj.IndividualPointCut;
import org.eclipse.papyrus.aspectj.InitializationPointCut;
import org.eclipse.papyrus.aspectj.OperationalPointCut;
import org.eclipse.papyrus.aspectj.PointCut;
import org.eclipse.papyrus.aspectj.PointCutConjuction;
import org.eclipse.papyrus.aspectj.PointCutDisjuction;
import org.eclipse.papyrus.aspectj.PointCutNegation;
import org.eclipse.papyrus.aspectj.PointCutPointCut;
import org.eclipse.papyrus.aspectj.PreInitializationPointCut;
import org.eclipse.papyrus.aspectj.PropertyPointCut;
import org.eclipse.papyrus.aspectj.SetPointCut;
import org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature;
import org.eclipse.papyrus.aspectj.StaticInitializationPointCut;
import org.eclipse.papyrus.aspectj.TargetPointCut;
import org.eclipse.papyrus.aspectj.ThisPointCut;
import org.eclipse.papyrus.aspectj.TypePointCut;
import org.eclipse.papyrus.aspectj.WithinCodePointCut;
import org.eclipse.papyrus.aspectj.WithinPointCut;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectJPackageImpl extends EPackageImpl implements AspectJPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticCrossCuttingFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializationPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preInitializationPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withinCodePointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentDefiningPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typePointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argsPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceExecutionPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticInitializationPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withinPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointCutPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFlowBelowPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossCuttingConcernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointCutDisjuctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointCutNegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFlowPointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointCutConjuctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adviceExecutionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aspectInstantiationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AspectJPackageImpl() {
		super(eNS_URI, AspectJFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AspectJPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AspectJPackage init() {
		if (isInited) return (AspectJPackage)EPackage.Registry.INSTANCE.getEPackage(AspectJPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAspectJPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AspectJPackageImpl theAspectJPackage = registeredAspectJPackage instanceof AspectJPackageImpl ? (AspectJPackageImpl)registeredAspectJPackage : new AspectJPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAspectJPackage.createPackageContents();

		// Initialize created meta-data
		theAspectJPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAspectJPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AspectJPackage.eNS_URI, theAspectJPackage);
		return theAspectJPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticCrossCuttingFeature() {
		return staticCrossCuttingFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticCrossCuttingFeature_OnType() {
		return (EReference)staticCrossCuttingFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticCrossCuttingFeature_Base_Feature() {
		return (EReference)staticCrossCuttingFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Base_Class() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAspect_IsPrivileged() {
		return (EAttribute)aspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAspect_PerType() {
		return (EAttribute)aspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_PerPointCut() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_DeclaredParents() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_DeclaredImplements() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Precedes() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_PrecededBy() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualPointCut() {
		return individualPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualPointCut_Composite() {
		return (EReference)individualPointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointCut() {
		return pointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointCut_Base_StructuralFeature() {
		return (EReference)pointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionPointCut() {
		return compositionPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionPointCut_Composee() {
		return (EReference)compositionPointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializationPointCut() {
		return initializationPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionPointCut() {
		return executionPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalPointCut() {
		return operationalPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalPointCut_Operation() {
		return (EReference)operationalPointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreInitializationPointCut() {
		return preInitializationPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetPointCut() {
		return setPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyPointCut() {
		return propertyPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyPointCut_Field() {
		return (EReference)propertyPointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetPointCut() {
		return getPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallPointCut() {
		return callPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithinCodePointCut() {
		return withinCodePointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentDefiningPointCut() {
		return argumentDefiningPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDefiningPointCut_Base_StructuralFeature() {
		return (EReference)argumentDefiningPointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentDefiningPointCut_ArgNames() {
		return (EAttribute)argumentDefiningPointCutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThisPointCut() {
		return thisPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypePointCut() {
		return typePointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypePointCut_Type() {
		return (EReference)typePointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgsPointCut() {
		return argsPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetPointCut() {
		return targetPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdviceExecutionPointCut() {
		return adviceExecutionPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvice() {
		return adviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvice_AdviceExecution() {
		return (EAttribute)adviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvice_Base_BehavioralFeature() {
		return (EReference)adviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvice_Pointcut() {
		return (EReference)adviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticInitializationPointCut() {
		return staticInitializationPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionPointCut() {
		return exceptionPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithinPointCut() {
		return withinPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointCutPointCut() {
		return pointCutPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointCutPointCut_SelectedPointCut() {
		return (EReference)pointCutPointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFlowBelowPointCut() {
		return cFlowBelowPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossCuttingConcern() {
		return crossCuttingConcernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossCuttingConcern_Base_Package() {
		return (EReference)crossCuttingConcernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointCutDisjuction() {
		return pointCutDisjuctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointCutNegation() {
		return pointCutNegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFlowPointCut() {
		return cFlowPointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointCutConjuction() {
		return pointCutConjuctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdviceExecutionType() {
		return adviceExecutionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAspectInstantiationType() {
		return aspectInstantiationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectJFactory getAspectJFactory() {
		return (AspectJFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		staticCrossCuttingFeatureEClass = createEClass(STATIC_CROSS_CUTTING_FEATURE);
		createEReference(staticCrossCuttingFeatureEClass, STATIC_CROSS_CUTTING_FEATURE__ON_TYPE);
		createEReference(staticCrossCuttingFeatureEClass, STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE);

		aspectEClass = createEClass(ASPECT);
		createEReference(aspectEClass, ASPECT__BASE_CLASS);
		createEAttribute(aspectEClass, ASPECT__IS_PRIVILEGED);
		createEAttribute(aspectEClass, ASPECT__PER_TYPE);
		createEReference(aspectEClass, ASPECT__PER_POINT_CUT);
		createEReference(aspectEClass, ASPECT__DECLARED_PARENTS);
		createEReference(aspectEClass, ASPECT__DECLARED_IMPLEMENTS);
		createEReference(aspectEClass, ASPECT__PRECEDES);
		createEReference(aspectEClass, ASPECT__PRECEDED_BY);

		individualPointCutEClass = createEClass(INDIVIDUAL_POINT_CUT);
		createEReference(individualPointCutEClass, INDIVIDUAL_POINT_CUT__COMPOSITE);

		pointCutEClass = createEClass(POINT_CUT);
		createEReference(pointCutEClass, POINT_CUT__BASE_STRUCTURAL_FEATURE);

		compositionPointCutEClass = createEClass(COMPOSITION_POINT_CUT);
		createEReference(compositionPointCutEClass, COMPOSITION_POINT_CUT__COMPOSEE);

		initializationPointCutEClass = createEClass(INITIALIZATION_POINT_CUT);

		executionPointCutEClass = createEClass(EXECUTION_POINT_CUT);

		operationalPointCutEClass = createEClass(OPERATIONAL_POINT_CUT);
		createEReference(operationalPointCutEClass, OPERATIONAL_POINT_CUT__OPERATION);

		preInitializationPointCutEClass = createEClass(PRE_INITIALIZATION_POINT_CUT);

		setPointCutEClass = createEClass(SET_POINT_CUT);

		propertyPointCutEClass = createEClass(PROPERTY_POINT_CUT);
		createEReference(propertyPointCutEClass, PROPERTY_POINT_CUT__FIELD);

		getPointCutEClass = createEClass(GET_POINT_CUT);

		callPointCutEClass = createEClass(CALL_POINT_CUT);

		withinCodePointCutEClass = createEClass(WITHIN_CODE_POINT_CUT);

		argumentDefiningPointCutEClass = createEClass(ARGUMENT_DEFINING_POINT_CUT);
		createEReference(argumentDefiningPointCutEClass, ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE);
		createEAttribute(argumentDefiningPointCutEClass, ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES);

		thisPointCutEClass = createEClass(THIS_POINT_CUT);

		typePointCutEClass = createEClass(TYPE_POINT_CUT);
		createEReference(typePointCutEClass, TYPE_POINT_CUT__TYPE);

		argsPointCutEClass = createEClass(ARGS_POINT_CUT);

		targetPointCutEClass = createEClass(TARGET_POINT_CUT);

		adviceExecutionPointCutEClass = createEClass(ADVICE_EXECUTION_POINT_CUT);

		adviceEClass = createEClass(ADVICE);
		createEAttribute(adviceEClass, ADVICE__ADVICE_EXECUTION);
		createEReference(adviceEClass, ADVICE__BASE_BEHAVIORAL_FEATURE);
		createEReference(adviceEClass, ADVICE__POINTCUT);

		staticInitializationPointCutEClass = createEClass(STATIC_INITIALIZATION_POINT_CUT);

		exceptionPointCutEClass = createEClass(EXCEPTION_POINT_CUT);

		withinPointCutEClass = createEClass(WITHIN_POINT_CUT);

		pointCutPointCutEClass = createEClass(POINT_CUT_POINT_CUT);
		createEReference(pointCutPointCutEClass, POINT_CUT_POINT_CUT__SELECTED_POINT_CUT);

		cFlowBelowPointCutEClass = createEClass(CFLOW_BELOW_POINT_CUT);

		crossCuttingConcernEClass = createEClass(CROSS_CUTTING_CONCERN);
		createEReference(crossCuttingConcernEClass, CROSS_CUTTING_CONCERN__BASE_PACKAGE);

		pointCutDisjuctionEClass = createEClass(POINT_CUT_DISJUCTION);

		pointCutNegationEClass = createEClass(POINT_CUT_NEGATION);

		cFlowPointCutEClass = createEClass(CFLOW_POINT_CUT);

		pointCutConjuctionEClass = createEClass(POINT_CUT_CONJUCTION);

		// Create enums
		adviceExecutionTypeEEnum = createEEnum(ADVICE_EXECUTION_TYPE);
		aspectInstantiationTypeEEnum = createEEnum(ASPECT_INSTANTIATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		individualPointCutEClass.getESuperTypes().add(this.getPointCut());
		compositionPointCutEClass.getESuperTypes().add(this.getPointCut());
		initializationPointCutEClass.getESuperTypes().add(this.getExecutionPointCut());
		executionPointCutEClass.getESuperTypes().add(this.getOperationalPointCut());
		operationalPointCutEClass.getESuperTypes().add(this.getIndividualPointCut());
		preInitializationPointCutEClass.getESuperTypes().add(this.getExecutionPointCut());
		setPointCutEClass.getESuperTypes().add(this.getPropertyPointCut());
		propertyPointCutEClass.getESuperTypes().add(this.getIndividualPointCut());
		getPointCutEClass.getESuperTypes().add(this.getPropertyPointCut());
		callPointCutEClass.getESuperTypes().add(this.getOperationalPointCut());
		withinCodePointCutEClass.getESuperTypes().add(this.getOperationalPointCut());
		thisPointCutEClass.getESuperTypes().add(this.getArgumentDefiningPointCut());
		typePointCutEClass.getESuperTypes().add(this.getIndividualPointCut());
		argsPointCutEClass.getESuperTypes().add(this.getArgumentDefiningPointCut());
		targetPointCutEClass.getESuperTypes().add(this.getArgumentDefiningPointCut());
		adviceExecutionPointCutEClass.getESuperTypes().add(this.getIndividualPointCut());
		staticInitializationPointCutEClass.getESuperTypes().add(this.getTypePointCut());
		exceptionPointCutEClass.getESuperTypes().add(this.getTypePointCut());
		withinPointCutEClass.getESuperTypes().add(this.getTypePointCut());
		pointCutPointCutEClass.getESuperTypes().add(this.getIndividualPointCut());
		cFlowBelowPointCutEClass.getESuperTypes().add(this.getPointCutPointCut());
		pointCutDisjuctionEClass.getESuperTypes().add(this.getCompositionPointCut());
		pointCutNegationEClass.getESuperTypes().add(this.getCompositionPointCut());
		cFlowPointCutEClass.getESuperTypes().add(this.getPointCutPointCut());
		pointCutConjuctionEClass.getESuperTypes().add(this.getCompositionPointCut());

		// Initialize classes, features, and operations; add parameters
		initEClass(staticCrossCuttingFeatureEClass, StaticCrossCuttingFeature.class, "StaticCrossCuttingFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticCrossCuttingFeature_OnType(), theUMLPackage.getType(), null, "onType", null, 1, -1, StaticCrossCuttingFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaticCrossCuttingFeature_Base_Feature(), theUMLPackage.getFeature(), null, "base_Feature", null, 1, 1, StaticCrossCuttingFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspect_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAspect_IsPrivileged(), theTypesPackage.getBoolean(), "isPrivileged", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAspect_PerType(), this.getAspectInstantiationType(), "perType", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAspect_PerPointCut(), this.getIndividualPointCut(), null, "perPointCut", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAspect_DeclaredParents(), theUMLPackage.getGeneralization(), null, "declaredParents", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAspect_DeclaredImplements(), theUMLPackage.getInterfaceRealization(), null, "declaredImplements", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAspect_Precedes(), this.getAspect(), this.getAspect_PrecededBy(), "precedes", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAspect_PrecededBy(), this.getAspect(), this.getAspect_Precedes(), "precededBy", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(individualPointCutEClass, IndividualPointCut.class, "IndividualPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualPointCut_Composite(), this.getCompositionPointCut(), null, "composite", null, 0, -1, IndividualPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pointCutEClass, PointCut.class, "PointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointCut_Base_StructuralFeature(), theUMLPackage.getStructuralFeature(), null, "base_StructuralFeature", null, 1, 1, PointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compositionPointCutEClass, CompositionPointCut.class, "CompositionPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionPointCut_Composee(), this.getIndividualPointCut(), null, "composee", null, 1, -1, CompositionPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(initializationPointCutEClass, InitializationPointCut.class, "InitializationPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionPointCutEClass, ExecutionPointCut.class, "ExecutionPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationalPointCutEClass, OperationalPointCut.class, "OperationalPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalPointCut_Operation(), theUMLPackage.getOperation(), null, "operation", null, 1, -1, OperationalPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(preInitializationPointCutEClass, PreInitializationPointCut.class, "PreInitializationPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setPointCutEClass, SetPointCut.class, "SetPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyPointCutEClass, PropertyPointCut.class, "PropertyPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyPointCut_Field(), theUMLPackage.getProperty(), null, "field", null, 1, -1, PropertyPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(getPointCutEClass, GetPointCut.class, "GetPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callPointCutEClass, CallPointCut.class, "CallPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(withinCodePointCutEClass, WithinCodePointCut.class, "WithinCodePointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentDefiningPointCutEClass, ArgumentDefiningPointCut.class, "ArgumentDefiningPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentDefiningPointCut_Base_StructuralFeature(), theUMLPackage.getStructuralFeature(), null, "base_StructuralFeature", null, 1, 1, ArgumentDefiningPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArgumentDefiningPointCut_ArgNames(), theTypesPackage.getString(), "argNames", null, 1, -1, ArgumentDefiningPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thisPointCutEClass, ThisPointCut.class, "ThisPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typePointCutEClass, TypePointCut.class, "TypePointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypePointCut_Type(), theUMLPackage.getType(), null, "type", null, 1, -1, TypePointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argsPointCutEClass, ArgsPointCut.class, "ArgsPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetPointCutEClass, TargetPointCut.class, "TargetPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adviceExecutionPointCutEClass, AdviceExecutionPointCut.class, "AdviceExecutionPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdvice_AdviceExecution(), this.getAdviceExecutionType(), "adviceExecution", null, 1, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdvice_Base_BehavioralFeature(), theUMLPackage.getBehavioralFeature(), null, "base_BehavioralFeature", null, 1, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdvice_Pointcut(), this.getPointCut(), null, "pointcut", null, 1, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staticInitializationPointCutEClass, StaticInitializationPointCut.class, "StaticInitializationPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionPointCutEClass, ExceptionPointCut.class, "ExceptionPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(withinPointCutEClass, WithinPointCut.class, "WithinPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointCutPointCutEClass, PointCutPointCut.class, "PointCutPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointCutPointCut_SelectedPointCut(), this.getIndividualPointCut(), null, "selectedPointCut", null, 1, 1, PointCutPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cFlowBelowPointCutEClass, CFlowBelowPointCut.class, "CFlowBelowPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crossCuttingConcernEClass, CrossCuttingConcern.class, "CrossCuttingConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossCuttingConcern_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, CrossCuttingConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pointCutDisjuctionEClass, PointCutDisjuction.class, "PointCutDisjuction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointCutNegationEClass, PointCutNegation.class, "PointCutNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cFlowPointCutEClass, CFlowPointCut.class, "CFlowPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointCutConjuctionEClass, PointCutConjuction.class, "PointCutConjuction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(adviceExecutionTypeEEnum, AdviceExecutionType.class, "AdviceExecutionType");
		addEEnumLiteral(adviceExecutionTypeEEnum, AdviceExecutionType.AROUND_ADVICE);
		addEEnumLiteral(adviceExecutionTypeEEnum, AdviceExecutionType.BEFORE_ADVICE);
		addEEnumLiteral(adviceExecutionTypeEEnum, AdviceExecutionType.AFTER_ADVICE);

		initEEnum(aspectInstantiationTypeEEnum, AspectInstantiationType.class, "AspectInstantiationType");
		addEEnumLiteral(aspectInstantiationTypeEEnum, AspectInstantiationType.PERTHIS);
		addEEnumLiteral(aspectInstantiationTypeEEnum, AspectInstantiationType.PERTARGET);
		addEEnumLiteral(aspectInstantiationTypeEEnum, AspectInstantiationType.PERCFLOW);
		addEEnumLiteral(aspectInstantiationTypeEEnum, AspectInstantiationType.PERCFLOWBELOW);

		// Create resource
		createResource(eNS_URI);
	}

} //AspectJPackageImpl
