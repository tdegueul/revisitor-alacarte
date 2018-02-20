/**
 */
package l3;

import l1.B;

import l2.C;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3.BindB#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see l3.L3Package#getBindB()
 * @model
 * @generated
 */
public interface BindB extends B {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(C)
	 * @see l3.L3Package#getBindB_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	C getDelegate();

	/**
	 * Sets the value of the '{@link l3.BindB#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(C value);

} // BindB
