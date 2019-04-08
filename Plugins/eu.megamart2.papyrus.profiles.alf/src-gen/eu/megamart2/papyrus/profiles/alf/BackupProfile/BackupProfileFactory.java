/**
 */
package eu.megamart2.papyrus.profiles.alf.BackupProfile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfilePackage
 * @generated
 */
public interface BackupProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackupProfileFactory eINSTANCE = eu.megamart2.papyrus.profiles.alf.BackupProfile.impl.BackupProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Backup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backup</em>'.
	 * @generated
	 */
	Backup createBackup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BackupProfilePackage getBackupProfilePackage();

} //BackupProfileFactory
