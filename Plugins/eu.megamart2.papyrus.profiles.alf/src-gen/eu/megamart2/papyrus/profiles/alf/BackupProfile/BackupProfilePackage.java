/**
 */
package eu.megamart2.papyrus.profiles.alf.BackupProfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfileFactory
 * @model kind="package"
 * @generated
 */
public interface BackupProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BackupProfile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///schemas/BackupProfile/_J7IFgKInEeS_KNX0nfvIVQ/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BackupProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackupProfilePackage eINSTANCE = eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupImpl <em>Backup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupImpl
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupProfilePackageImpl#getBackup()
	 * @generated
	 */
	int BACKUP = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP__STATE = 1;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP__BASE_COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Backup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Backup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState <em>Backup State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupProfilePackageImpl#getBackupState()
	 * @generated
	 */
	int BACKUP_STATE = 1;


	/**
	 * Returns the meta object for class '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup <em>Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backup</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup
	 * @generated
	 */
	EClass getBackup();

	/**
	 * Returns the meta object for the attribute '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getTimestamp()
	 * @see #getBackup()
	 * @generated
	 */
	EAttribute getBackup_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getState()
	 * @see #getBackup()
	 * @generated
	 */
	EAttribute getBackup_State();

	/**
	 * Returns the meta object for the reference '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getBase_Comment()
	 * @see #getBackup()
	 * @generated
	 */
	EReference getBackup_Base_Comment();

	/**
	 * Returns the meta object for enum '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState <em>Backup State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Backup State</em>'.
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState
	 * @generated
	 */
	EEnum getBackupState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BackupProfileFactory getBackupProfileFactory();

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
		 * The meta object literal for the '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupImpl <em>Backup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupImpl
		 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupProfilePackageImpl#getBackup()
		 * @generated
		 */
		EClass BACKUP = eINSTANCE.getBackup();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKUP__TIMESTAMP = eINSTANCE.getBackup_Timestamp();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKUP__STATE = eINSTANCE.getBackup_State();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKUP__BASE_COMMENT = eINSTANCE.getBackup_Base_Comment();

		/**
		 * The meta object literal for the '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState <em>Backup State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState
		 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupProfilePackageImpl#getBackupState()
		 * @generated
		 */
		EEnum BACKUP_STATE = eINSTANCE.getBackupState();

	}

} //BackupProfilePackage
