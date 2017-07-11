/**
 */
package sleepstatement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sleepstatement.SleepstatementPackage
 * @generated
 */
public interface SleepstatementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SleepstatementFactory eINSTANCE = sleepstatement.impl.SleepstatementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sleep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sleep</em>'.
	 * @generated
	 */
	Sleep createSleep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SleepstatementPackage getSleepstatementPackage();

} //SleepstatementFactory
