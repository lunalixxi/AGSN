/*
 * 
 */
package AGSN.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import AGSN.AGSNPackage;
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
import AGSN.diagram.part.AGSNDiagramEditorPlugin;

/**
 * @generated
 */
public class AGSNElementTypes {

	/**
	* @generated
	*/
	private AGSNElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			AGSNDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType SafetyCase_1000 = getElementType("AGSN.diagram.SafetyCase_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Module_2019 = getElementType("AGSN.diagram.Module_2019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Contract_2020 = getElementType("AGSN.diagram.Contract_2020"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Goal_2007 = getElementType("AGSN.diagram.Goal_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Strategy_2008 = getElementType("AGSN.diagram.Strategy_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Evidence_2009 = getElementType("AGSN.diagram.Evidence_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Context_2010 = getElementType("AGSN.diagram.Context_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Justification_2011 = getElementType("AGSN.diagram.Justification_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assumption_2012 = getElementType("AGSN.diagram.Assumption_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdditionalElement_2018 = getElementType("AGSN.diagram.AdditionalElement_2018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Strength_2013 = getElementType("AGSN.diagram.Strength_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RequiredAction_2014 = getElementType("AGSN.diagram.RequiredAction_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Weakness_2015 = getElementType("AGSN.diagram.Weakness_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Question_2016 = getElementType("AGSN.diagram.Question_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InContextOf_4001 = getElementType("AGSN.diagram.InContextOf_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SupportedBy_4002 = getElementType("AGSN.diagram.SupportedBy_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AdditionalLink_4005 = getElementType("AGSN.diagram.AdditionalLink_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BasicNodeHasComment_4003 = getElementType("AGSN.diagram.BasicNodeHasComment_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(SafetyCase_1000, AGSNPackage.eINSTANCE.getSafetyCase());

			elements.put(Module_2019, AGSNPackage.eINSTANCE.getModule());

			elements.put(Contract_2020, AGSNPackage.eINSTANCE.getContract());

			elements.put(Goal_2007, AGSNPackage.eINSTANCE.getGoal());

			elements.put(Strategy_2008, AGSNPackage.eINSTANCE.getStrategy());

			elements.put(Evidence_2009, AGSNPackage.eINSTANCE.getEvidence());

			elements.put(Context_2010, AGSNPackage.eINSTANCE.getContext());

			elements.put(Justification_2011, AGSNPackage.eINSTANCE.getJustification());

			elements.put(Assumption_2012, AGSNPackage.eINSTANCE.getAssumption());

			elements.put(AdditionalElement_2018, AGSNPackage.eINSTANCE.getAdditionalElement());

			elements.put(Strength_2013, AGSNPackage.eINSTANCE.getStrength());

			elements.put(RequiredAction_2014, AGSNPackage.eINSTANCE.getRequiredAction());

			elements.put(Weakness_2015, AGSNPackage.eINSTANCE.getWeakness());

			elements.put(Question_2016, AGSNPackage.eINSTANCE.getQuestion());

			elements.put(InContextOf_4001, AGSNPackage.eINSTANCE.getInContextOf());

			elements.put(SupportedBy_4002, AGSNPackage.eINSTANCE.getSupportedBy());

			elements.put(AdditionalLink_4005, AGSNPackage.eINSTANCE.getAdditionalLink());

			elements.put(BasicNodeHasComment_4003, AGSNPackage.eINSTANCE.getBasicNode_HasComment());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(SafetyCase_1000);
			KNOWN_ELEMENT_TYPES.add(Module_2019);
			KNOWN_ELEMENT_TYPES.add(Contract_2020);
			KNOWN_ELEMENT_TYPES.add(Goal_2007);
			KNOWN_ELEMENT_TYPES.add(Strategy_2008);
			KNOWN_ELEMENT_TYPES.add(Evidence_2009);
			KNOWN_ELEMENT_TYPES.add(Context_2010);
			KNOWN_ELEMENT_TYPES.add(Justification_2011);
			KNOWN_ELEMENT_TYPES.add(Assumption_2012);
			KNOWN_ELEMENT_TYPES.add(AdditionalElement_2018);
			KNOWN_ELEMENT_TYPES.add(Strength_2013);
			KNOWN_ELEMENT_TYPES.add(RequiredAction_2014);
			KNOWN_ELEMENT_TYPES.add(Weakness_2015);
			KNOWN_ELEMENT_TYPES.add(Question_2016);
			KNOWN_ELEMENT_TYPES.add(InContextOf_4001);
			KNOWN_ELEMENT_TYPES.add(SupportedBy_4002);
			KNOWN_ELEMENT_TYPES.add(AdditionalLink_4005);
			KNOWN_ELEMENT_TYPES.add(BasicNodeHasComment_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SafetyCaseEditPart.VISUAL_ID:
			return SafetyCase_1000;
		case ModuleEditPart.VISUAL_ID:
			return Module_2019;
		case ContractEditPart.VISUAL_ID:
			return Contract_2020;
		case GoalEditPart.VISUAL_ID:
			return Goal_2007;
		case StrategyEditPart.VISUAL_ID:
			return Strategy_2008;
		case EvidenceEditPart.VISUAL_ID:
			return Evidence_2009;
		case ContextEditPart.VISUAL_ID:
			return Context_2010;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2011;
		case AssumptionEditPart.VISUAL_ID:
			return Assumption_2012;
		case AdditionalElementEditPart.VISUAL_ID:
			return AdditionalElement_2018;
		case StrengthEditPart.VISUAL_ID:
			return Strength_2013;
		case RequiredActionEditPart.VISUAL_ID:
			return RequiredAction_2014;
		case WeaknessEditPart.VISUAL_ID:
			return Weakness_2015;
		case QuestionEditPart.VISUAL_ID:
			return Question_2016;
		case InContextOfEditPart.VISUAL_ID:
			return InContextOf_4001;
		case SupportedByEditPart.VISUAL_ID:
			return SupportedBy_4002;
		case AdditionalLinkEditPart.VISUAL_ID:
			return AdditionalLink_4005;
		case BasicNodeHasCommentEditPart.VISUAL_ID:
			return BasicNodeHasComment_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return AGSN.diagram.providers.AGSNElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return AGSN.diagram.providers.AGSNElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return AGSN.diagram.providers.AGSNElementTypes.getElement(elementTypeAdapter);
		}
	};

}
