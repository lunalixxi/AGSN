/*
 * 
 */
package AGSN.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import AGSN.diagram.edit.parts.WeaknessEditPart;
import AGSN.diagram.providers.AGSNElementTypes;
import AGSN.diagram.providers.AGSNModelingAssistantProvider;

/**
 * @generated
 */
public class AGSNModelingAssistantProviderOfWeaknessEditPart extends AGSNModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((WeaknessEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(WeaknessEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(AGSNElementTypes.BasicNodeHasComment_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((WeaknessEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(WeaknessEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AGSNElementTypes.BasicNodeHasComment_4003) {
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
