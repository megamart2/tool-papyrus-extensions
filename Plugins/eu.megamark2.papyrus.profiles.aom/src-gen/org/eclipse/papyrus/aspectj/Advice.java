/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.Advice#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.Advice#getAdviceExecution <em>Advice Execution</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.Advice#getPointcut <em>Pointcut</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends EObject {
	/**
	 * Returns the value of the '<em><b>Advice Execution</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.aspectj.AdviceExecutionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice Execution</em>' attribute.
	 * @see org.eclipse.papyrus.aspectj.AdviceExecutionType
	 * @see #setAdviceExecution(AdviceExecutionType)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getAdvice_AdviceExecution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AdviceExecutionType getAdviceExecution();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.Advice#getAdviceExecution <em>Advice Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice Execution</em>' attribute.
	 * @see org.eclipse.papyrus.aspectj.AdviceExecutionType
	 * @see #getAdviceExecution()
	 * @generated
	 */
	void setAdviceExecution(AdviceExecutionType value);

	/**
	 * Returns the value of the '<em><b>Pointcut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut</em>' reference.
	 * @see #setPointcut(PointCut)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getAdvice_Pointcut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PointCut getPointcut();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.Advice#getPointcut <em>Pointcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut</em>' reference.
	 * @see #getPointcut()
	 * @generated
	 */
	void setPointcut(PointCut value);

	/**
	 * Returns the value of the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavioral Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #setBase_BehavioralFeature(BehavioralFeature)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getAdvice_Base_BehavioralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioralFeature getBase_BehavioralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.Advice#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 */
	void setBase_BehavioralFeature(BehavioralFeature value);

} // Advice
