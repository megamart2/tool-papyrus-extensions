/**
 */
package org.eclipse.papyrus.aspectj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Cross Cutting Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature#getBase_Feature <em>Base Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature#getOnType <em>On Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getStaticCrossCuttingFeature()
 * @model
 * @generated
 */
public interface StaticCrossCuttingFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Feature</em>' reference.
	 * @see #setBase_Feature(Feature)
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getStaticCrossCuttingFeature_Base_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getBase_Feature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.aspectj.StaticCrossCuttingFeature#getBase_Feature <em>Base Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Feature</em>' reference.
	 * @see #getBase_Feature()
	 * @generated
	 */
	void setBase_Feature(Feature value);

	/**
	 * Returns the value of the '<em><b>On Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Type</em>' reference list.
	 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getStaticCrossCuttingFeature_OnType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Type> getOnType();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>On Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOnType()
	 * @generated
	 */
	Type getOnType(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>On Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOnType()
	 * @generated
	 */
	Type getOnType(String name, boolean ignoreCase, EClass eClass);

} // StaticCrossCuttingFeature
