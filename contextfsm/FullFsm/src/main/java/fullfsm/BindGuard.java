/**
 */
package fullfsm;

import basicfsm.Guard;

import boolexp.Exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fullfsm.BindGuard#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see fullfsm.FullfsmPackage#getBindGuard()
 * @model
 * @generated
 */
public interface BindGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(Exp)
	 * @see fullfsm.FullfsmPackage#getBindGuard_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	Exp getDelegate();

	/**
	 * Sets the value of the '{@link fullfsm.BindGuard#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Exp value);

} // BindGuard
