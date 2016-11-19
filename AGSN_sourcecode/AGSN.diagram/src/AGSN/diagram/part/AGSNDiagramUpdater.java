/*
* 
*/
package AGSN.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import AGSN.AGSNPackage;
import AGSN.AdditionalElement;
import AGSN.AdditionalLink;
import AGSN.Assumption;
import AGSN.BasicNode;
import AGSN.Context;
import AGSN.Contract;
import AGSN.Evidence;
import AGSN.Goal;
import AGSN.InContextOf;
import AGSN.Justification;
import AGSN.Module;
import AGSN.Question;
import AGSN.Recommendation;
import AGSN.RequiredAction;
import AGSN.SafetyCase;
import AGSN.Strategy;
import AGSN.Strength;
import AGSN.SupportedBy;
import AGSN.Weakness;
import AGSN.diagram.edit.parts.AdditionalElementEditPart;
import AGSN.diagram.edit.parts.AdditionalLinkEditPart;
import AGSN.diagram.edit.parts.AssumptionEditPart;
import AGSN.diagram.edit.parts.BasicNodeHasCommentEditPart;
import AGSN.diagram.edit.parts.ContextEditPart;
import AGSN.diagram.edit.parts.ContractEditPart;
import AGSN.diagram.edit.parts.EvidenceEditPart;
import AGSN.diagram.edit.parts.GoalEditPart;
import AGSN.diagram.edit.parts.InContextOfEditPart;
import AGSN.diagram.edit.parts.JustificationEditPart;
import AGSN.diagram.edit.parts.ModuleEditPart;
import AGSN.diagram.edit.parts.QuestionEditPart;
import AGSN.diagram.edit.parts.RequiredActionEditPart;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;
import AGSN.diagram.edit.parts.StrategyEditPart;
import AGSN.diagram.edit.parts.StrengthEditPart;
import AGSN.diagram.edit.parts.SupportedByEditPart;
import AGSN.diagram.edit.parts.WeaknessEditPart;
import AGSN.diagram.providers.AGSNElementTypes;

/**
 * @generated
 */
public class AGSNDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<AGSNNodeDescriptor> getSemanticChildren(View view) {
		switch (AGSNVisualIDRegistry.getVisualID(view)) {
		case SafetyCaseEditPart.VISUAL_ID:
			return getSafetyCase_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AGSNNodeDescriptor> getSafetyCase_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SafetyCase modelElement = (SafetyCase) view.getElement();
		LinkedList<AGSNNodeDescriptor> result = new LinkedList<AGSNNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRootBasicNode().iterator(); it.hasNext();) {
			BasicNode childElement = (BasicNode) it.next();
			int visualID = AGSNVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModuleEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContractEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GoalEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StrategyEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EvidenceEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JustificationEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssumptionEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdditionalElementEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRootCommendation().iterator(); it.hasNext();) {
			Recommendation childElement = (Recommendation) it.next();
			int visualID = AGSNVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StrengthEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RequiredActionEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WeaknessEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == QuestionEditPart.VISUAL_ID) {
				result.add(new AGSNNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getContainedLinks(View view) {
		switch (AGSNVisualIDRegistry.getVisualID(view)) {
		case SafetyCaseEditPart.VISUAL_ID:
			return getSafetyCase_1000ContainedLinks(view);
		case ModuleEditPart.VISUAL_ID:
			return getModule_2019ContainedLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2020ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2007ContainedLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2008ContainedLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2009ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2010ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2011ContainedLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2012ContainedLinks(view);
		case AdditionalElementEditPart.VISUAL_ID:
			return getAdditionalElement_2018ContainedLinks(view);
		case StrengthEditPart.VISUAL_ID:
			return getStrength_2013ContainedLinks(view);
		case RequiredActionEditPart.VISUAL_ID:
			return getRequiredAction_2014ContainedLinks(view);
		case WeaknessEditPart.VISUAL_ID:
			return getWeakness_2015ContainedLinks(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2016ContainedLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4001ContainedLinks(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4002ContainedLinks(view);
		case AdditionalLinkEditPart.VISUAL_ID:
			return getAdditionalLink_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getIncomingLinks(View view) {
		switch (AGSNVisualIDRegistry.getVisualID(view)) {
		case ModuleEditPart.VISUAL_ID:
			return getModule_2019IncomingLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2020IncomingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2007IncomingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2008IncomingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2009IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2010IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2011IncomingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2012IncomingLinks(view);
		case AdditionalElementEditPart.VISUAL_ID:
			return getAdditionalElement_2018IncomingLinks(view);
		case StrengthEditPart.VISUAL_ID:
			return getStrength_2013IncomingLinks(view);
		case RequiredActionEditPart.VISUAL_ID:
			return getRequiredAction_2014IncomingLinks(view);
		case WeaknessEditPart.VISUAL_ID:
			return getWeakness_2015IncomingLinks(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2016IncomingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4001IncomingLinks(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4002IncomingLinks(view);
		case AdditionalLinkEditPart.VISUAL_ID:
			return getAdditionalLink_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getOutgoingLinks(View view) {
		switch (AGSNVisualIDRegistry.getVisualID(view)) {
		case ModuleEditPart.VISUAL_ID:
			return getModule_2019OutgoingLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2020OutgoingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2007OutgoingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2008OutgoingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2009OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2010OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2011OutgoingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2012OutgoingLinks(view);
		case AdditionalElementEditPart.VISUAL_ID:
			return getAdditionalElement_2018OutgoingLinks(view);
		case StrengthEditPart.VISUAL_ID:
			return getStrength_2013OutgoingLinks(view);
		case RequiredActionEditPart.VISUAL_ID:
			return getRequiredAction_2014OutgoingLinks(view);
		case WeaknessEditPart.VISUAL_ID:
			return getWeakness_2015OutgoingLinks(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2016OutgoingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4001OutgoingLinks(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4002OutgoingLinks(view);
		case AdditionalLinkEditPart.VISUAL_ID:
			return getAdditionalLink_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getSafetyCase_1000ContainedLinks(View view) {
		SafetyCase modelElement = (SafetyCase) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getModule_2019ContainedLinks(View view) {
		Module modelElement = (Module) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getContract_2020ContainedLinks(View view) {
		Contract modelElement = (Contract) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getGoal_2007ContainedLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getStrategy_2008ContainedLinks(View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getEvidence_2009ContainedLinks(View view) {
		Evidence modelElement = (Evidence) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getContext_2010ContainedLinks(View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getJustification_2011ContainedLinks(View view) {
		Justification modelElement = (Justification) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAssumption_2012ContainedLinks(View view) {
		Assumption modelElement = (Assumption) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAdditionalElement_2018ContainedLinks(View view) {
		AdditionalElement modelElement = (AdditionalElement) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getStrength_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getRequiredAction_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getWeakness_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getQuestion_2016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getInContextOf_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getSupportedBy_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAdditionalLink_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getModule_2019IncomingLinks(View view) {
		Module modelElement = (Module) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getContract_2020IncomingLinks(View view) {
		Contract modelElement = (Contract) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getGoal_2007IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getStrategy_2008IncomingLinks(View view) {
		Strategy modelElement = (Strategy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getEvidence_2009IncomingLinks(View view) {
		Evidence modelElement = (Evidence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getContext_2010IncomingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getJustification_2011IncomingLinks(View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAssumption_2012IncomingLinks(View view) {
		Assumption modelElement = (Assumption) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAdditionalElement_2018IncomingLinks(View view) {
		AdditionalElement modelElement = (AdditionalElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AdditionalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getStrength_2013IncomingLinks(View view) {
		Strength modelElement = (Strength) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getRequiredAction_2014IncomingLinks(View view) {
		RequiredAction modelElement = (RequiredAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getWeakness_2015IncomingLinks(View view) {
		Weakness modelElement = (Weakness) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getQuestion_2016IncomingLinks(View view) {
		Question modelElement = (Question) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getInContextOf_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getSupportedBy_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAdditionalLink_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getModule_2019OutgoingLinks(View view) {
		Module modelElement = (Module) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<AGSNLinkDescriptor> getContract_2020OutgoingLinks(View view) {
		Contract modelElement = (Contract) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getGoal_2007OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getStrategy_2008OutgoingLinks(View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getEvidence_2009OutgoingLinks(View view) {
		Evidence modelElement = (Evidence) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getContext_2010OutgoingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getJustification_2011OutgoingLinks(View view) {
		Justification modelElement = (Justification) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAssumption_2012OutgoingLinks(View view) {
		Assumption modelElement = (Assumption) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAdditionalElement_2018OutgoingLinks(View view) {
		AdditionalElement modelElement = (AdditionalElement) view.getElement();
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AdditionalLink_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getStrength_2013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getRequiredAction_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getWeakness_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getQuestion_2016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getInContextOf_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getSupportedBy_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AGSNLinkDescriptor> getAdditionalLink_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<AGSNLinkDescriptor> getContainedTypeModelFacetLinks_InContextOf_4001(
			SafetyCase container) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		for (Iterator<?> links = container.getRootBasicLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) linkObject;
			if (InContextOfEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode dst = link.getTarget();
			BasicNode src = link.getSource();
			result.add(new AGSNLinkDescriptor(src, dst, link, AGSNElementTypes.InContextOf_4001,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AGSNLinkDescriptor> getContainedTypeModelFacetLinks_SupportedBy_4002(
			SafetyCase container) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		for (Iterator<?> links = container.getRootBasicLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SupportedBy) {
				continue;
			}
			SupportedBy link = (SupportedBy) linkObject;
			if (SupportedByEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode dst = link.getTarget();
			BasicNode src = link.getSource();
			result.add(new AGSNLinkDescriptor(src, dst, link, AGSNElementTypes.SupportedBy_4002,
					SupportedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AGSNLinkDescriptor> getContainedTypeModelFacetLinks_AdditionalLink_4005(
			SafetyCase container) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		for (Iterator<?> links = container.getRootBasicLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AdditionalLink) {
				continue;
			}
			AdditionalLink link = (AdditionalLink) linkObject;
			if (AdditionalLinkEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode dst = link.getTarget();
			BasicNode src = link.getSource();
			result.add(new AGSNLinkDescriptor(src, dst, link, AGSNElementTypes.AdditionalLink_4005,
					AdditionalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AGSNLinkDescriptor> getIncomingTypeModelFacetLinks_InContextOf_4001(BasicNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AGSNPackage.eINSTANCE.getBasicLink_Target()
					|| false == setting.getEObject() instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) setting.getEObject();
			if (InContextOfEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode src = link.getSource();
			result.add(new AGSNLinkDescriptor(src, target, link, AGSNElementTypes.InContextOf_4001,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AGSNLinkDescriptor> getIncomingTypeModelFacetLinks_SupportedBy_4002(BasicNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AGSNPackage.eINSTANCE.getBasicLink_Target()
					|| false == setting.getEObject() instanceof SupportedBy) {
				continue;
			}
			SupportedBy link = (SupportedBy) setting.getEObject();
			if (SupportedByEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode src = link.getSource();
			result.add(new AGSNLinkDescriptor(src, target, link, AGSNElementTypes.SupportedBy_4002,
					SupportedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AGSNLinkDescriptor> getIncomingTypeModelFacetLinks_AdditionalLink_4005(BasicNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AGSNPackage.eINSTANCE.getBasicLink_Target()
					|| false == setting.getEObject() instanceof AdditionalLink) {
				continue;
			}
			AdditionalLink link = (AdditionalLink) setting.getEObject();
			if (AdditionalLinkEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode src = link.getSource();
			result.add(new AGSNLinkDescriptor(src, target, link, AGSNElementTypes.AdditionalLink_4005,
					AdditionalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AGSNLinkDescriptor> getIncomingFeatureModelFacetLinks_BasicNode_HasComment_4003(
			Recommendation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AGSNPackage.eINSTANCE.getBasicNode_HasComment()) {
				result.add(new AGSNLinkDescriptor(setting.getEObject(), target,
						AGSNElementTypes.BasicNodeHasComment_4003, BasicNodeHasCommentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AGSNLinkDescriptor> getOutgoingTypeModelFacetLinks_InContextOf_4001(BasicNode source) {
		SafetyCase container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof SafetyCase) {
				container = (SafetyCase) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		for (Iterator<?> links = container.getRootBasicLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) linkObject;
			if (InContextOfEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode dst = link.getTarget();
			BasicNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AGSNLinkDescriptor(src, dst, link, AGSNElementTypes.InContextOf_4001,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AGSNLinkDescriptor> getOutgoingTypeModelFacetLinks_SupportedBy_4002(BasicNode source) {
		SafetyCase container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof SafetyCase) {
				container = (SafetyCase) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		for (Iterator<?> links = container.getRootBasicLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SupportedBy) {
				continue;
			}
			SupportedBy link = (SupportedBy) linkObject;
			if (SupportedByEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode dst = link.getTarget();
			BasicNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AGSNLinkDescriptor(src, dst, link, AGSNElementTypes.SupportedBy_4002,
					SupportedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AGSNLinkDescriptor> getOutgoingTypeModelFacetLinks_AdditionalLink_4005(BasicNode source) {
		SafetyCase container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof SafetyCase) {
				container = (SafetyCase) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		for (Iterator<?> links = container.getRootBasicLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AdditionalLink) {
				continue;
			}
			AdditionalLink link = (AdditionalLink) linkObject;
			if (AdditionalLinkEditPart.VISUAL_ID != AGSNVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BasicNode dst = link.getTarget();
			BasicNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AGSNLinkDescriptor(src, dst, link, AGSNElementTypes.AdditionalLink_4005,
					AdditionalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AGSNLinkDescriptor> getOutgoingFeatureModelFacetLinks_BasicNode_HasComment_4003(
			BasicNode source) {
		LinkedList<AGSNLinkDescriptor> result = new LinkedList<AGSNLinkDescriptor>();
		Recommendation destination = source.getHasComment();
		if (destination == null) {
			return result;
		}
		result.add(new AGSNLinkDescriptor(source, destination, AGSNElementTypes.BasicNodeHasComment_4003,
				BasicNodeHasCommentEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<AGSNNodeDescriptor> getSemanticChildren(View view) {
			return AGSNDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<AGSNLinkDescriptor> getContainedLinks(View view) {
			return AGSNDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<AGSNLinkDescriptor> getIncomingLinks(View view) {
			return AGSNDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<AGSNLinkDescriptor> getOutgoingLinks(View view) {
			return AGSNDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
