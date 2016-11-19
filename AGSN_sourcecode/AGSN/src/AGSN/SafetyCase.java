/**
 */
package AGSN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AGSN.SafetyCase#getRootBasicNode <em>Root Basic Node</em>}</li>
 *   <li>{@link AGSN.SafetyCase#getRootBasicLink <em>Root Basic Link</em>}</li>
 *   <li>{@link AGSN.SafetyCase#getRootCommendation <em>Root Commendation</em>}</li>
 *   <li>{@link AGSN.SafetyCase#getDescription <em>Description</em>}</li>
 *   <li>{@link AGSN.SafetyCase#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see AGSN.AGSNPackage#getSafetyCase()
 * @model
 * @generated
 */
public interface SafetyCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Basic Node</b></em>' containment reference list.
	 * The list contents are of type {@link AGSN.BasicNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Basic Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Basic Node</em>' containment reference list.
	 * @see AGSN.AGSNPackage#getSafetyCase_RootBasicNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicNode> getRootBasicNode();

	/**
	 * Returns the value of the '<em><b>Root Basic Link</b></em>' containment reference list.
	 * The list contents are of type {@link AGSN.BasicLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Basic Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Basic Link</em>' containment reference list.
	 * @see AGSN.AGSNPackage#getSafetyCase_RootBasicLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicLink> getRootBasicLink();

	/**
	 * Returns the value of the '<em><b>Root Commendation</b></em>' containment reference list.
	 * The list contents are of type {@link AGSN.Recommendation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Commendation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Commendation</em>' containment reference list.
	 * @see AGSN.AGSNPackage#getSafetyCase_RootCommendation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recommendation> getRootCommendation();

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
	 * @see AGSN.AGSNPackage#getSafetyCase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link AGSN.SafetyCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see AGSN.AGSNPackage#getSafetyCase_Id()
	 * @model id="true" ordered="false"
	 *        extendedMetaData="name='id' namespace='http://sdq.ipd.uka.de/Identifier/1.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AGSN.SafetyCase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SafetyCase
