/**
 */
package basicfsm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link basicfsm.State#getName <em>Name</em>}</li>
 *   <li>{@link basicfsm.State#getIn <em>In</em>}</li>
 *   <li>{@link basicfsm.State#getOut <em>Out</em>}</li>
 *   <li>{@link basicfsm.State#getDecls <em>Decls</em>}</li>
 * </ul>
 *
 * @see basicfsm.BasicfsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see basicfsm.BasicfsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link basicfsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link basicfsm.Trans}.
	 * It is bidirectional and its opposite is '{@link basicfsm.Trans#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see basicfsm.BasicfsmPackage#getState_In()
	 * @see basicfsm.Trans#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Trans> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link basicfsm.Trans}.
	 * It is bidirectional and its opposite is '{@link basicfsm.Trans#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see basicfsm.BasicfsmPackage#getState_Out()
	 * @see basicfsm.Trans#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Trans> getOut();

	/**
	 * Returns the value of the '<em><b>Decls</b></em>' containment reference list.
	 * The list contents are of type {@link basicfsm.VarDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decls</em>' containment reference list.
	 * @see basicfsm.BasicfsmPackage#getState_Decls()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarDecl> getDecls();

} // State
