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
	 * The meta object id for the '{@link simpleal.impl.ArithImpl <em>Arith</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.ArithImpl
	 * @see simpleal.impl.SimplealPackageImpl#getArith()
	 * @generated
	 */
	int ARITH = 2;

	/**
	 * The number of structural features of the '<em>Arith</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arith</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.VarRefImpl
	 * @see simpleal.impl.SimplealPackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__NAME = ARITH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = ARITH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_OPERATION_COUNT = ARITH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.ArithLitImpl <em>Arith Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.ArithLitImpl
	 * @see simpleal.impl.SimplealPackageImpl#getArithLit()
	 * @generated
	 */
	int ARITH_LIT = 4;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_LIT__VAL = ARITH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arith Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_LIT_FEATURE_COUNT = ARITH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arith Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_LIT_OPERATION_COUNT = ARITH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.ArithOpImpl <em>Arith Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.ArithOpImpl
	 * @see simpleal.impl.SimplealPackageImpl#getArithOp()
	 * @generated
	 */
	int ARITH_OP = 5;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP__LHS = ARITH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP__RHS = ARITH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arith Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_FEATURE_COUNT = ARITH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arith Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_OPERATION_COUNT = ARITH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.ArithPlusImpl <em>Arith Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.ArithPlusImpl
	 * @see simpleal.impl.SimplealPackageImpl#getArithPlus()
	 * @generated
	 */
	int ARITH_PLUS = 6;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.ArithMinusImpl <em>Arith Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.ArithMinusImpl
	 * @see simpleal.impl.SimplealPackageImpl#getArithMinus()
	 * @generated
	 */
	int ARITH_MINUS = 7;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleal.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.PrintImpl
	 * @see simpleal.impl.SimplealPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__NAME = STMT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link simpleal.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleal.impl.AssignImpl
	 * @see simpleal.impl.SimplealPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__VAL = STMT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = STMT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link simpleal.Arith <em>Arith</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith</em>'.
	 * @see simpleal.Arith
	 * @generated
	 */
	EClass getArith();

	/**
	 * Returns the meta object for class '{@link simpleal.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see simpleal.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the attribute '{@link simpleal.VarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleal.VarRef#getName()
	 * @see #getVarRef()
	 * @generated
	 */
	EAttribute getVarRef_Name();

	/**
	 * Returns the meta object for class '{@link simpleal.ArithLit <em>Arith Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Lit</em>'.
	 * @see simpleal.ArithLit
	 * @generated
	 */
	EClass getArithLit();

	/**
	 * Returns the meta object for the attribute '{@link simpleal.ArithLit#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see simpleal.ArithLit#getVal()
	 * @see #getArithLit()
	 * @generated
	 */
	EAttribute getArithLit_Val();

	/**
	 * Returns the meta object for class '{@link simpleal.ArithOp <em>Arith Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op</em>'.
	 * @see simpleal.ArithOp
	 * @generated
	 */
	EClass getArithOp();

	/**
	 * Returns the meta object for the containment reference '{@link simpleal.ArithOp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see simpleal.ArithOp#getLhs()
	 * @see #getArithOp()
	 * @generated
	 */
	EReference getArithOp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link simpleal.ArithOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see simpleal.ArithOp#getRhs()
	 * @see #getArithOp()
	 * @generated
	 */
	EReference getArithOp_Rhs();

	/**
	 * Returns the meta object for class '{@link simpleal.ArithPlus <em>Arith Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Plus</em>'.
	 * @see simpleal.ArithPlus
	 * @generated
	 */
	EClass getArithPlus();

	/**
	 * Returns the meta object for class '{@link simpleal.ArithMinus <em>Arith Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Minus</em>'.
	 * @see simpleal.ArithMinus
	 * @generated
	 */
	EClass getArithMinus();

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
	 * Returns the meta object for the attribute '{@link simpleal.Print#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleal.Print#getName()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_Name();

	/**
	 * Returns the meta object for class '{@link simpleal.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see simpleal.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the attribute '{@link simpleal.Assign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleal.Assign#getName()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Name();

	/**
	 * Returns the meta object for the containment reference '{@link simpleal.Assign#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val</em>'.
	 * @see simpleal.Assign#getVal()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Val();

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
		 * The meta object literal for the '{@link simpleal.impl.ArithImpl <em>Arith</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.ArithImpl
		 * @see simpleal.impl.SimplealPackageImpl#getArith()
		 * @generated
		 */
		EClass ARITH = eINSTANCE.getArith();

		/**
		 * The meta object literal for the '{@link simpleal.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.VarRefImpl
		 * @see simpleal.impl.SimplealPackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REF__NAME = eINSTANCE.getVarRef_Name();

		/**
		 * The meta object literal for the '{@link simpleal.impl.ArithLitImpl <em>Arith Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.ArithLitImpl
		 * @see simpleal.impl.SimplealPackageImpl#getArithLit()
		 * @generated
		 */
		EClass ARITH_LIT = eINSTANCE.getArithLit();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITH_LIT__VAL = eINSTANCE.getArithLit_Val();

		/**
		 * The meta object literal for the '{@link simpleal.impl.ArithOpImpl <em>Arith Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.ArithOpImpl
		 * @see simpleal.impl.SimplealPackageImpl#getArithOp()
		 * @generated
		 */
		EClass ARITH_OP = eINSTANCE.getArithOp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITH_OP__LHS = eINSTANCE.getArithOp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITH_OP__RHS = eINSTANCE.getArithOp_Rhs();

		/**
		 * The meta object literal for the '{@link simpleal.impl.ArithPlusImpl <em>Arith Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.ArithPlusImpl
		 * @see simpleal.impl.SimplealPackageImpl#getArithPlus()
		 * @generated
		 */
		EClass ARITH_PLUS = eINSTANCE.getArithPlus();

		/**
		 * The meta object literal for the '{@link simpleal.impl.ArithMinusImpl <em>Arith Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.ArithMinusImpl
		 * @see simpleal.impl.SimplealPackageImpl#getArithMinus()
		 * @generated
		 */
		EClass ARITH_MINUS = eINSTANCE.getArithMinus();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__NAME = eINSTANCE.getPrint_Name();

		/**
		 * The meta object literal for the '{@link simpleal.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleal.impl.AssignImpl
		 * @see simpleal.impl.SimplealPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__NAME = eINSTANCE.getAssign_Name();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__VAL = eINSTANCE.getAssign_Val();

	}

} //SimplealPackage
