/*
 * 
 */
package AGSN.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import AGSN.diagram.edit.parts.AGSNEditPartFactory;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;
import AGSN.diagram.part.AGSNVisualIDRegistry;

/**
 * @generated
 */
public class AGSNEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public AGSNEditPartProvider() {
		super(new AGSNEditPartFactory(), AGSNVisualIDRegistry.TYPED_INSTANCE, SafetyCaseEditPart.MODEL_ID);
	}

}
