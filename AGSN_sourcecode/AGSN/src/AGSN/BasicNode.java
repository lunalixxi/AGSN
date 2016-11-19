/**
 */
package AGSN;

import java.lang.Integer;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AGSN.BasicNode#getId <em>Id</em>}</li>
 *   <li>{@link AGSN.BasicNode#getName <em>Name</em>}</li>
 *   <li>{@link AGSN.BasicNode#getAssessstatus <em>Assessstatus</em>}</li>
 *   <li>{@link AGSN.BasicNode#getHasComment <em>Has Comment</em>}</li>
 *   <li>{@link AGSN.BasicNode#getDescription <em>Description</em>}</li>
 *   <li>{@link AGSN.BasicNode#getQualityLevel <em>Quality Level</em>}</li>
 *   <li>{@link AGSN.BasicNode#getConfidencePercentage <em>Confidence Percentage</em>}</li>
 *   <li>{@link AGSN.BasicNode#getWeight <em>Weight</em>}</li>
 *   <li>{@link AGSN.BasicNode#getBeliefDegree <em>Belief Degree</em>}</li>
 * </ul>
 *
 * @see AGSN.AGSNPackage#getBasicNode()
 * @model abstract="true"
 * @generated
 */
public interface BasicNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AGSN.AGSNPackage#getBasicNode_Id()
	 * @model id="true" ordered="false"
	 *        extendedMetaData="name='id' namespace='http://sdq.ipd.uka.de/Identifier/1.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AGSN.AGSNPackage#getBasicNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assessstatus</b></em>' attribute.
	 * The literals are from the enumeration {@link AGSN.AssessStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessstatus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessstatus</em>' attribute.
	 * @see AGSN.AssessStatus
	 * @see #setAssessstatus(AssessStatus)
	 * @see AGSN.AGSNPackage#getBasicNode_Assessstatus()
	 * @model
	 * @generated
	 */
	AssessStatus getAssessstatus();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getAssessstatus <em>Assessstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessstatus</em>' attribute.
	 * @see AGSN.AssessStatus
	 * @see #getAssessstatus()
	 * @generated
	 */
	void setAssessstatus(AssessStatus value);

	/**
	 * Returns the value of the '<em><b>Has Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Comment</em>' reference.
	 * @see #setHasComment(Recommendation)
	 * @see AGSN.AGSNPackage#getBasicNode_HasComment()
	 * @model annotation="gmf.link style='solid' width='1' tool.small.bundle='AGSN.edit' tool.small.path='icons/full/obj16/BasicNodeHasComment.gif'"
	 * @generated
	 */
	Recommendation getHasComment();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getHasComment <em>Has Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Comment</em>' reference.
	 * @see #getHasComment()
	 * @generated
	 */
	void setHasComment(Recommendation value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see AGSN.AGSNPackage#getBasicNode_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Quality Level</b></em>' attribute.
	 * The literals are from the enumeration {@link AGSN.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Level</em>' attribute.
	 * @see AGSN.Level
	 * @see #setQualityLevel(Level)
	 * @see AGSN.AGSNPackage#getBasicNode_QualityLevel()
	 * @model
	 * @generated
	 */
	Level getQualityLevel();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getQualityLevel <em>Quality Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Level</em>' attribute.
	 * @see AGSN.Level
	 * @see #getQualityLevel()
	 * @generated
	 */
	void setQualityLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Confidence Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidence Percentage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence Percentage</em>' attribute.
	 * @see #setConfidencePercentage(Integer)
	 * @see AGSN.AGSNPackage#getBasicNode_ConfidencePercentage()
	 * @model dataType="AGSN.percentage"
	 * @generated
	 */
	Integer getConfidencePercentage();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getConfidencePercentage <em>Confidence Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Percentage</em>' attribute.
	 * @see #getConfidencePercentage()
	 * @generated
	 */
	void setConfidencePercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see AGSN.AGSNPackage#getBasicNode_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Belief Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belief Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belief Degree</em>' attribute.
	 * @see #setBeliefDegree(double[])
	 * @see AGSN.AGSNPackage#getBasicNode_BeliefDegree()
	 * @model dataType="AGSN.beliefDegree"
	 * @generated
	 */
	double[] getBeliefDegree();

	/**
	 * Sets the value of the '{@link AGSN.BasicNode#getBeliefDegree <em>Belief Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belief Degree</em>' attribute.
	 * @see #getBeliefDegree()
	 * @generated
	 */
	void setBeliefDegree(double[] value);

} // BasicNode
