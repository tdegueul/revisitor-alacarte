/**
 */
package fullfsm.impl;

import basicfsm.BasicfsmPackage;

import boolexp.BoolexpPackage;

import fullfsm.BindAction;
import fullfsm.BindGuard;
import fullfsm.FullfsmFactory;
import fullfsm.FullfsmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleal.SimplealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FullfsmPackageImpl extends EPackageImpl implements FullfsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindActionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fullfsm.FullfsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FullfsmPackageImpl() {
		super(eNS_URI, FullfsmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FullfsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FullfsmPackage init() {
		if (isInited) return (FullfsmPackage)EPackage.Registry.INSTANCE.getEPackage(FullfsmPackage.eNS_URI);

		// Obtain or create and register package
		FullfsmPackageImpl theFullfsmPackage = (FullfsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FullfsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FullfsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicfsmPackage.eINSTANCE.eClass();
		BoolexpPackage.eINSTANCE.eClass();
		SimplealPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFullfsmPackage.createPackageContents();

		// Initialize created meta-data
		theFullfsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFullfsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FullfsmPackage.eNS_URI, theFullfsmPackage);
		return theFullfsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindGuard() {
		return bindGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindGuard_Bound() {
		return (EReference)bindGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindAction() {
		return bindActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindAction_Bound() {
		return (EReference)bindActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullfsmFactory getFullfsmFactory() {
		return (FullfsmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bindGuardEClass = createEClass(BIND_GUARD);
		createEReference(bindGuardEClass, BIND_GUARD__BOUND);

		bindActionEClass = createEClass(BIND_ACTION);
		createEReference(bindActionEClass, BIND_ACTION__BOUND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicfsmPackage theBasicfsmPackage = (BasicfsmPackage)EPackage.Registry.INSTANCE.getEPackage(BasicfsmPackage.eNS_URI);
		BoolexpPackage theBoolexpPackage = (BoolexpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI);
		SimplealPackage theSimplealPackage = (SimplealPackage)EPackage.Registry.INSTANCE.getEPackage(SimplealPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bindGuardEClass.getESuperTypes().add(theBasicfsmPackage.getGuard());
		bindActionEClass.getESuperTypes().add(theBasicfsmPackage.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(bindGuardEClass, BindGuard.class, "BindGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindGuard_Bound(), theBoolexpPackage.getExp(), null, "bound", null, 0, 1, BindGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindActionEClass, BindAction.class, "BindAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindAction_Bound(), theSimplealPackage.getBlock(), null, "bound", null, 0, 1, BindAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FullfsmPackageImpl
