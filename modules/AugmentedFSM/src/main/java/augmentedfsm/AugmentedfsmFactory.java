/**
 */
package augmentedfsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see augmentedfsm.AugmentedfsmPackage
 * @generated
 */
public interface AugmentedfsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AugmentedfsmFactory eINSTANCE = augmentedfsm.impl.AugmentedfsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Executable State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable State</em>'.
	 * @generated
	 */
	ExecutableState createExecutableState();

	/**
	 * Returns a new object of class '<em>Guarded Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarded Transition</em>'.
	 * @generated
	 */
	GuardedTransition createGuardedTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AugmentedfsmPackage getAugmentedfsmPackage();

} //AugmentedfsmFactory
