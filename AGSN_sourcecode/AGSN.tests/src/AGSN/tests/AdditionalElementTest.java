/**
 */
package AGSN.tests;

import AGSN.AGSNFactory;
import AGSN.AdditionalElement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Additional Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdditionalElementTest extends BasicNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdditionalElementTest.class);
	}

	/**
	 * Constructs a new Additional Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Additional Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdditionalElement getFixture() {
		return (AdditionalElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AGSNFactory.eINSTANCE.createAdditionalElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AdditionalElementTest
