/**
 */
package augmentedfsm;

import fsm.State;

import simpleimp.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link augmentedfsm.ExecutableState#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see augmentedfsm.AugmentedfsmPackage#getExecutableState()
 * @model
 * @generated
 */
public interface ExecutableState extends State {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see augmentedfsm.AugmentedfsmPackage#getExecutableState_Body()
	 * @model containment="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link augmentedfsm.ExecutableState#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

} // ExecutableState
