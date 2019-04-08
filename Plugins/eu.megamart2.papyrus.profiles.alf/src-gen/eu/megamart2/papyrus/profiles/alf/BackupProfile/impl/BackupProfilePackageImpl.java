/**
 */
package eu.megamart2.papyrus.profiles.alf.BackupProfile.impl;

import eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup;
import eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfileFactory;
import eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfilePackage;
import eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class BackupProfilePackageImpl extends EPackageImpl implements BackupProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backupStateEEnum = null;

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
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BackupProfilePackageImpl() {
		super(eNS_URI, BackupProfileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BackupProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BackupProfilePackage init() {
		if (isInited) return (BackupProfilePackage)EPackage.Registry.INSTANCE.getEPackage(BackupProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBackupProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BackupProfilePackageImpl theBackupProfilePackage = registeredBackupProfilePackage instanceof BackupProfilePackageImpl ? (BackupProfilePackageImpl)registeredBackupProfilePackage : new BackupProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBackupProfilePackage.createPackageContents();

		// Initialize created meta-data
		theBackupProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBackupProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BackupProfilePackage.eNS_URI, theBackupProfilePackage);
		return theBackupProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackup() {
		return backupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackup_Timestamp() {
		return (EAttribute)backupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackup_State() {
		return (EAttribute)backupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBackup_Base_Comment() {
		return (EReference)backupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBackupState() {
		return backupStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackupProfileFactory getBackupProfileFactory() {
		return (BackupProfileFactory)getEFactoryInstance();
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
		backupEClass = createEClass(BACKUP);
		createEAttribute(backupEClass, BACKUP__TIMESTAMP);
		createEAttribute(backupEClass, BACKUP__STATE);
		createEReference(backupEClass, BACKUP__BASE_COMMENT);

		// Create enums
		backupStateEEnum = createEEnum(BACKUP_STATE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(backupEClass, Backup.class, "Backup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackup_Timestamp(), theTypesPackage.getString(), "timestamp", null, 1, 1, Backup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBackup_State(), this.getBackupState(), "state", null, 1, 1, Backup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBackup_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Backup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(backupStateEEnum, BackupState.class, "BackupState");
		addEEnumLiteral(backupStateEEnum, BackupState.SAVED);
		addEEnumLiteral(backupStateEEnum, BackupState.MERGED);

		// Create resource
		createResource(eNS_URI);
	}

} //BackupProfilePackageImpl
