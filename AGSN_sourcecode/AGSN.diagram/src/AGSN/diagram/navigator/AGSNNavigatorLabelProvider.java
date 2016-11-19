/*
* 
*/
package AGSN.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import AGSN.AdditionalLink;
import AGSN.InContextOf;
import AGSN.SafetyCase;
import AGSN.SupportedBy;
import AGSN.diagram.edit.parts.AdditionalElementEditPart;
import AGSN.diagram.edit.parts.AdditionalElementNameEditPart;
import AGSN.diagram.edit.parts.AdditionalLinkEditPart;
import AGSN.diagram.edit.parts.AssumptionEditPart;
import AGSN.diagram.edit.parts.AssumptionNameEditPart;
import AGSN.diagram.edit.parts.BasicNodeHasCommentEditPart;
import AGSN.diagram.edit.parts.ContextEditPart;
import AGSN.diagram.edit.parts.ContextNameEditPart;
import AGSN.diagram.edit.parts.ContractEditPart;
import AGSN.diagram.edit.parts.ContractNameEditPart;
import AGSN.diagram.edit.parts.EvidenceEditPart;
import AGSN.diagram.edit.parts.EvidenceNameEditPart;
import AGSN.diagram.edit.parts.GoalEditPart;
import AGSN.diagram.edit.parts.GoalNameEditPart;
import AGSN.diagram.edit.parts.InContextOfEditPart;
import AGSN.diagram.edit.parts.JustificationEditPart;
import AGSN.diagram.edit.parts.JustificationNameEditPart;
import AGSN.diagram.edit.parts.ModuleEditPart;
import AGSN.diagram.edit.parts.ModuleNameEditPart;
import AGSN.diagram.edit.parts.QuestionEditPart;
import AGSN.diagram.edit.parts.QuestionNameEditPart;
import AGSN.diagram.edit.parts.RequiredActionEditPart;
import AGSN.diagram.edit.parts.RequiredActionNameEditPart;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;
import AGSN.diagram.edit.parts.StrategyEditPart;
import AGSN.diagram.edit.parts.StrategyNameEditPart;
import AGSN.diagram.edit.parts.StrengthEditPart;
import AGSN.diagram.edit.parts.StrengthNameEditPart;
import AGSN.diagram.edit.parts.SupportedByEditPart;
import AGSN.diagram.edit.parts.WeaknessEditPart;
import AGSN.diagram.edit.parts.WeaknessNameEditPart;
import AGSN.diagram.part.AGSNDiagramEditorPlugin;
import AGSN.diagram.part.AGSNVisualIDRegistry;
import AGSN.diagram.providers.AGSNElementTypes;
import AGSN.diagram.providers.AGSNParserProvider;

/**
 * @generated
 */
public class AGSNNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		AGSNDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		AGSNDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof AGSNNavigatorItem && !isOwnView(((AGSNNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof AGSNNavigatorGroup) {
			AGSNNavigatorGroup group = (AGSNNavigatorGroup) element;
			return AGSNDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof AGSNNavigatorItem) {
			AGSNNavigatorItem navigatorItem = (AGSNNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (AGSNVisualIDRegistry.getVisualID(view)) {
		case SafetyCaseEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?AGSN?SafetyCase", AGSNElementTypes.SafetyCase_1000); //$NON-NLS-1$
		case GoalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Goal", AGSNElementTypes.Goal_2007); //$NON-NLS-1$
		case StrategyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Strategy", AGSNElementTypes.Strategy_2008); //$NON-NLS-1$
		case EvidenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Evidence", AGSNElementTypes.Evidence_2009); //$NON-NLS-1$
		case ContextEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Context", AGSNElementTypes.Context_2010); //$NON-NLS-1$
		case JustificationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Justification", AGSNElementTypes.Justification_2011); //$NON-NLS-1$
		case AssumptionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Assumption", AGSNElementTypes.Assumption_2012); //$NON-NLS-1$
		case StrengthEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Strength", AGSNElementTypes.Strength_2013); //$NON-NLS-1$
		case RequiredActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?RequiredAction", AGSNElementTypes.RequiredAction_2014); //$NON-NLS-1$
		case WeaknessEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Weakness", AGSNElementTypes.Weakness_2015); //$NON-NLS-1$
		case QuestionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Question", AGSNElementTypes.Question_2016); //$NON-NLS-1$
		case AdditionalElementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?AdditionalElement", AGSNElementTypes.AdditionalElement_2018); //$NON-NLS-1$
		case ModuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Module", AGSNElementTypes.Module_2019); //$NON-NLS-1$
		case ContractEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?AGSN?Contract", AGSNElementTypes.Contract_2020); //$NON-NLS-1$
		case InContextOfEditPart.VISUAL_ID:
			return getImage("Navigator?Link?AGSN?InContextOf", AGSNElementTypes.InContextOf_4001); //$NON-NLS-1$
		case SupportedByEditPart.VISUAL_ID:
			return getImage("Navigator?Link?AGSN?SupportedBy", AGSNElementTypes.SupportedBy_4002); //$NON-NLS-1$
		case BasicNodeHasCommentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?AGSN?BasicNode?hasComment", AGSNElementTypes.BasicNodeHasComment_4003); //$NON-NLS-1$
		case AdditionalLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?AGSN?AdditionalLink", AGSNElementTypes.AdditionalLink_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AGSNDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && AGSNElementTypes.isKnownElementType(elementType)) {
			image = AGSNElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof AGSNNavigatorGroup) {
			AGSNNavigatorGroup group = (AGSNNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof AGSNNavigatorItem) {
			AGSNNavigatorItem navigatorItem = (AGSNNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (AGSNVisualIDRegistry.getVisualID(view)) {
		case SafetyCaseEditPart.VISUAL_ID:
			return getSafetyCase_1000Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2007Text(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2008Text(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2009Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2010Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2011Text(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2012Text(view);
		case StrengthEditPart.VISUAL_ID:
			return getStrength_2013Text(view);
		case RequiredActionEditPart.VISUAL_ID:
			return getRequiredAction_2014Text(view);
		case WeaknessEditPart.VISUAL_ID:
			return getWeakness_2015Text(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2016Text(view);
		case AdditionalElementEditPart.VISUAL_ID:
			return getAdditionalElement_2018Text(view);
		case ModuleEditPart.VISUAL_ID:
			return getModule_2019Text(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2020Text(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4001Text(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4002Text(view);
		case BasicNodeHasCommentEditPart.VISUAL_ID:
			return getBasicNodeHasComment_4003Text(view);
		case AdditionalLinkEditPart.VISUAL_ID:
			return getAdditionalLink_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getSafetyCase_1000Text(View view) {
		SafetyCase domainModelElement = (SafetyCase) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGoal_2007Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Goal_2007,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(GoalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStrategy_2008Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Strategy_2008,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(StrategyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvidence_2009Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Evidence_2009,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(EvidenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContext_2010Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Context_2010,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(ContextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJustification_2011Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Justification_2011,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(JustificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssumption_2012Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Assumption_2012,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(AssumptionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStrength_2013Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Strength_2013,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(StrengthNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRequiredAction_2014Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.RequiredAction_2014,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(RequiredActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWeakness_2015Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Weakness_2015,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(WeaknessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQuestion_2016Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Question_2016,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(QuestionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdditionalElement_2018Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.AdditionalElement_2018,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(AdditionalElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModule_2019Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Module_2019,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(ModuleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContract_2020Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.Contract_2020,
				view.getElement() != null ? view.getElement() : view,
				AGSNVisualIDRegistry.getType(ContractNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInContextOf_4001Text(View view) {
		InContextOf domainModelElement = (InContextOf) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupportedBy_4002Text(View view) {
		SupportedBy domainModelElement = (SupportedBy) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBasicNodeHasComment_4003Text(View view) {
		IParser parser = AGSNParserProvider.getParser(AGSNElementTypes.BasicNodeHasComment_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdditionalLink_4005Text(View view) {
		AdditionalLink domainModelElement = (AdditionalLink) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			AGSNDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return SafetyCaseEditPart.MODEL_ID.equals(AGSNVisualIDRegistry.getModelID(view));
	}

}
