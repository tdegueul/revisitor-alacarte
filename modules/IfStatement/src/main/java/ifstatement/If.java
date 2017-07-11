/**
 */
package ifstatement;

import simpleimp.Block;
import simpleimp.Condition;
import simpleimp.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifstatement.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link ifstatement.If#getThn <em>Thn</em>}</li>
 *   <li>{@link ifstatement.If#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @see ifstatement.IfstatementPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see ifstatement.IfstatementPackage#getIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link ifstatement.If#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Thn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thn</em>' containment reference.
	 * @see #setThn(Block)
	 * @see ifstatement.IfstatementPackage#getIf_Thn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getThn();

	/**
	 * Sets the value of the '{@link ifstatement.If#getThn <em>Thn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thn</em>' containment reference.
	 * @see #getThn()
	 * @generated
	 */
	void setThn(Block value);

	/**
	 * Returns the value of the '<em><b>Els</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Els</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Els</em>' containment reference.
	 * @see #setEls(Block)
	 * @see ifstatement.IfstatementPackage#getIf_Els()
	 * @model containment="true"
	 * @generated
	 */
	Block getEls();

	/**
	 * Sets the value of the '{@link ifstatement.If#getEls <em>Els</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Els</em>' containment reference.
	 * @see #getEls()
	 * @generated
	 */
	void setEls(Block value);

} // If
