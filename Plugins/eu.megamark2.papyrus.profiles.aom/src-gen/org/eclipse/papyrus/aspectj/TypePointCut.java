/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.TypePointCut#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getTypePointCut()
 * @model
 * @generated
 */
public interface TypePointCut extends PointCut {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getTypePointCut_Type()
	 * @model required="true"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getType()
	 * @generated
	 */
	Type getType(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getType()
	 * @generated
	 */
	Type getType(String name, boolean ignoreCase, EClass eClass);

} // TypePointCut
