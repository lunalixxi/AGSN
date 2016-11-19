package gsnfigures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class GSNContract extends Shape{

	private PointList pointList;
	public GSNContract(){
		this.setMinimumSize(new Dimension(80,60));
		this.pointList = new PointList();
	}
	
	/*
	@Override
	public void paint(Graphics graphics) {
		Rectangle r = getBounds();
		
		Point p1=new Point(r.x,r.y);
		Point p2=new Point(r.x+2*r.width/6,r.y);
		Point p3=new Point(r.x+2*r.width/6,r.y+r.height/7);
		Point p4=new Point(r.x,r.y+r.height/7);
		Point p5=new Point(r.x+r.width,r.y+r.height/7);
		Point p6=new Point(r.x,r.y+6*r.height/7);
		Point p7=new Point(r.x+r.width,r.y+6*r.height/7);
		Point p8=new Point(r.x+4*r.width/6,r.y+r.height);
		Point p9=new Point(r.x+4*r.width/6,r.y+6*r.height/7);
		Point p10=new Point(r.x+r.width,r.y+r.height);


		PointList pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p4);
		pointList.addPoint(p5);
		pointList.addPoint(p6);
		pointList.addPoint(p7);
		pointList.addPoint(p8);
		pointList.addPoint(p9);
		pointList.addPoint(p10);

		// Fill the shape
		graphics.fillPolygon(pointList);

		graphics.drawLine(p1, p2);
		graphics.drawLine(p2, p3);
		graphics.drawLine(p1, p4);
		graphics.drawLine(p4, p5);
		graphics.drawLine(p5, p7);
		graphics.drawLine(p6, p7);
		graphics.drawLine(p6, p4);
		graphics.drawLine(p8, p9);
		graphics.drawLine(p8, p10);
		graphics.drawLine(p10, p7);

		
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);
	}*/
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(this.pointList);
	}
	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();
		
		Point p1=new Point(r.x,r.y);
		Point p2=new Point(r.x+2*r.width/6,r.y);
		Point p3=new Point(r.x+2*r.width/6,r.y+r.height/7);
		Point p4=new Point(r.x,r.y+r.height/7);
		Point p5=new Point(r.x+r.width-1,r.y+r.height/7);
		Point p6=new Point(r.x,r.y+6*r.height/7);
		Point p7=new Point(r.x+r.width-1,r.y+6*r.height/7);
		Point p8=new Point(r.x+4*r.width/6,r.y+r.height-1);
		Point p9=new Point(r.x+4*r.width/6,r.y+6*r.height/7);
		Point p10=new Point(r.x+r.width-1,r.y+r.height-1);

	    pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p5);
		pointList.addPoint(p7);
		pointList.addPoint(p10);
		pointList.addPoint(p8);
		pointList.addPoint(p9);
		pointList.addPoint(p6);
		pointList.addPoint(p4);

		// Fill the shape
		int lineWidth = 1;
        graphics.setLineWidth(lineWidth);
        graphics.setForegroundColor(ColorConstants.darkGray);
		graphics.fillPolygon(pointList);

		graphics.drawLine(p1, p2);
		graphics.drawLine(p2, p3);
		graphics.drawLine(p1, p4);
		graphics.drawLine(p4, p5);
		graphics.drawLine(p5, p7);
		graphics.drawLine(p6, p7);
		graphics.drawLine(p6, p4);
		graphics.drawLine(p8, p9);
		graphics.drawLine(p8, p10);
		graphics.drawLine(p10, p7);

		
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
