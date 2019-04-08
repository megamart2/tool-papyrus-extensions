/**
 */
package eu.megamart2.papyrus.profiles.alf.ActionLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguagePackage
 * @generated
 */
public interface ActionLanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionLanguageFactory eINSTANCE = eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl.ActionLanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Textual Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual Representation</em>'.
	 * @generated
	 */
	TextualRepresentation createTextualRepresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionLanguagePackage getActionLanguagePackage();

} //ActionLanguageFactory
