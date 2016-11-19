/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.common.util;


import AGSN.diagram.common.model.NodeType;

import org.eclipse.osgi.util.NLS;

/**
 * A message bundle class for menus.
 */
public final class Menus extends NLS {

    // AUTO_GENERATED:START
    private static final String BUNDLE_NAME = "AGSN.diagram.common.util.menus"; //$NON-NLS-1$

    public static String CalculateScoreAction_0;
    public static String ConvertNodeTypeSelectionListener_0;
    public static String NodeChildrenHideHandler_0;
    public static String NodeChildrenShowHandler_0;
    public static String SelectAttachmentHandler_0;
    public static String TemplateModelAdditionAction_0;
    public static String SelectLinkedDiagramHandler_0;
    public static String NodeSelectionListener_0;
    public static String TemplateSelectionListener_0;
    public static String SetSiblingOrderHandler_0;
    public static String Menus_0;
    public static String Menus_1;
    public static String Menus_2;
    public static String Menus_3;
    public static String Menus_4;
    public static String Menus_5;
    public static String Menus_6;
    public static String Menus_7;
    public static String Menus_8;
    public static String Menus_9;
    public static String Menus_10;
    public static String Menus_11;
    public static String Menus_12;
    public static String Menus_13;
    public static String Menus_14;
    public static String DcaseFileMenuContributionItem_2;
    public static String DcaseFileMenuContributionItem_3;
    public static String CompareDcaseFileSelectionAdapter_0;
    public static String SwitchSourceAndTargetSelectionAdapter_0;
    public static String ExpressModelDiffrenceLogic_0;
    public static String ExpressModelDiffrenceLogic_1;
    public static String ExpressModelDiffrenceLogic_2;
    public static String AddPattern_0;
    public static String AddPattern_1;
    public static String LoopUnroll_0;
    public static String LoopUnroll_1;
    
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Menus.class);
    }

    /**
     * A constructor.
     */
    private Menus() {
    }
    
    /**
     * Returns the string that represents the specified node type.
     * 
     * @param nodeType the node type.
     * @return the string that represents the specified node type.
     */
    public static String getMenuName(NodeType nodeType) {
        String result = null;
        switch (nodeType) {
            case GOAL:
                result = Menus_0;
                break;
            case STRATEGY:
                result = Menus_1;
                break;
            case EVIDENCE:
                result = Menus_2;
                break;
            case CONTEXT:
                result = Menus_3;
                break;
            case JUSTIFICATION:
                result = Menus_4;
                break;
            case ASSUMPTION:
            	result = Menus_5;
            	break;
		default:
			break;
            
        }
        return result;
    }
}
