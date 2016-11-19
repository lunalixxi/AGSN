package gsnfigures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class GSNAwayGoal extends Figure{

	public GSNAwayGoal(){
		this.setMinimumSize(new Dimension(80,60));
	}
	
	@Override
	public void paint(Graphics graphics) {
		Rectangle r=getBounds();
		
		// Define the points of a parallelogram
		Point p1 = new Point(r.x, r.y);
		Point p2 = new Point(r.x + r.width, r.y);
		Point p3 = new Point(r.x, r.y+r.height);
		Point p4 = new Point(r.x + r.width, r.y + r.height);
		Point p5 = new Point(r.x,r.y+3*r.height/4);
		Point p6 = new Point(r.x+r.width,r.y+3*r.height/4);

		
		Point p7=new Point(r.x+2*r.width/18,r.y+14*r.height/18);
		Point p8=new Point(r.x+3*r.width/18,r.y+14*r.height/18);
		Point p9=new Point(r.x+3*r.width/18,r.y+15*r.height/18);
		Point p10=new Point(r.x+2*r.width/18,r.y+15*r.height/18);
		Point p11 =new Point(r.x+5*r.width/18,r.y+15*r.height/18);
		Point p12=new Point(r.x+2*r.width/18,r.y+17*r.height/18);
		Point p13=new Point(r.x+5*r.width/18,r.y+17*r.height/18);
	
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
		pointList.addPoint(p11);
		pointList.addPoint(p12);
		pointList.addPoint(p13);
		// Fill the shape
		graphics.fillPolygon(pointList);
		
		// Draw the outline
		graphics.drawLine(p1, p2);
		graphics.drawLine(p1, p3);
		graphics.drawLine(p3, p4);
		graphics.drawLine(p2, p4);
		graphics.drawLine(p5, p6);
	
		graphics.drawLine(p7, p8);
		graphics.drawLine(p8, p9);
		graphics.drawLine(p7, p10);
		graphics.drawLine(p10, p11);
		graphics.drawLine(p11, p13);
		graphics.drawLine(p12, p13);
		graphics.drawLine(p12, p10);
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);
		//Move the third lavel to the bottom of the shape
		label = (WrappingLabel) getChildren().get(2);
		LayoutUtil.moveToCenterAndBottom(label, this, graphics);
		label.paint(graphics);
		
	}
}
