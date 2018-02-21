/**
 */
package fullfsm;

import basicfsm.Action;

import simpleal.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fullfsm.BindAction#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see fullfsm.FullfsmPackage#getBindAction()
 * @model
 * @generated
 */
public interface BindAction extends Action {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(Block)
	 * @see fullfsm.FullfsmPackage#getBindAction_Bound()
	 * @model containment="true"
	 * @generated
	 */
	Block getBound();

	/**
	 * Sets the value of the '{@link fullfsm.BindAction#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(Block value);

} // BindAction
