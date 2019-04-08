/**
 */
package eu.megamart2.papyrus.profiles.alf.ActionLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ActionLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ActionLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/ALF/20120827/ActionLanguage-Profile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ActionLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionLanguagePackage eINSTANCE = eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.ActionLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.TextualRepresentationImpl <em>Textual Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.TextualRepresentationImpl
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.ActionLanguagePackageImpl#getTextualRepresentation()
	 * @generated
	 */
	int TEXTUAL_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REPRESENTATION__BASE_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REPRESENTATION__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Textual Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REPRESENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Textual Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REPRESENTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation <em>Textual Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Representation</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation
	 * @generated
	 */
	EClass getTextualRepresentation();

	/**
	 * Returns the meta object for the reference '{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getBase_Comment()
	 * @see #getTextualRepresentation()
	 * @generated
	 */
	EReference getTextualRepresentation_Base_Comment();

	/**
	 * Returns the meta object for the attribute '{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation#getLanguage()
	 * @see #getTextualRepresentation()
	 * @generated
	 */
	EAttribute getTextualRepresentation_Language();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionLanguageFactory getActionLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.TextualRepresentationImpl <em>Textual Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.TextualRepresentationImpl
		 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.ActionLanguagePackageImpl#getTextualRepresentation()
		 * @generated
		 */
		EClass TEXTUAL_REPRESENTATION = eINSTANCE.getTextualRepresentation();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_REPRESENTATION__BASE_COMMENT = eINSTANCE.getTextualRepresentation_Base_Comment();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_REPRESENTATION__LANGUAGE = eINSTANCE.getTextualRepresentation_Language();

	}

} //ActionLanguagePackage
