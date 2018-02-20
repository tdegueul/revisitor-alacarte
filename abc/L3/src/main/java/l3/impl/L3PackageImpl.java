/**
 */
package l3.impl;

import l1.L1Package;

import l2.L2Package;

import l3.BindB;
import l3.L3Factory;
import l3.L3Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class L3PackageImpl extends EPackageImpl implements L3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindBEClass = null;

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
	 * @see l3.L3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private L3PackageImpl() {
		super(eNS_URI, L3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link L3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static L3Package init() {
		if (isInited) return (L3Package)EPackage.Registry.INSTANCE.getEPackage(L3Package.eNS_URI);

		// Obtain or create and register package
		L3PackageImpl theL3Package = (L3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof L3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new L3PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		L1Package.eINSTANCE.eClass();
		L2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theL3Package.createPackageContents();

		// Initialize created meta-data
		theL3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theL3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(L3Package.eNS_URI, theL3Package);
		return theL3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindB() {
		return bindBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindB_Delegate() {
		return (EReference)bindBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L3Factory getL3Factory() {
		return (L3Factory)getEFactoryInstance();
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
		bindBEClass = createEClass(BIND_B);
		createEReference(bindBEClass, BIND_B__DELEGATE);
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
		L1Package theL1Package = (L1Package)EPackage.Registry.INSTANCE.getEPackage(L1Package.eNS_URI);
		L2Package theL2Package = (L2Package)EPackage.Registry.INSTANCE.getEPackage(L2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bindBEClass.getESuperTypes().add(theL1Package.getB());

		// Initialize classes, features, and operations; add parameters
		initEClass(bindBEClass, BindB.class, "BindB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindB_Delegate(), theL2Package.getC(), null, "delegate", null, 0, 1, BindB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //L3PackageImpl
