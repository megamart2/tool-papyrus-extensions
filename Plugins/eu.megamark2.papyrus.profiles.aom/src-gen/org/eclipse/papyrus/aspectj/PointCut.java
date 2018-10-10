/**
 */
package org.eclipse.papyrus.aspectj;

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
 *   <li>{@link org.eclipse.papyrus.aspectj.PointCut#getBase_StructuralFeature <em>Base Structural Feature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCut()
 * @model
 * @generated
 */
public interface PointCut extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Structural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Structural Feature</em>' reference.
	 * @see #setBase_StructuralFeature(StructuralFeature)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCut_Base_StructuralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getBase_StructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.PointCut#getBase_StructuralFeature <em>Base Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Structural Feature</em>' reference.
	 * @see #getBase_StructuralFeature()
	 * @generated
	 */
	void setBase_StructuralFeature(StructuralFeature value);

} // PointCut
