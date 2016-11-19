/*
 * 
 */
package AGSN.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import AGSN.AGSNPackage;
import AGSN.diagram.edit.parts.AdditionalElementDescriptionEditPart;
import AGSN.diagram.edit.parts.AdditionalElementNameEditPart;
import AGSN.diagram.edit.parts.AssumptionDescriptionEditPart;
import AGSN.diagram.edit.parts.AssumptionNameEditPart;
import AGSN.diagram.edit.parts.ContextDescriptionEditPart;
import AGSN.diagram.edit.parts.ContextNameEditPart;
import AGSN.diagram.edit.parts.ContractDescriptionEditPart;
import AGSN.diagram.edit.parts.ContractNameEditPart;
import AGSN.diagram.edit.parts.EvidenceDescriptionEditPart;
import AGSN.diagram.edit.parts.EvidenceNameEditPart;
import AGSN.diagram.edit.parts.GoalDescriptionEditPart;
import AGSN.diagram.edit.parts.GoalNameEditPart;
import AGSN.diagram.edit.parts.JustificationDescriptionEditPart;
import AGSN.diagram.edit.parts.JustificationNameEditPart;
import AGSN.diagram.edit.parts.ModuleDescriptionEditPart;
import AGSN.diagram.edit.parts.ModuleNameEditPart;
import AGSN.diagram.edit.parts.QuestionDescriptionEditPart;
import AGSN.diagram.edit.parts.QuestionNameEditPart;
import AGSN.diagram.edit.parts.RequiredActionDescriptionEditPart;
import AGSN.diagram.edit.parts.RequiredActionNameEditPart;
import AGSN.diagram.edit.parts.StrategyDescriptionEditPart;
import AGSN.diagram.edit.parts.StrategyNameEditPart;
import AGSN.diagram.edit.parts.StrengthDescriptionEditPart;
import AGSN.diagram.edit.parts.StrengthNameEditPart;
import AGSN.diagram.edit.parts.WeaknessDescriptionEditPart;
import AGSN.diagram.edit.parts.WeaknessNameEditPart;
import AGSN.diagram.parsers.MessageFormatParser;
import AGSN.diagram.part.AGSNVisualIDRegistry;

/**
 * @generated
 */
public class AGSNParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser moduleName_5039Parser;

	/**
	* @generated
	*/
	private IParser getModuleName_5039Parser() {
		if (moduleName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Module: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Module: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Module: {0}"); //$NON-NLS-1$
			moduleName_5039Parser = parser;
		}
		return moduleName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser moduleDescription_5040Parser;

	/**
	* @generated
	*/
	private IParser getModuleDescription_5040Parser() {
		if (moduleDescription_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			moduleDescription_5040Parser = parser;
		}
		return moduleDescription_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser contractName_5041Parser;

	/**
	* @generated
	*/
	private IParser getContractName_5041Parser() {
		if (contractName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Contract: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Contract: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Contract: {0}"); //$NON-NLS-1$
			contractName_5041Parser = parser;
		}
		return contractName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser contractDescription_5042Parser;

	/**
	* @generated
	*/
	private IParser getContractDescription_5042Parser() {
		if (contractDescription_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractDescription_5042Parser = parser;
		}
		return contractDescription_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser goalName_5015Parser;

	/**
	* @generated
	*/
	private IParser getGoalName_5015Parser() {
		if (goalName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Goal: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Goal: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Goal: {0}"); //$NON-NLS-1$
			goalName_5015Parser = parser;
		}
		return goalName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser goalDescription_5016Parser;

	/**
	* @generated
	*/
	private IParser getGoalDescription_5016Parser() {
		if (goalDescription_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalDescription_5016Parser = parser;
		}
		return goalDescription_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser strategyName_5017Parser;

	/**
	* @generated
	*/
	private IParser getStrategyName_5017Parser() {
		if (strategyName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Strategy: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Strategy: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Strategy: {0}"); //$NON-NLS-1$
			strategyName_5017Parser = parser;
		}
		return strategyName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser strategyDescription_5018Parser;

	/**
	* @generated
	*/
	private IParser getStrategyDescription_5018Parser() {
		if (strategyDescription_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strategyDescription_5018Parser = parser;
		}
		return strategyDescription_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser evidenceName_5019Parser;

	/**
	* @generated
	*/
	private IParser getEvidenceName_5019Parser() {
		if (evidenceName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Evidence: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Evidence: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Evidence: {0}"); //$NON-NLS-1$
			evidenceName_5019Parser = parser;
		}
		return evidenceName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser evidenceDescription_5020Parser;

	/**
	* @generated
	*/
	private IParser getEvidenceDescription_5020Parser() {
		if (evidenceDescription_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evidenceDescription_5020Parser = parser;
		}
		return evidenceDescription_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser contextName_5021Parser;

	/**
	* @generated
	*/
	private IParser getContextName_5021Parser() {
		if (contextName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Context: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Context: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Context: {0}"); //$NON-NLS-1$
			contextName_5021Parser = parser;
		}
		return contextName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser contextDescription_5022Parser;

	/**
	* @generated
	*/
	private IParser getContextDescription_5022Parser() {
		if (contextDescription_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextDescription_5022Parser = parser;
		}
		return contextDescription_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser justificationName_5023Parser;

	/**
	* @generated
	*/
	private IParser getJustificationName_5023Parser() {
		if (justificationName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Justification: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Justification: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Justification: {0}"); //$NON-NLS-1$
			justificationName_5023Parser = parser;
		}
		return justificationName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser justificationDescription_5024Parser;

	/**
	* @generated
	*/
	private IParser getJustificationDescription_5024Parser() {
		if (justificationDescription_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationDescription_5024Parser = parser;
		}
		return justificationDescription_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser assumptionName_5025Parser;

	/**
	* @generated
	*/
	private IParser getAssumptionName_5025Parser() {
		if (assumptionName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Assumption: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assumption: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assumption: {0}"); //$NON-NLS-1$
			assumptionName_5025Parser = parser;
		}
		return assumptionName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser assumptionDescription_5026Parser;

	/**
	* @generated
	*/
	private IParser getAssumptionDescription_5026Parser() {
		if (assumptionDescription_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionDescription_5026Parser = parser;
		}
		return assumptionDescription_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser additionalElementName_5037Parser;

	/**
	* @generated
	*/
	private IParser getAdditionalElementName_5037Parser() {
		if (additionalElementName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Additional Node: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Additional Node: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Additional Node: {0}"); //$NON-NLS-1$
			additionalElementName_5037Parser = parser;
		}
		return additionalElementName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser additionalElementDescription_5038Parser;

	/**
	* @generated
	*/
	private IParser getAdditionalElementDescription_5038Parser() {
		if (additionalElementDescription_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getBasicNode_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			additionalElementDescription_5038Parser = parser;
		}
		return additionalElementDescription_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser strengthName_5027Parser;

	/**
	* @generated
	*/
	private IParser getStrengthName_5027Parser() {
		if (strengthName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Strength: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Strength: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Strength: {0}"); //$NON-NLS-1$
			strengthName_5027Parser = parser;
		}
		return strengthName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser strengthDescription_5028Parser;

	/**
	* @generated
	*/
	private IParser getStrengthDescription_5028Parser() {
		if (strengthDescription_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strengthDescription_5028Parser = parser;
		}
		return strengthDescription_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser requiredActionName_5029Parser;

	/**
	* @generated
	*/
	private IParser getRequiredActionName_5029Parser() {
		if (requiredActionName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Required Action: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Required Action: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Required Action: {0}"); //$NON-NLS-1$
			requiredActionName_5029Parser = parser;
		}
		return requiredActionName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser requiredActionDescription_5030Parser;

	/**
	* @generated
	*/
	private IParser getRequiredActionDescription_5030Parser() {
		if (requiredActionDescription_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			requiredActionDescription_5030Parser = parser;
		}
		return requiredActionDescription_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser weaknessName_5031Parser;

	/**
	* @generated
	*/
	private IParser getWeaknessName_5031Parser() {
		if (weaknessName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Weakness: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Weakness: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Weakness: {0}"); //$NON-NLS-1$
			weaknessName_5031Parser = parser;
		}
		return weaknessName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser weaknessDescription_5032Parser;

	/**
	* @generated
	*/
	private IParser getWeaknessDescription_5032Parser() {
		if (weaknessDescription_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			weaknessDescription_5032Parser = parser;
		}
		return weaknessDescription_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser questionName_5033Parser;

	/**
	* @generated
	*/
	private IParser getQuestionName_5033Parser() {
		if (questionName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Question: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Question: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Question: {0}"); //$NON-NLS-1$
			questionName_5033Parser = parser;
		}
		return questionName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser questionDescription_5034Parser;

	/**
	* @generated
	*/
	private IParser getQuestionDescription_5034Parser() {
		if (questionDescription_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { AGSNPackage.eINSTANCE.getRecommendation_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			questionDescription_5034Parser = parser;
		}
		return questionDescription_5034Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ModuleNameEditPart.VISUAL_ID:
			return getModuleName_5039Parser();
		case ModuleDescriptionEditPart.VISUAL_ID:
			return getModuleDescription_5040Parser();
		case ContractNameEditPart.VISUAL_ID:
			return getContractName_5041Parser();
		case ContractDescriptionEditPart.VISUAL_ID:
			return getContractDescription_5042Parser();
		case GoalNameEditPart.VISUAL_ID:
			return getGoalName_5015Parser();
		case GoalDescriptionEditPart.VISUAL_ID:
			return getGoalDescription_5016Parser();
		case StrategyNameEditPart.VISUAL_ID:
			return getStrategyName_5017Parser();
		case StrategyDescriptionEditPart.VISUAL_ID:
			return getStrategyDescription_5018Parser();
		case EvidenceNameEditPart.VISUAL_ID:
			return getEvidenceName_5019Parser();
		case EvidenceDescriptionEditPart.VISUAL_ID:
			return getEvidenceDescription_5020Parser();
		case ContextNameEditPart.VISUAL_ID:
			return getContextName_5021Parser();
		case ContextDescriptionEditPart.VISUAL_ID:
			return getContextDescription_5022Parser();
		case JustificationNameEditPart.VISUAL_ID:
			return getJustificationName_5023Parser();
		case JustificationDescriptionEditPart.VISUAL_ID:
			return getJustificationDescription_5024Parser();
		case AssumptionNameEditPart.VISUAL_ID:
			return getAssumptionName_5025Parser();
		case AssumptionDescriptionEditPart.VISUAL_ID:
			return getAssumptionDescription_5026Parser();
		case AdditionalElementNameEditPart.VISUAL_ID:
			return getAdditionalElementName_5037Parser();
		case AdditionalElementDescriptionEditPart.VISUAL_ID:
			return getAdditionalElementDescription_5038Parser();
		case StrengthNameEditPart.VISUAL_ID:
			return getStrengthName_5027Parser();
		case StrengthDescriptionEditPart.VISUAL_ID:
			return getStrengthDescription_5028Parser();
		case RequiredActionNameEditPart.VISUAL_ID:
			return getRequiredActionName_5029Parser();
		case RequiredActionDescriptionEditPart.VISUAL_ID:
			return getRequiredActionDescription_5030Parser();
		case WeaknessNameEditPart.VISUAL_ID:
			return getWeaknessName_5031Parser();
		case WeaknessDescriptionEditPart.VISUAL_ID:
			return getWeaknessDescription_5032Parser();
		case QuestionNameEditPart.VISUAL_ID:
			return getQuestionName_5033Parser();
		case QuestionDescriptionEditPart.VISUAL_ID:
			return getQuestionDescription_5034Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(AGSNVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(AGSNVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (AGSNElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
