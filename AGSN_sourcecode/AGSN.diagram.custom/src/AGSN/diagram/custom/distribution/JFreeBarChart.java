package AGSN.diagram.custom.distribution;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.NumberFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleEdge;

import AGSN.diagram.common.constant.SystemPropertyKeyConst;
import AGSN.diagram.common.exception.DcaseRuntimeException;
import AGSN.diagram.common.util.FileUtil;
import AGSN.diagram.common.util.MessageTypeImpl;
import AGSN.diagram.common.util.Messages;
import AGSN.diagram.custom.common.util.AGSNEditorUtil;
import AGSN.diagram.edit.parts.SafetyCaseEditPart;

public class JFreeBarChart {
	// quality level key
	private final static String verylow = SystemPropertyKeyConst.verylow;
	private final static String low = SystemPropertyKeyConst.low;
	private final static String medium = SystemPropertyKeyConst.medium;
	private final static String high = SystemPropertyKeyConst.high;
	private final static String veryhigh = SystemPropertyKeyConst.veryhigh;

	// status key
	private final static String notreviewed = SystemPropertyKeyConst.notreviewed;
	private final static String accepted = SystemPropertyKeyConst.accepted;
	private final static String incorrect = SystemPropertyKeyConst.incorrect;
	private final static String weak = SystemPropertyKeyConst.weak;
	private final static String reviewlater = SystemPropertyKeyConst.reviewlater;

	// chart png files
	private final static String[] PNGfiles = new String[4];

	// title of the chart
	private static String[] title = new String[4];
	
	//dataset values
	public static double[] values = new double[5];
	
	//chart path
	private static File chartFile = null;
	
	//type of Bar chart
	private static String type = "";

	/**
	 * Creates a new demo instance.
	 *
	 * @param title
	 *            the frame title.
	 */
	public JFreeBarChart() {

	}

	/**
	 * Returns a sample dataset.
	 * 
	 * @return The dataset.
	 */
	private static CategoryDataset createDataset(double[] values, String xaxis) {
		final String[] series = new String[values.length];
		if (xaxis.equals("Quality Level")) {
			// row keys...
			series[0] = verylow;
			series[1] = low;
			series[2] = medium;
			series[3] = high;
			series[4] = veryhigh;
		} else {
			if (xaxis.equals("Assessment Status")) {
				series[0] = notreviewed;
				series[1] = accepted;
				series[2] = incorrect;
				series[3] = weak;
				series[4] = reviewlater;
			}
		}

		// column keys...
		final String category1 = "";
		/*
		 * final String category2 = "Category 2"; final String category3 =
		 * "Category 3"; final String category4 = "Category 4"; final String
		 * category5 = "Category 5";
		 */

		// create the dataset...
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		for (int i = 0; i < values.length; i++) {
			dataset.addValue(values[i], series[i], category1);
		}
		return dataset;

	}

	/**
	 * Creates a sample chart.
	 * 
	 * @param dataset
	 *            the dataset.
	 * 
	 * @return A sample chart.
	 */
	public static JFreeChart createChart(final CategoryDataset dataset, String title, String xaxis, String yaxis) {

		ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());
		final JFreeChart chart = ChartFactory.createBarChart(title, // chart
																	// title
				xaxis, // domain axis label
				yaxis, // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				false, // include legend
				true, // tooltips?
				false // URLs?
		);
		// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

		// set the background color for the chart...
		chart.setBackgroundPaint(Color.white);

		// get a reference to the plot for further customisation...
		final CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(Color.white);
		plot.setDomainGridlinePaint(Color.black);
		plot.setRangeGridlinePaint(Color.black);

		// set the range axis to display integers only...
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

		// disable bar outlines...
		final BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setDrawBarOutline(false);
		renderer.setShadowVisible(false);
        CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator(
                "{0} {3}", NumberFormat.getInstance());
		renderer.setBaseItemLabelGenerator(generator);
		renderer.setBaseItemLabelsVisible(true);
		// set up paints for series...
		Color gp0 = null;
		Color gp1 = null;
		Color gp2 = null;
		Color gp3 = null;
		Color gp4 = null;
		if (type.equals("status")) {
			gp0 = new Color(243, 229, 171);
			gp1 = new Color(102, 255, 102);
			gp2 = new Color(255, 100, 100);
			gp3 = new Color(255, 255, 102);
			gp4 = new Color(200, 200, 200);
		} else {
			gp0 = new Color(255, 0, 0);
			gp1 = new Color(255, 128, 0);
			gp2 = new Color(255, 255, 0);
			gp3 = new Color(128, 255, 0);
			gp4 = new Color(0, 204, 0);
		}
		renderer.setSeriesPaint(0, gp0);
		renderer.setSeriesPaint(1, gp1);
		renderer.setSeriesPaint(2, gp2);
		renderer.setSeriesPaint(3, gp3);
		renderer.setSeriesPaint(4, gp4);

		final CategoryAxis domainAxis = plot.getDomainAxis();
		domainAxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0));
		// OPTIONAL CUSTOMISATION COMPLETED.
		//LegendTitle legend = chart.getLegend();
		//legend.setPosition(RectangleEdge.TOP);

		return chart;
	}
	
	public static String generateFile(String file) {
		if (file.equals("quality_distribution")){
			PNGfiles[0] = "quality_All";
			PNGfiles[1] =  "quality_Goal";
			PNGfiles[2] =  "quality_Strategy";
			PNGfiles[3] =  "quality_Evidence";
			type = "quality";
		}else{
			if (file.equals("status_overview")){
				PNGfiles[0] = "status_All";
				PNGfiles[1] =  "status_Goal";
				PNGfiles[2] =  "status_Strategy";
				PNGfiles[3] =  "status_Evidence";
				type = "status";
			}
		}
		if (values != null) {
			SafetyCaseEditPart safetycaseEditPart = AGSNEditorUtil.getCurrentArgumentEditPart();
			IFile currentFile = AGSNEditorUtil.getModelFile(safetycaseEditPart);

			IPath path = currentFile.getLocation().removeFileExtension();
			IPath resourcepath = currentFile.getFullPath().removeFileExtension();
			chartFile = new File(path.toOSString() + "_report/");

			// create the folder in workspace
			IFolder folder = FileUtil.getWorkspaceFolderFromPath(resourcepath + "_report/");
			try {
				if (!folder.exists()) {
					folder.create(IResource.NONE, true, null);
				}
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			String filepath = resourcepath + "_report/" + file +".html";
			return filepath;
		}
		return null;
	}

	public static void generateBarChart(String filename, String title, String xaxis, String yaxis) {
		
			String filepath = chartFile.getPath() + "/" + filename + ".png";

			CategoryDataset datasets = createDataset(values, xaxis);
			JFreeChart chart = createChart(datasets, title, xaxis, yaxis);
			try {
				ChartUtilities.saveChartAsPNG(new File(filepath), chart, 600, 400);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void saveHTML(String filepath) {
		final IFile htmlfile = FileUtil.getWorkspaceFileFromPath(filepath);

		try {
			final OutputStream out = new FileOutputStream(htmlfile.getLocation().toOSString());
			final PrintWriter writer = new PrintWriter(out);
			writer.println("<HTML>");
			writer.println("<HEAD><TITLE>" + title + "</TITLE></HEAD>");
			for (int i = 0; i < 4; i++) {
				writer.println("<BODY>");
				// ChartUtilities.writeImageMap(writer, "chart", info);
				writer.println("<IMG SRC=\"" + PNGfiles[i] + ".png\" "
						+ "WIDTH=\"600\" HEIGHT=\"400\" BORDER=\"0\" USEMAP=\"#chart\">");
				writer.println("</BODY>");
				writer.println("<p></p>");
			}
			writer.println("</HTML>");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static IFile getBarChartFile(String filePath) {

		// refresh package explorer
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

		// throws exception if the path is null or empty.
		if (filePath == null || filePath.trim().length() == 0) {
			throw new DcaseRuntimeException(Messages.OpenDefaultEditorHandler_0, null, null, 0,
					MessageTypeImpl.OPEN_REPORT_CRITICAL_FAILED);
		}

		// gets the IFile object.
		IFile file = FileUtil.getWorkspaceFileFromPath(filePath);

		// throws exception if the file doesn't exist.
		if (file == null || !file.exists()) {
			throw new DcaseRuntimeException(Messages.OpenDefaultEditorHandler_1, null, null, 0,
					MessageTypeImpl.OPEN_REPORT_INVALID_FILE);
		}

		return file;
	}

}
