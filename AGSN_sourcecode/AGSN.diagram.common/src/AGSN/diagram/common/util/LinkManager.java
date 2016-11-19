/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.common.util;

import static AGSN.diagram.common.constant.SystemDefinitionConst.COLLECTION_INITIAL_CAPACITY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


import AGSN.SafetyCase;
import AGSN.BasicLink;
import AGSN.BasicNode;
import AGSN.diagram.common.exception.DcaseSystemException;
import AGSN.diagram.common.model.AttributeType;
import AGSN.diagram.common.model.LinkInfo;
import AGSN.diagram.common.model.NodeInfo;
import AGSN.diagram.common.model.NodeType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * A class that manages nodes and links.
 */
public class LinkManager {
    
    /**
     * A XMLResource.
     */
    private XMLResource xmlResource;

    /**
     * the map that manages suites of a node ID and its source node IDs.
     */
    private Map<String, List<String>> sourceHashMap;

    /**
     * the map that manages suites of a node ID and its target node IDs.
     */
    private Map<String, List<String>> targetHashMap;

    /**
     * the map that manages suites of a node ID and its BasicNode object.
     */
    private Map<String, BasicNode> nodeHashMap;

    /**
     * the map that manages suites of a node ID and its BasicNode object.
     */
    private Map<String, NodeInfo> nodeMap;
    
    /**
     * the map that manages suites of a node ID and its Goal object.
     */
    private Map<String, NodeInfo> goalMap;

    /**
     * the map that manages suites of a link ID and its LinkInfo object.
     */
    private Map<String, LinkInfo> linkMap;
    
    /**
     * Loads the AGSN XMLResource and initializes this object.
     * 
     * @param xmlResource the AGSN XMLResource.
     */
    public void load(XMLResource xmlResource) {

        this.xmlResource = xmlResource;

        //clears the maps.
        sourceHashMap = new HashMap<String, List<String>>(
                COLLECTION_INITIAL_CAPACITY);
        targetHashMap = new HashMap<String, List<String>>(
                COLLECTION_INITIAL_CAPACITY);
        nodeHashMap = new HashMap<String, BasicNode>(
                COLLECTION_INITIAL_CAPACITY);
        nodeMap = new HashMap<String, NodeInfo>(COLLECTION_INITIAL_CAPACITY);
        linkMap = new HashMap<String, LinkInfo>(COLLECTION_INITIAL_CAPACITY);
        goalMap = new HashMap<String, NodeInfo>(COLLECTION_INITIAL_CAPACITY);
        // gets the argument.
        SafetyCase argument = null;
        EList<EObject> contentList = xmlResource.getContents();
        for (EObject content : contentList) {
            if (content instanceof SafetyCase) {
                argument = (SafetyCase) content;
                break;
            }
        }

        // failed to get the argument.
        if (argument == null) {
            throw new DcaseSystemException(Messages.LinkManager_0, null,
                    MessageTypeImpl.DATA_STRUCTURE_ERROR);
        }
        
        // puts the argument to the maps.
        /**String argumentId = getId(argument);
        nodeHashMap.put(argumentId, argument);
        nodeMap.put(argumentId, ModelUtil.createNodeInfo(argument));
        */

        // puts the nodes to the maps.
        EList<BasicNode> nodeList = argument.getRootBasicNode();
        for (BasicNode node : nodeList) {
            String id = node.getId();
            nodeHashMap.put(id, node);
            NodeInfo nodeInfo = ModelUtil.createNodeInfo(node);
            nodeMap.put(id, nodeInfo);
            if (nodeInfo.getNodeType() == NodeType.GOAL) {
            	goalMap.put(id,nodeInfo);
            }
        }

        // puts the links to the maps.
        EList<BasicLink> linkList = argument.getRootBasicLink();
        for (BasicLink link : linkList) {
            String id = link.getId();
            String sourceId = link.getSource().getId();
            String targetId = link.getTarget().getId();

            // puts the links to the maps.
            linkMap.put(id, ModelUtil.createLinkInfo(link));

            // puts the targets to the maps.
            List<String> sourceList = sourceHashMap.get(targetId);
            if (sourceList == null) {
                sourceList = new ArrayList<String>();
            }
            sourceList.add(sourceId);
            sourceHashMap.put(targetId, sourceList);

            // puts the sources to the maps.
            List<String> targetList = targetHashMap.get(sourceId);
            if (targetList == null) {
                targetList = new ArrayList<String>();
            }
            targetList.add(targetId);
            targetHashMap.put(sourceId, targetList);
        }
    }

    /**
     * Gets the list of the node IDs those link to the node that is represented the specified ID.
     * 
     * @param id the target node ID.
     * @return the list of the source node IDs.
     */
    public List<String> getSource(String id) {
       return sourceHashMap.get(id);
    }

    /**
     * Gets the list of the node IDs those link from the node that is represented the specified ID.
     * 
     * @param id the source node ID.
     * @return the list of the target node IDs.
     */
    public List<String> getTarget(String id) {
        return targetHashMap.get(id);
    }

    /**
     * Returns the list of IDs of all nodes.
     * 
     * @return the list of IDs of all nodes.
     */
    public Set<String> getAllNodes() {
        return nodeHashMap.keySet();
    }
    
    /**
     * Returns the list of IDs of all goals.
     * 
     * @return the list of IDs of all goals.
     */
    public Set<String> getAllGoals() {
        return nodeHashMap.keySet();
    }
    
    /**
     * Returns the list of IDs of all links.
     * 
     * @return the list of IDs of all links.
     */
    public Set<String> getAllLinks() {
        return linkMap.keySet();
    }

    /**
     * Returns the ID of the specified node.
     * 
     * @param node the node.
     * @return the ID.
     */
    public String getId(EObject node) {
        return xmlResource.getID(node);
    }

    /**
     * Returns the BasicNode object that is represented the specified ID.
     * 
     * @param id the ID.
     * @return the node.
     */
    public BasicNode getBasicNode(String id) {
        return nodeHashMap.get(id);
    }

    /**
     * Returns the NodeInfo object that is represented the specified ID.
     * 
     * @param id the ID.
     * @return the node.
     */
    public NodeInfo getNodeInfo(String id) {
        return nodeMap.get(id);
    }

    /**
     * Returns the LinkInfo object that is represented the specified ID.
     * 
     * @param id the ID.
     * @return the link.
     */
    public LinkInfo getLinkInfo(String id) {
        return linkMap.get(id);
    }
    
    /**
     * Returns the URI of this resource. 
     * 
     * @return the URI of this resource. 
     */
    public URI getUri() {
        return xmlResource.getURI();
    }
}
