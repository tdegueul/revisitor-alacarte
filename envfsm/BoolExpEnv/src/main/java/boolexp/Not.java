/**
 */
package boolexp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boolexp.Not#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see boolexp.BoolexpPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Exp {
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
	 * @see boolexp.BoolexpPackage#getNot_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getExp();

	/**
	 * Sets the value of the '{@link boolexp.Not#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Exp value);

} // Not
