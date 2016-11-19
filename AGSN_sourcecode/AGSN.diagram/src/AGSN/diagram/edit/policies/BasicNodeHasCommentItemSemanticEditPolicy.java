/*
* 
*/
package AGSN.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import AGSN.diagram.providers.AGSNElementTypes;

/**
 * @generated
 */
public class BasicNodeHasCommentItemSemanticEditPolicy extends AGSNBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BasicNodeHasCommentItemSemanticEditPolicy() {
		super(AGSNElementTypes.BasicNodeHasComment_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
