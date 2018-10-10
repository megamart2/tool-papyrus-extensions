/**
 */
package org.eclipse.papyrus.aspectj;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aspect Instantiation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getAspectInstantiationType()
 * @model
 * @generated
 */
public enum AspectInstantiationType implements Enumerator {
	/**
	 * The '<em><b>Perthis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERTHIS_VALUE
	 * @generated
	 * @ordered
	 */
	PERTHIS(0, "perthis", "perthis"),

	/**
	 * The '<em><b>Pertarget</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERTARGET_VALUE
	 * @generated
	 * @ordered
	 */
	PERTARGET(1, "pertarget", "pertarget"),

	/**
	 * The '<em><b>Percflow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	PERCFLOW(2, "percflow", "percflow"),

	/**
	 * The '<em><b>Percflowbelow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCFLOWBELOW_VALUE
	 * @generated
	 * @ordered
	 */
	PERCFLOWBELOW(3, "percflowbelow", "percflowbelow");

	/**
	 * The '<em><b>Perthis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Perthis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERTHIS
	 * @model name="perthis"
	 * @generated
	 * @ordered
	 */
	public static final int PERTHIS_VALUE = 0;

	/**
	 * The '<em><b>Pertarget</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pertarget</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERTARGET
	 * @model name="pertarget"
	 * @generated
	 * @ordered
	 */
	public static final int PERTARGET_VALUE = 1;

	/**
	 * The '<em><b>Percflow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percflow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCFLOW
	 * @model name="percflow"
	 * @generated
	 * @ordered
	 */
	public static final int PERCFLOW_VALUE = 2;

	/**
	 * The '<em><b>Percflowbelow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percflowbelow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCFLOWBELOW
	 * @model name="percflowbelow"
	 * @generated
	 * @ordered
	 */
	public static final int PERCFLOWBELOW_VALUE = 3;

	/**
	 * An array of all the '<em><b>Aspect Instantiation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AspectInstantiationType[] VALUES_ARRAY =
		new AspectInstantiationType[] {
			PERTHIS,
			PERTARGET,
			PERCFLOW,
			PERCFLOWBELOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Aspect Instantiation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AspectInstantiationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aspect Instantiation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AspectInstantiationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AspectInstantiationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect Instantiation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AspectInstantiationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AspectInstantiationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect Instantiation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AspectInstantiationType get(int value) {
		switch (value) {
			case PERTHIS_VALUE: return PERTHIS;
			case PERTARGET_VALUE: return PERTARGET;
			case PERCFLOW_VALUE: return PERCFLOW;
			case PERCFLOWBELOW_VALUE: return PERCFLOWBELOW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AspectInstantiationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AspectInstantiationType
