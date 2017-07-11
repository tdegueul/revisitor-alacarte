/**
 */
package boolexpimp.impl;

import boolexpimp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolexpimpFactoryImpl extends EFactoryImpl implements BoolexpimpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BoolexpimpFactory init() {
		try {
			BoolexpimpFactory theBoolexpimpFactory = (BoolexpimpFactory)EPackage.Registry.INSTANCE.getEFactory(BoolexpimpPackage.eNS_URI);
			if (theBoolexpimpFactory != null) {
				return theBoolexpimpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BoolexpimpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolexpimpFactoryImpl() {
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
			case BoolexpimpPackage.BOOL_EXP_CONDITION: return createBoolExpCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExpCondition createBoolExpCondition() {
		BoolExpConditionImpl boolExpCondition = new BoolExpConditionImpl();
		return boolExpCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolexpimpPackage getBoolexpimpPackage() {
		return (BoolexpimpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BoolexpimpPackage getPackage() {
		return BoolexpimpPackage.eINSTANCE;
	}

} //BoolexpimpFactoryImpl
