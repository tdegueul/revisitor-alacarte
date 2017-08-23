/**
 */
package augmentedfsm;

import boolexp.Exp;

import fsm.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link augmentedfsm.GuardedTransition#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see augmentedfsm.AugmentedfsmPackage#getGuardedTransition()
 * @model
 * @generated
 */
public interface GuardedTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Exp)
	 * @see augmentedfsm.AugmentedfsmPackage#getGuardedTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Exp getGuard();

	/**
	 * Sets the value of the '{@link augmentedfsm.GuardedTransition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Exp value);

} // GuardedTransition
