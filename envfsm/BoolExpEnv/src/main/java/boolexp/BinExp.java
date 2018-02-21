/**
 */
package boolexp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boolexp.BinExp#getLhs <em>Lhs</em>}</li>
 *   <li>{@link boolexp.BinExp#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see boolexp.BoolexpPackage#getBinExp()
 * @model abstract="true"
 * @generated
 */
public interface BinExp extends Exp {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Exp)
	 * @see boolexp.BoolexpPackage#getBinExp_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getLhs();

	/**
	 * Sets the value of the '{@link boolexp.BinExp#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Exp value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Exp)
	 * @see boolexp.BoolexpPackage#getBinExp_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getRhs();

	/**
	 * Sets the value of the '{@link boolexp.BinExp#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Exp value);

} // BinExp
