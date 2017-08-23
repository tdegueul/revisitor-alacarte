/**
 */
package augmentedfsm.impl;

import augmentedfsm.AugmentedfsmFactory;
import augmentedfsm.AugmentedfsmPackage;
import augmentedfsm.ExecutableState;
import augmentedfsm.GuardedTransition;

import boolexp.BoolexpPackage;

import fsm.FsmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleimp.SimpleimpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AugmentedfsmPackageImpl extends EPackageImpl implements AugmentedfsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardedTransitionEClass = null;

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
	 * @see augmentedfsm.AugmentedfsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AugmentedfsmPackageImpl() {
		super(eNS_URI, AugmentedfsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AugmentedfsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AugmentedfsmPackage init() {
		if (isInited) return (AugmentedfsmPackage)EPackage.Registry.INSTANCE.getEPackage(AugmentedfsmPackage.eNS_URI);

		// Obtain or create and register package
		AugmentedfsmPackageImpl theAugmentedfsmPackage = (AugmentedfsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AugmentedfsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AugmentedfsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BoolexpPackage.eINSTANCE.eClass();
		FsmPackage.eINSTANCE.eClass();
		SimpleimpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAugmentedfsmPackage.createPackageContents();

		// Initialize created meta-data
		theAugmentedfsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAugmentedfsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AugmentedfsmPackage.eNS_URI, theAugmentedfsmPackage);
		return theAugmentedfsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableState() {
		return executableStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableState_Body() {
		return (EReference)executableStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardedTransition() {
		return guardedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardedTransition_Guard() {
		return (EReference)guardedTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AugmentedfsmFactory getAugmentedfsmFactory() {
		return (AugmentedfsmFactory)getEFactoryInstance();
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
		executableStateEClass = createEClass(EXECUTABLE_STATE);
		createEReference(executableStateEClass, EXECUTABLE_STATE__BODY);

		guardedTransitionEClass = createEClass(GUARDED_TRANSITION);
		createEReference(guardedTransitionEClass, GUARDED_TRANSITION__GUARD);
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
		FsmPackage theFsmPackage = (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);
		SimpleimpPackage theSimpleimpPackage = (SimpleimpPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleimpPackage.eNS_URI);
		BoolexpPackage theBoolexpPackage = (BoolexpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		executableStateEClass.getESuperTypes().add(theFsmPackage.getState());
		guardedTransitionEClass.getESuperTypes().add(theFsmPackage.getTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(executableStateEClass, ExecutableState.class, "ExecutableState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableState_Body(), theSimpleimpPackage.getBlock(), null, "body", null, 0, 1, ExecutableState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardedTransitionEClass, GuardedTransition.class, "GuardedTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardedTransition_Guard(), theBoolexpPackage.getExp(), null, "guard", null, 0, 1, GuardedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AugmentedfsmPackageImpl
