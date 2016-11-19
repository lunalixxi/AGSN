/**
 */
package AGSN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AGSN.Goal#isUndeveloped <em>Undeveloped</em>}</li>
 * </ul>
 *
 * @see AGSN.AGSNPackage#getGoal()
 * @model annotation="gmf.node label='name' label.icon='false' label.pattern='Goal: {0}' figure='gsnfigures.GSNGoal' size='120,80' color='255,255,255'"
 * @generated
 */
public interface Goal extends BasicNode {
	/**
	 * Returns the value of the '<em><b>Undeveloped</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undeveloped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undeveloped</em>' attribute.
	 * @see #setUndeveloped(boolean)
	 * @see AGSN.AGSNPackage#getGoal_Undeveloped()
	 * @model default="false"
	 * @generated
	 */
	boolean isUndeveloped();

	/**
	 * Sets the value of the '{@link AGSN.Goal#isUndeveloped <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeveloped</em>' attribute.
	 * @see #isUndeveloped()
	 * @generated
	 */
	void setUndeveloped(boolean value);

} // Goal
