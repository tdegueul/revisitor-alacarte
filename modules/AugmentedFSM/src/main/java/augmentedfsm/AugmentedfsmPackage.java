/**
 */
package augmentedfsm;

import fsm.FsmPackage;

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
 * @see augmentedfsm.AugmentedfsmFactory
 * @model kind="package"
 * @generated
 */
public interface AugmentedfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "augmentedfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://augmentedfsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "augmentedfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AugmentedfsmPackage eINSTANCE = augmentedfsm.impl.AugmentedfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link augmentedfsm.impl.ExecutableStateImpl <em>Executable State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see augmentedfsm.impl.ExecutableStateImpl
	 * @see augmentedfsm.impl.AugmentedfsmPackageImpl#getExecutableState()
	 * @generated
	 */
	int EXECUTABLE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_STATE__NAME = FsmPackage.STATE__NAME;

	/**
	 * The feature id for the '<em><b>Owning</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_STATE__OWNING = FsmPackage.STATE__OWNING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_STATE__INCOMING = FsmPackage.STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_STATE__OUTGOING = FsmPackage.STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_STATE__BODY = FsmPackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_STATE_FEATURE_COUNT = FsmPackage.STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Executable State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_STATE_OPERATION_COUNT = FsmPackage.STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link augmentedfsm.impl.GuardedTransitionImpl <em>Guarded Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see augmentedfsm.impl.GuardedTransitionImpl
	 * @see augmentedfsm.impl.AugmentedfsmPackageImpl#getGuardedTransition()
	 * @generated
	 */
	int GUARDED_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__EVENT = FsmPackage.TRANSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Owning</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__OWNING = FsmPackage.TRANSITION__OWNING;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__SOURCE = FsmPackage.TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__TARGET = FsmPackage.TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__GUARD = FsmPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION_FEATURE_COUNT = FsmPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guarded Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION_OPERATION_COUNT = FsmPackage.TRANSITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link augmentedfsm.ExecutableState <em>Executable State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable State</em>'.
	 * @see augmentedfsm.ExecutableState
	 * @generated
	 */
	EClass getExecutableState();

	/**
	 * Returns the meta object for the containment reference '{@link augmentedfsm.ExecutableState#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see augmentedfsm.ExecutableState#getBody()
	 * @see #getExecutableState()
	 * @generated
	 */
	EReference getExecutableState_Body();

	/**
	 * Returns the meta object for class '{@link augmentedfsm.GuardedTransition <em>Guarded Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Transition</em>'.
	 * @see augmentedfsm.GuardedTransition
	 * @generated
	 */
	EClass getGuardedTransition();

	/**
	 * Returns the meta object for the containment reference '{@link augmentedfsm.GuardedTransition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see augmentedfsm.GuardedTransition#getGuard()
	 * @see #getGuardedTransition()
	 * @generated
	 */
	EReference getGuardedTransition_Guard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AugmentedfsmFactory getAugmentedfsmFactory();

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
		 * The meta object literal for the '{@link augmentedfsm.impl.ExecutableStateImpl <em>Executable State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see augmentedfsm.impl.ExecutableStateImpl
		 * @see augmentedfsm.impl.AugmentedfsmPackageImpl#getExecutableState()
		 * @generated
		 */
		EClass EXECUTABLE_STATE = eINSTANCE.getExecutableState();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_STATE__BODY = eINSTANCE.getExecutableState_Body();

		/**
		 * The meta object literal for the '{@link augmentedfsm.impl.GuardedTransitionImpl <em>Guarded Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see augmentedfsm.impl.GuardedTransitionImpl
		 * @see augmentedfsm.impl.AugmentedfsmPackageImpl#getGuardedTransition()
		 * @generated
		 */
		EClass GUARDED_TRANSITION = eINSTANCE.getGuardedTransition();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARDED_TRANSITION__GUARD = eINSTANCE.getGuardedTransition_Guard();

	}

} //AugmentedfsmPackage
