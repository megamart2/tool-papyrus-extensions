/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.OperationalPointCut#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getOperationalPointCut()
 * @model abstract="true"
 * @generated
 */
public interface OperationalPointCut extends PointCut {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference list.
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getOperationalPointCut_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOperation()
	 * @generated
	 */
	Operation getOperation(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOperation()
	 * @generated
	 */
	Operation getOperation(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes, boolean ignoreCase);

} // OperationalPointCut
