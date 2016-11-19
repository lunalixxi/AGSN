/*
* 
*/
package AGSN.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import AGSN.diagram.edit.commands.AdditionalLinkCreateCommand;
import AGSN.diagram.edit.commands.AdditionalLinkReorientCommand;
import AGSN.diagram.edit.commands.BasicNodeHasCommentCreateCommand;
import AGSN.diagram.edit.commands.BasicNodeHasCommentReorientCommand;
import AGSN.diagram.edit.commands.InContextOfCreateCommand;
import AGSN.diagram.edit.commands.InContextOfReorientCommand;
import AGSN.diagram.edit.commands.SupportedByCreateCommand;
import AGSN.diagram.edit.commands.SupportedByReorientCommand;
import AGSN.diagram.edit.parts.AdditionalLinkEditPart;
import AGSN.diagram.edit.parts.BasicNodeHasCommentEditPart;
import AGSN.diagram.edit.parts.InContextOfEditPart;
import AGSN.diagram.edit.parts.SupportedByEditPart;
import AGSN.diagram.part.AGSNVisualIDRegistry;
import AGSN.diagram.providers.AGSNElementTypes;

/**
 * @generated
 */
public class AdditionalElementItemSemanticEditPolicy extends AGSNBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdditionalElementItemSemanticEditPolicy() {
		super(AGSNElementTypes.AdditionalElement_2018);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (AGSNVisualIDRegistry.getVisualID(incomingLink) == InContextOfEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AGSNVisualIDRegistry.getVisualID(incomingLink) == SupportedByEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AGSNVisualIDRegistry.getVisualID(incomingLink) == AdditionalLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (AGSNVisualIDRegistry.getVisualID(outgoingLink) == InContextOfEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AGSNVisualIDRegistry.getVisualID(outgoingLink) == SupportedByEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AGSNVisualIDRegistry.getVisualID(outgoingLink) == AdditionalLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AGSNVisualIDRegistry.getVisualID(outgoingLink) == BasicNodeHasCommentEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (AGSNElementTypes.InContextOf_4001 == req.getElementType()) {
			return getGEFWrapper(new InContextOfCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AGSNElementTypes.SupportedBy_4002 == req.getElementType()) {
			return getGEFWrapper(new SupportedByCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AGSNElementTypes.AdditionalLink_4005 == req.getElementType()) {
			return getGEFWrapper(new AdditionalLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AGSNElementTypes.BasicNodeHasComment_4003 == req.getElementType()) {
			return getGEFWrapper(new BasicNodeHasCommentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (AGSNElementTypes.InContextOf_4001 == req.getElementType()) {
			return getGEFWrapper(new InContextOfCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AGSNElementTypes.SupportedBy_4002 == req.getElementType()) {
			return getGEFWrapper(new SupportedByCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AGSNElementTypes.AdditionalLink_4005 == req.getElementType()) {
			return getGEFWrapper(new AdditionalLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AGSNElementTypes.BasicNodeHasComment_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case InContextOfEditPart.VISUAL_ID:
			return getGEFWrapper(new InContextOfReorientCommand(req));
		case SupportedByEditPart.VISUAL_ID:
			return getGEFWrapper(new SupportedByReorientCommand(req));
		case AdditionalLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new AdditionalLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case BasicNodeHasCommentEditPart.VISUAL_ID:
			return getGEFWrapper(new BasicNodeHasCommentReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
