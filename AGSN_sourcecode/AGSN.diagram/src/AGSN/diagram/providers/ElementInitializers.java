/*
 * 
 */
package AGSN.diagram.providers;

import AGSN.diagram.part.AGSNDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = AGSNDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			AGSNDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
