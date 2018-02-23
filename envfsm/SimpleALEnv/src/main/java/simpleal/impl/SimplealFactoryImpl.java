/**
 */
package simpleal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplealFactoryImpl extends EFactoryImpl implements SimplealFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplealFactory init() {
		try {
			SimplealFactory theSimplealFactory = (SimplealFactory)EPackage.Registry.INSTANCE.getEFactory(SimplealPackage.eNS_URI);
			if (theSimplealFactory != null) {
				return theSimplealFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplealFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplealFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplealPackage.BLOCK: return createBlock();
			case SimplealPackage.VAR_REF: return createVarRef();
			case SimplealPackage.ARITH_LIT: return createArithLit();
			case SimplealPackage.ARITH_PLUS: return createArithPlus();
			case SimplealPackage.ARITH_MINUS: return createArithMinus();
			case SimplealPackage.PRINT: return createPrint();
			case SimplealPackage.ASSIGN: return createAssign();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarRef createVarRef() {
		VarRefImpl varRef = new VarRefImpl();
		return varRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithLit createArithLit() {
		ArithLitImpl arithLit = new ArithLitImpl();
		return arithLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithPlus createArithPlus() {
		ArithPlusImpl arithPlus = new ArithPlusImpl();
		return arithPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithMinus createArithMinus() {
		ArithMinusImpl arithMinus = new ArithMinusImpl();
		return arithMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplealPackage getSimplealPackage() {
		return (SimplealPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplealPackage getPackage() {
		return SimplealPackage.eINSTANCE;
	}

} //SimplealFactoryImpl
