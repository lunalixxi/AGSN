/*
 * Copyright (C) 2012  Nagoya University All rights reserved.
 */
package AGSN.diagram.custom.common.util;

import static AGSN.diagram.common.constant.SystemPropertyKeyConst.DIAGRAM_FILE_EXTENSION;
import static AGSN.diagram.common.constant.SystemPropertyKeyConst.MODEL_GMF_FILE_EXTENSION;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.Tool;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import AGSN.BasicLink;
import AGSN.BasicNode;
import AGSN.SafetyCase;
import AGSN.diagram.common.model.AttributeType;
import AGSN.diagram.common.model.NodeInfo;
import AGSN.diagram.common.util.FileUtil;
import AGSN.diagram.common.util.MessageTypeImpl;
import AGSN.diagram.common.util.Messages;
import AGSN.diagram.common.util.ModelUtil;
import AGSN.diagram.common.util.PropertyUtil;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;
import AGSN.diagram.part.AGSNDiagramEditor;

/**
 * A utility class that handles modules.
 */
public final class ModuleUtil {
	
	/**
	 * the file extension of a diagram.
	 */
	private static final String DIAGRAM_FILE_EXTENSION_NAME = PropertyUtil
			.getSystemProperty(DIAGRAM_FILE_EXTENSION);
	
	/**
	 * the file extension of a model.
	 */
	private static final String MODEL_FILE_EXTENSION_NAME = PropertyUtil
			.getSystemProperty(MODEL_GMF_FILE_EXTENSION);
	
	/**
	 * the main module name.
	 */
	private static final String MAIN_MODULE_NAME = "main"; //$NON-NLS-1$

	/**
	 * the separator string of references.
	 */
	private static final String REFERENCE_SEPARATOR_NAME = ";"; //$NON-NLS-1$

	/**
	 * the separator string of modules and nodes.
	 */
	private static final String MODULE_SEPARATOR_NAME = "/"; //$NON-NLS-1$
	
	/**
	 * the Contract flag name.
	 */
	private static final String CONTRACT_FLAG_NAME = "C"; //$NON-NLS-1$
	
	/**
	 * the separator string of responsibility.
	 */
	private static final String RESPONSIBILITY_SEPARATOR_NAME = ";"; //$NON-NLS-1$

	/**
	 * A constructor.
	 */
	private ModuleUtil() {
	}

	/**
	 * Returns the reference separator.
	 * 
	 * @return the reference separator.
	 */
	public static String getReferenceSeparator() {
		return REFERENCE_SEPARATOR_NAME;
	}

	/**
	 * Returns the module separator.
	 * 
	 * @return the reference separator.
	 */
	public static String getModuleSeparator() {
		return MODULE_SEPARATOR_NAME;
	}

	/**
	 * Returns the diagram file extension.
	 * 
	 * @return the diagram file extension.
	 */
	public static String getDiagramFileExtension() {
		return DIAGRAM_FILE_EXTENSION_NAME;
	}

	/**
	 * Returns the model file extension.
	 * 
	 * @return the model file extension.
	 */
	public static String getModelFileExtension() {
		return MODEL_FILE_EXTENSION_NAME;
	}

	/**
	 * Returns the main module name.
	 * 
	 * @return the main module name.
	 */
	public static String getMainModuleName() {
		return MAIN_MODULE_NAME;
	}

	/**
	 * Returns whether the name is workspace reference.
	 * 
	 * @param name
	 *            the attachment name.
	 * @return whether the name is workspace reference.
	 */
	public static boolean isWorkspaceReference(String name) {
		try {
			if (name.substring(0, 1).equals(MODULE_SEPARATOR_NAME)) {
				return true;
			} else {
				return false;
			}
		} catch (StringIndexOutOfBoundsException e) {
			return false;
		}
	}

	/**
	 * Returns whether the file is model file.
	 * 
	 * @param file
	 *            the file.
	 * @return whether the file is model file.
	 */
	public static boolean isModelFile(IFile file) {
		if (file != null) {
			String extensionStr = file.getFileExtension();
			if (extensionStr != null) {
				return extensionStr.equals(MODEL_FILE_EXTENSION_NAME);
			}
		}
		return false;
	}

	/**
	 * Returns whether the file is diagram file.
	 * 
	 * @param file
	 *            the file.
	 * @return whether the file is diagram file.
	 */
	public static boolean isDiagramFile(IFile file) {
		if (file != null) {
			String extensionStr = file.getFileExtension();
			if (extensionStr != null) {
				return extensionStr.equals(DIAGRAM_FILE_EXTENSION_NAME);
			}
		}
		return false;
	}

	/**
	 * Returns the module name.
	 * 
	 * @param file
	 *            the diagram file or the model file.
	 * @return the module name.
	 */
	public static String getModuleName(IFile file) {
		IPath path = file.getFullPath();
		if (path != null) {
			String absolutePath = path.removeFileExtension() + MODULE_SEPARATOR_NAME;
			return trimProjectName(absolutePath);
		}
		return null;
	}

	/**
	 * Returns the module name.
	 * 
	 * @param name
	 *            the module name or node name.
	 * @return the module name.
	 */
	public static String getModuleName(String name) {
		if (name == null || name.length() == 0) {
			return null;
		}
		name = trimProjectName(name);
		int lindex = name.lastIndexOf(MODULE_SEPARATOR_NAME);
		if (lindex >= 0) {
			if (lindex < name.length()-1) {
				return name.substring(0, lindex+1); // include the last MODULE_SEPARATOR_NAME
			} else {
				return name; // maybe module name
			}
		}
		return name + MODULE_SEPARATOR_NAME; // for compatibility
	}
	
	/**
	 * Returns the node name.
	 * 
	 * @param nodeName
	 *            the node name (with module name).
	 * @return the node name.
	 */
	public static String getNodeName(String nodeName) {
		if (nodeName == null) {
			return null;
		}
		int index = nodeName.lastIndexOf(MODULE_SEPARATOR_NAME);
		if (index >= 0) {
			if (index < nodeName.length()-1) {
				return nodeName.substring(index + 1);
			} else {
				// If module name only, return nodeName
			}
		}
		return nodeName;
	}

	/**
	 * Trims the project name.
	 * @param name the absolute path name.
	 * @return the trimming name.
	 */
	public static String trimProjectName(String name) {
		if (name.charAt(0) == IPath.SEPARATOR) {
			int index = name.indexOf(IPath.SEPARATOR, 1);
			if (index > 0) {
				name = name.substring(index+1);
			}
		}
		return name;
	}
	/**
	 * Returns the Diagram file path.
	 * 
	 * @param name
	 *            the module name.
	 * @return the diagram file path.
	 */
	public static IPath getDiagramPath(String name) {
		SafetyCaseEditPart editPart = getCurrentArgumentEditPart();
		IFile modelFile = getModelFile(editPart);
		return getModulePath(modelFile, name, DIAGRAM_FILE_EXTENSION_NAME);
	}

	/**
	 * Returns the Model file path.
	 * 
	 * @param name
	 *            the module name.
	 * @return the model file path.
	 */
	public static IPath getModelPath(String name) {
		SafetyCaseEditPart editPart = getCurrentArgumentEditPart();
		IFile modelFile = getModelFile(editPart);
		return getModulePath(modelFile, name, MODEL_FILE_EXTENSION_NAME);
	}
	
    /**
     * Returns the current argument edit part.
     * 
     * @return the current argument edit part.
     */
    public static SafetyCaseEditPart getCurrentArgumentEditPart() {

        AGSNDiagramEditor agsnEditor = getCurrentAGSNEditor();

        return getCurrentArgumentEditPart(agsnEditor);
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
     * Returns the argument edit part from the specified editor.
     * 
     * @param dcaseEditor the editor.
     * @return the argument edit part.
     */
    public static SafetyCaseEditPart getCurrentArgumentEditPart(
            AGSNDiagramEditor dcaseEditor) {

        if (dcaseEditor == null) {
            return null;
        }

        DiagramEditPart editPart = dcaseEditor.getDiagramEditPart();
        if (!(editPart instanceof SafetyCaseEditPart)) {
            return null;
        }

        return (SafetyCaseEditPart) editPart;
    }
	
    /**
     * Returns the IPath that represents model/diagram file.
     * @param baseFile the base reference file.
     * @param moduleName the module name.
     * @param extension the extension of file.
     * @return the IPath that represents model/diagram file.
     */
    public static IPath getModulePath(IFile baseFile, String moduleName, String extension) {
    	if (moduleName == null || moduleName.length() == 0 ||
    			extension == null || extension.length() == 0) {
    		return null;
    	}
		IProject project;
		if (baseFile != null) {
			project = baseFile.getProject();
		} else {
			project = ResourcesPlugin.getWorkspace().getRoot().getProject();
		}
		if (project != null) {
			// trim the last separater character.
			String baseName = MODULE_SEPARATOR_NAME.equals(moduleName.substring(moduleName.length()-1))
					? moduleName.substring(0, moduleName.length()-1) : moduleName;
			IPath basePath = project.getFullPath().addTrailingSeparator().append(baseName);
			return basePath;
		}
		return null;
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
     * Returns the IFile that represents model file.
     * 
     * @param resource the resource
     * @return the IFile that represents model file.
     */
    public static IFile getModelFile(Resource resource) {

        return WorkspaceSynchronizer.getFile(resource);
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
	 * Returns the reference number.
	 * 
	 * @param reference
	 *            RefSource value.
	 * @return the reference number.
	 */
	public static int getReferenceNumber(String reference) {
		if (reference == null || reference.length() == 0) {
			return 0;
		} else {
			return reference.split(REFERENCE_SEPARATOR_NAME).length;
		}
	}

	/**
	 * Returns the attribute of node.
	 * 
	 * @param node
	 *            the node.
	 * @param type
	 *            the attribute type.
	 * @return the attribute string.
	 */
	public static String getAttributeValue(BasicNode node, AttributeType type) {
		NodeInfo nodeInfo = ModelUtil.createNodeInfo(node);
		if (nodeInfo != null) {
			return (String) nodeInfo.getAttribute(type);
		} else {
			return null;
		}
	}

	/**
	 * Returns the attribute of editpart.
	 * 
	 * @param editPart
	 *            the editpart.
	 * @param type
	 *            the attribute type.
	 * @return the attribute string.
	 */
	public static String getAttributeValue(GraphicalEditPart editPart,
			AttributeType type) {
		EObject eobj = AGSNEditorUtil.getElement(editPart);
		if (eobj instanceof BasicNode) {
			return getAttributeValue((BasicNode) eobj, type);
		} else {
			return null;
		}
	}

	/**
	 * Returns the RefSource attribute value.
	 * 
	 * @param list
	 *            the reference list.
	 * @return the RefSource attribute value.
	 */
	private static String makeModuleReference(ArrayList<String> list) {
		StringBuffer buffer = new StringBuffer();
		for (String attr : list) {
			if (buffer.length() > 0) {
				buffer.append(REFERENCE_SEPARATOR_NAME);
			}
			buffer.append(attr);
		}
		return buffer.toString();
	}

	/**
	 * Appends reference to RefSource and returns the new references.
	 * 
	 * @param allStr
	 *            the RefSource.
	 * @param refStr
	 *            the adding reference.
	 * @return the new references.
	 */
	public static String appendModuleReference(String allStr, String refStr) {
		ArrayList<String> orgList = null;
		if (allStr != null) {
			orgList = new ArrayList<String>(Arrays.asList(allStr
					.split(REFERENCE_SEPARATOR_NAME)));
		} else {
			orgList = new ArrayList<String>();
		}
		if (!orgList.contains(refStr)) {
			orgList.add(refStr);
		}
		return makeModuleReference(orgList);
	}

	/**
	 * Removes reference from RefSource and returns the new references.
	 * 
	 * @param allStr
	 *            the RefSource.
	 * @param refStr
	 *            the removing reference.
	 * @return the new references.
	 */
	public static String removeModuleReference(String allStr, String refStr) {
		ArrayList<String> orgList = null;
		if (allStr != null) {
			orgList = new ArrayList<String>(Arrays.asList(allStr
					.split(REFERENCE_SEPARATOR_NAME)));
		} else {
			orgList = new ArrayList<String>();
		}
		if (orgList.contains(refStr)) {
			orgList.remove(refStr);
		}
		return makeModuleReference(orgList);
	}
	
	/**
	 * Returns the files belong to the project.
	 * @param project the project.
	 * @return the files belong to the project.
	 */
	public static IResource[] getMembers(IProject project) throws CoreException {
		ArrayList<IResource>ret = new ArrayList<IResource>();
		for (IResource res : project.members()) {
			if (res instanceof IFolder) {
				ret.addAll(getMembers((IFolder)res));
			} else {
				ret.add(res);
			}
		}
		return ret.toArray(new IResource[ret.size()]);
	}
	
	/**
	 * Returns the files belong to the folder (recursively).
	 * @param folder the folder.
	 * @return the files belong to the folder.
	 */
	private static List<IResource> getMembers(IFolder folder) throws CoreException {
		ArrayList<IResource>ret = new ArrayList<IResource>();
		for (IResource res : folder.members()) {
			if (res instanceof IFolder) {
				ret.addAll(getMembers((IFolder)res));
			} else {
				ret.add(res);
			}
		}
		return ret;
	}

	/**
	 * Checks if the attachment is URL or not.
	 * 
	 * @param attachment
	 *            the attachment.
	 * @return whether the attachment is URL or not.
	 */
	public static boolean isUrl(String attachment) {
		try {
			URL url = new URL(attachment);
			if (!AGSNEditorUtil.checkDcaseReferenceProtocol(url.getProtocol())) {
				return false;
			}

		} catch (MalformedURLException e) {
			return false;
		}
		return true;
	}

	/**
	 * Returns the node number.
	 * 
	 * @param moduleName
	 *            the module name.
	 * @return the node number.
	 */
	public static int countNodes(String moduleName) {
		if (moduleName == null || moduleName.length() == 0) {
			return 0;
		}
		IPath path = getModelPath(moduleName);
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				EObject eobj = ModelUtil.getModel(file, true);
				if (eobj instanceof SafetyCase) {
					EList<BasicNode> nodes = ((SafetyCase) eobj)
							.getRootBasicNode();
					return (nodes != null) ? nodes.size() : 0;
				}
			}
		}
		return 0;
	}

	/***
	 * Returns the root node of argument.
	 * 
	 * @param argument
	 *            the argument.
	 * @return the root node of argument.
	 */
	public static BasicNode getRootElement(SafetyCase argument) {
		HashSet<BasicNode> nodeSet = new HashSet<BasicNode>(
				argument.getRootBasicNode());
		for (BasicLink link : argument.getRootBasicLink()) {
			nodeSet.remove(link.getTarget());
		}
		return (nodeSet.size() > 0) ? (BasicNode) nodeSet.toArray()[0] : null;
	}

	/**
	 * Returns the root node.
	 * 
	 * @param file
	 *            the module file.
	 * @return the root node.
	 */
	public static BasicNode getRootNode(IFile file) {
		EObject templateModel = ModelUtil.getModel(file, true);
		return getRootNode((SafetyCase) templateModel);
	}

	/**
	 * Returns the root node.
	 * 
	 * @param argument
	 *            the argument.
	 * @return the root node.
	 */
	public static BasicNode getRootNode(SafetyCase argument) {
		List<BasicNode> nodeList = argument.getRootBasicNode();
		HashSet<BasicNode> nodeSet = new HashSet<BasicNode>(nodeList);
		for (BasicLink link : argument.getRootBasicLink()) {
			nodeSet.remove(link.getTarget());
		}
		if (nodeSet.size() == 1) {
			return (BasicNode) nodeSet.toArray()[0];
		} else {
			return null;
		}
	}

	/**
	 * Returns the current cursor location for Diagram.
	 * 
	 * @param argumentEditPart
	 *            the argument edit part.
	 * @return the current point.
	 */
	public static Point getCurrentLocation(SafetyCaseEditPart argumentEditPart) {
		IDiagramGraphicalViewer viewer = AGSNEditorUtil
				.getCurrentAGSNEditor().getDiagramGraphicalViewer();
		FigureCanvas canvas = (FigureCanvas) viewer.getControl();
		// the position of scrollable diagram.
		Point viewPoint = canvas.getViewport().getViewLocation();
		Tool tool = argumentEditPart.getViewer().getEditDomain()
				.getActiveTool();
		AbstractTool aTool = (AbstractTool) tool;
		Point toolLocation = null;
		try {
			Method method = AbstractTool.class.getDeclaredMethod("getLocation"); //$NON-NLS-1$
			method.setAccessible(true);
			toolLocation = ((org.eclipse.draw2d.geometry.Point) method
					.invoke(aTool)).getCopy();
		} catch (Exception e) {
			MessageWriter.writeMessageToConsole(
					Messages.AddPatternContributionItem_0,
					MessageTypeImpl.CREATE_PATTERN_FAILED);
			return new Point(0, 0);
		}
		return new Point(viewPoint.x + toolLocation.x, viewPoint.y
				+ toolLocation.y);
	}

	/**
	 * Returns the extracted attachment string.
	 * 
	 * @param attachment
	 *            the attachment string.
	 * @return the extracted attachment string.
	 */
	public static String removeContractIconString(String attachment) {
		if (attachment != null) {
			int index = attachment.indexOf(RESPONSIBILITY_SEPARATOR_NAME);
			if (index >= 0) {
				return attachment.substring(0, index);
			}
		}
		return attachment;
	}

}
