/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.common.model;

import static AGSN.diagram.common.constant.SystemDefinitionConst.ARGUMENT_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.CONTEXT_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.EVIDENCE_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.GOAL_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.JUSTIFICATION_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.ASSUMPTION_NAME;

import static AGSN.diagram.common.constant.SystemDefinitionConst.POLICY_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.STRATEGY_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.SYSTEM_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.ADDITIONALNODE_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.SAFETYCASE_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.MODULE_NAME;
import static AGSN.diagram.common.constant.SystemDefinitionConst.CONTRACT_NAME;

import static AGSN.diagram.common.util.ModelUtil.INTEGER_ONE;
import static AGSN.diagram.common.util.ModelUtil.STRING_EMPTY;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import AGSN.SafetyCase;
import AGSN.AdditionalElement;
import AGSN.Assumption;
import AGSN.BasicNode;
import AGSN.Context;
import AGSN.Contract;
import AGSN.Evidence;
import AGSN.Goal;
import AGSN.Justification;
import AGSN.Module;
import AGSN.Strategy;
import AGSN.diagram.common.validator.NodeConnectionRule;
import AGSN.diagram.common.validator.NodeMultiplicity;
import AGSN.diagram.common.validator.NodeValidatorRule;
import AGSN.diagram.common.validator.RuleOperator;


/**
 * A enumeration that represents a type of the node.
 */
public enum NodeType {

    /** The Goal. */
    GOAL(GOAL_NAME),
    /** The Evidence. */
    EVIDENCE(EVIDENCE_NAME),
    /** The Strategy. */
    STRATEGY(STRATEGY_NAME),
    /** The Context. */
    CONTEXT(CONTEXT_NAME),
    /** The Justification. */
    JUSTIFICATION(JUSTIFICATION_NAME),
    /** The Assumption. */
    ASSUMPTION(ASSUMPTION_NAME),
    /** The Undeveloped. */
    //UNDEVELOPED(UNDEVELOPED),
    /** The Module. */
    MODULE(MODULE_NAME),
    /** The Contract. */
    CONTRACT(CONTRACT_NAME),
    /** The System. */
    SYSTEM(SYSTEM_NAME),
    /** The Policy. */
    POLICY(POLICY_NAME),
    /** The DCase element **/
    ADDITIONALELEMENT(ADDITIONALNODE_NAME),
//    /** The Userdef001. */
//    USERDEF001(USERDEF001_NAME),
//    /** The Userdef002. */
//    USERDEF002(USERDEF002_NAME),
//    /** The Userdef003. */
//    USERDEF003(USERDEF003_NAME),

    /** The Argument. */
    ARGUMENT(ARGUMENT_NAME),
	SAFETYCASE(SAFETYCASE_NAME);

    /**
     * the type name.
     */
    private String name = null;

    /**
     * the connection rules.
     */
    private NodeValidatorRule nodeValidatorRule = null;

    /**
     * the map of attributes with default value..
     */
    private Map<AttributeType, Object> attributeInitValueMap = null;

    /**
     * Returns the NodeType object equivalent for the specified BasicNode object.
     * 
     * @param basicNode the node.
     * @return the type of the node.
     */
    public static NodeType getNodeType(BasicNode basicNode) {

        if (basicNode instanceof Goal) {
            return NodeType.GOAL;
        } else if (basicNode instanceof Strategy) {
            return NodeType.STRATEGY;
        } else if (basicNode instanceof Evidence) {
            return NodeType.EVIDENCE;
        } else if (basicNode instanceof Context) {
            return NodeType.CONTEXT;
        } else if (basicNode instanceof Justification) {
            return NodeType.JUSTIFICATION;
        } else if (basicNode instanceof Assumption) {
            return NodeType.ASSUMPTION;
        } else if (basicNode instanceof SafetyCase) {
            return NodeType.SAFETYCASE;
        } else if (basicNode instanceof AdditionalElement){
        	return NodeType.ADDITIONALELEMENT;
        } else if (basicNode instanceof Module){
        	return NodeType.MODULE;
        } else if (basicNode instanceof Contract){
        	return NodeType.CONTRACT;
        }

        // returns null if there is no NodeType equivalent for the specified BasicNode object.
        return null;
    }

    /**
     * Creates the connection rules.
     * 
     * @param nodeType the type of the node.
     * @return the connection rules.
     */
    private static NodeValidatorRule createNodeValidatorRule(NodeType nodeType) {

        NodeValidatorRule nodeValidatorRule = null;

        switch (nodeType) {
            case GOAL:
                nodeValidatorRule = createGoalValidatorRule();
                break;
            case STRATEGY:
                nodeValidatorRule = createStrategyValidatorRule();
                break;
            case EVIDENCE:
            	nodeValidatorRule = createEvidenceValidatorRule();
            case CONTEXT:
            case SYSTEM: // Pattern
                nodeValidatorRule = createContextValidatorRule();
                break;
            case JUSTIFICATION:
                nodeValidatorRule = createJustificationValidatorRule();
                break;
            case SAFETYCASE:
            default:
                break;
        }

        return nodeValidatorRule;
    }

    /**
     * Creates the connection rules for the Goal node.
     * 
     * @return the connection rules for the Goal node.
     */
    private static NodeValidatorRule createGoalValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO_OR_ONE);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO_OR_ONE);
        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.JUSTIFICATION,
                NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO_OR_MORE); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO_OR_ONE); // Action
        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO);
        parentMultiplicity
                .put(NodeType.STRATEGY, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        // creates connection rules for children.
        List<NodeConnectionRule> childRuleList = new ArrayList<NodeConnectionRule>();
        // create a exclusive connection rule for the Strategy,Evidence,Undeveloped,and the Monitor as children.
        List<NodeType> nodeList1 = new ArrayList<NodeType>();
        nodeList1.add(NodeType.STRATEGY);
        nodeList1.add(NodeType.EVIDENCE);
        nodeList1.add(NodeType.POLICY); // Action
        NodeConnectionRule rule1 = new NodeConnectionRule(RuleOperator.NAND,
                nodeList1);
        childRuleList.add(rule1);
        // create a exclusive connection rule for the Justification and the Evidence as children.
        List<NodeType> nodeList2 = new ArrayList<NodeType>();
        nodeList2.add(NodeType.JUSTIFICATION);
        nodeList2.add(NodeType.EVIDENCE);
        NodeConnectionRule rule2 = new NodeConnectionRule(RuleOperator.NAND,
                nodeList2);
        childRuleList.add(rule2);
        // create a exclusive connection rule for the Justification and the Monitor as children.
        List<NodeType> nodeList3 = new ArrayList<NodeType>();
        nodeList3.add(NodeType.JUSTIFICATION);
        
        NodeConnectionRule rule3 = new NodeConnectionRule(RuleOperator.NAND,
                nodeList3);
        childRuleList.add(rule3);

        nodeValidatorRule.setChildRule(childRuleList);

        return nodeValidatorRule;
    }

    /**
     * Creates the connection rules for the Strategy node.
     * 
     * @return the connection rules for the Strategy node.
     */
    private static NodeValidatorRule createStrategyValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO_OR_MORE); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        return nodeValidatorRule;
    }

    /**
     * Creates the connection rules for the Evidence node.
     * 
     * @return the connection rules for the Evidence node.
     */
    private static NodeValidatorRule createEvidenceValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO_OR_MORE); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action

        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        return nodeValidatorRule;
    }

    /**
     * Creates the connection rules for the Undeveloped node.
     * 
     * @return the connection rules for the Undeveloped node.
     */
    private static NodeValidatorRule createUndevelopedValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        return nodeValidatorRule;
    }

    /**
     * Creates the connection rules for the Context node.
     * 
     * @return the connection rules for the Context node.
     */
    private static NodeValidatorRule createContextValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_ONE);
        parentMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO_OR_ONE);
        parentMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO_OR_ONE);

        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        // creates connection rules for parents.
        List<NodeConnectionRule> parentRuleList = new ArrayList<NodeConnectionRule>();
        // create a exclusive connection rule for the Goal,Strategy,Evidence,Monitor,and the System as parents.
        List<NodeType> nodeList1 = new ArrayList<NodeType>();
        nodeList1.add(NodeType.GOAL);
        nodeList1.add(NodeType.STRATEGY);
        nodeList1.add(NodeType.EVIDENCE);
        //nodeList1.add(NodeType.SYSTEM); // Parameter
        NodeConnectionRule rule1 = new NodeConnectionRule(RuleOperator.NAND,
                nodeList1);
        parentRuleList.add(rule1);
        nodeValidatorRule.setParentRule(parentRuleList);

        return nodeValidatorRule;
    }

    /**
     * Creates the connection rules for the Justification node.
     * 
     * @return the connection rules for the Justification node.
     */
    private static NodeValidatorRule createJustificationValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_ONE);
        parentMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO);

        parentMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
        
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        // creates connection rules for parents.
        List<NodeConnectionRule> parentRuleList = new ArrayList<NodeConnectionRule>();
        // create a exclusive connection rule for the Goal and the System as parents.
        List<NodeType> nodeList1 = new ArrayList<NodeType>();
        nodeList1.add(NodeType.GOAL);
        //nodeList1.add(NodeType.SYSTEM); // Parameter
        NodeConnectionRule rule1 = new NodeConnectionRule(RuleOperator.NAND,
                nodeList1);
        parentRuleList.add(rule1);
        nodeValidatorRule.setParentRule(parentRuleList);

        return nodeValidatorRule;
    }

    /**
     * Creates the connection rules for the Module/External node.
     * 
     * @return the connection rules for the Module/External node.
     */
    private static NodeValidatorRule createModuleValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO);

        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.JUSTIFICATION, NodeMultiplicity.ZERO);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO_OR_MORE); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO); // Action
       
        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity
                .put(NodeType.STRATEGY, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity
                .put(NodeType.EVIDENCE, NodeMultiplicity.ZERO_OR_MORE);

        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO_OR_MORE);

        parentMultiplicity.put(NodeType.JUSTIFICATION,
                NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO_OR_MORE); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO_OR_MORE); // Action
        
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        return nodeValidatorRule;
    }

    /**
     * Creates an unrestricted connection rule.
     * 
     * @return an unrestricted connection rule.
     */
    private static NodeValidatorRule createUnlimitedValidatorRule() {

        NodeValidatorRule nodeValidatorRule = new NodeValidatorRule();

        // creates the multiplicity for children. 
        Map<NodeType, NodeMultiplicity> childMultiplicity = new TreeMap<NodeType, NodeMultiplicity>();
        childMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.STRATEGY, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.EVIDENCE, NodeMultiplicity.ZERO_OR_MORE);

        childMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.JUSTIFICATION,
                NodeMultiplicity.ZERO_OR_MORE);
        childMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO_OR_MORE); // Pattern
        childMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO_OR_MORE); // Action
        
        childMultiplicity = addUnlimitedNodeMultiplicity(childMultiplicity);
        nodeValidatorRule.setChildMultiplicity(childMultiplicity);

        // creates the multiplicity for parents. 
        Map<NodeType, NodeMultiplicity> parentMultiplicity = new HashMap<NodeType, NodeMultiplicity>();
        parentMultiplicity.put(NodeType.GOAL, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity
                .put(NodeType.STRATEGY, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity
                .put(NodeType.EVIDENCE, NodeMultiplicity.ZERO_OR_MORE);

        parentMultiplicity.put(NodeType.CONTEXT, NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity.put(NodeType.JUSTIFICATION,
                NodeMultiplicity.ZERO_OR_MORE);
        parentMultiplicity.put(NodeType.SYSTEM, NodeMultiplicity.ZERO_OR_MORE); // Pattern
        parentMultiplicity.put(NodeType.POLICY, NodeMultiplicity.ZERO_OR_MORE); // Action
        parentMultiplicity = addUnlimitedNodeMultiplicity(parentMultiplicity);
        nodeValidatorRule.setParentMultiplicity(parentMultiplicity);

        return nodeValidatorRule;
    }

    /**
     * Adds common unrestricted multiplicity connection rules.
     * 
     * @param multipilictyMap the map of the multiplicity.
     * @return the map of the multiplicity with common unrestricted multiplicity.
     */
    private static Map<NodeType, NodeMultiplicity> addUnlimitedNodeMultiplicity(
            Map<NodeType, NodeMultiplicity> multipilictyMap) {

        

        return multipilictyMap;
    }

    /**
     * Creates the map of proprietary attributes with default value.
     * 
     * @param nodeType the node type
     * @return the map of proprietary attributes with default value.
     */
    private static Map<AttributeType, Object> createAttributeInitValueMap(
            NodeType nodeType) {

        Map<AttributeType, Object> initValueMap = createCommonAttributeInitValueMap();

        switch (nodeType) {
            case GOAL:
                initValueMap.put(AttributeType.SCORE, BigDecimal.ZERO);
                initValueMap.put(AttributeType.WEIGHT, INTEGER_ONE);
                break;
            case JUSTIFICATION:
                initValueMap.put(AttributeType.STAKEHOLDER, STRING_EMPTY);
                initValueMap.put(AttributeType.RISK_ANALYSIS, STRING_EMPTY);
                break;
            case SYSTEM: // Pattern
                initValueMap.put(AttributeType.SUBTYPE, STRING_EMPTY);
                initValueMap.put(AttributeType.LEAFNODE, STRING_EMPTY);
                initValueMap.put(AttributeType.I, STRING_EMPTY);
                initValueMap.put(AttributeType.J, STRING_EMPTY);
                break;
            case STRATEGY:
            case EVIDENCE:
            case CONTEXT:
            case POLICY:
            case SAFETYCASE:
            case ARGUMENT:
                break;
            default:
                return null;
        }

        return initValueMap;
    }

    /**
     * Creates the common attributes with default values.
     * 
     * @return the common attributes with default values.
     */
    private static Map<AttributeType, Object> createCommonAttributeInitValueMap() {

        Map<AttributeType, Object> commonInitValueMap = new HashMap<AttributeType, Object>();
        commonInitValueMap.put(AttributeType.ID, null);
        commonInitValueMap.put(AttributeType.NAME, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.DESC, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.ATTACHMENT, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.STATUS, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.FLAG, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.RESPNAME, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.RESPADDRESS, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.RESPICON, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.RESPTIME, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.MESSAGE, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.REQUIREMENT, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.PARENT, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.REFSOURCE, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.PARAMETERDEFS, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.PARAMETERVALS, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.PARAMETERIZEDDESC, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF001, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF002, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF003, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF004, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF005, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF006, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF007, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF008, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF009, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF010, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF011, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF012, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF013, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF014, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF015, STRING_EMPTY);
        commonInitValueMap.put(AttributeType.USERDEF016, STRING_EMPTY);

        return commonInitValueMap;
    }

    /**
     * Allocates a NodeType and initializes it to represents the specified name.
     * 
     * @param name the name.
     */
    private NodeType(String name) {
        this.name = name;
    }

    /**
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the connection rules.
     * 
     * @return the connection rules.
     */
    public NodeValidatorRule getNodeValidatorRule() {

        if (nodeValidatorRule == null) {
            nodeValidatorRule = createNodeValidatorRule(this);
        }
        return nodeValidatorRule;
    }

    /**
     * Returns the map of attributes with default value.
     * 
     * @return the map of attributes with default value.
     */
    public Map<AttributeType, Object> getAttributeInitValueMap() {

        if (attributeInitValueMap == null) {
            attributeInitValueMap = createAttributeInitValueMap(this);
        }
        return attributeInitValueMap;
    }

}
