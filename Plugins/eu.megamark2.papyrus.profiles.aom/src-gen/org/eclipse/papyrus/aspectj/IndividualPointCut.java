/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.IndividualPointCut#getComposite <em>Composite</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getIndividualPointCut()
 * @model abstract="true"
 * @generated
 */
public interface IndividualPointCut extends PointCut {
	/**
	 * Returns the value of the '<em><b>Composite</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.aspectj.CompositionPointCut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' reference list.
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getIndividualPointCut_Composite()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompositionPointCut> getComposite();

} // IndividualPointCut
