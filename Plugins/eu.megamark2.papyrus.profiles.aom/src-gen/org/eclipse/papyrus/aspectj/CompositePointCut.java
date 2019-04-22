/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.CompositePointCut#getComposee <em>Composee</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.CompositePointCut#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getCompositePointCut()
 * @model
 * @generated
 */
public interface CompositePointCut extends PointCut {
	/**
	 * Returns the value of the '<em><b>Composee</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.aspectj.PointCut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composee</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composee</em>' reference list.
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getCompositePointCut_Composee()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<PointCut> getComposee();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.aspectj.PointCutCompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.papyrus.aspectj.PointCutCompositionType
	 * @see #setType(PointCutCompositionType)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getCompositePointCut_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PointCutCompositionType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.CompositePointCut#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.papyrus.aspectj.PointCutCompositionType
	 * @see #getType()
	 * @generated
	 */
	void setType(PointCutCompositionType value);

} // CompositePointCut
