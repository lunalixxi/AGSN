package AGSN.diagram.custom.command;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import AGSN.BasicNode;
import AGSN.diagram.common.constant.SystemPropertyKeyConst;
import AGSN.diagram.common.exception.DcaseRuntimeException;
import AGSN.diagram.common.exception.DcaseSystemException;
import AGSN.diagram.common.util.MessageTypeImpl;
import AGSN.diagram.common.util.Messages;
import AGSN.diagram.custom.common.util.AGSNEditorUtil;
import AGSN.diagram.custom.common.util.MessageWriter;
import AGSN.diagram.custom.assessmentER.ERJFreeBarChart;

/**
 * @author Zhuoao Li (z.li.3@student.tue.nl) A handler to generate and open ER
 *         bar chart of an element in HTML with the default editor.
 */
public class ERBarchartHandler extends AbstractEditPartHandler {

	/**
	 * Execute command.
	 * 
	 * @param arg0
	 *            the event argument.
	 * @throws ExecutionException
	 *             the ExecutionException.
	 * @return null.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		GraphicalEditPart editPart = getSelectedElement(event);
		String filepath = ERJFreeBarChart.generateFile("er_belief");
		BasicNode selectednode = (BasicNode) AGSNEditorUtil.getElement(editPart);

		if (selectednode.getBeliefDegree() == null) {
			MessageWriter.showErrorMessageBox(NLS.bind(Messages.OpenERBarChartError, selectednode.getName()));
		} else {

			try {
				// generate ER bar chart
				ERJFreeBarChart.node = selectednode;
				ERJFreeBarChart.generateBarChart("er_belief", "Degrees of Belief " + selectednode.getName(),
						SystemPropertyKeyConst.quality_xaxis, SystemPropertyKeyConst.degree_belief);

				ERJFreeBarChart.saveHTML(filepath);

				IFile file = ERJFreeBarChart.getBarChartFile(filepath);
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
		}
		return null;
	}

	/**
	 * Opens the file with the default editor.
	 * 
	 * @param file
	 *            the file to open.
	 */
	private void openFileEditor(IFile file) {

		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IDE.openEditor(workbenchPage, file);
		} catch (PartInitException e) {
			throw new DcaseSystemException(Messages.COMMON_EXCEPTION_partInit, e,
					MessageTypeImpl.OPEN_REPORT_CRITICAL_FAILED);
		}
	}

}
