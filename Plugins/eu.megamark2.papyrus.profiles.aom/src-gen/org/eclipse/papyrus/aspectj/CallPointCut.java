/**
 */
package org.eclipse.papyrus.aspectj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.CallPointCut#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getCallPointCut()
 * @model
 * @generated
 */
public interface CallPointCut extends OperationalPointCut {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getCallPointCut_Signature()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.CallPointCut#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // CallPointCut
