/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.common.constant;

/**
 * A class that defines system property keys.
 */
public final class SystemPropertyKeyConst {

    /**
     * The keys for the system properties.
     */
    private SystemPropertyKeyConst() {
    }

    /**
     * The key for the extension of the GMF diagram file.
     */
    public static final String DIAGRAM_FILE_EXTENSION = "diagram.file.extension";   //$NON-NLS-1$

    /**
     * The key for the extension of the GMF model file.
     */
    public static final String MODEL_GMF_FILE_EXTENSION = "model.gmf.file.extension";   //$NON-NLS-1$

    /**
     * The key for the extension of the D-Case file.
     */
    public static final String MODEL_DCASE_FILE_EXTENSION = "model.dcase.file.extension";   //$NON-NLS-1$

    /**
     * The key for the extension of the ARM file.
     */
    public static final String MODEL_ARM_FILE_EXTENSION = "model.arm.file.extension";   //$NON-NLS-1$

    /**
     * The key for the extension of the ARM file.
     */
    public static final String MODEL_SACM_FILE_EXTENSION = "model.sacm.file.extension";   //$NON-NLS-1$

    /**
     * The key for the extension of the template file.
     */
    public static final String TEMPLATE_MODEL_FILE_EXTENSION = "template.model.file.extension"; //$NON-NLS-1$
    
    /**
     * The key for the template project name.
     */
    public static final String TEMPLATE_RESOURCE_PROJECT_NAME = "template.resource.project.name";   //$NON-NLS-1$
    
    /**
     * The key for value of the top margin of the canvas.
     */
    public static final String DIAGRAM_EDIT_CANVAS_MARGIN_TOP = "diagram.edit.canvas.margin.top";   //$NON-NLS-1$

    /**
    * The key for value of the left margin of the canvas.
     */
    public static final String DIAGRAM_EDIT_CANVAS_MARGIN_LEFT = "diagram.edit.canvas.margin.left"; //$NON-NLS-1$

    /**
     * The key for value of the bottom margin of the canvas.
     */
    public static final String DIAGRAM_EDIT_CANVAS_MARGIN_BOTTOM = "diagram.edit.canvas.margin.bottom"; //$NON-NLS-1$

    /**
     * The key for value of the right margin of the canvas.
     */
    public static final String DIAGRAM_EDIT_CANVAS_MARGIN_RIGHT = "diagram.edit.canvas.margin.right";   //$NON-NLS-1$

    /**
     * The key for the message output level.
     */
    public static final String MESSAGE_OUTPUT_LEVEL = "message.output.level";   //$NON-NLS-1$

    /**
     * The key for the extension of the d* diagram file.
     */
    public static final String DSTAR_FILE_EXTENSION = "dstar.file.extension";   //$NON-NLS-1$

    /**
     * The key for the extension of the d* model file.
     */
    public static final String MODEL_DSTAR_FILE_EXTENSION = "model.dstar.file.extension";   //$NON-NLS-1$

    /**
     * The key for the external command project name.
     */
    public static final String EXTERNAL_COMMAND_PROJECT_NAME = "external.command.project.name";   //$NON-NLS-1$
    
	//quality level key
	public final static String verylow = "Very Low";
	public final static String low = "Low";
	public final static String medium = "Medium";
	public final static String high = "High";
	public final static String veryhigh = "Very High";
	
	//status key
	public final static String notreviewed = "Not Reviewed";
	public final static String accepted = "Accepted";
	public final static String incorrect = "Incorrect";
	public final static String weak = "Weak";
	public final static String reviewlater = "Review Later";
	
	//Bar Chart Title
	public final static String quality_all = "Quality Distribution";
	public final static String quality_goal = "Quality Distribution of Goals";
	public final static String quality_strategy = "Quality Distribution of Strategies";
	public final static String quality_evidence = "Quality Distribution of Evidences";
	public final static String quality_xaxis = "Quality Level";
	
	
	public final static String status_all = "Assessment Status Overview";
	public final static String status_goal = "Assessment Status of Goals";
	public final static String status_strategy = "Assessment Status of Strategies";
	public final static String status_evidence = "Assessment Status of Evidences";
	public final static String status_xaxis = "Assessment Status";
	
	public final static String yaxis_all = "Number of Nodes";
	public final static String yaxis_goal = "Number of Goals";
	public final static String yaxis_strategy = "Number of Strategies";
	public final static String yaxis_evidence = "Number of Evidences";
	
	public final static String degree_belief = "Degree of Belief";

	
}
