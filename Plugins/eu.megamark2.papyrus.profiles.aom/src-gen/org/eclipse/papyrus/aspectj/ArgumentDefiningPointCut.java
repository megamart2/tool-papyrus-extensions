/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Defining Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut#getBase_StructuralFeature <em>Base Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut#getArgNames <em>Arg Names</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getArgumentDefiningPointCut()
 * @model
 * @generated
 */
public interface ArgumentDefiningPointCut extends EObject {
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
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getArgumentDefiningPointCut_Base_StructuralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getBase_StructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.ArgumentDefiningPointCut#getBase_StructuralFeature <em>Base Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Structural Feature</em>' reference.
	 * @see #getBase_StructuralFeature()
	 * @generated
	 */
	void setBase_StructuralFeature(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Arg Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg Names</em>' attribute list.
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getArgumentDefiningPointCut_ArgNames()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true"
	 * @generated
	 */
	EList<String> getArgNames();

} // ArgumentDefiningPointCut
