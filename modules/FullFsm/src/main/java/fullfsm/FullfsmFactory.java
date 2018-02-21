/**
 */
package fullfsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fullfsm.FullfsmPackage
 * @generated
 */
public interface FullfsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FullfsmFactory eINSTANCE = fullfsm.impl.FullfsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bind Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bind Guard</em>'.
	 * @generated
	 */
	BindGuard createBindGuard();

	/**
	 * Returns a new object of class '<em>Bind Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bind Action</em>'.
	 * @generated
	 */
	BindAction createBindAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FullfsmPackage getFullfsmPackage();

} //FullfsmFactory
