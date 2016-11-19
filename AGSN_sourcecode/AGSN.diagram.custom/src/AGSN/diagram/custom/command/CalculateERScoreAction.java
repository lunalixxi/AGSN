/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.custom.command;

import static AGSN.diagram.common.constant.SystemDefinitionConst.COLLECTION_INITIAL_CAPACITY;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import AGSN.BasicNode;
import AGSN.diagram.common.exception.DcaseRuntimeException;
import AGSN.diagram.common.exception.DcaseSystemException;
import AGSN.diagram.common.util.FunctionTypeImpl;
import AGSN.diagram.common.util.LinkManager;
import AGSN.diagram.common.util.Menus;
import AGSN.diagram.custom.common.util.AGSNEditorUtil;
import AGSN.diagram.custom.common.util.MessageWriter;
import AGSN.diagram.custom.assessmentER.Assessment;
import AGSN.diagram.custom.assessmentER.ChangeScoreTransactionCommand;
//import AGSN.diagram.custom.assessment.ChangeScoreTransactionCommand;
import AGSN.impl.SafetyCaseImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.impl.ViewImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An action to calculate the score.
 */
public class CalculateERScoreAction implements IObjectActionDelegate {

    /**
     * the action ID.
     */
    public static final String ID = "AGSN.diagram.custom.CalculateScoreActionID"; //$NON-NLS-1$ 

    /**
     * the selected element.
     */
    private GraphicalEditPart selectedElement;

    /**
     * Sets the active part for the delegate.
     * 
     * @param action
     *            the action proxy that handles presentation portion of the
     *            action; must not be null.
     * @param targetPart
     *            the new part target; must not be null.
     */
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    }

    /**
     * Calculates the scores and set them to each goal nodes.
     * 
     * @param action IAction.
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {

        Object model = selectedElement.getModel();
        if (model instanceof ViewImpl) {
            EObject eObj = ((ViewImpl) model).getElement();

            if (eObj instanceof SafetyCaseImpl) {
                XMLResource res = (XMLResource) eObj.eResource();
                LinkManager linkManager = new LinkManager();
                linkManager.load(res);
                Assessment assessment = new Assessment(linkManager);
                IFile diagramFile = AGSNEditorUtil.getCurrentDiagramFile();
                MessageWriter.clearMarkers(diagramFile,
                        FunctionTypeImpl.CALCULATE_SCORE);
                try {

                    // calculates the score.
                    assessment.calculateScore();

                    // creates the map of nodes to set the value of score attribute.
                    Map<BasicNode, double[]> changeNodeList = new HashMap<BasicNode, double[]>(
                            COLLECTION_INITIAL_CAPACITY);

                    for (Entry<String, double[]> entry : assessment
                            .getChangeList().entrySet()) {
                        changeNodeList.put(linkManager.getBasicNode(entry
                                .getKey()), entry.getValue());
                    }

                    // creates a transaction command to update properties.
                    ChangeScoreTransactionCommand tranCommand = new ChangeScoreTransactionCommand(
                            selectedElement.getEditingDomain(),
                            Menus.CalculateScoreAction_0, changeNodeList);

                    selectedElement.getDiagramEditDomain()
                            .getDiagramCommandStack().execute(
                                    new ICommandProxy(tranCommand));

                } catch (DcaseRuntimeException dcaseRuntimeException) {
                    dcaseRuntimeException.setResource(diagramFile);
                    MessageWriter
                            .writeMessageToProblemsView(dcaseRuntimeException);
                    MessageWriter.showMessageBoxSeeProblems();
                } catch (DcaseSystemException dcaseSystemException) {
                    MessageWriter.writeMessageToErrorLog(dcaseSystemException);
                    MessageWriter.showMessageBoxSeeErroLog();
                }

            }
        }

    }


    /**
     * Notifies this action delegate that the selection in the workbench has changed.
     * 
     * @param action the action proxy that handles presentation portion of 
     *      the action
     * @param selection the current selection, or null if there
     *      is no selection.
     */
    public void selectionChanged(IAction action, ISelection selection) {
        selectedElement = null;
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            if (structuredSelection.getFirstElement() instanceof GraphicalEditPart) {
                selectedElement = (GraphicalEditPart) structuredSelection
                        .getFirstElement();
            }
        }

    }

}
