/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.custom.command;


import AGSN.AdditionalElement;
import AGSN.BasicNode;
import AGSN.Contract;
import AGSN.Evidence;
import AGSN.Module;
import AGSN.diagram.common.exception.DcaseRuntimeException;
import AGSN.diagram.common.exception.DcaseSystemException;
import AGSN.diagram.common.util.FileUtil;
import AGSN.diagram.common.util.MessageTypeImpl;
import AGSN.diagram.common.util.Messages;
import AGSN.diagram.custom.common.util.MessageWriter;
import AGSN.diagram.custom.common.util.ModuleUtil;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * A handler to open attachment with the default editor.
 */
public class OpenDefaultEditorHandler extends AbstractEditPartHandler {

    /**
     * Opens attachment with the default editor.
     * 
     * @param event ExecutionEvent
     * @return the result of the execution.
     * @throws ExecutionException if an exception occurred during execution.
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {

        // gets the selected node.
        GraphicalEditPart selectedElement = getSelectedElement(event);

        if (selectedElement != null) {
            try {
                // gets the BasicNode object.
                BasicNode basicNode = getBasicNode(selectedElement);

                // gets the IFile object that represents attachment.
                IFile file = getIFile(basicNode);

                // opens the attachment with default editor.
                openFileEditor(file);

            } catch (DcaseRuntimeException dre) {
                // handles the runtime exception.
                MessageWriter.showErrorMessageBox(dre.getMessage());
            } catch (DcaseSystemException dse) {
                // handles the d-case system exception.
                MessageWriter.writeMessageToErrorLog(dse);
                MessageWriter.showMessageBoxSeeErroLog();
            }
        }
        return null;
    }

    /**
     * Returns the IFile object that represents attachment.
     * 
     * @param basicNode the BasicNode object.
     * @return the IFile object that represents attachment.
     */
    private IFile getIFile(BasicNode basicNode) {

        // gets the file path.
    	String filePath = "";
    	if (basicNode instanceof Evidence){
         filePath = ((Evidence) basicNode).getAttachment();
    	}else if (basicNode instanceof AdditionalElement){
    		filePath = ((AdditionalElement) basicNode).getAttachment();
    	}else if (basicNode instanceof Module){
    		filePath = ((Module) basicNode).getAttachment();
    	}else if (basicNode instanceof Contract){
    		filePath = ((Contract) basicNode).getAttachment();
    	}

        // throws exception if the path is null or empty.
        if (filePath == null || filePath.trim().length() == 0) {
            throw new DcaseRuntimeException(
                    Messages.OpenDefaultEditorHandler_0, null, null, 0,
                    MessageTypeImpl.OPEN_ATTACHMENT_INVALID_FILE);
        }
        // get the full path for module
        if(!filePath.startsWith("/")){
        	IPath path = ModuleUtil.getDiagramPath(filePath);
        	filePath = path.toString();
        }
        // gets the IFile object.
        IFile file = FileUtil.getWorkspaceFileFromPath(filePath);

        // throws exception if the file doesn't exist.
        if (file == null || !file.exists()) {
            throw new DcaseRuntimeException(
                    Messages.OpenDefaultEditorHandler_1, null, null, 0,
                    MessageTypeImpl.OPEN_ATTACHMENT_INVALID_FILE);
        }

         return file;
    }

    /**
     * Opens the file with the default editor.
     * 
     * @param file the file to open.
     */
    private void openFileEditor(IFile file) {

        IWorkbenchPage workbenchPage = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();
        try {
            IDE.openEditor(workbenchPage, file);
        } catch (PartInitException e) {
            throw new DcaseSystemException(Messages.COMMON_EXCEPTION_partInit,
                    e, MessageTypeImpl.OPEN_ATTACHMENT_CRITICAL_FAILED);
        }
    }
}