/**
 */
package sleepstatement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleimp.SimpleimpPackage;

import sleepstatement.Sleep;
import sleepstatement.SleepstatementFactory;
import sleepstatement.SleepstatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SleepstatementPackageImpl extends EPackageImpl implements SleepstatementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sleepEClass = null;

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
	 * @see sleepstatement.SleepstatementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SleepstatementPackageImpl() {
		super(eNS_URI, SleepstatementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SleepstatementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SleepstatementPackage init() {
		if (isInited) return (SleepstatementPackage)EPackage.Registry.INSTANCE.getEPackage(SleepstatementPackage.eNS_URI);

		// Obtain or create and register package
		SleepstatementPackageImpl theSleepstatementPackage = (SleepstatementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SleepstatementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SleepstatementPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimpleimpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSleepstatementPackage.createPackageContents();

		// Initialize created meta-data
		theSleepstatementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSleepstatementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SleepstatementPackage.eNS_URI, theSleepstatementPackage);
		return theSleepstatementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSleep() {
		return sleepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSleep_Duration() {
		return (EAttribute)sleepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SleepstatementFactory getSleepstatementFactory() {
		return (SleepstatementFactory)getEFactoryInstance();
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
		sleepEClass = createEClass(SLEEP);
		createEAttribute(sleepEClass, SLEEP__DURATION);
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
		SimpleimpPackage theSimpleimpPackage = (SimpleimpPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleimpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sleepEClass.getESuperTypes().add(theSimpleimpPackage.getStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(sleepEClass, Sleep.class, "Sleep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSleep_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, Sleep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SleepstatementPackageImpl
