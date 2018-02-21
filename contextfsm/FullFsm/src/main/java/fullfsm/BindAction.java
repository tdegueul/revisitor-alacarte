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
 *   <li>{@link fullfsm.BindAction#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see fullfsm.FullfsmPackage#getBindAction()
 * @model
 * @generated
 */
public interface BindAction extends Action {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(Block)
	 * @see fullfsm.FullfsmPackage#getBindAction_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	Block getDelegate();

	/**
	 * Sets the value of the '{@link fullfsm.BindAction#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Block value);

} // BindAction
