/**
 */
package boolexpimp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see boolexpimp.BoolexpimpPackage
 * @generated
 */
public interface BoolexpimpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoolexpimpFactory eINSTANCE = boolexpimp.impl.BoolexpimpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bool Exp Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Exp Condition</em>'.
	 * @generated
	 */
	BoolExpCondition createBoolExpCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BoolexpimpPackage getBoolexpimpPackage();

} //BoolexpimpFactory
