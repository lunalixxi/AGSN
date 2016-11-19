/*
 * 
 */
package AGSN.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import AGSN.diagram.edit.parts.AdditionalElementEditPart;
import AGSN.diagram.edit.parts.AssumptionEditPart;
import AGSN.diagram.edit.parts.ContextEditPart;
import AGSN.diagram.edit.parts.ContractEditPart;
import AGSN.diagram.edit.parts.EvidenceEditPart;
import AGSN.diagram.edit.parts.GoalEditPart;
import AGSN.diagram.edit.parts.JustificationEditPart;
import AGSN.diagram.edit.parts.ModuleEditPart;
import AGSN.diagram.edit.parts.QuestionEditPart;
import AGSN.diagram.edit.parts.RequiredActionEditPart;
import AGSN.diagram.edit.parts.StrategyEditPart;
import AGSN.diagram.edit.parts.StrengthEditPart;
import AGSN.diagram.edit.parts.WeaknessEditPart;
import AGSN.diagram.providers.AGSNElementTypes;
import AGSN.diagram.providers.AGSNModelingAssistantProvider;

/**
 * @generated
 */
public class AGSNModelingAssistantProviderOfContextEditPart extends AGSNModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ContextEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ContextEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(AGSNElementTypes.InContextOf_4001);
		types.add(AGSNElementTypes.SupportedBy_4002);
		types.add(AGSNElementTypes.AdditionalLink_4005);
		types.add(AGSNElementTypes.BasicNodeHasComment_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ContextEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ContextEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ModuleEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof ContractEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof GoalEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof StrategyEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof EvidenceEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof ContextEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof AdditionalElementEditPart) {
			types.add(AGSNElementTypes.InContextOf_4001);
		}
		if (targetEditPart instanceof ModuleEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof ContractEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof GoalEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof StrategyEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof EvidenceEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof ContextEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof AdditionalElementEditPart) {
			types.add(AGSNElementTypes.SupportedBy_4002);
		}
		if (targetEditPart instanceof ModuleEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof ContractEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof GoalEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof StrategyEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof EvidenceEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof ContextEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof AdditionalElementEditPart) {
			types.add(AGSNElementTypes.AdditionalLink_4005);
		}
		if (targetEditPart instanceof StrengthEditPart) {
			types.add(AGSNElementTypes.BasicNodeHasComment_4003);
		}
		if (targetEditPart instanceof RequiredActionEditPart) {
			types.add(AGSNElementTypes.BasicNodeHasComment_4003);
		}
		if (targetEditPart instanceof WeaknessEditPart) {
			types.add(AGSNElementTypes.BasicNodeHasComment_4003);
		}
		if (targetEditPart instanceof QuestionEditPart) {
			types.add(AGSNElementTypes.BasicNodeHasComment_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ContextEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ContextEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AGSNElementTypes.InContextOf_4001) {
			types.add(AGSNElementTypes.Module_2019);
			types.add(AGSNElementTypes.Contract_2020);
			types.add(AGSNElementTypes.Goal_2007);
			types.add(AGSNElementTypes.Strategy_2008);
			types.add(AGSNElementTypes.Evidence_2009);
			types.add(AGSNElementTypes.Context_2010);
			types.add(AGSNElementTypes.Justification_2011);
			types.add(AGSNElementTypes.Assumption_2012);
			types.add(AGSNElementTypes.AdditionalElement_2018);
		} else if (relationshipType == AGSNElementTypes.SupportedBy_4002) {
			types.add(AGSNElementTypes.Module_2019);
			types.add(AGSNElementTypes.Contract_2020);
			types.add(AGSNElementTypes.Goal_2007);
			types.add(AGSNElementTypes.Strategy_2008);
			types.add(AGSNElementTypes.Evidence_2009);
			types.add(AGSNElementTypes.Context_2010);
			types.add(AGSNElementTypes.Justification_2011);
			types.add(AGSNElementTypes.Assumption_2012);
			types.add(AGSNElementTypes.AdditionalElement_2018);
		} else if (relationshipType == AGSNElementTypes.AdditionalLink_4005) {
			types.add(AGSNElementTypes.Module_2019);
			types.add(AGSNElementTypes.Contract_2020);
			types.add(AGSNElementTypes.Goal_2007);
			types.add(AGSNElementTypes.Strategy_2008);
			types.add(AGSNElementTypes.Evidence_2009);
			types.add(AGSNElementTypes.Context_2010);
			types.add(AGSNElementTypes.Justification_2011);
			types.add(AGSNElementTypes.Assumption_2012);
			types.add(AGSNElementTypes.AdditionalElement_2018);
		} else if (relationshipType == AGSNElementTypes.BasicNodeHasComment_4003) {
			types.add(AGSNElementTypes.Strength_2013);
			types.add(AGSNElementTypes.RequiredAction_2014);
			types.add(AGSNElementTypes.Weakness_2015);
			types.add(AGSNElementTypes.Question_2016);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ContextEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ContextEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(AGSNElementTypes.InContextOf_4001);
		types.add(AGSNElementTypes.SupportedBy_4002);
		types.add(AGSNElementTypes.AdditionalLink_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ContextEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ContextEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AGSNElementTypes.InContextOf_4001) {
			types.add(AGSNElementTypes.Module_2019);
			types.add(AGSNElementTypes.Contract_2020);
			types.add(AGSNElementTypes.Goal_2007);
			types.add(AGSNElementTypes.Strategy_2008);
			types.add(AGSNElementTypes.Evidence_2009);
			types.add(AGSNElementTypes.Context_2010);
			types.add(AGSNElementTypes.Justification_2011);
			types.add(AGSNElementTypes.Assumption_2012);
			types.add(AGSNElementTypes.AdditionalElement_2018);
		} else if (relationshipType == AGSNElementTypes.SupportedBy_4002) {
			types.add(AGSNElementTypes.Module_2019);
			types.add(AGSNElementTypes.Contract_2020);
			types.add(AGSNElementTypes.Goal_2007);
			types.add(AGSNElementTypes.Strategy_2008);
			types.add(AGSNElementTypes.Evidence_2009);
			types.add(AGSNElementTypes.Context_2010);
			types.add(AGSNElementTypes.Justification_2011);
			types.add(AGSNElementTypes.Assumption_2012);
			types.add(AGSNElementTypes.AdditionalElement_2018);
		} else if (relationshipType == AGSNElementTypes.AdditionalLink_4005) {
			types.add(AGSNElementTypes.Module_2019);
			types.add(AGSNElementTypes.Contract_2020);
			types.add(AGSNElementTypes.Goal_2007);
			types.add(AGSNElementTypes.Strategy_2008);
			types.add(AGSNElementTypes.Evidence_2009);
			types.add(AGSNElementTypes.Context_2010);
			types.add(AGSNElementTypes.Justification_2011);
			types.add(AGSNElementTypes.Assumption_2012);
			types.add(AGSNElementTypes.AdditionalElement_2018);
		}
		return types;
	}

}
