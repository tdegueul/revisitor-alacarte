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
 *   <li>{@link fullfsm.BindGuard#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see fullfsm.FullfsmPackage#getBindGuard()
 * @model
 * @generated
 */
public interface BindGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(Exp)
	 * @see fullfsm.FullfsmPackage#getBindGuard_Bound()
	 * @model containment="true"
	 * @generated
	 */
	Exp getBound();

	/**
	 * Sets the value of the '{@link fullfsm.BindGuard#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(Exp value);

} // BindGuard
