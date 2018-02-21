/**
 */
package simpleal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see simpleal.SimplealFactory
 * @model kind="package"
 * @generated
 */
public interface SimplealPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://simpleal/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplealPackage eINSTANCE = simpleal.impl.SimplealPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleal.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.BlockImpl
	 * @see simpleal.impl.SimplealPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STMTS = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.StmtImpl <em>Stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.StmtImpl
	 * @see simpleal.impl.SimplealPackageImpl#getStmt()
	 * @generated
	 */
	int STMT = 1;

	/**
	 * The number of structural features of the '<em>Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.PrintImpl
	 * @see simpleal.impl.SimplealPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 2;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__MSG = STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = STMT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link simpleal.impl.PrintVarImpl <em>Print Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.PrintVarImpl
	 * @see simpleal.impl.SimplealPackageImpl#getPrintVar()
	 * @generated
	 */
	int PRINT_VAR = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_VAR__VAR_NAME = STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_VAR_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Print Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_VAR_OPERATION_COUNT = STMT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link simpleal.impl.BindImpl <em>Bind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.BindImpl
	 * @see simpleal.impl.SimplealPackageImpl#getBind()
	 * @generated
	 */
	int BIND = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND__NAME = STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND__VAL = STMT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_OPERATION_COUNT = STMT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link simpleal.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see simpleal.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleal.Block#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmts</em>'.
	 * @see simpleal.Block#getStmts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Stmts();

	/**
	 * Returns the meta object for class '{@link simpleal.Stmt <em>Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stmt</em>'.
	 * @see simpleal.Stmt
	 * @generated
	 */
	EClass getStmt();

	/**
	 * Returns the meta object for class '{@link simpleal.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see simpleal.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the attribute '{@link simpleal.Print#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see simpleal.Print#getMsg()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_Msg();

	/**
	 * Returns the meta object for class '{@link simpleal.PrintVar <em>Print Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Var</em>'.
	 * @see simpleal.PrintVar
	 * @generated
	 */
	EClass getPrintVar();

	/**
	 * Returns the meta object for the attribute '{@link simpleal.PrintVar#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see simpleal.PrintVar#getVarName()
	 * @see #getPrintVar()
	 * @generated
	 */
	EAttribute getPrintVar_VarName();

	/**
	 * Returns the meta object for class '{@link simpleal.Bind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind</em>'.
	 * @see simpleal.Bind
	 * @generated
	 */
	EClass getBind();

	/**
	 * Returns the meta object for the attribute '{@link simpleal.Bind#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleal.Bind#getName()
	 * @see #getBind()
	 * @generated
	 */
	EAttribute getBind_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleal.Bind#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see simpleal.Bind#getVal()
	 * @see #getBind()
	 * @generated
	 */
	EAttribute getBind_Val();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplealFactory getSimplealFactory();

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
		 * The meta object literal for the '{@link simpleal.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.BlockImpl
		 * @see simpleal.impl.SimplealPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STMTS = eINSTANCE.getBlock_Stmts();

		/**
		 * The meta object literal for the '{@link simpleal.impl.StmtImpl <em>Stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.StmtImpl
		 * @see simpleal.impl.SimplealPackageImpl#getStmt()
		 * @generated
		 */
		EClass STMT = eINSTANCE.getStmt();

		/**
		 * The meta object literal for the '{@link simpleal.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.PrintImpl
		 * @see simpleal.impl.SimplealPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__MSG = eINSTANCE.getPrint_Msg();

		/**
		 * The meta object literal for the '{@link simpleal.impl.PrintVarImpl <em>Print Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.PrintVarImpl
		 * @see simpleal.impl.SimplealPackageImpl#getPrintVar()
		 * @generated
		 */
		EClass PRINT_VAR = eINSTANCE.getPrintVar();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_VAR__VAR_NAME = eINSTANCE.getPrintVar_VarName();

		/**
		 * The meta object literal for the '{@link simpleal.impl.BindImpl <em>Bind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.BindImpl
		 * @see simpleal.impl.SimplealPackageImpl#getBind()
		 * @generated
		 */
		EClass BIND = eINSTANCE.getBind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIND__NAME = eINSTANCE.getBind_Name();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIND__VAL = eINSTANCE.getBind_Val();

	}

} //SimplealPackage
