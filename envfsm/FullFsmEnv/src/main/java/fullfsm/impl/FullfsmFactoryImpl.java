/**
 */
package fullfsm.impl;

import fullfsm.*;

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
public class FullfsmFactoryImpl extends EFactoryImpl implements FullfsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FullfsmFactory init() {
		try {
			FullfsmFactory theFullfsmFactory = (FullfsmFactory)EPackage.Registry.INSTANCE.getEFactory(FullfsmPackage.eNS_URI);
			if (theFullfsmFactory != null) {
				return theFullfsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FullfsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullfsmFactoryImpl() {
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
			case FullfsmPackage.BIND_GUARD: return createBindGuard();
			case FullfsmPackage.BIND_ACTION: return createBindAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindGuard createBindGuard() {
		BindGuardImpl bindGuard = new BindGuardImpl();
		return bindGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindAction createBindAction() {
		BindActionImpl bindAction = new BindActionImpl();
		return bindAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullfsmPackage getFullfsmPackage() {
		return (FullfsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FullfsmPackage getPackage() {
		return FullfsmPackage.eINSTANCE;
	}

} //FullfsmFactoryImpl
