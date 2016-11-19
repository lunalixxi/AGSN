/*
* 
*/
package AGSN.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import AGSN.AGSNPackage;
import AGSN.SafetyCase;
import AGSN.diagram.edit.parts.AdditionalElementDescriptionEditPart;
import AGSN.diagram.edit.parts.AdditionalElementEditPart;
import AGSN.diagram.edit.parts.AdditionalElementNameEditPart;
import AGSN.diagram.edit.parts.AdditionalLinkEditPart;
import AGSN.diagram.edit.parts.AssumptionDescriptionEditPart;
import AGSN.diagram.edit.parts.AssumptionEditPart;
import AGSN.diagram.edit.parts.AssumptionNameEditPart;
import AGSN.diagram.edit.parts.BasicNodeHasCommentEditPart;
import AGSN.diagram.edit.parts.ContextDescriptionEditPart;
import AGSN.diagram.edit.parts.ContextEditPart;
import AGSN.diagram.edit.parts.ContextNameEditPart;
import AGSN.diagram.edit.parts.ContractDescriptionEditPart;
import AGSN.diagram.edit.parts.ContractEditPart;
import AGSN.diagram.edit.parts.ContractNameEditPart;
import AGSN.diagram.edit.parts.EvidenceDescriptionEditPart;
import AGSN.diagram.edit.parts.EvidenceEditPart;
import AGSN.diagram.edit.parts.EvidenceNameEditPart;
import AGSN.diagram.edit.parts.GoalDescriptionEditPart;
import AGSN.diagram.edit.parts.GoalEditPart;
import AGSN.diagram.edit.parts.GoalNameEditPart;
import AGSN.diagram.edit.parts.InContextOfEditPart;
import AGSN.diagram.edit.parts.JustificationDescriptionEditPart;
import AGSN.diagram.edit.parts.JustificationEditPart;
import AGSN.diagram.edit.parts.JustificationNameEditPart;
import AGSN.diagram.edit.parts.ModuleDescriptionEditPart;
import AGSN.diagram.edit.parts.ModuleEditPart;
import AGSN.diagram.edit.parts.ModuleNameEditPart;
import AGSN.diagram.edit.parts.QuestionDescriptionEditPart;
import AGSN.diagram.edit.parts.QuestionEditPart;
import AGSN.diagram.edit.parts.QuestionNameEditPart;
import AGSN.diagram.edit.parts.RequiredActionDescriptionEditPart;
import AGSN.diagram.edit.parts.RequiredActionEditPart;
import AGSN.diagram.edit.parts.RequiredActionNameEditPart;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;
import AGSN.diagram.edit.parts.StrategyDescriptionEditPart;
import AGSN.diagram.edit.parts.StrategyEditPart;
import AGSN.diagram.edit.parts.StrategyNameEditPart;
import AGSN.diagram.edit.parts.StrengthDescriptionEditPart;
import AGSN.diagram.edit.parts.StrengthEditPart;
import AGSN.diagram.edit.parts.StrengthNameEditPart;
import AGSN.diagram.edit.parts.SupportedByEditPart;
import AGSN.diagram.edit.parts.WeaknessDescriptionEditPart;
import AGSN.diagram.edit.parts.WeaknessEditPart;
import AGSN.diagram.edit.parts.WeaknessNameEditPart;
import AGSN.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class AGSNVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "AGSN.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SafetyCaseEditPart.MODEL_ID.equals(view.getType())) {
				return SafetyCaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return AGSN.diagram.part.AGSNVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				AGSNDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AGSNPackage.eINSTANCE.getSafetyCase().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((SafetyCase) domainElement)) {
			return SafetyCaseEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = AGSN.diagram.part.AGSNVisualIDRegistry.getModelID(containerView);
		if (!SafetyCaseEditPart.MODEL_ID.equals(containerModelID) && !"AGSN".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SafetyCaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = AGSN.diagram.part.AGSNVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SafetyCaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SafetyCaseEditPart.VISUAL_ID:
			if (AGSNPackage.eINSTANCE.getModule().isSuperTypeOf(domainElement.eClass())) {
				return ModuleEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getContract().isSuperTypeOf(domainElement.eClass())) {
				return ContractEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getGoal().isSuperTypeOf(domainElement.eClass())) {
				return GoalEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getStrategy().isSuperTypeOf(domainElement.eClass())) {
				return StrategyEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getEvidence().isSuperTypeOf(domainElement.eClass())) {
				return EvidenceEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getContext().isSuperTypeOf(domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getJustification().isSuperTypeOf(domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getAssumption().isSuperTypeOf(domainElement.eClass())) {
				return AssumptionEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getAdditionalElement().isSuperTypeOf(domainElement.eClass())) {
				return AdditionalElementEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getStrength().isSuperTypeOf(domainElement.eClass())) {
				return StrengthEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getRequiredAction().isSuperTypeOf(domainElement.eClass())) {
				return RequiredActionEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getWeakness().isSuperTypeOf(domainElement.eClass())) {
				return WeaknessEditPart.VISUAL_ID;
			}
			if (AGSNPackage.eINSTANCE.getQuestion().isSuperTypeOf(domainElement.eClass())) {
				return QuestionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = AGSN.diagram.part.AGSNVisualIDRegistry.getModelID(containerView);
		if (!SafetyCaseEditPart.MODEL_ID.equals(containerModelID) && !"AGSN".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SafetyCaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = AGSN.diagram.part.AGSNVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SafetyCaseEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SafetyCaseEditPart.VISUAL_ID:
			if (ModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrategyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvidenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdditionalElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrengthEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RequiredActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WeaknessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModuleEditPart.VISUAL_ID:
			if (ModuleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModuleDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractEditPart.VISUAL_ID:
			if (ContractNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalEditPart.VISUAL_ID:
			if (GoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GoalDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyEditPart.VISUAL_ID:
			if (StrategyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrategyDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EvidenceEditPart.VISUAL_ID:
			if (EvidenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvidenceDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextEditPart.VISUAL_ID:
			if (ContextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JustificationEditPart.VISUAL_ID:
			if (JustificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssumptionEditPart.VISUAL_ID:
			if (AssumptionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdditionalElementEditPart.VISUAL_ID:
			if (AdditionalElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdditionalElementDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrengthEditPart.VISUAL_ID:
			if (StrengthNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrengthDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequiredActionEditPart.VISUAL_ID:
			if (RequiredActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RequiredActionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WeaknessEditPart.VISUAL_ID:
			if (WeaknessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WeaknessDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionEditPart.VISUAL_ID:
			if (QuestionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BasicNodeHasCommentEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AGSNPackage.eINSTANCE.getInContextOf().isSuperTypeOf(domainElement.eClass())) {
			return InContextOfEditPart.VISUAL_ID;
		}
		if (AGSNPackage.eINSTANCE.getSupportedBy().isSuperTypeOf(domainElement.eClass())) {
			return SupportedByEditPart.VISUAL_ID;
		}
		if (AGSNPackage.eINSTANCE.getAdditionalLink().isSuperTypeOf(domainElement.eClass())) {
			return AdditionalLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(SafetyCase element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SafetyCaseEditPart.VISUAL_ID:
			return false;
		case GoalEditPart.VISUAL_ID:
		case StrategyEditPart.VISUAL_ID:
		case EvidenceEditPart.VISUAL_ID:
		case ContextEditPart.VISUAL_ID:
		case JustificationEditPart.VISUAL_ID:
		case AssumptionEditPart.VISUAL_ID:
		case StrengthEditPart.VISUAL_ID:
		case RequiredActionEditPart.VISUAL_ID:
		case WeaknessEditPart.VISUAL_ID:
		case QuestionEditPart.VISUAL_ID:
		case AdditionalElementEditPart.VISUAL_ID:
		case ModuleEditPart.VISUAL_ID:
		case ContractEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return AGSN.diagram.part.AGSNVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return AGSN.diagram.part.AGSNVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return AGSN.diagram.part.AGSNVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return AGSN.diagram.part.AGSNVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return AGSN.diagram.part.AGSNVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return AGSN.diagram.part.AGSNVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
