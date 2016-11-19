/**
 */
package AGSN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AGSN.Strategy#isUndeveloped <em>Undeveloped</em>}</li>
 * </ul>
 *
 * @see AGSN.AGSNPackage#getStrategy()
 * @model annotation="gmf.node label='name' label.icon='false' label.pattern='Strategy: {0}' figure='gsnfigures.GSNStrategy' size='120,80' color='255,255,255'"
 * @generated
 */
public interface Strategy extends BasicNode {
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
	 * @see AGSN.AGSNPackage#getStrategy_Undeveloped()
	 * @model default="false"
	 * @generated
	 */
	boolean isUndeveloped();

	/**
	 * Sets the value of the '{@link AGSN.Strategy#isUndeveloped <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeveloped</em>' attribute.
	 * @see #isUndeveloped()
	 * @generated
	 */
	void setUndeveloped(boolean value);

} // Strategy
