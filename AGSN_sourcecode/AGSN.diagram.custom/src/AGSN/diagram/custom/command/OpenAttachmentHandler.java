/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.custom.command;

import java.net.MalformedURLException;
import java.net.URL;

import AGSN.BasicNode;
import AGSN.Contract;
import AGSN.Evidence;
import AGSN.Module;
import AGSN.AdditionalElement;
import AGSN.diagram.common.util.Messages;
import AGSN.diagram.custom.common.util.AGSNEditorUtil;
import AGSN.diagram.custom.common.util.MessageWriter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.osgi.util.NLS;

/**
 * The handler to open an attachment.
 */
public class OpenAttachmentHandler extends AbstractEditPartHandler {

    /**
     * execute {@link OpenUrlHandler} or {@link OpenDefaultEditorHandler}
     * dependent on the type of the selected node's attachment.
     * 
     * @param event ExecutionEvent An event
     * @return result of the execution
     * @throws ExecutionException if an exception occurred during execution OpenUrlHandler or OpenDefaultEditorHandler.
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        
        GraphicalEditPart editPart = getSelectedElement(event);
        String attachment = null;
        
        if (editPart == null) {
        	/*AGSNLinkEditPart linkEditPart = AGSNEditorUtil.getFirstCurrentSelectedLink();
        	if (linkEditPart != null) {
        		BasicLink basicLink = (BasicLink)AGSNEditorUtil.getElement(linkEditPart);
        		attachment = basicLink.getAttachment();
        	}*/
        } else {
        	BasicNode basicNode = getBasicNode(editPart);
        	if (basicNode instanceof Evidence){
                Evidence evi = (Evidence) getBasicNode(editPart);
                attachment =  evi.getAttachment();
        	}else if (basicNode instanceof AdditionalElement){
        		AdditionalElement addelement = (AdditionalElement) getBasicNode(editPart);
        		attachment =  addelement.getAttachment();
        	}else if (basicNode instanceof Module){
        		Module mod = (Module) getBasicNode(editPart);
        		attachment =  mod.getAttachment();
        	}else if (basicNode instanceof Contract){
        		Contract cont = (Contract) getBasicNode(editPart);
        		attachment =  cont.getAttachment();
        	}
        }
        
        if (attachment != null && attachment.length() > 0) {
            
            if (isUrl(attachment)) {
                // in the case of uri type, execute OpenUrlHandler.
                AbstractHandler openUrlHandler = new OpenUrlHandler();
                return openUrlHandler.execute(event);
            } else {
                AbstractHandler openDefaultEditorHandler = new OpenDefaultEditorHandler();
                return openDefaultEditorHandler.execute(event);
            }
        } else {
            MessageWriter.showErrorMessageBox(NLS.bind(Messages.OpenUrlHandler_5, "Attachment")); //$NON-NLS-1$
            return null;
        }
    }
    
    /**
     * Checks if the attachment is URL or not.
     * 
     * @param attachment the attachment.
     * @return if the attachment is url: true.
     */
    private static boolean isUrl(String attachment) {
        URL url = null;
        try {
            url = new URL(attachment);
            //MessageWriter.writeMessageToConsole(
                    //"protocol=" + url.getProtocol(), MessageTypeImpl.DIAGNOSIS); //$NON-NLS-1$
            // check the protocol
            if (!AGSNEditorUtil.checkDcaseReferenceProtocol(url.getProtocol())) {
                MessageWriter.showErrorMessageBox(
                        NLS.bind(
                                Messages.OpenUrlHandler_6, url.getProtocol()));
                return false;
            }

        } catch (MalformedURLException e) {
            return false;
        }
        return true;
    }
}
