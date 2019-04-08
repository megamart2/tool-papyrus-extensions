/**
 */
package eu.megamart2.papyrus.profiles.alf.ActionLanguage.impl;

import eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguageFactory;
import eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguagePackage;
import eu.megamart2.papyrus.profiles.alf.ActionLanguage.TextualRepresentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionLanguagePackageImpl extends EPackageImpl implements ActionLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualRepresentationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.megamart2.papyrus.profiles.alf.ActionLanguage.ActionLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionLanguagePackageImpl() {
		super(eNS_URI, ActionLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ActionLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionLanguagePackage init() {
		if (isInited) return (ActionLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ActionLanguagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredActionLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ActionLanguagePackageImpl theActionLanguagePackage = registeredActionLanguagePackage instanceof ActionLanguagePackageImpl ? (ActionLanguagePackageImpl)registeredActionLanguagePackage : new ActionLanguagePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theActionLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theActionLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActionLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionLanguagePackage.eNS_URI, theActionLanguagePackage);
		return theActionLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualRepresentation() {
		return textualRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualRepresentation_Base_Comment() {
		return (EReference)textualRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualRepresentation_Language() {
		return (EAttribute)textualRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLanguageFactory getActionLanguageFactory() {
		return (ActionLanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		textualRepresentationEClass = createEClass(TEXTUAL_REPRESENTATION);
		createEReference(textualRepresentationEClass, TEXTUAL_REPRESENTATION__BASE_COMMENT);
		createEAttribute(textualRepresentationEClass, TEXTUAL_REPRESENTATION__LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(textualRepresentationEClass, TextualRepresentation.class, "TextualRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextualRepresentation_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, TextualRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextualRepresentation_Language(), theTypesPackage.getString(), "language", null, 1, 1, TextualRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ActionLanguagePackageImpl
