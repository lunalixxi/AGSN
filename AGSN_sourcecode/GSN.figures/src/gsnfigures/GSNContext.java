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

public class GSNContext extends Shape{

	//says if the element is related with any entity abstraction extension
	private  int shape;
	//sets the visibility of the element
	private boolean visibility;
	
	public GSNContext(){
		this.setShape(0);
		this.setVisibility(false);
		this.setMinimumSize(new Dimension(80,60));

		
	}
	/*
	@Override
	public void paint(Graphics graphics) {
		
		Rectangle r = getBounds();
		if(visibility){
			Point p1=new Point(r.x+15*r.width/18,r.y+3*r.height/18);
			Point p2=new Point(r.x+16*r.width/18,r.y+3*r.height/18);
			Point p3=new Point(r.x+16*r.width/18,r.y+4*r.height/18);
			Point p4=new Point(r.x+15*r.width/18,r.y+4*r.height/18);
			Point p5 =new Point(r.x+17*r.width/18,r.y+4*r.height/18);
			Point p6=new Point(r.x+15*r.width/18,r.y+6*r.height/18);
			Point p7=new Point(r.x+17*r.width/18,r.y+6*r.height/18);
			PointList pointList = new PointList();
			pointList.addPoint(p1);
			pointList.addPoint(p2);
			pointList.addPoint(p3);
			pointList.addPoint(p4);
			pointList.addPoint(p5);
			pointList.addPoint(p6);
			pointList.addPoint(p7);
			// Fill the shape
			graphics.fillPolygon(pointList);
			
			// Draw the outline
			graphics.setLineWidth(2);

			graphics.drawLine(p1, p2);
			graphics.drawLine(p2, p3);
			graphics.drawLine(p1, p4);
			graphics.drawLine(p4, p5);
			graphics.drawLine(p5, p7);
			graphics.drawLine(p6, p7);
			graphics.drawLine(p6, p4);

		}
		
		graphics.setLineWidth(0);	
		if (getShape()==0){
			graphics.drawRoundRectangle(r, r.width/3, r.height);
		}
		else{
			Rectangle r2=new Rectangle(r.x,r.y,r.width,3*r.height/4);
			graphics.drawRoundRectangle(r2, r.width/4, r.height/4);
			Point p5 = new Point(r.x+r.width/2, r.y+3*r.height/4);
			Point p6 = new Point(r.x + 5*r.width/8, r.y+7*r.height/8);
			Point p7 = new Point(r.x+r.width/2, r.y + r.height);
			Point p8 = new Point(r.x + 3*r.width/8, r.y + 7*r.height/8);		
			PointList pointList = new PointList();
			pointList.addPoint(p5);
			pointList.addPoint(p6);
			pointList.addPoint(p7);
			pointList.addPoint(p8);	
			// Fill the shape
			graphics.fillPolygon(pointList);
			
			// Draw the outline
			graphics.drawLine(p5, p6);
			graphics.drawLine(p6, p8);
			graphics.drawLine(p5, p8);
		}
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);
	}*/
	public  void setShape(int shape) {
		this.shape = shape;
	}
	public  int getShape() {
		return shape;
	}
	public void setVisibility(boolean p) {
		this.visibility = p;
	}
	public boolean getVisibility() {
		return visibility;
	}
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillRoundRectangle(getBounds(), getBounds().width/3, getBounds().height);
	}
	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();
		graphics.setLineWidth(0);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawRoundRectangle(r, r.width / 3, r.height);
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
