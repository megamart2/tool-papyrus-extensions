/**
 */
package org.eclipse.papyrus.aspectj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Cut Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.PointCutPointCut#getSelectedPointCut <em>Selected Point Cut</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCutPointCut()
 * @model abstract="true"
 * @generated
 */
public interface PointCutPointCut extends PointCut {
	/**
	 * Returns the value of the '<em><b>Selected Point Cut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Point Cut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Point Cut</em>' reference.
	 * @see #setSelectedPointCut(PointCut)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getPointCutPointCut_SelectedPointCut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PointCut getSelectedPointCut();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.PointCutPointCut#getSelectedPointCut <em>Selected Point Cut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Point Cut</em>' reference.
	 * @see #getSelectedPointCut()
	 * @generated
	 */
	void setSelectedPointCut(PointCut value);

} // PointCutPointCut
