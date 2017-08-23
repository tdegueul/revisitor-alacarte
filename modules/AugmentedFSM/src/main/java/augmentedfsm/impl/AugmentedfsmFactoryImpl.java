/**
 */
package augmentedfsm.impl;

import augmentedfsm.*;

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
public class AugmentedfsmFactoryImpl extends EFactoryImpl implements AugmentedfsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AugmentedfsmFactory init() {
		try {
			AugmentedfsmFactory theAugmentedfsmFactory = (AugmentedfsmFactory)EPackage.Registry.INSTANCE.getEFactory(AugmentedfsmPackage.eNS_URI);
			if (theAugmentedfsmFactory != null) {
				return theAugmentedfsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AugmentedfsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AugmentedfsmFactoryImpl() {
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
			case AugmentedfsmPackage.EXECUTABLE_STATE: return createExecutableState();
			case AugmentedfsmPackage.GUARDED_TRANSITION: return createGuardedTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableState createExecutableState() {
		ExecutableStateImpl executableState = new ExecutableStateImpl();
		return executableState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedTransition createGuardedTransition() {
		GuardedTransitionImpl guardedTransition = new GuardedTransitionImpl();
		return guardedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AugmentedfsmPackage getAugmentedfsmPackage() {
		return (AugmentedfsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AugmentedfsmPackage getPackage() {
		return AugmentedfsmPackage.eINSTANCE;
	}

} //AugmentedfsmFactoryImpl
