/*
* 
*/
package AGSN.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import AGSN.diagram.part.AGSNVisualIDRegistry;

/**
 * @generated
 */
public class AGSNNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4007;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof AGSNNavigatorItem) {
			AGSNNavigatorItem item = (AGSNNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return AGSNVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
