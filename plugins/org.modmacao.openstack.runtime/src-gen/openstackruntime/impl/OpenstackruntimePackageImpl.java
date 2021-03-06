/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package openstackruntime.impl;

import openstackruntime.Flavor;
import openstackruntime.Floatingip;
import openstackruntime.Image;
import openstackruntime.OpenstackruntimeFactory;
import openstackruntime.OpenstackruntimePackage;
import openstackruntime.Runtimeid;

import openstackruntime.util.OpenstackruntimeValidator;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenstackruntimePackageImpl extends EPackageImpl implements OpenstackruntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flavorEClass = null;

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
	 * @see openstackruntime.OpenstackruntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenstackruntimePackageImpl() {
		super(eNS_URI, OpenstackruntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenstackruntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenstackruntimePackage init() {
		if (isInited) return (OpenstackruntimePackage)EPackage.Registry.INSTANCE.getEPackage(OpenstackruntimePackage.eNS_URI);

		// Obtain or create and register package
		OpenstackruntimePackageImpl theOpenstackruntimePackage = (OpenstackruntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpenstackruntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpenstackruntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenstackruntimePackage.createPackageContents();

		// Initialize created meta-data
		theOpenstackruntimePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOpenstackruntimePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OpenstackruntimeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOpenstackruntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenstackruntimePackage.eNS_URI, theOpenstackruntimePackage);
		return theOpenstackruntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeid() {
		return runtimeidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeid_OpenstackRuntimeId() {
		return (EAttribute)runtimeidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingip() {
		return floatingipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingip_OpenstackFloatingipAddress() {
		return (EAttribute)floatingipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingip_OpenstackFloatingipPool() {
		return (EAttribute)floatingipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_OpenstackImageId() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlavor() {
		return flavorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_OpenstackFlavorId() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackruntimeFactory getOpenstackruntimeFactory() {
		return (OpenstackruntimeFactory)getEFactoryInstance();
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
		runtimeidEClass = createEClass(RUNTIMEID);
		createEAttribute(runtimeidEClass, RUNTIMEID__OPENSTACK_RUNTIME_ID);

		floatingipEClass = createEClass(FLOATINGIP);
		createEAttribute(floatingipEClass, FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS);
		createEAttribute(floatingipEClass, FLOATINGIP__OPENSTACK_FLOATINGIP_POOL);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__OPENSTACK_IMAGE_ID);

		flavorEClass = createEClass(FLAVOR);
		createEAttribute(flavorEClass, FLAVOR__OPENSTACK_FLAVOR_ID);
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
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeidEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		floatingipEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		imageEClass.getESuperTypes().add(theInfrastructurePackage.getOs_tpl());
		imageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		flavorEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		flavorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(runtimeidEClass, Runtimeid.class, "Runtimeid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeid_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", null, 0, 1, Runtimeid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingipEClass, Floatingip.class, "Floatingip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingip_OpenstackFloatingipAddress(), theOCCIPackage.getString(), "openstackFloatingipAddress", null, 0, 1, Floatingip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatingip_OpenstackFloatingipPool(), theOCCIPackage.getString(), "openstackFloatingipPool", null, 0, 1, Floatingip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_OpenstackImageId(), theOCCIPackage.getString(), "openstackImageId", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flavorEClass, Flavor.class, "Flavor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlavor_OpenstackFlavorId(), theOCCIPackage.getString(), "openstackFlavorId", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (runtimeidEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (floatingipEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (flavorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "occi", "http://schemas.ogf.org/occi/core/ecore",
			 "infrastructure", "http://schemas.ogf.org/occi/infrastructure/ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (runtimeidEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(infrastructure::Network) or self.entity.oclIsKindOf(infrastructure::Compute) or self.entity.oclIsKindOf(infrastructure::Storage) or self.entity.oclIsKindOf(infrastructure::Storagelink) or self.entity.oclIsKindOf(infrastructure::Networkinterface)"
		   });	
		addAnnotation
		  (floatingipEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (flavorEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(infrastructure::Compute)"
		   });
	}

} //OpenstackruntimePackageImpl
