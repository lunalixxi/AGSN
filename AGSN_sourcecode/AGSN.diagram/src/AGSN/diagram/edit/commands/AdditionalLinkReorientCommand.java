/*
 * 
 */
package AGSN.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import AGSN.AdditionalLink;
import AGSN.BasicNode;
import AGSN.SafetyCase;
import AGSN.diagram.edit.policies.AGSNBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AdditionalLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public AdditionalLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AdditionalLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof BasicNode && newEnd instanceof BasicNode)) {
			return false;
		}
		BasicNode target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof SafetyCase)) {
			return false;
		}
		SafetyCase container = (SafetyCase) getLink().eContainer();
		return AGSNBaseItemSemanticEditPolicy.getLinkConstraints().canExistAdditionalLink_4005(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof BasicNode && newEnd instanceof BasicNode)) {
			return false;
		}
		BasicNode source = getLink().getSource();
		if (!(getLink().eContainer() instanceof SafetyCase)) {
			return false;
		}
		SafetyCase container = (SafetyCase) getLink().eContainer();
		return AGSNBaseItemSemanticEditPolicy.getLinkConstraints().canExistAdditionalLink_4005(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected AdditionalLink getLink() {
		return (AdditionalLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected BasicNode getOldSource() {
		return (BasicNode) oldEnd;
	}

	/**
	* @generated
	*/
	protected BasicNode getNewSource() {
		return (BasicNode) newEnd;
	}

	/**
	* @generated
	*/
	protected BasicNode getOldTarget() {
		return (BasicNode) oldEnd;
	}

	/**
	* @generated
	*/
	protected BasicNode getNewTarget() {
		return (BasicNode) newEnd;
	}
}
