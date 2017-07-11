/**
 */
package boolexpimp;

import boolexp.Exp;

import simpleimp.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Exp Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boolexpimp.BoolExpCondition#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see boolexpimp.BoolexpimpPackage#getBoolExpCondition()
 * @model
 * @generated
 */
public interface BoolExpCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Exp)
	 * @see boolexpimp.BoolexpimpPackage#getBoolExpCondition_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getExp();

	/**
	 * Sets the value of the '{@link boolexpimp.BoolExpCondition#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Exp value);

} // BoolExpCondition
