/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.aspectj.AspectJFactory
 * @model kind="package"
 * @generated
 */
public interface AspectJPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aspectj";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://megamart2-ecsel.eu/aspectj/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AspectJ";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectJPackage eINSTANCE = org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.StaticCrossCuttingFeatureImpl <em>Static Cross Cutting Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.StaticCrossCuttingFeatureImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getStaticCrossCuttingFeature()
	 * @generated
	 */
	int STATIC_CROSS_CUTTING_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>On Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CROSS_CUTTING_FEATURE__ON_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Static Cross Cutting Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CROSS_CUTTING_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Static Cross Cutting Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CROSS_CUTTING_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.AspectImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Is Privileged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__IS_PRIVILEGED = 1;

	/**
	 * The feature id for the '<em><b>Per Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Per Point Cut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PER_POINT_CUT = 3;

	/**
	 * The feature id for the '<em><b>Declared Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__DECLARED_PARENTS = 4;

	/**
	 * The feature id for the '<em><b>Declared Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__DECLARED_IMPLEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PRECEDES = 6;

	/**
	 * The feature id for the '<em><b>Preceded By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PRECEDED_BY = 7;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutImpl <em>Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.PointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCut()
	 * @generated
	 */
	int POINT_CUT = 2;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.OperationalPointCutImpl <em>Operational Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.OperationalPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getOperationalPointCut()
	 * @generated
	 */
	int OPERATIONAL_POINT_CUT = 5;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_POINT_CUT__OPERATION = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operational Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_POINT_CUT_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operational Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_POINT_CUT_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.ExecutionPointCutImpl <em>Execution Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.ExecutionPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getExecutionPointCut()
	 * @generated
	 */
	int EXECUTION_POINT_CUT = 4;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = OPERATIONAL_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_POINT_CUT__OPERATION = OPERATIONAL_POINT_CUT__OPERATION;

	/**
	 * The number of structural features of the '<em>Execution Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_POINT_CUT_FEATURE_COUNT = OPERATIONAL_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_POINT_CUT_OPERATION_COUNT = OPERATIONAL_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.InitializationPointCutImpl <em>Initialization Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.InitializationPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getInitializationPointCut()
	 * @generated
	 */
	int INITIALIZATION_POINT_CUT = 3;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = EXECUTION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_POINT_CUT__OPERATION = EXECUTION_POINT_CUT__OPERATION;

	/**
	 * The number of structural features of the '<em>Initialization Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_POINT_CUT_FEATURE_COUNT = EXECUTION_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initialization Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_POINT_CUT_OPERATION_COUNT = EXECUTION_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.PreInitializationPointCutImpl <em>Pre Initialization Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.PreInitializationPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPreInitializationPointCut()
	 * @generated
	 */
	int PRE_INITIALIZATION_POINT_CUT = 6;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INITIALIZATION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = EXECUTION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INITIALIZATION_POINT_CUT__OPERATION = EXECUTION_POINT_CUT__OPERATION;

	/**
	 * The number of structural features of the '<em>Pre Initialization Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INITIALIZATION_POINT_CUT_FEATURE_COUNT = EXECUTION_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Initialization Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INITIALIZATION_POINT_CUT_OPERATION_COUNT = EXECUTION_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.PropertyPointCutImpl <em>Property Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.PropertyPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPropertyPointCut()
	 * @generated
	 */
	int PROPERTY_POINT_CUT = 8;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_POINT_CUT__FIELD = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_POINT_CUT_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_POINT_CUT_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.SetPointCutImpl <em>Set Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.SetPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getSetPointCut()
	 * @generated
	 */
	int SET_POINT_CUT = 7;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = PROPERTY_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT_CUT__FIELD = PROPERTY_POINT_CUT__FIELD;

	/**
	 * The number of structural features of the '<em>Set Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT_CUT_FEATURE_COUNT = PROPERTY_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_POINT_CUT_OPERATION_COUNT = PROPERTY_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.GetPointCutImpl <em>Get Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.GetPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getGetPointCut()
	 * @generated
	 */
	int GET_POINT_CUT = 9;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = PROPERTY_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POINT_CUT__FIELD = PROPERTY_POINT_CUT__FIELD;

	/**
	 * The number of structural features of the '<em>Get Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POINT_CUT_FEATURE_COUNT = PROPERTY_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POINT_CUT_OPERATION_COUNT = PROPERTY_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.CallPointCutImpl <em>Call Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.CallPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCallPointCut()
	 * @generated
	 */
	int CALL_POINT_CUT = 10;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = OPERATIONAL_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_POINT_CUT__OPERATION = OPERATIONAL_POINT_CUT__OPERATION;

	/**
	 * The number of structural features of the '<em>Call Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_POINT_CUT_FEATURE_COUNT = OPERATIONAL_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_POINT_CUT_OPERATION_COUNT = OPERATIONAL_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.WithinCodePointCutImpl <em>Within Code Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.WithinCodePointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getWithinCodePointCut()
	 * @generated
	 */
	int WITHIN_CODE_POINT_CUT = 11;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_CODE_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = OPERATIONAL_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_CODE_POINT_CUT__OPERATION = OPERATIONAL_POINT_CUT__OPERATION;

	/**
	 * The number of structural features of the '<em>Within Code Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_CODE_POINT_CUT_FEATURE_COUNT = OPERATIONAL_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Within Code Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_CODE_POINT_CUT_OPERATION_COUNT = OPERATIONAL_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.ArgumentDefiningPointCutImpl <em>Argument Defining Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.ArgumentDefiningPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getArgumentDefiningPointCut()
	 * @generated
	 */
	int ARGUMENT_DEFINING_POINT_CUT = 12;

	/**
	 * The feature id for the '<em><b>Base Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Arg Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES = 1;

	/**
	 * The number of structural features of the '<em>Argument Defining Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument Defining Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DEFINING_POINT_CUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.ThisPointCutImpl <em>This Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.ThisPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getThisPointCut()
	 * @generated
	 */
	int THIS_POINT_CUT = 13;

	/**
	 * The feature id for the '<em><b>Base Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_POINT_CUT__BASE_STRUCTURAL_FEATURE = ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Arg Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_POINT_CUT__ARG_NAMES = ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_POINT_CUT__TYPE = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>This Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_POINT_CUT_FEATURE_COUNT = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>This Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_POINT_CUT_OPERATION_COUNT = ARGUMENT_DEFINING_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.TypePointCutImpl <em>Type Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.TypePointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getTypePointCut()
	 * @generated
	 */
	int TYPE_POINT_CUT = 14;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_POINT_CUT__TYPE = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_POINT_CUT_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_POINT_CUT_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl <em>Args Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getArgsPointCut()
	 * @generated
	 */
	int ARGS_POINT_CUT = 15;

	/**
	 * The feature id for the '<em><b>Base Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_POINT_CUT__BASE_STRUCTURAL_FEATURE = ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Arg Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_POINT_CUT__ARG_NAMES = ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_POINT_CUT__TYPE = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Args Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_POINT_CUT_FEATURE_COUNT = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Args Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_POINT_CUT_OPERATION_COUNT = ARGUMENT_DEFINING_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.TargetPointCutImpl <em>Target Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.TargetPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getTargetPointCut()
	 * @generated
	 */
	int TARGET_POINT_CUT = 16;

	/**
	 * The feature id for the '<em><b>Base Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_CUT__BASE_STRUCTURAL_FEATURE = ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Arg Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_CUT__ARG_NAMES = ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_CUT__TYPE = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_CUT_FEATURE_COUNT = ARGUMENT_DEFINING_POINT_CUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_CUT_OPERATION_COUNT = ARGUMENT_DEFINING_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.AdviceExecutionPointCutImpl <em>Advice Execution Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.AdviceExecutionPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAdviceExecutionPointCut()
	 * @generated
	 */
	int ADVICE_EXECUTION_POINT_CUT = 17;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EXECUTION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The number of structural features of the '<em>Advice Execution Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EXECUTION_POINT_CUT_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Advice Execution Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_EXECUTION_POINT_CUT_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.AdviceImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 18;

	/**
	 * The feature id for the '<em><b>Advice Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ADVICE_EXECUTION = 0;

	/**
	 * The feature id for the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__BASE_BEHAVIORAL_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__POINTCUT = 2;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.StaticInitializationPointCutImpl <em>Static Initialization Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.StaticInitializationPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getStaticInitializationPointCut()
	 * @generated
	 */
	int STATIC_INITIALIZATION_POINT_CUT = 19;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INITIALIZATION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = TYPE_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INITIALIZATION_POINT_CUT__TYPE = TYPE_POINT_CUT__TYPE;

	/**
	 * The number of structural features of the '<em>Static Initialization Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INITIALIZATION_POINT_CUT_FEATURE_COUNT = TYPE_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Initialization Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INITIALIZATION_POINT_CUT_OPERATION_COUNT = TYPE_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.ExceptionPointCutImpl <em>Exception Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.ExceptionPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getExceptionPointCut()
	 * @generated
	 */
	int EXCEPTION_POINT_CUT = 20;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = TYPE_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_POINT_CUT__TYPE = TYPE_POINT_CUT__TYPE;

	/**
	 * The number of structural features of the '<em>Exception Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_POINT_CUT_FEATURE_COUNT = TYPE_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exception Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_POINT_CUT_OPERATION_COUNT = TYPE_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.WithinPointCutImpl <em>Within Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.WithinPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getWithinPointCut()
	 * @generated
	 */
	int WITHIN_POINT_CUT = 21;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = TYPE_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_POINT_CUT__TYPE = TYPE_POINT_CUT__TYPE;

	/**
	 * The number of structural features of the '<em>Within Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_POINT_CUT_FEATURE_COUNT = TYPE_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Within Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_POINT_CUT_OPERATION_COUNT = TYPE_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutPointCutImpl <em>Point Cut Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.PointCutPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutPointCut()
	 * @generated
	 */
	int POINT_CUT_POINT_CUT = 22;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Selected Point Cut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_POINT_CUT__SELECTED_POINT_CUT = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Cut Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_POINT_CUT_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point Cut Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_POINT_CUT_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.CFlowBelowPointCutImpl <em>CFlow Below Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.CFlowBelowPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCFlowBelowPointCut()
	 * @generated
	 */
	int CFLOW_BELOW_POINT_CUT = 23;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_BELOW_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Selected Point Cut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_BELOW_POINT_CUT__SELECTED_POINT_CUT = POINT_CUT_POINT_CUT__SELECTED_POINT_CUT;

	/**
	 * The number of structural features of the '<em>CFlow Below Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_BELOW_POINT_CUT_FEATURE_COUNT = POINT_CUT_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CFlow Below Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_BELOW_POINT_CUT_OPERATION_COUNT = POINT_CUT_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.CrossCuttingConcernImpl <em>Cross Cutting Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.CrossCuttingConcernImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCrossCuttingConcern()
	 * @generated
	 */
	int CROSS_CUTTING_CONCERN = 24;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_CUTTING_CONCERN__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Cross Cutting Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_CUTTING_CONCERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cross Cutting Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_CUTTING_CONCERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutDisjuctionImpl <em>Point Cut Disjuction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.PointCutDisjuctionImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutDisjuction()
	 * @generated
	 */
	int POINT_CUT_DISJUCTION = 25;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_DISJUCTION__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Composee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_DISJUCTION__COMPOSEE = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Cut Disjuction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_DISJUCTION_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point Cut Disjuction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_DISJUCTION_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutNegationImpl <em>Point Cut Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.PointCutNegationImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutNegation()
	 * @generated
	 */
	int POINT_CUT_NEGATION = 26;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_NEGATION__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Composee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_NEGATION__COMPOSEE = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Cut Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_NEGATION_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point Cut Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_NEGATION_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.CFlowPointCutImpl <em>CFlow Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.CFlowPointCutImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCFlowPointCut()
	 * @generated
	 */
	int CFLOW_POINT_CUT = 27;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT_POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Selected Point Cut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_POINT_CUT__SELECTED_POINT_CUT = POINT_CUT_POINT_CUT__SELECTED_POINT_CUT;

	/**
	 * The number of structural features of the '<em>CFlow Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_POINT_CUT_FEATURE_COUNT = POINT_CUT_POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CFlow Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLOW_POINT_CUT_OPERATION_COUNT = POINT_CUT_POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutConjuctionImpl <em>Point Cut Conjuction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.impl.PointCutConjuctionImpl
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutConjuction()
	 * @generated
	 */
	int POINT_CUT_CONJUCTION = 28;

	/**
	 * The feature id for the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_CONJUCTION__BASE_POINT_CUT_STRUCTURAL_FEATURE = POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Composee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_CONJUCTION__COMPOSEE = POINT_CUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Cut Conjuction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_CONJUCTION_FEATURE_COUNT = POINT_CUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point Cut Conjuction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_CONJUCTION_OPERATION_COUNT = POINT_CUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.AdviceExecutionType <em>Advice Execution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.AdviceExecutionType
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAdviceExecutionType()
	 * @generated
	 */
	int ADVICE_EXECUTION_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.aspectj.AspectInstantiationType <em>Aspect Instantiation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.aspectj.AspectInstantiationType
	 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAspectInstantiationType()
	 * @generated
	 */
	int ASPECT_INSTANTIATION_TYPE = 30;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature <em>Static Cross Cutting Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Cross Cutting Feature</em>'.
	 * @see org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature
	 * @generated
	 */
	EClass getStaticCrossCuttingFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature#getOnType <em>On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Type</em>'.
	 * @see org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature#getOnType()
	 * @see #getStaticCrossCuttingFeature()
	 * @generated
	 */
	EReference getStaticCrossCuttingFeature_OnType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature#getBase_Feature <em>Base Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Feature</em>'.
	 * @see org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature#getBase_Feature()
	 * @see #getStaticCrossCuttingFeature()
	 * @generated
	 */
	EReference getStaticCrossCuttingFeature_Base_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.Aspect#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#getBase_Class()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.aspectj.Aspect#isPrivileged <em>Is Privileged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Privileged</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#isPrivileged()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_IsPrivileged();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.aspectj.Aspect#getPerType <em>Per Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Type</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#getPerType()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_PerType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.Aspect#getPerPointCut <em>Per Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Per Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#getPerPointCut()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_PerPointCut();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.Aspect#getDeclaredParents <em>Declared Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declared Parents</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#getDeclaredParents()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_DeclaredParents();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.Aspect#getDeclaredImplements <em>Declared Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declared Implements</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#getDeclaredImplements()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_DeclaredImplements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.Aspect#getPrecedes <em>Precedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedes</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#getPrecedes()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Precedes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.Aspect#getPrecededBy <em>Preceded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preceded By</em>'.
	 * @see org.eclipse.papyrus.aspectj.Aspect#getPrecededBy()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_PrecededBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.PointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCut
	 * @generated
	 */
	EClass getPointCut();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.PointCut#getBase_PointCut_StructuralFeature <em>Base Point Cut Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Point Cut Structural Feature</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCut#getBase_PointCut_StructuralFeature()
	 * @see #getPointCut()
	 * @generated
	 */
	EReference getPointCut_Base_PointCut_StructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.InitializationPointCut <em>Initialization Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.InitializationPointCut
	 * @generated
	 */
	EClass getInitializationPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.ExecutionPointCut <em>Execution Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.ExecutionPointCut
	 * @generated
	 */
	EClass getExecutionPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.OperationalPointCut <em>Operational Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.OperationalPointCut
	 * @generated
	 */
	EClass getOperationalPointCut();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.OperationalPointCut#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation</em>'.
	 * @see org.eclipse.papyrus.aspectj.OperationalPointCut#getOperation()
	 * @see #getOperationalPointCut()
	 * @generated
	 */
	EReference getOperationalPointCut_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.PreInitializationPointCut <em>Pre Initialization Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Initialization Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.PreInitializationPointCut
	 * @generated
	 */
	EClass getPreInitializationPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.SetPointCut <em>Set Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.SetPointCut
	 * @generated
	 */
	EClass getSetPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.PropertyPointCut <em>Property Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.PropertyPointCut
	 * @generated
	 */
	EClass getPropertyPointCut();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.PropertyPointCut#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Field</em>'.
	 * @see org.eclipse.papyrus.aspectj.PropertyPointCut#getField()
	 * @see #getPropertyPointCut()
	 * @generated
	 */
	EReference getPropertyPointCut_Field();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.GetPointCut <em>Get Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.GetPointCut
	 * @generated
	 */
	EClass getGetPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.CallPointCut <em>Call Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.CallPointCut
	 * @generated
	 */
	EClass getCallPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.WithinCodePointCut <em>Within Code Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within Code Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.WithinCodePointCut
	 * @generated
	 */
	EClass getWithinCodePointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut <em>Argument Defining Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Defining Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut
	 * @generated
	 */
	EClass getArgumentDefiningPointCut();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut#getBase_StructuralFeature <em>Base Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Structural Feature</em>'.
	 * @see org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut#getBase_StructuralFeature()
	 * @see #getArgumentDefiningPointCut()
	 * @generated
	 */
	EReference getArgumentDefiningPointCut_Base_StructuralFeature();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut#getArgNames <em>Arg Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arg Names</em>'.
	 * @see org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut#getArgNames()
	 * @see #getArgumentDefiningPointCut()
	 * @generated
	 */
	EAttribute getArgumentDefiningPointCut_ArgNames();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.ThisPointCut <em>This Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.ThisPointCut
	 * @generated
	 */
	EClass getThisPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.TypePointCut <em>Type Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.TypePointCut
	 * @generated
	 */
	EClass getTypePointCut();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.TypePointCut#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.eclipse.papyrus.aspectj.TypePointCut#getType()
	 * @see #getTypePointCut()
	 * @generated
	 */
	EReference getTypePointCut_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.ArgsPointCut <em>Args Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Args Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.ArgsPointCut
	 * @generated
	 */
	EClass getArgsPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.TargetPointCut <em>Target Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.TargetPointCut
	 * @generated
	 */
	EClass getTargetPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.AdviceExecutionPointCut <em>Advice Execution Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice Execution Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.AdviceExecutionPointCut
	 * @generated
	 */
	EClass getAdviceExecutionPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see org.eclipse.papyrus.aspectj.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.aspectj.Advice#getAdviceExecution <em>Advice Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advice Execution</em>'.
	 * @see org.eclipse.papyrus.aspectj.Advice#getAdviceExecution()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_AdviceExecution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.Advice#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavioral Feature</em>'.
	 * @see org.eclipse.papyrus.aspectj.Advice#getBase_BehavioralFeature()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_Base_BehavioralFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.Advice#getPointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointcut</em>'.
	 * @see org.eclipse.papyrus.aspectj.Advice#getPointcut()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_Pointcut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.StaticInitializationPointCut <em>Static Initialization Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Initialization Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.StaticInitializationPointCut
	 * @generated
	 */
	EClass getStaticInitializationPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.ExceptionPointCut <em>Exception Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.ExceptionPointCut
	 * @generated
	 */
	EClass getExceptionPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.WithinPointCut <em>Within Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.WithinPointCut
	 * @generated
	 */
	EClass getWithinPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.PointCutPointCut <em>Point Cut Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Cut Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutPointCut
	 * @generated
	 */
	EClass getPointCutPointCut();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.PointCutPointCut#getSelectedPointCut <em>Selected Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutPointCut#getSelectedPointCut()
	 * @see #getPointCutPointCut()
	 * @generated
	 */
	EReference getPointCutPointCut_SelectedPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.CFlowBelowPointCut <em>CFlow Below Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFlow Below Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.CFlowBelowPointCut
	 * @generated
	 */
	EClass getCFlowBelowPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.CrossCuttingConcern <em>Cross Cutting Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Cutting Concern</em>'.
	 * @see org.eclipse.papyrus.aspectj.CrossCuttingConcern
	 * @generated
	 */
	EClass getCrossCuttingConcern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.CrossCuttingConcern#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.aspectj.CrossCuttingConcern#getBase_Package()
	 * @see #getCrossCuttingConcern()
	 * @generated
	 */
	EReference getCrossCuttingConcern_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.PointCutDisjuction <em>Point Cut Disjuction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Cut Disjuction</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutDisjuction
	 * @generated
	 */
	EClass getPointCutDisjuction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.PointCutDisjuction#getComposee <em>Composee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composee</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutDisjuction#getComposee()
	 * @see #getPointCutDisjuction()
	 * @generated
	 */
	EReference getPointCutDisjuction_Composee();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.PointCutNegation <em>Point Cut Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Cut Negation</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutNegation
	 * @generated
	 */
	EClass getPointCutNegation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.aspectj.PointCutNegation#getComposee <em>Composee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composee</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutNegation#getComposee()
	 * @see #getPointCutNegation()
	 * @generated
	 */
	EReference getPointCutNegation_Composee();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.CFlowPointCut <em>CFlow Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFlow Point Cut</em>'.
	 * @see org.eclipse.papyrus.aspectj.CFlowPointCut
	 * @generated
	 */
	EClass getCFlowPointCut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.aspectj.PointCutConjuction <em>Point Cut Conjuction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Cut Conjuction</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutConjuction
	 * @generated
	 */
	EClass getPointCutConjuction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.aspectj.PointCutConjuction#getComposee <em>Composee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composee</em>'.
	 * @see org.eclipse.papyrus.aspectj.PointCutConjuction#getComposee()
	 * @see #getPointCutConjuction()
	 * @generated
	 */
	EReference getPointCutConjuction_Composee();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.aspectj.AdviceExecutionType <em>Advice Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Advice Execution Type</em>'.
	 * @see org.eclipse.papyrus.aspectj.AdviceExecutionType
	 * @generated
	 */
	EEnum getAdviceExecutionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.aspectj.AspectInstantiationType <em>Aspect Instantiation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aspect Instantiation Type</em>'.
	 * @see org.eclipse.papyrus.aspectj.AspectInstantiationType
	 * @generated
	 */
	EEnum getAspectInstantiationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AspectJFactory getAspectJFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.StaticCrossCuttingFeatureImpl <em>Static Cross Cutting Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.StaticCrossCuttingFeatureImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getStaticCrossCuttingFeature()
		 * @generated
		 */
		EClass STATIC_CROSS_CUTTING_FEATURE = eINSTANCE.getStaticCrossCuttingFeature();

		/**
		 * The meta object literal for the '<em><b>On Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_CROSS_CUTTING_FEATURE__ON_TYPE = eINSTANCE.getStaticCrossCuttingFeature_OnType();

		/**
		 * The meta object literal for the '<em><b>Base Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_CROSS_CUTTING_FEATURE__BASE_FEATURE = eINSTANCE.getStaticCrossCuttingFeature_Base_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.AspectImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__BASE_CLASS = eINSTANCE.getAspect_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Is Privileged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__IS_PRIVILEGED = eINSTANCE.getAspect_IsPrivileged();

		/**
		 * The meta object literal for the '<em><b>Per Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__PER_TYPE = eINSTANCE.getAspect_PerType();

		/**
		 * The meta object literal for the '<em><b>Per Point Cut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__PER_POINT_CUT = eINSTANCE.getAspect_PerPointCut();

		/**
		 * The meta object literal for the '<em><b>Declared Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__DECLARED_PARENTS = eINSTANCE.getAspect_DeclaredParents();

		/**
		 * The meta object literal for the '<em><b>Declared Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__DECLARED_IMPLEMENTS = eINSTANCE.getAspect_DeclaredImplements();

		/**
		 * The meta object literal for the '<em><b>Precedes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__PRECEDES = eINSTANCE.getAspect_Precedes();

		/**
		 * The meta object literal for the '<em><b>Preceded By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__PRECEDED_BY = eINSTANCE.getAspect_PrecededBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutImpl <em>Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.PointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCut()
		 * @generated
		 */
		EClass POINT_CUT = eINSTANCE.getPointCut();

		/**
		 * The meta object literal for the '<em><b>Base Point Cut Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_CUT__BASE_POINT_CUT_STRUCTURAL_FEATURE = eINSTANCE.getPointCut_Base_PointCut_StructuralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.InitializationPointCutImpl <em>Initialization Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.InitializationPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getInitializationPointCut()
		 * @generated
		 */
		EClass INITIALIZATION_POINT_CUT = eINSTANCE.getInitializationPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.ExecutionPointCutImpl <em>Execution Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.ExecutionPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getExecutionPointCut()
		 * @generated
		 */
		EClass EXECUTION_POINT_CUT = eINSTANCE.getExecutionPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.OperationalPointCutImpl <em>Operational Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.OperationalPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getOperationalPointCut()
		 * @generated
		 */
		EClass OPERATIONAL_POINT_CUT = eINSTANCE.getOperationalPointCut();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_POINT_CUT__OPERATION = eINSTANCE.getOperationalPointCut_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.PreInitializationPointCutImpl <em>Pre Initialization Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.PreInitializationPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPreInitializationPointCut()
		 * @generated
		 */
		EClass PRE_INITIALIZATION_POINT_CUT = eINSTANCE.getPreInitializationPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.SetPointCutImpl <em>Set Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.SetPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getSetPointCut()
		 * @generated
		 */
		EClass SET_POINT_CUT = eINSTANCE.getSetPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.PropertyPointCutImpl <em>Property Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.PropertyPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPropertyPointCut()
		 * @generated
		 */
		EClass PROPERTY_POINT_CUT = eINSTANCE.getPropertyPointCut();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_POINT_CUT__FIELD = eINSTANCE.getPropertyPointCut_Field();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.GetPointCutImpl <em>Get Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.GetPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getGetPointCut()
		 * @generated
		 */
		EClass GET_POINT_CUT = eINSTANCE.getGetPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.CallPointCutImpl <em>Call Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.CallPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCallPointCut()
		 * @generated
		 */
		EClass CALL_POINT_CUT = eINSTANCE.getCallPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.WithinCodePointCutImpl <em>Within Code Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.WithinCodePointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getWithinCodePointCut()
		 * @generated
		 */
		EClass WITHIN_CODE_POINT_CUT = eINSTANCE.getWithinCodePointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.ArgumentDefiningPointCutImpl <em>Argument Defining Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.ArgumentDefiningPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getArgumentDefiningPointCut()
		 * @generated
		 */
		EClass ARGUMENT_DEFINING_POINT_CUT = eINSTANCE.getArgumentDefiningPointCut();

		/**
		 * The meta object literal for the '<em><b>Base Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DEFINING_POINT_CUT__BASE_STRUCTURAL_FEATURE = eINSTANCE.getArgumentDefiningPointCut_Base_StructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Arg Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_DEFINING_POINT_CUT__ARG_NAMES = eINSTANCE.getArgumentDefiningPointCut_ArgNames();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.ThisPointCutImpl <em>This Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.ThisPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getThisPointCut()
		 * @generated
		 */
		EClass THIS_POINT_CUT = eINSTANCE.getThisPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.TypePointCutImpl <em>Type Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.TypePointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getTypePointCut()
		 * @generated
		 */
		EClass TYPE_POINT_CUT = eINSTANCE.getTypePointCut();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_POINT_CUT__TYPE = eINSTANCE.getTypePointCut_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl <em>Args Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.ArgsPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getArgsPointCut()
		 * @generated
		 */
		EClass ARGS_POINT_CUT = eINSTANCE.getArgsPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.TargetPointCutImpl <em>Target Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.TargetPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getTargetPointCut()
		 * @generated
		 */
		EClass TARGET_POINT_CUT = eINSTANCE.getTargetPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.AdviceExecutionPointCutImpl <em>Advice Execution Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.AdviceExecutionPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAdviceExecutionPointCut()
		 * @generated
		 */
		EClass ADVICE_EXECUTION_POINT_CUT = eINSTANCE.getAdviceExecutionPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.AdviceImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '<em><b>Advice Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__ADVICE_EXECUTION = eINSTANCE.getAdvice_AdviceExecution();

		/**
		 * The meta object literal for the '<em><b>Base Behavioral Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__BASE_BEHAVIORAL_FEATURE = eINSTANCE.getAdvice_Base_BehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Pointcut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__POINTCUT = eINSTANCE.getAdvice_Pointcut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.StaticInitializationPointCutImpl <em>Static Initialization Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.StaticInitializationPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getStaticInitializationPointCut()
		 * @generated
		 */
		EClass STATIC_INITIALIZATION_POINT_CUT = eINSTANCE.getStaticInitializationPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.ExceptionPointCutImpl <em>Exception Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.ExceptionPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getExceptionPointCut()
		 * @generated
		 */
		EClass EXCEPTION_POINT_CUT = eINSTANCE.getExceptionPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.WithinPointCutImpl <em>Within Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.WithinPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getWithinPointCut()
		 * @generated
		 */
		EClass WITHIN_POINT_CUT = eINSTANCE.getWithinPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutPointCutImpl <em>Point Cut Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.PointCutPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutPointCut()
		 * @generated
		 */
		EClass POINT_CUT_POINT_CUT = eINSTANCE.getPointCutPointCut();

		/**
		 * The meta object literal for the '<em><b>Selected Point Cut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_CUT_POINT_CUT__SELECTED_POINT_CUT = eINSTANCE.getPointCutPointCut_SelectedPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.CFlowBelowPointCutImpl <em>CFlow Below Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.CFlowBelowPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCFlowBelowPointCut()
		 * @generated
		 */
		EClass CFLOW_BELOW_POINT_CUT = eINSTANCE.getCFlowBelowPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.CrossCuttingConcernImpl <em>Cross Cutting Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.CrossCuttingConcernImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCrossCuttingConcern()
		 * @generated
		 */
		EClass CROSS_CUTTING_CONCERN = eINSTANCE.getCrossCuttingConcern();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_CUTTING_CONCERN__BASE_PACKAGE = eINSTANCE.getCrossCuttingConcern_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutDisjuctionImpl <em>Point Cut Disjuction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.PointCutDisjuctionImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutDisjuction()
		 * @generated
		 */
		EClass POINT_CUT_DISJUCTION = eINSTANCE.getPointCutDisjuction();

		/**
		 * The meta object literal for the '<em><b>Composee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_CUT_DISJUCTION__COMPOSEE = eINSTANCE.getPointCutDisjuction_Composee();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutNegationImpl <em>Point Cut Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.PointCutNegationImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutNegation()
		 * @generated
		 */
		EClass POINT_CUT_NEGATION = eINSTANCE.getPointCutNegation();

		/**
		 * The meta object literal for the '<em><b>Composee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_CUT_NEGATION__COMPOSEE = eINSTANCE.getPointCutNegation_Composee();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.CFlowPointCutImpl <em>CFlow Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.CFlowPointCutImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getCFlowPointCut()
		 * @generated
		 */
		EClass CFLOW_POINT_CUT = eINSTANCE.getCFlowPointCut();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.impl.PointCutConjuctionImpl <em>Point Cut Conjuction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.impl.PointCutConjuctionImpl
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getPointCutConjuction()
		 * @generated
		 */
		EClass POINT_CUT_CONJUCTION = eINSTANCE.getPointCutConjuction();

		/**
		 * The meta object literal for the '<em><b>Composee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_CUT_CONJUCTION__COMPOSEE = eINSTANCE.getPointCutConjuction_Composee();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.AdviceExecutionType <em>Advice Execution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.AdviceExecutionType
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAdviceExecutionType()
		 * @generated
		 */
		EEnum ADVICE_EXECUTION_TYPE = eINSTANCE.getAdviceExecutionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.aspectj.AspectInstantiationType <em>Aspect Instantiation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.aspectj.AspectInstantiationType
		 * @see org.eclipse.papyrus.aspectj.impl.AspectJPackageImpl#getAspectInstantiationType()
		 * @generated
		 */
		EEnum ASPECT_INSTANTIATION_TYPE = eINSTANCE.getAspectInstantiationType();

	}

} //AspectJPackage
