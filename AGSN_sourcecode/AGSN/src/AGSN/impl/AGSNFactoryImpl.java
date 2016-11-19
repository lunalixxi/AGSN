/**
 */
package AGSN.impl;

import AGSN.*;

import java.lang.Integer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class AGSNFactoryImpl extends EFactoryImpl implements AGSNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static AGSNFactory init() {
		try {
			AGSNFactory theAGSNFactory = (AGSNFactory)EPackage.Registry.INSTANCE.getEFactory(AGSNPackage.eNS_URI);
			if (theAGSNFactory != null) {
				return theAGSNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AGSNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public AGSNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AGSNPackage.SAFETY_CASE: return createSafetyCase();
			case AGSNPackage.GOAL: return createGoal();
			case AGSNPackage.STRATEGY: return createStrategy();
			case AGSNPackage.EVIDENCE: return createEvidence();
			case AGSNPackage.CONTEXT: return createContext();
			case AGSNPackage.JUSTIFICATION: return createJustification();
			case AGSNPackage.ASSUMPTION: return createAssumption();
			case AGSNPackage.IN_CONTEXT_OF: return createInContextOf();
			case AGSNPackage.SUPPORTED_BY: return createSupportedBy();
			case AGSNPackage.RECOMMENDATION: return createRecommendation();
			case AGSNPackage.STRENGTH: return createStrength();
			case AGSNPackage.REQUIRED_ACTION: return createRequiredAction();
			case AGSNPackage.WEAKNESS: return createWeakness();
			case AGSNPackage.QUESTION: return createQuestion();
			case AGSNPackage.ADDITIONAL_ELEMENT: return createAdditionalElement();
			case AGSNPackage.ADDITIONAL_LINK: return createAdditionalLink();
			case AGSNPackage.MODULE_ELEMENT: return createModuleElement();
			case AGSNPackage.MODULE: return createModule();
			case AGSNPackage.CONTRACT: return createContract();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AGSNPackage.ASSESS_STATUS:
				return createAssessStatusFromString(eDataType, initialValue);
			case AGSNPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case AGSNPackage.BELIEF_DEGREE:
				return createbeliefDegreeFromString(eDataType, initialValue);
			case AGSNPackage.PERCENTAGE:
				return createpercentageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AGSNPackage.ASSESS_STATUS:
				return convertAssessStatusToString(eDataType, instanceValue);
			case AGSNPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case AGSNPackage.BELIEF_DEGREE:
				return convertbeliefDegreeToString(eDataType, instanceValue);
			case AGSNPackage.PERCENTAGE:
				return convertpercentageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyCase createSafetyCase() {
		SafetyCaseImpl safetyCase = new SafetyCaseImpl();
		return safetyCase;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InContextOf createInContextOf() {
		InContextOfImpl inContextOf = new InContextOfImpl();
		return inContextOf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedBy createSupportedBy() {
		SupportedByImpl supportedBy = new SupportedByImpl();
		return supportedBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Recommendation createRecommendation() {
		RecommendationImpl recommendation = new RecommendationImpl();
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Strength createStrength() {
		StrengthImpl strength = new StrengthImpl();
		return strength;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredAction createRequiredAction() {
		RequiredActionImpl requiredAction = new RequiredActionImpl();
		return requiredAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Weakness createWeakness() {
		WeaknessImpl weakness = new WeaknessImpl();
		return weakness;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalElement createAdditionalElement() {
		AdditionalElementImpl additionalElement = new AdditionalElementImpl();
		return additionalElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalLink createAdditionalLink() {
		AdditionalLinkImpl additionalLink = new AdditionalLinkImpl();
		return additionalLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleElement createModuleElement() {
		ModuleElementImpl moduleElement = new ModuleElementImpl();
		return moduleElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssessStatus createAssessStatusFromString(EDataType eDataType, String initialValue) {
		AssessStatus result = AssessStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssessStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public double[] createbeliefDegreeFromString(EDataType eDataType, String initialValue) {
		double[] beliefDegree = new double[5];
		if (initialValue != null) {
			initialValue = initialValue.replace("{", "");
			initialValue = initialValue.replace("}", "");
			initialValue = initialValue.replace("(", "");
			initialValue = initialValue.replace(")", "");
			String[] result = initialValue.split(",");
			for (int i = 0; i < 5; i++) {
				beliefDegree[i] = Double.parseDouble(result[2*i+1]);
			}
		}
		return beliefDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertbeliefDegreeToString(EDataType eDataType, Object instanceValue) {
		double[] beliefDegree = (double[]) instanceValue;
		if (beliefDegree != null) {
			String result = "{";
			result += "(" + "Very Low, " + beliefDegree[0] + "), ";
			result += "(" + "Low, " + beliefDegree[1] + "), ";
			result += "(" + "Medium, " + beliefDegree[2] + "), ";
			result += "(" + "High, " + beliefDegree[3] + "), ";
			result += "(" + "Very High, " + beliefDegree[4] + ")";
			result += "}";
			return result;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createpercentageFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpercentageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AGSNPackage getAGSNPackage() {
		return (AGSNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AGSNPackage getPackage() {
		return AGSNPackage.eINSTANCE;
	}

} // AGSNFactoryImpl
