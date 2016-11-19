
/*
 * 
 */
package AGSN.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import AGSN.diagram.providers.AGSNElementTypes;

/**
 * @generated
 */
public class AGSNPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
		paletteRoot.add(createCommentNodes3Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAdditionalElement1CreationTool());
		paletteContainer.add(createAssumption2CreationTool());
		paletteContainer.add(createContext3CreationTool());
		paletteContainer.add(createContract4CreationTool());
		paletteContainer.add(createEvidence5CreationTool());
		paletteContainer.add(createGoal6CreationTool());
		paletteContainer.add(createJustification7CreationTool());
		paletteContainer.add(createModule8CreationTool());
		paletteContainer.add(createStrategy9CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAdditionalLink1CreationTool());
		paletteContainer.add(createHasComment2CreationTool());
		paletteContainer.add(createInContextOf3CreationTool());
		paletteContainer.add(createSupportedBy4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Comment Nodes" palette tool group
	* @generated
	*/
	private PaletteContainer createCommentNodes3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.CommentNodes3Group_title);
		paletteContainer.setId("createCommentNodes3Group"); //$NON-NLS-1$
		paletteContainer.add(createStrength1CreationTool());
		paletteContainer.add(createQuestion2CreationTool());
		paletteContainer.add(createRequiredAction3CreationTool());
		paletteContainer.add(createWeakness4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdditionalElement1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AdditionalElement1CreationTool_title,
				Messages.AdditionalElement1CreationTool_desc,
				Collections.singletonList(AGSNElementTypes.AdditionalElement_2018));
		entry.setId("createAdditionalElement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.AdditionalElement_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssumption2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Assumption2CreationTool_title,
				Messages.Assumption2CreationTool_desc, Collections.singletonList(AGSNElementTypes.Assumption_2012));
		entry.setId("createAssumption2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Assumption_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContext3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Context3CreationTool_title,
				Messages.Context3CreationTool_desc, Collections.singletonList(AGSNElementTypes.Context_2010));
		entry.setId("createContext3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Context_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContract4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Contract4CreationTool_title,
				Messages.Contract4CreationTool_desc, Collections.singletonList(AGSNElementTypes.Contract_2020));
		entry.setId("createContract4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Contract_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEvidence5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Evidence5CreationTool_title,
				Messages.Evidence5CreationTool_desc, Collections.singletonList(AGSNElementTypes.Evidence_2009));
		entry.setId("createEvidence5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Evidence_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGoal6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Goal6CreationTool_title,
				Messages.Goal6CreationTool_desc, Collections.singletonList(AGSNElementTypes.Goal_2007));
		entry.setId("createGoal6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Goal_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJustification7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Justification7CreationTool_title,
				Messages.Justification7CreationTool_desc,
				Collections.singletonList(AGSNElementTypes.Justification_2011));
		entry.setId("createJustification7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Justification_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModule8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Module8CreationTool_title,
				Messages.Module8CreationTool_desc, Collections.singletonList(AGSNElementTypes.Module_2019));
		entry.setId("createModule8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Module_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStrategy9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Strategy9CreationTool_title,
				Messages.Strategy9CreationTool_desc, Collections.singletonList(AGSNElementTypes.Strategy_2008));
		entry.setId("createStrategy9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Strategy_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdditionalLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AdditionalLink1CreationTool_title,
				Messages.AdditionalLink1CreationTool_desc,
				Collections.singletonList(AGSNElementTypes.AdditionalLink_4005));
		entry.setId("createAdditionalLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.AdditionalLink_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHasComment2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.HasComment2CreationTool_title,
				Messages.HasComment2CreationTool_desc,
				Collections.singletonList(AGSNElementTypes.BasicNodeHasComment_4003));
		entry.setId("createHasComment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AGSNDiagramEditorPlugin.findImageDescriptor("/AGSN.edit/icons/full/obj16/BasicNodeHasComment.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInContextOf3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InContextOf3CreationTool_title,
				Messages.InContextOf3CreationTool_desc, Collections.singletonList(AGSNElementTypes.InContextOf_4001));
		entry.setId("createInContextOf3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.InContextOf_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSupportedBy4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SupportedBy4CreationTool_title,
				Messages.SupportedBy4CreationTool_desc, Collections.singletonList(AGSNElementTypes.SupportedBy_4002));
		entry.setId("createSupportedBy4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.SupportedBy_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStrength1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Strength1CreationTool_title,
				Messages.Strength1CreationTool_desc, Collections.singletonList(AGSNElementTypes.Strength_2013));
		entry.setId("createStrength1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Strength_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQuestion2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Question2CreationTool_title,
				Messages.Question2CreationTool_desc, Collections.singletonList(AGSNElementTypes.Question_2016));
		entry.setId("createQuestion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Question_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRequiredAction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RequiredAction3CreationTool_title,
				Messages.RequiredAction3CreationTool_desc,
				Collections.singletonList(AGSNElementTypes.RequiredAction_2014));
		entry.setId("createRequiredAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.RequiredAction_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWeakness4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Weakness4CreationTool_title,
				Messages.Weakness4CreationTool_desc, Collections.singletonList(AGSNElementTypes.Weakness_2015));
		entry.setId("createWeakness4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AGSNElementTypes.getImageDescriptor(AGSNElementTypes.Weakness_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
