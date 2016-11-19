package gsnfigures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class GSNStrategy extends Shape {

	// says if the element is related with any entity abstraction extension
	private int shape;
    private PointList pointList;
	public GSNStrategy() {
		this.setShape(0);
		this.setMinimumSize(new Dimension(80, 60));
        this.pointList = new PointList();
	}

	/*
	 * @Override public void paint(Graphics graphics) {
	 * 
	 * Rectangle r = getBounds(); if (getShape()==0){
	 * 
	 * // Define the points of a parallelogram Point p1 = new
	 * Point(r.x+r.width/12, r.y); Point p2 = new Point(r.x + r.width - 1, r.y);
	 * Point p3 = new Point(r.x, r.y + r.height); Point p4 = new Point(r.x +
	 * 11*r.width/12 - 1, r.y + r.height);
	 * 
	 * 
	 * PointList pointList = new PointList(); pointList.addPoint(p1);
	 * pointList.addPoint(p2); pointList.addPoint(p3); pointList.addPoint(p4);
	 * 
	 * // Fill the shape graphics.fillPolygon(pointList); // Draw the outline
	 * graphics.setLineWidth(1);
	 * 
	 * graphics.drawLine(p1, p2);
	 * 
	 * graphics.drawLine(p1, p3); graphics.setLineWidth(2);
	 * graphics.drawLine(p3, p4); graphics.setLineWidth(1);
	 * graphics.drawLine(p2, p4);
	 * 
	 * 
	 * } else{ // Define the points of a parallelogram Point p1 = new
	 * Point(r.x+r.width/12, r.y); Point p2 = new Point(r.x + r.width - 1, r.y);
	 * Point p3 = new Point(r.x, r.y + 3*r.height/4); Point p4 = new Point(r.x +
	 * 11*r.width/12 - 1, r.y + 3*r.height/4);
	 * 
	 * 
	 * PointList pointList = new PointList(); pointList.addPoint(p1);
	 * pointList.addPoint(p2); pointList.addPoint(p3); pointList.addPoint(p4);
	 * //undeveloped element status if(getShape()==1){ Point p5 = new
	 * Point(r.x+r.width/2, r.y+3*r.height/4); Point p6 = new Point(r.x +
	 * 5*r.width/8, r.y+7*r.height/8); Point p7 = new Point(r.x+r.width/2, r.y +
	 * r.height); Point p8 = new Point(r.x + 3*r.width/8, r.y + 7*r.height/8);
	 * 
	 * pointList.addPoint(p5); pointList.addPoint(p6); pointList.addPoint(p7);
	 * pointList.addPoint(p8); // Fill the shape
	 * graphics.fillPolygon(pointList);
	 * 
	 * // Draw the outline graphics.setLineWidth(1);
	 * 
	 * graphics.drawLine(p1, p2); graphics.drawLine(p1, p3);
	 * graphics.drawLine(p3, p4); graphics.drawLine(p2, p4);
	 * 
	 * // Draw the outline graphics.drawLine(p5, p6); graphics.drawLine(p6, p7);
	 * graphics.drawLine(p7, p8); graphics.drawLine(p5, p8);
	 * 
	 * } //uninstantiated element status else if(getShape()==2){
	 * 
	 * 
	 * Point p5 = new Point(r.x+r.width/2, r.y+3*r.height/4); Point p6 = new
	 * Point(r.x + 5*r.width/8, r.y+7*r.height/8); Point p7 = new
	 * Point(r.x+r.width/2, r.y + r.height); Point p8 = new Point(r.x +
	 * 3*r.width/8, r.y + 7*r.height/8);
	 * 
	 * pointList.addPoint(p5); pointList.addPoint(p6); pointList.addPoint(p7);
	 * pointList.addPoint(p8); // Fill the shape
	 * graphics.fillPolygon(pointList);
	 * 
	 * // Draw the outline graphics.setLineWidth(1); graphics.drawLine(p1, p2);
	 * graphics.drawLine(p1, p3); graphics.drawLine(p3, p4);
	 * graphics.drawLine(p2, p4);
	 * 
	 * // Draw the outline graphics.drawLine(p5, p6); graphics.drawLine(p6, p8);
	 * graphics.drawLine(p5, p8);
	 * 
	 * } //undeveloped and uninstantiated element status else if(getShape()==3){
	 * 
	 * Point p5 = new Point(r.x+r.width/2, r.y+3*r.height/4); Point p6 = new
	 * Point(r.x + 5*r.width/8, r.y+7*r.height/8); Point p7 = new
	 * Point(r.x+r.width/2, r.y + r.height); Point p8 = new Point(r.x +
	 * 3*r.width/8, r.y + 7*r.height/8);
	 * 
	 * pointList.addPoint(p5); pointList.addPoint(p6); pointList.addPoint(p7);
	 * pointList.addPoint(p8); // Fill the shape
	 * graphics.fillPolygon(pointList);
	 * 
	 * // Draw the outline graphics.setLineWidth(1);
	 * 
	 * graphics.drawLine(p1, p2); graphics.drawLine(p1, p3);
	 * graphics.drawLine(p3, p4); graphics.drawLine(p2, p4);
	 * 
	 * // Draw the outline graphics.drawLine(p5, p6); graphics.drawLine(p6, p7);
	 * graphics.drawLine(p7, p8); graphics.drawLine(p5, p8);
	 * graphics.drawLine(p6, p8);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * // Move the first label to the center of the parallelogram WrappingLabel
	 * label = (WrappingLabel) getChildren().get(0);
	 * LayoutUtil.moveToCenterAndUp(label, this, graphics);
	 * label.paint(graphics); // Move the second label to the center of the
	 * parallelogram label = (WrappingLabel) getChildren().get(1);
	 * LayoutUtil.moveToCenterAndDown(label, this, graphics);
	 * label.paint(graphics);
	 * 
	 * }
	 */
	public void setShape(int shape) {
		this.shape = shape;
	}

	public int getShape() {
		return shape;
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(pointList);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();

		// Define the points of a parallelogram
		Point p1 = new Point(r.x + r.width / 12, r.y);
		Point p2 = new Point(r.x + r.width - 1, r.y);
		Point p3 = new Point(r.x + 11 * r.width / 12 - 1, r.y + r.height);
		Point p4 = new Point(r.x, r.y + r.height);
		
		pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p4);

		// Fill the shape
		graphics.setForegroundColor(ColorConstants.darkGray);
		graphics.fillPolygon(pointList);
		// Draw the outline

		graphics.drawLine(p1, p2);
		graphics.setLineWidth(1);
		graphics.drawLine(p2, p3);
		graphics.setLineWidth(2);
		graphics.drawLine(p3, p4);
		graphics.setLineWidth(1);
		graphics.drawLine(p4, p1);

		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);

	}
}
