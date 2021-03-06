/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.PointCut#getBase_PointCut_StructuralFeature <em>Base Point Cut Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.PointCut#getComposite <em>Composite</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCut()
 * @model abstract="true"
 * @generated
 */
public interface PointCut extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Point Cut Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Point Cut Structural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Point Cut Structural Feature</em>' reference.
	 * @see #setBase_PointCut_StructuralFeature(StructuralFeature)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCut_Base_PointCut_StructuralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getBase_PointCut_StructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.PointCut#getBase_PointCut_StructuralFeature <em>Base Point Cut Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Point Cut Structural Feature</em>' reference.
	 * @see #getBase_PointCut_StructuralFeature()
	 * @generated
	 */
	void setBase_PointCut_StructuralFeature(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.aspectj.CompositePointCut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' reference list.
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCut_Composite()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompositePointCut> getComposite();

} // PointCut
