/**
 */
package org.eclipse.papyrus.aspectj;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Advice Execution Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.aspectj.AspectJPackage#getAdviceExecutionType()
 * @model
 * @generated
 */
public enum AdviceExecutionType implements Enumerator {
	/**
	 * The '<em><b>Around Advice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND_ADVICE_VALUE
	 * @generated
	 * @ordered
	 */
	AROUND_ADVICE(0, "AroundAdvice", "AroundAdvice"),

	/**
	 * The '<em><b>Before Advice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_ADVICE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_ADVICE(1, "BeforeAdvice", "BeforeAdvice"),

	/**
	 * The '<em><b>After Advice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_ADVICE_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_ADVICE(2, "AfterAdvice", "AfterAdvice");

	/**
	 * The '<em><b>Around Advice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Around Advice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND_ADVICE
	 * @model name="AroundAdvice"
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_ADVICE_VALUE = 0;

	/**
	 * The '<em><b>Before Advice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Advice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_ADVICE
	 * @model name="BeforeAdvice"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_ADVICE_VALUE = 1;

	/**
	 * The '<em><b>After Advice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After Advice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_ADVICE
	 * @model name="AfterAdvice"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_ADVICE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Advice Execution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdviceExecutionType[] VALUES_ARRAY =
		new AdviceExecutionType[] {
			AROUND_ADVICE,
			BEFORE_ADVICE,
			AFTER_ADVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Advice Execution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdviceExecutionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Advice Execution Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdviceExecutionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdviceExecutionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Advice Execution Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdviceExecutionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdviceExecutionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Advice Execution Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdviceExecutionType get(int value) {
		switch (value) {
			case AROUND_ADVICE_VALUE: return AROUND_ADVICE;
			case BEFORE_ADVICE_VALUE: return BEFORE_ADVICE;
			case AFTER_ADVICE_VALUE: return AFTER_ADVICE;
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
	private AdviceExecutionType(int value, String name, String literal) {
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
	
} //AdviceExecutionType
