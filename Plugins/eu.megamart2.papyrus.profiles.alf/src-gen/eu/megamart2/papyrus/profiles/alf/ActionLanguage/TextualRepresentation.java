/**
 */
package eu.megamart2.papyrus.profiles.alf.ActionLanguage;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getBase_Comment <em>Base Comment</em>}</li>
 *   <li>{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguagePackage#getTextualRepresentation()
 * @model
 * @generated
 */
public interface TextualRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Comment</em>' reference.
	 * @see #setBase_Comment(Comment)
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguagePackage#getTextualRepresentation_Base_Comment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Comment getBase_Comment();

	/**
	 * Sets the value of the '{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getBase_Comment <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Comment</em>' reference.
	 * @see #getBase_Comment()
	 * @generated
	 */
	void setBase_Comment(Comment value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguagePackage#getTextualRepresentation_Language()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // TextualRepresentation
