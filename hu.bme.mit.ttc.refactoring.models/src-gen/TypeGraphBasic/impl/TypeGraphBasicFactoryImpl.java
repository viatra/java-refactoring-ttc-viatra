/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.*;

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
public class TypeGraphBasicFactoryImpl extends EFactoryImpl implements TypeGraphBasicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeGraphBasicFactory init() {
		try {
			TypeGraphBasicFactory theTypeGraphBasicFactory = (TypeGraphBasicFactory)EPackage.Registry.INSTANCE.getEFactory(TypeGraphBasicPackage.eNS_URI);
			if (theTypeGraphBasicFactory != null) {
				return theTypeGraphBasicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeGraphBasicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphBasicFactoryImpl() {
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
			case TypeGraphBasicPackage.TCLASS: return createTClass();
			case TypeGraphBasicPackage.TFIELD: return createTField();
			case TypeGraphBasicPackage.TFIELD_DEFINITION: return createTFieldDefinition();
			case TypeGraphBasicPackage.TFIELD_SIGNATURE: return createTFieldSignature();
			case TypeGraphBasicPackage.TMETHOD: return createTMethod();
			case TypeGraphBasicPackage.TMETHOD_DEFINITION: return createTMethodDefinition();
			case TypeGraphBasicPackage.TMETHOD_SIGNATURE: return createTMethodSignature();
			case TypeGraphBasicPackage.TPACKAGE: return createTPackage();
			case TypeGraphBasicPackage.TYPE_GRAPH: return createTypeGraph();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass createTClass() {
		TClassImpl tClass = new TClassImpl();
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TField createTField() {
		TFieldImpl tField = new TFieldImpl();
		return tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition createTFieldDefinition() {
		TFieldDefinitionImpl tFieldDefinition = new TFieldDefinitionImpl();
		return tFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature createTFieldSignature() {
		TFieldSignatureImpl tFieldSignature = new TFieldSignatureImpl();
		return tFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod createTMethod() {
		TMethodImpl tMethod = new TMethodImpl();
		return tMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition createTMethodDefinition() {
		TMethodDefinitionImpl tMethodDefinition = new TMethodDefinitionImpl();
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature createTMethodSignature() {
		TMethodSignatureImpl tMethodSignature = new TMethodSignatureImpl();
		return tMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage createTPackage() {
		TPackageImpl tPackage = new TPackageImpl();
		return tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph createTypeGraph() {
		TypeGraphImpl typeGraph = new TypeGraphImpl();
		return typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphBasicPackage getTypeGraphBasicPackage() {
		return (TypeGraphBasicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypeGraphBasicPackage getPackage() {
		return TypeGraphBasicPackage.eINSTANCE;
	}

} //TypeGraphBasicFactoryImpl
