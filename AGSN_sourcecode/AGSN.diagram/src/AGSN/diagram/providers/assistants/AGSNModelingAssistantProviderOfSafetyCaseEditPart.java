/*
 * 
 */
package AGSN.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import AGSN.diagram.providers.AGSNElementTypes;
import AGSN.diagram.providers.AGSNModelingAssistantProvider;

/**
 * @generated
 */
public class AGSNModelingAssistantProviderOfSafetyCaseEditPart extends AGSNModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(13);
		types.add(AGSNElementTypes.Module_2019);
		types.add(AGSNElementTypes.Contract_2020);
		types.add(AGSNElementTypes.Goal_2007);
		types.add(AGSNElementTypes.Strategy_2008);
		types.add(AGSNElementTypes.Evidence_2009);
		types.add(AGSNElementTypes.Context_2010);
		types.add(AGSNElementTypes.Justification_2011);
		types.add(AGSNElementTypes.Assumption_2012);
		types.add(AGSNElementTypes.AdditionalElement_2018);
		types.add(AGSNElementTypes.Strength_2013);
		types.add(AGSNElementTypes.RequiredAction_2014);
		types.add(AGSNElementTypes.Weakness_2015);
		types.add(AGSNElementTypes.Question_2016);
		return types;
	}

}
