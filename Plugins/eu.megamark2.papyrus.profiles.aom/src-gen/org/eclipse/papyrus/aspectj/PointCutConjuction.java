/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Cut Conjuction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.PointCutConjuction#getComposee <em>Composee</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCutConjuction()
 * @model
 * @generated
 */
public interface PointCutConjuction extends PointCut {

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
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCutConjuction_Composee()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<PointCut> getComposee();

} // PointCutConjuction
