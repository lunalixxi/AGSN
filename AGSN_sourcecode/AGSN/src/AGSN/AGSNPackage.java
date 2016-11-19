/**
 */
package AGSN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see AGSN.AGSNFactory
 * @model kind="package"
 * @generated
 */
public interface AGSNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AGSN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AGSN";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AGSN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AGSNPackage eINSTANCE = AGSN.impl.AGSNPackageImpl.init();

	/**
	 * The meta object id for the '{@link AGSN.impl.SafetyCaseImpl <em>Safety Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.SafetyCaseImpl
	 * @see AGSN.impl.AGSNPackageImpl#getSafetyCase()
	 * @generated
	 */
	int SAFETY_CASE = 0;

	/**
	 * The feature id for the '<em><b>Root Basic Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__ROOT_BASIC_NODE = 0;

	/**
	 * The feature id for the '<em><b>Root Basic Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__ROOT_BASIC_LINK = 1;

	/**
	 * The feature id for the '<em><b>Root Commendation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__ROOT_COMMENDATION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__ID = 4;

	/**
	 * The number of structural features of the '<em>Safety Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link AGSN.impl.BasicNodeImpl <em>Basic Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.BasicNodeImpl
	 * @see AGSN.impl.AGSNPackageImpl#getBasicNode()
	 * @generated
	 */
	int BASIC_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__ASSESSSTATUS = 2;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__HAS_COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__QUALITY_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__CONFIDENCE_PERCENTAGE = 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__WEIGHT = 7;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__BELIEF_DEGREE = 8;

	/**
	 * The number of structural features of the '<em>Basic Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link AGSN.impl.BasicLinkImpl <em>Basic Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.BasicLinkImpl
	 * @see AGSN.impl.AGSNPackageImpl#getBasicLink()
	 * @generated
	 */
	int BASIC_LINK = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK__ID = 2;

	/**
	 * The number of structural features of the '<em>Basic Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link AGSN.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.GoalImpl
	 * @see AGSN.impl.AGSNPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UNDEVELOPED = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AGSN.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.StrategyImpl
	 * @see AGSN.impl.AGSNPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__UNDEVELOPED = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AGSN.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.EvidenceImpl
	 * @see AGSN.impl.AGSNPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ATTACHMENT = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AGSN.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.ContextImpl
	 * @see AGSN.impl.AGSNPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.JustificationImpl
	 * @see AGSN.impl.AGSNPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.AssumptionImpl
	 * @see AGSN.impl.AGSNPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.InContextOfImpl
	 * @see AGSN.impl.AGSNPackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__SOURCE = BASIC_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__TARGET = BASIC_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__ID = BASIC_LINK__ID;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = BASIC_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.SupportedByImpl
	 * @see AGSN.impl.AGSNPackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__SOURCE = BASIC_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TARGET = BASIC_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ID = BASIC_LINK__ID;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = BASIC_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.RecommendationImpl <em>Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.RecommendationImpl
	 * @see AGSN.impl.AGSNPackageImpl#getRecommendation()
	 * @generated
	 */
	int RECOMMENDATION = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link AGSN.impl.StrengthImpl <em>Strength</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.StrengthImpl
	 * @see AGSN.impl.AGSNPackageImpl#getStrength()
	 * @generated
	 */
	int STRENGTH = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__ID = RECOMMENDATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__NAME = RECOMMENDATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__DESCRIPTION = RECOMMENDATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Strength</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH_FEATURE_COUNT = RECOMMENDATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.RequiredActionImpl <em>Required Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.RequiredActionImpl
	 * @see AGSN.impl.AGSNPackageImpl#getRequiredAction()
	 * @generated
	 */
	int REQUIRED_ACTION = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ACTION__ID = RECOMMENDATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ACTION__NAME = RECOMMENDATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ACTION__DESCRIPTION = RECOMMENDATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Required Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ACTION_FEATURE_COUNT = RECOMMENDATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.WeaknessImpl <em>Weakness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.WeaknessImpl
	 * @see AGSN.impl.AGSNPackageImpl#getWeakness()
	 * @generated
	 */
	int WEAKNESS = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__ID = RECOMMENDATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__NAME = RECOMMENDATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__DESCRIPTION = RECOMMENDATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Weakness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_FEATURE_COUNT = RECOMMENDATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.QuestionImpl
	 * @see AGSN.impl.AGSNPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = RECOMMENDATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = RECOMMENDATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DESCRIPTION = RECOMMENDATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = RECOMMENDATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.AdditionalElementImpl <em>Additional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.AdditionalElementImpl
	 * @see AGSN.impl.AGSNPackageImpl#getAdditionalElement()
	 * @generated
	 */
	int ADDITIONAL_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT__ATTACHMENT = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Additional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ELEMENT_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AGSN.impl.AdditionalLinkImpl <em>Additional Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.AdditionalLinkImpl
	 * @see AGSN.impl.AGSNPackageImpl#getAdditionalLink()
	 * @generated
	 */
	int ADDITIONAL_LINK = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LINK__SOURCE = BASIC_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LINK__TARGET = BASIC_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LINK__ID = BASIC_LINK__ID;

	/**
	 * The number of structural features of the '<em>Additional Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LINK_FEATURE_COUNT = BASIC_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.ModuleElementImpl <em>Module Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.ModuleElementImpl
	 * @see AGSN.impl.AGSNPackageImpl#getModuleElement()
	 * @generated
	 */
	int MODULE_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__NAME = BASIC_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__ASSESSSTATUS = BASIC_NODE__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__HAS_COMMENT = BASIC_NODE__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__DESCRIPTION = BASIC_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__QUALITY_LEVEL = BASIC_NODE__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__CONFIDENCE_PERCENTAGE = BASIC_NODE__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__WEIGHT = BASIC_NODE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__BELIEF_DEGREE = BASIC_NODE__BELIEF_DEGREE;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__ATTACHMENT = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AGSN.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.ModuleImpl
	 * @see AGSN.impl.AGSNPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = MODULE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = MODULE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ASSESSSTATUS = MODULE_ELEMENT__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HAS_COMMENT = MODULE_ELEMENT__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = MODULE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__QUALITY_LEVEL = MODULE_ELEMENT__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONFIDENCE_PERCENTAGE = MODULE_ELEMENT__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__WEIGHT = MODULE_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__BELIEF_DEGREE = MODULE_ELEMENT__BELIEF_DEGREE;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ATTACHMENT = MODULE_ELEMENT__ATTACHMENT;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = MODULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.ContractImpl
	 * @see AGSN.impl.AGSNPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ID = MODULE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = MODULE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Assessstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ASSESSSTATUS = MODULE_ELEMENT__ASSESSSTATUS;

	/**
	 * The feature id for the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__HAS_COMMENT = MODULE_ELEMENT__HAS_COMMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DESCRIPTION = MODULE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__QUALITY_LEVEL = MODULE_ELEMENT__QUALITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CONFIDENCE_PERCENTAGE = MODULE_ELEMENT__CONFIDENCE_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__WEIGHT = MODULE_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__BELIEF_DEGREE = MODULE_ELEMENT__BELIEF_DEGREE;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ATTACHMENT = MODULE_ELEMENT__ATTACHMENT;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = MODULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AGSN.AssessStatus <em>Assess Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.AssessStatus
	 * @see AGSN.impl.AGSNPackageImpl#getAssessStatus()
	 * @generated
	 */
	int ASSESS_STATUS = 21;

	/**
	 * The meta object id for the '{@link AGSN.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.Level
	 * @see AGSN.impl.AGSNPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 22;


	/**
	 * The meta object id for the '<em>belief Degree</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AGSN.impl.AGSNPackageImpl#getbeliefDegree()
	 * @generated
	 */
	int BELIEF_DEGREE = 23;


	/**
	 * The meta object id for the '<em>percentage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see AGSN.impl.AGSNPackageImpl#getpercentage()
	 * @generated
	 */
	int PERCENTAGE = 24;


	/**
	 * Returns the meta object for class '{@link AGSN.SafetyCase <em>Safety Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Case</em>'.
	 * @see AGSN.SafetyCase
	 * @generated
	 */
	EClass getSafetyCase();

	/**
	 * Returns the meta object for the containment reference list '{@link AGSN.SafetyCase#getRootBasicNode <em>Root Basic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Basic Node</em>'.
	 * @see AGSN.SafetyCase#getRootBasicNode()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_RootBasicNode();

	/**
	 * Returns the meta object for the containment reference list '{@link AGSN.SafetyCase#getRootBasicLink <em>Root Basic Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Basic Link</em>'.
	 * @see AGSN.SafetyCase#getRootBasicLink()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_RootBasicLink();

	/**
	 * Returns the meta object for the containment reference list '{@link AGSN.SafetyCase#getRootCommendation <em>Root Commendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Commendation</em>'.
	 * @see AGSN.SafetyCase#getRootCommendation()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_RootCommendation();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.SafetyCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see AGSN.SafetyCase#getDescription()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EAttribute getSafetyCase_Description();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.SafetyCase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AGSN.SafetyCase#getId()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EAttribute getSafetyCase_Id();

	/**
	 * Returns the meta object for class '{@link AGSN.BasicNode <em>Basic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Node</em>'.
	 * @see AGSN.BasicNode
	 * @generated
	 */
	EClass getBasicNode();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AGSN.BasicNode#getId()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AGSN.BasicNode#getName()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getAssessstatus <em>Assessstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessstatus</em>'.
	 * @see AGSN.BasicNode#getAssessstatus()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_Assessstatus();

	/**
	 * Returns the meta object for the reference '{@link AGSN.BasicNode#getHasComment <em>Has Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Comment</em>'.
	 * @see AGSN.BasicNode#getHasComment()
	 * @see #getBasicNode()
	 * @generated
	 */
	EReference getBasicNode_HasComment();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see AGSN.BasicNode#getDescription()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getQualityLevel <em>Quality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Level</em>'.
	 * @see AGSN.BasicNode#getQualityLevel()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_QualityLevel();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getConfidencePercentage <em>Confidence Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence Percentage</em>'.
	 * @see AGSN.BasicNode#getConfidencePercentage()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_ConfidencePercentage();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see AGSN.BasicNode#getWeight()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_Weight();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicNode#getBeliefDegree <em>Belief Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Belief Degree</em>'.
	 * @see AGSN.BasicNode#getBeliefDegree()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_BeliefDegree();

	/**
	 * Returns the meta object for class '{@link AGSN.BasicLink <em>Basic Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Link</em>'.
	 * @see AGSN.BasicLink
	 * @generated
	 */
	EClass getBasicLink();

	/**
	 * Returns the meta object for the reference '{@link AGSN.BasicLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see AGSN.BasicLink#getSource()
	 * @see #getBasicLink()
	 * @generated
	 */
	EReference getBasicLink_Source();

	/**
	 * Returns the meta object for the reference '{@link AGSN.BasicLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see AGSN.BasicLink#getTarget()
	 * @see #getBasicLink()
	 * @generated
	 */
	EReference getBasicLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.BasicLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AGSN.BasicLink#getId()
	 * @see #getBasicLink()
	 * @generated
	 */
	EAttribute getBasicLink_Id();

	/**
	 * Returns the meta object for class '{@link AGSN.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see AGSN.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.Goal#isUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see AGSN.Goal#isUndeveloped()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Undeveloped();

	/**
	 * Returns the meta object for class '{@link AGSN.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see AGSN.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.Strategy#isUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see AGSN.Strategy#isUndeveloped()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Undeveloped();

	/**
	 * Returns the meta object for class '{@link AGSN.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see AGSN.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.Evidence#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment</em>'.
	 * @see AGSN.Evidence#getAttachment()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Attachment();

	/**
	 * Returns the meta object for class '{@link AGSN.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see AGSN.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link AGSN.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see AGSN.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link AGSN.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see AGSN.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link AGSN.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see AGSN.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for class '{@link AGSN.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see AGSN.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for class '{@link AGSN.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation</em>'.
	 * @see AGSN.Recommendation
	 * @generated
	 */
	EClass getRecommendation();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.Recommendation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see AGSN.Recommendation#getID()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_ID();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.Recommendation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AGSN.Recommendation#getName()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_Name();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.Recommendation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see AGSN.Recommendation#getDescription()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_Description();

	/**
	 * Returns the meta object for class '{@link AGSN.Strength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strength</em>'.
	 * @see AGSN.Strength
	 * @generated
	 */
	EClass getStrength();

	/**
	 * Returns the meta object for class '{@link AGSN.RequiredAction <em>Required Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Action</em>'.
	 * @see AGSN.RequiredAction
	 * @generated
	 */
	EClass getRequiredAction();

	/**
	 * Returns the meta object for class '{@link AGSN.Weakness <em>Weakness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weakness</em>'.
	 * @see AGSN.Weakness
	 * @generated
	 */
	EClass getWeakness();

	/**
	 * Returns the meta object for class '{@link AGSN.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see AGSN.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link AGSN.AdditionalElement <em>Additional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Element</em>'.
	 * @see AGSN.AdditionalElement
	 * @generated
	 */
	EClass getAdditionalElement();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.AdditionalElement#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment</em>'.
	 * @see AGSN.AdditionalElement#getAttachment()
	 * @see #getAdditionalElement()
	 * @generated
	 */
	EAttribute getAdditionalElement_Attachment();

	/**
	 * Returns the meta object for class '{@link AGSN.AdditionalLink <em>Additional Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Link</em>'.
	 * @see AGSN.AdditionalLink
	 * @generated
	 */
	EClass getAdditionalLink();

	/**
	 * Returns the meta object for class '{@link AGSN.ModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Element</em>'.
	 * @see AGSN.ModuleElement
	 * @generated
	 */
	EClass getModuleElement();

	/**
	 * Returns the meta object for the attribute '{@link AGSN.ModuleElement#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment</em>'.
	 * @see AGSN.ModuleElement#getAttachment()
	 * @see #getModuleElement()
	 * @generated
	 */
	EAttribute getModuleElement_Attachment();

	/**
	 * Returns the meta object for class '{@link AGSN.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see AGSN.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for class '{@link AGSN.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see AGSN.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for enum '{@link AGSN.AssessStatus <em>Assess Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assess Status</em>'.
	 * @see AGSN.AssessStatus
	 * @generated
	 */
	EEnum getAssessStatus();

	/**
	 * Returns the meta object for enum '{@link AGSN.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see AGSN.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for data type '<em>belief Degree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>belief Degree</em>'.
	 * @model instanceClass="java.lang.double[]"
	 * @generated
	 */
	EDataType getbeliefDegree();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>percentage</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="maxInclusive='100' minInclusive='0'"
	 * @generated
	 */
	EDataType getpercentage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AGSNFactory getAGSNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AGSN.impl.SafetyCaseImpl <em>Safety Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.SafetyCaseImpl
		 * @see AGSN.impl.AGSNPackageImpl#getSafetyCase()
		 * @generated
		 */
		EClass SAFETY_CASE = eINSTANCE.getSafetyCase();

		/**
		 * The meta object literal for the '<em><b>Root Basic Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__ROOT_BASIC_NODE = eINSTANCE.getSafetyCase_RootBasicNode();

		/**
		 * The meta object literal for the '<em><b>Root Basic Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__ROOT_BASIC_LINK = eINSTANCE.getSafetyCase_RootBasicLink();

		/**
		 * The meta object literal for the '<em><b>Root Commendation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__ROOT_COMMENDATION = eINSTANCE.getSafetyCase_RootCommendation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CASE__DESCRIPTION = eINSTANCE.getSafetyCase_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CASE__ID = eINSTANCE.getSafetyCase_Id();

		/**
		 * The meta object literal for the '{@link AGSN.impl.BasicNodeImpl <em>Basic Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.BasicNodeImpl
		 * @see AGSN.impl.AGSNPackageImpl#getBasicNode()
		 * @generated
		 */
		EClass BASIC_NODE = eINSTANCE.getBasicNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__ID = eINSTANCE.getBasicNode_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__NAME = eINSTANCE.getBasicNode_Name();

		/**
		 * The meta object literal for the '<em><b>Assessstatus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__ASSESSSTATUS = eINSTANCE.getBasicNode_Assessstatus();

		/**
		 * The meta object literal for the '<em><b>Has Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_NODE__HAS_COMMENT = eINSTANCE.getBasicNode_HasComment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__DESCRIPTION = eINSTANCE.getBasicNode_Description();

		/**
		 * The meta object literal for the '<em><b>Quality Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__QUALITY_LEVEL = eINSTANCE.getBasicNode_QualityLevel();

		/**
		 * The meta object literal for the '<em><b>Confidence Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__CONFIDENCE_PERCENTAGE = eINSTANCE.getBasicNode_ConfidencePercentage();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__WEIGHT = eINSTANCE.getBasicNode_Weight();

		/**
		 * The meta object literal for the '<em><b>Belief Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__BELIEF_DEGREE = eINSTANCE.getBasicNode_BeliefDegree();

		/**
		 * The meta object literal for the '{@link AGSN.impl.BasicLinkImpl <em>Basic Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.BasicLinkImpl
		 * @see AGSN.impl.AGSNPackageImpl#getBasicLink()
		 * @generated
		 */
		EClass BASIC_LINK = eINSTANCE.getBasicLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_LINK__SOURCE = eINSTANCE.getBasicLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_LINK__TARGET = eINSTANCE.getBasicLink_Target();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_LINK__ID = eINSTANCE.getBasicLink_Id();

		/**
		 * The meta object literal for the '{@link AGSN.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.GoalImpl
		 * @see AGSN.impl.AGSNPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__UNDEVELOPED = eINSTANCE.getGoal_Undeveloped();

		/**
		 * The meta object literal for the '{@link AGSN.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.StrategyImpl
		 * @see AGSN.impl.AGSNPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__UNDEVELOPED = eINSTANCE.getStrategy_Undeveloped();

		/**
		 * The meta object literal for the '{@link AGSN.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.EvidenceImpl
		 * @see AGSN.impl.AGSNPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__ATTACHMENT = eINSTANCE.getEvidence_Attachment();

		/**
		 * The meta object literal for the '{@link AGSN.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.ContextImpl
		 * @see AGSN.impl.AGSNPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link AGSN.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.JustificationImpl
		 * @see AGSN.impl.AGSNPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link AGSN.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.AssumptionImpl
		 * @see AGSN.impl.AGSNPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link AGSN.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.InContextOfImpl
		 * @see AGSN.impl.AGSNPackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '{@link AGSN.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.SupportedByImpl
		 * @see AGSN.impl.AGSNPackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '{@link AGSN.impl.RecommendationImpl <em>Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.RecommendationImpl
		 * @see AGSN.impl.AGSNPackageImpl#getRecommendation()
		 * @generated
		 */
		EClass RECOMMENDATION = eINSTANCE.getRecommendation();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__ID = eINSTANCE.getRecommendation_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__NAME = eINSTANCE.getRecommendation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__DESCRIPTION = eINSTANCE.getRecommendation_Description();

		/**
		 * The meta object literal for the '{@link AGSN.impl.StrengthImpl <em>Strength</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.StrengthImpl
		 * @see AGSN.impl.AGSNPackageImpl#getStrength()
		 * @generated
		 */
		EClass STRENGTH = eINSTANCE.getStrength();

		/**
		 * The meta object literal for the '{@link AGSN.impl.RequiredActionImpl <em>Required Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.RequiredActionImpl
		 * @see AGSN.impl.AGSNPackageImpl#getRequiredAction()
		 * @generated
		 */
		EClass REQUIRED_ACTION = eINSTANCE.getRequiredAction();

		/**
		 * The meta object literal for the '{@link AGSN.impl.WeaknessImpl <em>Weakness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.WeaknessImpl
		 * @see AGSN.impl.AGSNPackageImpl#getWeakness()
		 * @generated
		 */
		EClass WEAKNESS = eINSTANCE.getWeakness();

		/**
		 * The meta object literal for the '{@link AGSN.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.QuestionImpl
		 * @see AGSN.impl.AGSNPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link AGSN.impl.AdditionalElementImpl <em>Additional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.AdditionalElementImpl
		 * @see AGSN.impl.AGSNPackageImpl#getAdditionalElement()
		 * @generated
		 */
		EClass ADDITIONAL_ELEMENT = eINSTANCE.getAdditionalElement();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_ELEMENT__ATTACHMENT = eINSTANCE.getAdditionalElement_Attachment();

		/**
		 * The meta object literal for the '{@link AGSN.impl.AdditionalLinkImpl <em>Additional Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.AdditionalLinkImpl
		 * @see AGSN.impl.AGSNPackageImpl#getAdditionalLink()
		 * @generated
		 */
		EClass ADDITIONAL_LINK = eINSTANCE.getAdditionalLink();

		/**
		 * The meta object literal for the '{@link AGSN.impl.ModuleElementImpl <em>Module Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.ModuleElementImpl
		 * @see AGSN.impl.AGSNPackageImpl#getModuleElement()
		 * @generated
		 */
		EClass MODULE_ELEMENT = eINSTANCE.getModuleElement();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ELEMENT__ATTACHMENT = eINSTANCE.getModuleElement_Attachment();

		/**
		 * The meta object literal for the '{@link AGSN.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.ModuleImpl
		 * @see AGSN.impl.AGSNPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '{@link AGSN.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.ContractImpl
		 * @see AGSN.impl.AGSNPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '{@link AGSN.AssessStatus <em>Assess Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.AssessStatus
		 * @see AGSN.impl.AGSNPackageImpl#getAssessStatus()
		 * @generated
		 */
		EEnum ASSESS_STATUS = eINSTANCE.getAssessStatus();

		/**
		 * The meta object literal for the '{@link AGSN.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.Level
		 * @see AGSN.impl.AGSNPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em>belief Degree</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AGSN.impl.AGSNPackageImpl#getbeliefDegree()
		 * @generated
		 */
		EDataType BELIEF_DEGREE = eINSTANCE.getbeliefDegree();

		/**
		 * The meta object literal for the '<em>percentage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see AGSN.impl.AGSNPackageImpl#getpercentage()
		 * @generated
		 */
		EDataType PERCENTAGE = eINSTANCE.getpercentage();

	}

} //AGSNPackage
