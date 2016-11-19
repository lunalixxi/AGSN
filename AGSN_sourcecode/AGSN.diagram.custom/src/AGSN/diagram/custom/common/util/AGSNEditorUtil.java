/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.custom.common.util;

import static AGSN.diagram.common.constant.SystemDefinitionConst.COLLECTION_INITIAL_CAPACITY;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import AGSN.diagram.common.util.UrlUtil;
import AGSN.diagram.edit.parts.InContextOfEditPart;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;
import AGSN.diagram.edit.parts.SupportedByEditPart;
import AGSN.diagram.edit.parts.custom.AGSNLinkEditPart;
import AGSN.diagram.edit.parts.custom.AGSNNodeEditPart;
import AGSN.diagram.part.AGSNDiagramEditor;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ViewImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * A utility class that that provides the methods to handle the D-Case diagram.
 */
public final class AGSNEditorUtil {

    /**
     * The private constructor.
     */
    private AGSNEditorUtil() {
    }

    /**
     * Returns the current diagram editor.
     * 
     * @return the current diagram editor.
     */
    public static AGSNDiagramEditor getCurrentAGSNEditor() {
        IWorkbenchPage workbenchPage = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();
    	if(workbenchPage == null) {
    		return null;
    	}
        IEditorPart editorPart = workbenchPage.getActiveEditor();

        // returns null if there is no active D-Case diagram editor.
        if (editorPart == null || !(editorPart instanceof AGSNDiagramEditor)) {
            return null;
        }

        return (AGSNDiagramEditor) editorPart;
    }

    /**
     * Returns the current diagram.
     * 
     * @return the current diagram.
     */
    public static Diagram getCurrentDiagram() {

    	AGSNDiagramEditor AGSNEditor = AGSNEditorUtil
                .getCurrentAGSNEditor();
        if (AGSNEditor == null) {
            return null;
        }

        return  AGSNEditor.getDiagram();
    }

    /**
     * Returns the current argument edit part.
     * 
     * @return the current argument edit part.
     */
    public static SafetyCaseEditPart getCurrentArgumentEditPart() {

    	AGSNDiagramEditor dcaseEditor = AGSNEditorUtil
                .getCurrentAGSNEditor();

        return getCurrentArgumentEditPart(dcaseEditor);
    }

    /**
     * Returns the argument edit part from the specified editor.
     * 
     * @param dcaseEditor the editor.
     * @return the argument edit part.
     */
    public static SafetyCaseEditPart getCurrentArgumentEditPart(
    		AGSNDiagramEditor agsnEditor) {

        if (agsnEditor == null) {
            return null;
        }

        DiagramEditPart editPart = agsnEditor.getDiagramEditPart();
        if (!(editPart instanceof SafetyCaseEditPart)) {
            return null;
        }

        return (SafetyCaseEditPart) editPart;
    }

    /**
     * Tests whether the specified string represents available protocol.
      * 
     * @param protocol the string that represents a protocol.
     * @return true if and only if the specified string represents available protocol;false false otherwise. 
     */
    public static boolean checkDcaseReferenceProtocol(String protocol) {
        return  UrlUtil.checkDcaseReferenceProtocol(protocol);
    }

    /**
     * Returns the currently active window.
     * 
     * @return the active workbench window
     */
    public static Shell getActiveWindowShell() {
        IWorkbench workbench = PlatformUI.getWorkbench();
        IWorkbenchWindow activeWindow = workbench.getActiveWorkbenchWindow();
        return activeWindow.getShell();
    }

    /**
     * Returns the set of strings those represents the ID of the children of the specified argument edit part.
     * 
     * @param argumentEditPart the argument edit part.
     * @return IDs of the children.
     */
    public static Set<String> getChildUUIDs(SafetyCaseEditPart argumentEditPart) {

        if (argumentEditPart == null) {
            return null;
        }

        XMLResource resource = getXMLResource(argumentEditPart);
        if (resource == null) {
            return null;
        }

        Set<String> idSet = new HashSet<String>(COLLECTION_INITIAL_CAPACITY);
        for (Object obj : argumentEditPart.getChildren()) {
            if (obj instanceof ShapeNodeEditPart) {
                ShapeNodeEditPart nodeEditPart = (ShapeNodeEditPart) obj;
                String id = getUUIDs(nodeEditPart, resource);
                if (id != null) {
                    idSet.add(id);
                }
            }
        }

        return idSet;
    }

    /**
     * Returns the ID of the specified edit part.
     * 
     * @param editPart the edit part.
     * @param resource the resource that has the specified edit part.
     * @return the ID of the specified edit part.
     */
    public static String getUUIDs(GraphicalEditPart editPart,
            XMLResource resource) {

        if (editPart == null || resource == null) {
            return null;
        }

        EObject eObj = getElement(editPart);
        return resource.getID(eObj);
    }

    /**
     *  Returns the ID of the specified edit part.
     * 
     * @param editPart the edit part.
     * @return the ID of the specified edit part.
     */
    public static String getUUIDs(GraphicalEditPart editPart) {

        EObject eObj = getElement(editPart);
        if (eObj == null) {
            return null;
        }

        XMLResource resource = (XMLResource) eObj.eResource();
        return resource.getID(eObj);
    }

    /**
     * Returns the ID of the specified connection node edit part.
     * 
     * @param linkPart the connection node edit part.
     * @return the ID of the specified edit part.
     */
    public static String getUUIDs(ConnectionNodeEditPart linkPart) {
        EObject eObj = getElement(linkPart);
        if (eObj == null) {
            return null;
        }

        XMLResource resource = (XMLResource) eObj.eResource();
        return resource.getID(eObj);
    }

    /**
     * Returns the EObject.
     * 
     * @param editPart the edit part.
     * @return the EObject.
     */
    public static EObject getElement(GraphicalEditPart editPart) {

        if (editPart == null) {
            return null;
        }

        Object model = editPart.getModel();
        if (!(model instanceof View)) {
            return null;
        }

        View view = (View) model;

        return view.getElement();
    }

    /**
     * Returns the EObject.
     * 
     * @param editPart the edit part.
     * @return the EObject.
     */
    public static EObject getElement(ConnectionNodeEditPart editPart) {

        if (editPart == null) {
            return null;
        }

        Object model = editPart.getModel();
        if (!(model instanceof View)) {
            return null;
        }

        View view = (View) model;

        return view.getElement();
    }

    /**
     * Returns the containing resource, or null.
     * 
     * @param editPart the edit part.
     * @return the containing resource, or null.
     */
    public static XMLResource getXMLResource(GraphicalEditPart editPart) {

        EObject eObj = getElement(editPart);
        if (eObj == null) {
            return null;
        }

        return (XMLResource) eObj.eResource();
    }

    /**
     * Returns the IFile that represents model file that contains the specified edit part.
     * 
     * @param editPart the edit part.
     * @return the IFile that represents model file.
     */
    public static IFile getModelFile(GraphicalEditPart editPart) {

        XMLResource resource = getXMLResource(editPart);
        if (resource == null) {
            return null;
        }

        return getModelFile(resource);
    }

    /**
     * Returns the IFile that represents model file.
     * 
     * @param resource the resource
     * @return the IFile that represents model file.
     */
    public static IFile getModelFile(Resource resource) {

        return WorkspaceSynchronizer.getFile(resource);
    }

    /**
     * Returns the IFile that represents current diagram file.
     * 
     * @return the IFile that represents current diagram file.
     */
    public static IFile getCurrentDiagramFile() {

        Diagram diagram = getCurrentDiagram();
        if (diagram == null) {
            return null;
        }

        return getDiagramFile(diagram);
    }

    /**
     * Returns the IFile that represents the diagram file.
     * 
     * @param diagram the diagram.
     * @return the IFile that represents the diagram file.
     */
    public static IFile getDiagramFile(Diagram diagram) {

        return WorkspaceSynchronizer.getFile(diagram.eResource());
    }

    /**
     * Tests whether the specified edit part is the D-Case link.
     * 
     * @param editPart the edit part.
     * @return true if and only if the specified edit part is the D-Case link;false otherwise.
     */
    public static boolean isDcaseLinkEditPart(Object editPart) {
        boolean result = false;
        if (editPart instanceof InContextOfEditPart
                || editPart instanceof SupportedByEditPart) {
            result = true;
        }
        return result;
    }

    /**
     * Returns the selected EObject or null.
     * 
     * @return the selected EObject or null.
     */
    public static EObject getSelectedObject() {
        EObject eObj = null;
        DiagramEditor editor = getCurrentAGSNEditor();
        if (editor != null) {

            ISelection selection = ((IWorkbenchPart) editor).getSite().getPage().getSelection();
            if (selection instanceof StructuredSelection) {
                Object selectedObj = ((StructuredSelection) selection)
                        .getFirstElement();

                if (selectedObj instanceof GraphicalEditPart) {
                    Object model = ((GraphicalEditPart) selectedObj).getModel();
                    if (model instanceof ViewImpl) {
                        eObj = ((ViewImpl) model).getElement();
                    }
                }

            }
        }
        return eObj;
    }

    /**
     * Returns the first selected node edit part.
     * 
     * @return the first selected node edit part.
     */
    public static AGSNNodeEditPart getFirstCurrentSelectedPart() {
    	AGSNNodeEditPart result = null;
        DiagramEditor editor = getCurrentAGSNEditor();
        if (editor != null) {
            ISelection selection = editor.getSite().getPage().getSelection();
            if (selection instanceof StructuredSelection) {
                Object selectedObj = ((StructuredSelection) selection)
                        .getFirstElement();
                if (selectedObj instanceof AGSNNodeEditPart) {
                    result = (AGSNNodeEditPart) selectedObj;
                }
            }
        }
        return result;
    }
    
    /**
     * Returns the first selected link edit part.
     * 
     * @return the first selected link edit part.
     */
    public static AGSNLinkEditPart getFirstCurrentSelectedLink() {
        AGSNLinkEditPart result = null;
        DiagramEditor editor = getCurrentAGSNEditor();
        if (editor != null) {
            ISelection selection = editor.getSite().getPage().getSelection();
            if (selection instanceof StructuredSelection) {
                Object selectedObj = ((StructuredSelection) selection)
                        .getFirstElement();
                if (selectedObj instanceof AGSNLinkEditPart) {
                    result = (AGSNLinkEditPart) selectedObj;
                }
            }
        }
        return result;
    }
    
    /**
     * Returns the selected node edit parts.
     * 
     * @return the selected node edit parts.
     */
    public static List<AGSNNodeEditPart> getSelectedPart() {
    	List<AGSNNodeEditPart> result = new ArrayList<AGSNNodeEditPart>();
        DiagramEditor editor = getCurrentAGSNEditor();
        if (editor != null) {
            ISelection selection = editor.getSite().getPage().getSelection();
            if (selection instanceof StructuredSelection) {
            	for(Object selectedObj : ((StructuredSelection)selection).toArray()) {
            		if(selectedObj instanceof AGSNNodeEditPart) {
            			result.add((AGSNNodeEditPart)selectedObj);
            		}
            	}
            }
        }
    	return result;
    }

    /**
     * Returns the top node edit part from selected edit parts.
     * 
     * @return the top node edit part from selected edit parts.
     */
    public static AGSNNodeEditPart getTopCurrentSelectedPart() {
    	AGSNNodeEditPart result = null;
        DiagramEditor editor = getCurrentAGSNEditor();
        if (editor != null) {
            ISelection selection = editor.getSite().getPage().getSelection();
            if (selection instanceof StructuredSelection) {
            	// objList are selected edit parts.
            	List<Object> objList = ((StructuredSelection)selection).toList();
            	for (Object obj : objList) {
            		if (obj instanceof AGSNNodeEditPart) {
            			// for each connections...
    					boolean isTop = true;
            			for(Object linkObj : ((AGSNNodeEditPart)obj).getTargetConnections()) {
            				if(linkObj instanceof ConnectionNodeEditPart) {
            					Object parentObj = ((ConnectionNodeEditPart)linkObj).getSource();
            					if(objList.contains(parentObj)) {
            						isTop = false;
            						break;
            					}
            				}
            			}
            			if(isTop) {
            				result = (AGSNNodeEditPart)obj;
            				break;
            			}
            		}
            	}
            }
        }
    	return result;
    }
    
    /**
     * Returns the sub-tree.
     * @param editPart the root node of sub-tree.
     * @param includeLink whether links is included or not.
     * @return the list of nodes (and links).
     */
    public static List<Object> selectSubtree(GraphicalEditPart editPart, boolean includeLink) {
    	List<Object> list = new ArrayList<Object>();
    	Set<String> checkedNodeList = new HashSet<String>();
    	Set<GraphicalEditPart> nodeEditPartSet = new HashSet<GraphicalEditPart>();
    	Set<ConnectionNodeEditPart> linkEditPartSet = new HashSet<ConnectionNodeEditPart>();
    	addSubtree(editPart, nodeEditPartSet, linkEditPartSet, checkedNodeList);
    	for(GraphicalEditPart node : nodeEditPartSet) {
    		list.add(node);
    	}
    	if(includeLink) {
    		for(ConnectionNodeEditPart link : linkEditPartSet) {
    			list.add(link);
    		}
    	}
    	return list;
    }
    
    private static void addSubtree(GraphicalEditPart editPart, Set<GraphicalEditPart> nodeSet,
    		Set<ConnectionNodeEditPart> linkSet, Set<String>checkedNodeList) {
    	String uuid = getUUIDs(editPart);
    	if(checkedNodeList.contains(uuid)) {
    		return;
    	}
    	checkedNodeList.add(uuid);
    	for(Object link : editPart.getSourceConnections()) {
    		if(link instanceof ConnectionNodeEditPart) {
    			ConnectionNodeEditPart dLink = (ConnectionNodeEditPart)link;
    			if(! linkSet.contains(dLink)) {
    				linkSet.add(dLink);
    				addSubtree((AGSNNodeEditPart)dLink.getTarget(), nodeSet, linkSet, checkedNodeList);
    			}
    		}
    	}
    	if(! nodeSet.contains(editPart)) {
    		nodeSet.add(editPart);
    	}
    }
}
