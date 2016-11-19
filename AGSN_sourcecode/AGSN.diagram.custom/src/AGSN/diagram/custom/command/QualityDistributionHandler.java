/**
 * 
 */
package AGSN.diagram.custom.command;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import AGSN.BasicNode;
import AGSN.Evidence;
import AGSN.Goal;
import AGSN.SafetyCase;
import AGSN.Strategy;
import AGSN.diagram.common.constant.SystemPropertyKeyConst;
import AGSN.diagram.common.exception.DcaseRuntimeException;
import AGSN.diagram.common.exception.DcaseSystemException;
import AGSN.diagram.common.util.MessageTypeImpl;
import AGSN.diagram.common.util.Messages;
import AGSN.diagram.custom.common.util.AGSNEditorUtil;
import AGSN.diagram.custom.common.util.MessageWriter;
import AGSN.diagram.custom.distribution.ComputeNodesMember;
import AGSN.diagram.custom.distribution.JFreeBarChart;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;

/**
 * @author Zhuoao Li (z.li.3@student.tue.nl)
 * A handler to generate and open quality report in HTML with the default editor.
 */
public class QualityDistributionHandler extends AbstractEditPartHandler {

	/**
     * The current safety case edit part.
     */
	private SafetyCaseEditPart safetycaseEditPart;
	
	/**
     * Execute command.
     * 
     * @param arg0 the event argument.
     * @throws ExecutionException the ExecutionException.
     * @return null.
     */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try{
			// generate quality report.
			String filepath = JFreeBarChart.generateFile("quality_distribution");
			JFreeBarChart.values = computeQuality();
			JFreeBarChart.generateBarChart("quality_All", SystemPropertyKeyConst.quality_all,
					SystemPropertyKeyConst.quality_xaxis, SystemPropertyKeyConst.yaxis_all);
			
			JFreeBarChart.values = computeGoalQuality();
			JFreeBarChart.generateBarChart("quality_Goal", SystemPropertyKeyConst.quality_goal, 
					SystemPropertyKeyConst.quality_xaxis, SystemPropertyKeyConst.yaxis_goal);
			
			JFreeBarChart.values= computeStrategyQuality();
			JFreeBarChart.generateBarChart("quality_Strategy", SystemPropertyKeyConst.quality_strategy, 
					SystemPropertyKeyConst.quality_xaxis, SystemPropertyKeyConst.yaxis_strategy);
			JFreeBarChart.values = computeEvidenceQuality();
			JFreeBarChart.generateBarChart("quality_Evidence", SystemPropertyKeyConst.quality_evidence, 
					SystemPropertyKeyConst.quality_xaxis, SystemPropertyKeyConst.yaxis_evidence);
			
			JFreeBarChart.saveHTML(filepath);
			
            IFile file = JFreeBarChart.getBarChartFile(filepath);
            // opens the quality report with default editor.
            openFileEditor(file);
            
		} catch (DcaseRuntimeException dre) {
            // handles the runtime exception.
            MessageWriter.showErrorMessageBox(dre.getMessage());
        } catch (DcaseSystemException dse) {
            // handles the d-case system exception.
            MessageWriter.writeMessageToErrorLog(dse);
            MessageWriter.showMessageBoxSeeErroLog();
        }
		return null;
	}
	
	private double[] computeGoalQuality(){
		try {
			safetycaseEditPart = AGSNEditorUtil.getCurrentArgumentEditPart();
        } catch (Exception e) {
        	safetycaseEditPart = null;
        }
        if (safetycaseEditPart != null) {
         
        	SafetyCase safetycase = (SafetyCase) AGSNEditorUtil
                    .getElement(safetycaseEditPart);
            if (safetycase != null) {
            	ComputeNodesMember computeNodesMember = new ComputeNodesMember(5);
				for (BasicNode basicNode : safetycase.getRootBasicNode()) {
					if(basicNode instanceof Goal){
						switch (basicNode.getQualityLevel()) {
						case VERY_LOW:
	                        computeNodesMember.incCount(0);
							break;
						case LOW:
							computeNodesMember.incCount(1);
							break;
						case MEDIUM:
							computeNodesMember.incCount(2);
							break;
						case HIGH:
							computeNodesMember.incCount(3);
							break;
						case VERY_HIGH:
							computeNodesMember.incCount(4);
							break;
						default:
							break;
						}
				}
				}
				double[] values = new double[5];
				for (int i = 0; i < 5; i++) {
            	   values[i] = computeNodesMember.getCount(i);
				}
				
				return values;
            }
        }
            return null;
	}
	
	private double[] computeStrategyQuality(){
		try {
			safetycaseEditPart = AGSNEditorUtil.getCurrentArgumentEditPart();
        } catch (Exception e) {
        	safetycaseEditPart = null;
        }
        if (safetycaseEditPart != null) {
         
        	SafetyCase safetycase = (SafetyCase) AGSNEditorUtil
                    .getElement(safetycaseEditPart);
            if (safetycase != null) {
            	ComputeNodesMember computeNodesMember = new ComputeNodesMember(5);
				for (BasicNode basicNode : safetycase.getRootBasicNode()) {
					if(basicNode instanceof Strategy){
						switch (basicNode.getQualityLevel()) {
						case VERY_LOW:
	                        computeNodesMember.incCount(0);
							break;
						case LOW:
							computeNodesMember.incCount(1);
							break;
						case MEDIUM:
							computeNodesMember.incCount(2);
							break;
						case HIGH:
							computeNodesMember.incCount(3);
							break;
						case VERY_HIGH:
							computeNodesMember.incCount(4);
							break;
						default:
							break;
						}
				}
				}
				double[] values = new double[5];
				for (int i = 0; i < 5; i++) {
            	   values[i] = computeNodesMember.getCount(i);
				}
				
				return values;
            }
        }
            return null;
	}
	
	private double[] computeEvidenceQuality(){
		try {
			safetycaseEditPart = AGSNEditorUtil.getCurrentArgumentEditPart();
        } catch (Exception e) {
        	safetycaseEditPart = null;
        }
        if (safetycaseEditPart != null) {
         
        	SafetyCase safetycase = (SafetyCase) AGSNEditorUtil
                    .getElement(safetycaseEditPart);
            if (safetycase != null) {
            	ComputeNodesMember computeNodesMember = new ComputeNodesMember(5);
				for (BasicNode basicNode : safetycase.getRootBasicNode()) {
					if(basicNode instanceof Evidence){
						switch (basicNode.getQualityLevel()) {
						case VERY_LOW:
	                        computeNodesMember.incCount(0);
							break;
						case LOW:
							computeNodesMember.incCount(1);
							break;
						case MEDIUM:
							computeNodesMember.incCount(2);
							break;
						case HIGH:
							computeNodesMember.incCount(3);
							break;
						case VERY_HIGH:
							computeNodesMember.incCount(4);
							break;
						default:
							break;
						}
				}
				}
				double[] values = new double[5];
				for (int i = 0; i < 5; i++) {
            	   values[i] = computeNodesMember.getCount(i);
				}
				
				return values;
            }
        }
            return null;
	}
	private double[] computeQuality() {
		
		try {
			safetycaseEditPart = AGSNEditorUtil.getCurrentArgumentEditPart();
        } catch (Exception e) {
        	safetycaseEditPart = null;
        }
        if (safetycaseEditPart != null) {
         
        	SafetyCase safetycase = (SafetyCase) AGSNEditorUtil
                    .getElement(safetycaseEditPart);
            if (safetycase != null) {
            	ComputeNodesMember computeNodesMember = new ComputeNodesMember(5);
				for (BasicNode basicNode : safetycase.getRootBasicNode()) {
					switch (basicNode.getQualityLevel()) {
					case VERY_LOW:
                        computeNodesMember.incCount(0);
						break;
					case LOW:
						computeNodesMember.incCount(1);
						break;
					case MEDIUM:
						computeNodesMember.incCount(2);
						break;
					case HIGH:
						computeNodesMember.incCount(3);
						break;
					case VERY_HIGH:
						computeNodesMember.incCount(4);
						break;
					default:
						break;
					}
				}
				double[] values = new double[5];
				for (int i = 0; i < 5; i++) {
            	   values[i] = computeNodesMember.getCount(i);
				}
				
				return values;
            }
        }
        
        return null;
		
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
                    e, MessageTypeImpl.OPEN_REPORT_CRITICAL_FAILED);
        }
    }

}
