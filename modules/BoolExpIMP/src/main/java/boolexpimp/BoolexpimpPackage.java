/**
 */
package boolexpimp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import simpleimp.SimpleimpPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see boolexpimp.BoolexpimpFactory
 * @model kind="package"
 * @generated
 */
public interface BoolexpimpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boolexpimp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://boolexpimp/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boolexpimp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoolexpimpPackage eINSTANCE = boolexpimp.impl.BoolexpimpPackageImpl.init();

	/**
	 * The meta object id for the '{@link boolexpimp.impl.BoolExpConditionImpl <em>Bool Exp Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexpimp.impl.BoolExpConditionImpl
	 * @see boolexpimp.impl.BoolexpimpPackageImpl#getBoolExpCondition()
	 * @generated
	 */
	int BOOL_EXP_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXP_CONDITION__EXP = SimpleimpPackage.CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Exp Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXP_CONDITION_FEATURE_COUNT = SimpleimpPackage.CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Exp Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXP_CONDITION_OPERATION_COUNT = SimpleimpPackage.CONDITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link boolexpimp.BoolExpCondition <em>Bool Exp Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Exp Condition</em>'.
	 * @see boolexpimp.BoolExpCondition
	 * @generated
	 */
	EClass getBoolExpCondition();

	/**
	 * Returns the meta object for the containment reference '{@link boolexpimp.BoolExpCondition#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see boolexpimp.BoolExpCondition#getExp()
	 * @see #getBoolExpCondition()
	 * @generated
	 */
	EReference getBoolExpCondition_Exp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoolexpimpFactory getBoolexpimpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link boolexpimp.impl.BoolExpConditionImpl <em>Bool Exp Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexpimp.impl.BoolExpConditionImpl
		 * @see boolexpimp.impl.BoolexpimpPackageImpl#getBoolExpCondition()
		 * @generated
		 */
		EClass BOOL_EXP_CONDITION = eINSTANCE.getBoolExpCondition();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_EXP_CONDITION__EXP = eINSTANCE.getBoolExpCondition_Exp();

	}

} //BoolexpimpPackage
