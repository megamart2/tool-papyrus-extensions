/**
 */
package eu.megamart2.papyrus.profiles.alf.BackupProfile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getState <em>State</em>}</li>
 *   <li>{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfilePackage#getBackup()
 * @model
 * @generated
 */
public interface Backup extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfilePackage#getBackup_Timestamp()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState
	 * @see #setState(BackupState)
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfilePackage#getBackup_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BackupState getState();

	/**
	 * Sets the value of the '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupState
	 * @see #getState()
	 * @generated
	 */
	void setState(BackupState value);

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
	 * @see eu.megamart2.papyrus.profiles.alf.BackupProfile.BackupProfilePackage#getBackup_Base_Comment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Comment getBase_Comment();

	/**
	 * Sets the value of the '{@link eu.megamart2.papyrus.profiles.alf.BackupProfile.Backup#getBase_Comment <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Comment</em>' reference.
	 * @see #getBase_Comment()
	 * @generated
	 */
	void setBase_Comment(Comment value);

} // Backup
