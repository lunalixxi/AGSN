/*
 * 
 */
package AGSN.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import AGSN.diagram.part.AGSNVisualIDRegistry;

/**
 * @generated
 */
public class AGSNEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (AGSNVisualIDRegistry.getVisualID(view)) {

			case SafetyCaseEditPart.VISUAL_ID:
				return new SafetyCaseEditPart(view);

			case ModuleEditPart.VISUAL_ID:
				return new ModuleEditPart(view);

			case ModuleNameEditPart.VISUAL_ID:
				return new ModuleNameEditPart(view);

			case ModuleDescriptionEditPart.VISUAL_ID:
				return new ModuleDescriptionEditPart(view);

			case ContractEditPart.VISUAL_ID:
				return new ContractEditPart(view);

			case ContractNameEditPart.VISUAL_ID:
				return new ContractNameEditPart(view);

			case ContractDescriptionEditPart.VISUAL_ID:
				return new ContractDescriptionEditPart(view);

			case GoalEditPart.VISUAL_ID:
				return new GoalEditPart(view);

			case GoalNameEditPart.VISUAL_ID:
				return new GoalNameEditPart(view);

			case GoalDescriptionEditPart.VISUAL_ID:
				return new GoalDescriptionEditPart(view);

			case StrategyEditPart.VISUAL_ID:
				return new StrategyEditPart(view);

			case StrategyNameEditPart.VISUAL_ID:
				return new StrategyNameEditPart(view);

			case StrategyDescriptionEditPart.VISUAL_ID:
				return new StrategyDescriptionEditPart(view);

			case EvidenceEditPart.VISUAL_ID:
				return new EvidenceEditPart(view);

			case EvidenceNameEditPart.VISUAL_ID:
				return new EvidenceNameEditPart(view);

			case EvidenceDescriptionEditPart.VISUAL_ID:
				return new EvidenceDescriptionEditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case ContextNameEditPart.VISUAL_ID:
				return new ContextNameEditPart(view);

			case ContextDescriptionEditPart.VISUAL_ID:
				return new ContextDescriptionEditPart(view);

			case JustificationEditPart.VISUAL_ID:
				return new JustificationEditPart(view);

			case JustificationNameEditPart.VISUAL_ID:
				return new JustificationNameEditPart(view);

			case JustificationDescriptionEditPart.VISUAL_ID:
				return new JustificationDescriptionEditPart(view);

			case AssumptionEditPart.VISUAL_ID:
				return new AssumptionEditPart(view);

			case AssumptionNameEditPart.VISUAL_ID:
				return new AssumptionNameEditPart(view);

			case AssumptionDescriptionEditPart.VISUAL_ID:
				return new AssumptionDescriptionEditPart(view);

			case AdditionalElementEditPart.VISUAL_ID:
				return new AdditionalElementEditPart(view);

			case AdditionalElementNameEditPart.VISUAL_ID:
				return new AdditionalElementNameEditPart(view);

			case AdditionalElementDescriptionEditPart.VISUAL_ID:
				return new AdditionalElementDescriptionEditPart(view);

			case StrengthEditPart.VISUAL_ID:
				return new StrengthEditPart(view);

			case StrengthNameEditPart.VISUAL_ID:
				return new StrengthNameEditPart(view);

			case StrengthDescriptionEditPart.VISUAL_ID:
				return new StrengthDescriptionEditPart(view);

			case RequiredActionEditPart.VISUAL_ID:
				return new RequiredActionEditPart(view);

			case RequiredActionNameEditPart.VISUAL_ID:
				return new RequiredActionNameEditPart(view);

			case RequiredActionDescriptionEditPart.VISUAL_ID:
				return new RequiredActionDescriptionEditPart(view);

			case WeaknessEditPart.VISUAL_ID:
				return new WeaknessEditPart(view);

			case WeaknessNameEditPart.VISUAL_ID:
				return new WeaknessNameEditPart(view);

			case WeaknessDescriptionEditPart.VISUAL_ID:
				return new WeaknessDescriptionEditPart(view);

			case QuestionEditPart.VISUAL_ID:
				return new QuestionEditPart(view);

			case QuestionNameEditPart.VISUAL_ID:
				return new QuestionNameEditPart(view);

			case QuestionDescriptionEditPart.VISUAL_ID:
				return new QuestionDescriptionEditPart(view);

			case InContextOfEditPart.VISUAL_ID:
				return new InContextOfEditPart(view);

			case SupportedByEditPart.VISUAL_ID:
				return new SupportedByEditPart(view);

			case AdditionalLinkEditPart.VISUAL_ID:
				return new AdditionalLinkEditPart(view);

			case BasicNodeHasCommentEditPart.VISUAL_ID:
				return new BasicNodeHasCommentEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
