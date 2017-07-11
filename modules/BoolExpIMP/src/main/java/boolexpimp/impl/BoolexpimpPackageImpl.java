/**
 */
package boolexpimp.impl;

import boolexp.BoolexpPackage;

import boolexpimp.BoolExpCondition;
import boolexpimp.BoolexpimpFactory;
import boolexpimp.BoolexpimpPackage;

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
public class BoolexpimpPackageImpl extends EPackageImpl implements BoolexpimpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolExpConditionEClass = null;

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
	 * @see boolexpimp.BoolexpimpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BoolexpimpPackageImpl() {
		super(eNS_URI, BoolexpimpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BoolexpimpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BoolexpimpPackage init() {
		if (isInited) return (BoolexpimpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpimpPackage.eNS_URI);

		// Obtain or create and register package
		BoolexpimpPackageImpl theBoolexpimpPackage = (BoolexpimpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BoolexpimpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BoolexpimpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BoolexpPackage.eINSTANCE.eClass();
		SimpleimpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBoolexpimpPackage.createPackageContents();

		// Initialize created meta-data
		theBoolexpimpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBoolexpimpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BoolexpimpPackage.eNS_URI, theBoolexpimpPackage);
		return theBoolexpimpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolExpCondition() {
		return boolExpConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolExpCondition_Exp() {
		return (EReference)boolExpConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolexpimpFactory getBoolexpimpFactory() {
		return (BoolexpimpFactory)getEFactoryInstance();
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
		boolExpConditionEClass = createEClass(BOOL_EXP_CONDITION);
		createEReference(boolExpConditionEClass, BOOL_EXP_CONDITION__EXP);
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
		BoolexpPackage theBoolexpPackage = (BoolexpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boolExpConditionEClass.getESuperTypes().add(theSimpleimpPackage.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(boolExpConditionEClass, BoolExpCondition.class, "BoolExpCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoolExpCondition_Exp(), theBoolexpPackage.getExp(), null, "exp", null, 1, 1, BoolExpCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BoolexpimpPackageImpl
