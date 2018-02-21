/**
 */
package fullfsm;

import basicfsm.BasicfsmPackage;

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
 * @see fullfsm.FullfsmFactory
 * @model kind="package"
 * @generated
 */
public interface FullfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fullfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fullfsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fullfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FullfsmPackage eINSTANCE = fullfsm.impl.FullfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fullfsm.impl.BindGuardImpl <em>Bind Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullfsm.impl.BindGuardImpl
	 * @see fullfsm.impl.FullfsmPackageImpl#getBindGuard()
	 * @generated
	 */
	int BIND_GUARD = 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_GUARD__BOUND = BasicfsmPackage.GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bind Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_GUARD_FEATURE_COUNT = BasicfsmPackage.GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bind Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_GUARD_OPERATION_COUNT = BasicfsmPackage.GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fullfsm.impl.BindActionImpl <em>Bind Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullfsm.impl.BindActionImpl
	 * @see fullfsm.impl.FullfsmPackageImpl#getBindAction()
	 * @generated
	 */
	int BIND_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION__BOUND = BasicfsmPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bind Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION_FEATURE_COUNT = BasicfsmPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bind Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION_OPERATION_COUNT = BasicfsmPackage.ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fullfsm.BindGuard <em>Bind Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind Guard</em>'.
	 * @see fullfsm.BindGuard
	 * @generated
	 */
	EClass getBindGuard();

	/**
	 * Returns the meta object for the containment reference '{@link fullfsm.BindGuard#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see fullfsm.BindGuard#getBound()
	 * @see #getBindGuard()
	 * @generated
	 */
	EReference getBindGuard_Bound();

	/**
	 * Returns the meta object for class '{@link fullfsm.BindAction <em>Bind Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind Action</em>'.
	 * @see fullfsm.BindAction
	 * @generated
	 */
	EClass getBindAction();

	/**
	 * Returns the meta object for the containment reference '{@link fullfsm.BindAction#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see fullfsm.BindAction#getBound()
	 * @see #getBindAction()
	 * @generated
	 */
	EReference getBindAction_Bound();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FullfsmFactory getFullfsmFactory();

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
		 * The meta object literal for the '{@link fullfsm.impl.BindGuardImpl <em>Bind Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullfsm.impl.BindGuardImpl
		 * @see fullfsm.impl.FullfsmPackageImpl#getBindGuard()
		 * @generated
		 */
		EClass BIND_GUARD = eINSTANCE.getBindGuard();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_GUARD__BOUND = eINSTANCE.getBindGuard_Bound();

		/**
		 * The meta object literal for the '{@link fullfsm.impl.BindActionImpl <em>Bind Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullfsm.impl.BindActionImpl
		 * @see fullfsm.impl.FullfsmPackageImpl#getBindAction()
		 * @generated
		 */
		EClass BIND_ACTION = eINSTANCE.getBindAction();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_ACTION__BOUND = eINSTANCE.getBindAction_Bound();

	}

} //FullfsmPackage
