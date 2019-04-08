/**
 */
package eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl;

import eu.megamart2.papyrus.profiles.alf.ActionLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionLanguageFactoryImpl extends EFactoryImpl implements ActionLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionLanguageFactory init() {
		try {
			ActionLanguageFactory theActionLanguageFactory = (ActionLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(ActionLanguagePackage.eNS_URI);
			if (theActionLanguageFactory != null) {
				return theActionLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActionLanguagePackage.TEXTUAL_REPRESENTATION: return createTextualRepresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualRepresentation createTextualRepresentation() {
		TextualRepresentationImpl textualRepresentation = new TextualRepresentationImpl();
		return textualRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLanguagePackage getActionLanguagePackage() {
		return (ActionLanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionLanguagePackage getPackage() {
		return ActionLanguagePackage.eINSTANCE;
	}

} //ActionLanguageFactoryImpl
