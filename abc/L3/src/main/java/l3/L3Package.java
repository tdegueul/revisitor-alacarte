/**
 */
package l3;

import l1.L1Package;

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
 * @see l3.L3Factory
 * @model kind="package"
 * @generated
 */
public interface L3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "l3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://l3/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "l3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	L3Package eINSTANCE = l3.impl.L3PackageImpl.init();

	/**
	 * The meta object id for the '{@link l3.impl.BindBImpl <em>Bind B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3.impl.BindBImpl
	 * @see l3.impl.L3PackageImpl#getBindB()
	 * @generated
	 */
	int BIND_B = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_B__DELEGATE = L1Package.B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bind B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_B_FEATURE_COUNT = L1Package.B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bind B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_B_OPERATION_COUNT = L1Package.B_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link l3.BindB <em>Bind B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind B</em>'.
	 * @see l3.BindB
	 * @generated
	 */
	EClass getBindB();

	/**
	 * Returns the meta object for the containment reference '{@link l3.BindB#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see l3.BindB#getDelegate()
	 * @see #getBindB()
	 * @generated
	 */
	EReference getBindB_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	L3Factory getL3Factory();

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
		 * The meta object literal for the '{@link l3.impl.BindBImpl <em>Bind B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3.impl.BindBImpl
		 * @see l3.impl.L3PackageImpl#getBindB()
		 * @generated
		 */
		EClass BIND_B = eINSTANCE.getBindB();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_B__DELEGATE = eINSTANCE.getBindB_Delegate();

	}

} //L3Package
