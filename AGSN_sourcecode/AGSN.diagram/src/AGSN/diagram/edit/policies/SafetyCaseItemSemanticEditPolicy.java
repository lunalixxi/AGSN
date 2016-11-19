/*
* 
*/
package AGSN.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import AGSN.diagram.edit.commands.AdditionalElementCreateCommand;
import AGSN.diagram.edit.commands.AssumptionCreateCommand;
import AGSN.diagram.edit.commands.ContextCreateCommand;
import AGSN.diagram.edit.commands.ContractCreateCommand;
import AGSN.diagram.edit.commands.EvidenceCreateCommand;
import AGSN.diagram.edit.commands.GoalCreateCommand;
import AGSN.diagram.edit.commands.JustificationCreateCommand;
import AGSN.diagram.edit.commands.ModuleCreateCommand;
import AGSN.diagram.edit.commands.QuestionCreateCommand;
import AGSN.diagram.edit.commands.RequiredActionCreateCommand;
import AGSN.diagram.edit.commands.StrategyCreateCommand;
import AGSN.diagram.edit.commands.StrengthCreateCommand;
import AGSN.diagram.edit.commands.WeaknessCreateCommand;
import AGSN.diagram.providers.AGSNElementTypes;

/**
 * @generated
 */
public class SafetyCaseItemSemanticEditPolicy extends AGSNBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SafetyCaseItemSemanticEditPolicy() {
		super(AGSNElementTypes.SafetyCase_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AGSNElementTypes.Module_2019 == req.getElementType()) {
			return getGEFWrapper(new ModuleCreateCommand(req));
		}
		if (AGSNElementTypes.Contract_2020 == req.getElementType()) {
			return getGEFWrapper(new ContractCreateCommand(req));
		}
		if (AGSNElementTypes.Goal_2007 == req.getElementType()) {
			return getGEFWrapper(new GoalCreateCommand(req));
		}
		if (AGSNElementTypes.Strategy_2008 == req.getElementType()) {
			return getGEFWrapper(new StrategyCreateCommand(req));
		}
		if (AGSNElementTypes.Evidence_2009 == req.getElementType()) {
			return getGEFWrapper(new EvidenceCreateCommand(req));
		}
		if (AGSNElementTypes.Context_2010 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
		}
		if (AGSNElementTypes.Justification_2011 == req.getElementType()) {
			return getGEFWrapper(new JustificationCreateCommand(req));
		}
		if (AGSNElementTypes.Assumption_2012 == req.getElementType()) {
			return getGEFWrapper(new AssumptionCreateCommand(req));
		}
		if (AGSNElementTypes.AdditionalElement_2018 == req.getElementType()) {
			return getGEFWrapper(new AdditionalElementCreateCommand(req));
		}
		if (AGSNElementTypes.Strength_2013 == req.getElementType()) {
			return getGEFWrapper(new StrengthCreateCommand(req));
		}
		if (AGSNElementTypes.RequiredAction_2014 == req.getElementType()) {
			return getGEFWrapper(new RequiredActionCreateCommand(req));
		}
		if (AGSNElementTypes.Weakness_2015 == req.getElementType()) {
			return getGEFWrapper(new WeaknessCreateCommand(req));
		}
		if (AGSNElementTypes.Question_2016 == req.getElementType()) {
			return getGEFWrapper(new QuestionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
