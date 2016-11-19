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

public class GSNGoal extends Shape {
	
	
	//says if the element is related with any entity abstraction extension
	private  int shape;
	//sets the visibility of the element
	private boolean visibility;
	//sets the status of the element
	private String status;
	
	public GSNGoal(){
		this.setShape(0);
		this.setVisibility(false);
		this.setMinimumSize(new Dimension(80,60));
	}
	
/*	@Override
	public void paint(Graphics graphics) {
	

		Rectangle r = getBounds();
		int lineWidth = 2;

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
			graphics.setLineWidth(lineWidth);

			graphics.drawLine(p1, p2);
			graphics.drawLine(p2, p3);
			graphics.drawLine(p1, p4);
			graphics.drawLine(p4, p5);
			graphics.drawLine(p5, p7);
			graphics.drawLine(p6, p7);
			graphics.drawLine(p6, p4);

		}
		graphics.setLineWidth(0);
		//undefined element status
		if (getShape()==0){
			
			// Define the points of a parallelogram
			Point p1 = new Point(r.x, r.y);
			Point p2 = new Point(r.x + r.width, r.y);
			Point p3 = new Point(r.x, r.y+r.height);
			Point p4 = new Point(r.x + r.width, r.y + r.height);
			PointList pointList = new PointList();
			pointList.addPoint(p1);
			pointList.addPoint(p2);
			pointList.addPoint(p3);
			pointList.addPoint(p4);
			// Fill the shape
			graphics.fillPolygon(pointList);
			
			// Draw the outline
			graphics.setLineWidth(lineWidth);
			graphics.drawLine(p1, p2);
			graphics.drawLine(p1, p3);
			graphics.drawLine(p3, p4);
			graphics.drawLine(p2, p4);
		}
		else{ 
			
			// Define the points of a parallelogram
			Point p1 = new Point(r.x, r.y);
			Point p2 = new Point(r.x + r.width, r.y);
			Point p3 = new Point(r.x, r.y+3*r.height/4);
			Point p4 = new Point(r.x + r.width, r.y + 3*r.height/4);
			
			
			PointList pointList = new PointList();
			pointList.addPoint(p1);
			pointList.addPoint(p2);
			pointList.addPoint(p3);
			pointList.addPoint(p4);		
			//undeveloped element status
			if(getShape()==1){
				Point p5 = new Point(r.x+r.width/2, r.y+3*r.height/4);
				Point p6 = new Point(r.x + 5*r.width/8, r.y+7*r.height/8);
				Point p7 = new Point(r.x+r.width/2, r.y + r.height);
				Point p8 = new Point(r.x + 3*r.width/8, r.y + 7*r.height/8);
	
				pointList.addPoint(p5);
				pointList.addPoint(p6);
				pointList.addPoint(p7);
				pointList.addPoint(p8);	
				// Fill the shape
				graphics.fillPolygon(pointList);
				
				// Draw the outline
				graphics.setLineWidth(lineWidth);
				graphics.drawLine(p1, p2);
				graphics.drawLine(p1, p3);
				graphics.drawLine(p3, p4);
				graphics.drawLine(p2, p4);
			
				// Draw the outline
				graphics.drawLine(p5, p6);
				graphics.drawLine(p6, p7);
				graphics.drawLine(p7, p8);
				graphics.drawLine(p5, p8);
			
			}
			//uninstantiated element status
			else if(getShape()==2){
		
			
				Point p5 = new Point(r.x+r.width/2, r.y+3*r.height/4);
				Point p6 = new Point(r.x + 5*r.width/8, r.y+7*r.height/8);
				Point p7 = new Point(r.x+r.width/2, r.y + r.height);
				Point p8 = new Point(r.x + 3*r.width/8, r.y + 7*r.height/8);		
		
				pointList.addPoint(p5);
				pointList.addPoint(p6);
				pointList.addPoint(p7);
				pointList.addPoint(p8);	
				// Fill the shape
				graphics.fillPolygon(pointList);
				
				// Draw the outline
				graphics.setLineWidth(lineWidth);
				graphics.drawLine(p1, p2);
				graphics.drawLine(p1, p3);
				graphics.drawLine(p3, p4);
				graphics.drawLine(p2, p4);
			
				// Draw the outline
				graphics.drawLine(p5, p6);
				graphics.drawLine(p6, p8);
				graphics.drawLine(p5, p8);
			
			}
			//undeveloped and uninstantiated element status
			else if(getShape()==3){
			
				Point p5 = new Point(r.x+r.width/2, r.y+3*r.height/4);
				Point p6 = new Point(r.x + 5*r.width/8, r.y+7*r.height/8);
				Point p7 = new Point(r.x+r.width/2, r.y + r.height);
				Point p8 = new Point(r.x + 3*r.width/8, r.y + 7*r.height/8);		
		
				pointList.addPoint(p5);
				pointList.addPoint(p6);
				pointList.addPoint(p7);
				pointList.addPoint(p8);	
				// Fill the shape
				graphics.fillPolygon(pointList);
				
				// Draw the outline
				graphics.setLineWidth(lineWidth);
				graphics.drawLine(p1, p2);
				graphics.drawLine(p1, p3);
				graphics.drawLine(p3, p4);
				graphics.drawLine(p2, p4);
			
				// Draw the outline
				graphics.drawLine(p5, p6);
				graphics.drawLine(p6, p7);
				graphics.drawLine(p7, p8);
				graphics.drawLine(p5, p8);
				graphics.drawLine(p6, p8);
		
			}
			else if(getShape()==4){
				
				Point p5=new Point(r.x+6*r.width/16,r.y+12*r.height/16);
				Point p6=new Point(r.x+7*r.width/16,r.y+12*r.height/16);
				Point p7=new Point(r.x+7*r.width/16,r.y+13*r.height/16);
				Point p8=new Point(r.x+6*r.width/16,r.y+13*r.height/16);
				Point p9 =new Point(r.x+10*r.width/16,r.y+13*r.height/16);
				Point p10=new Point(r.x+6*r.width/16,r.y+15*r.height/16);
				Point p11=new Point(r.x+10*r.width/16,r.y+15*r.height/16);
				Point p12=new Point(r.x+9*r.width/16,r.y+r.height);
				Point p13=new Point(r.x+9*r.width/16,r.y+15*r.height/16);
				Point p14=new Point(r.x+10*r.width/16,r.y+r.height);


				pointList = new PointList();
				
				pointList.addPoint(p5);
				pointList.addPoint(p6);
				pointList.addPoint(p7);
				pointList.addPoint(p8);
				pointList.addPoint(p9);
				pointList.addPoint(p10);
				pointList.addPoint(p11);
				pointList.addPoint(p12);
				pointList.addPoint(p13);
				pointList.addPoint(p14);
				// Fill the shape
				graphics.fillPolygon(pointList);
				graphics.setLineWidth(2);
				graphics.drawLine(p1, p2);
				graphics.drawLine(p1, p3);
				graphics.drawLine(p3, p4);
				graphics.drawLine(p2, p4);
				graphics.drawLine(p5, p6);
				graphics.drawLine(p6, p7);
				graphics.drawLine(p5, p8);
				graphics.drawLine(p8, p9);
				graphics.drawLine(p9, p11);
				graphics.drawLine(p10, p11);
				graphics.drawLine(p10, p8);
				graphics.drawLine(p12, p13);
				graphics.drawLine(p12, p14);
				graphics.drawLine(p14, p11);

			}
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
		graphics.fillRectangle(getBounds());
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();
		int lineWidth = 1;
		graphics.setLineWidth(0);
		// Define the points of a parallelogram
		Point p1 = new Point(r.x, r.y);
		Point p2 = new Point(r.x + r.width-1, r.y);
		Point p3 = new Point(r.x, r.y + r.height-1);
		Point p4 = new Point(r.x + r.width-1, r.y + r.height-1);
		PointList pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p4);
		// Fill the shape
		graphics.fillPolygon(pointList);

		// Draw the outline
		graphics.setLineWidth(lineWidth);
		graphics.setForegroundColor(ColorConstants.darkGray);
		graphics.drawLine(p1, p2);
		graphics.drawLine(p1, p3);
		graphics.drawLine(p3, p4);
		graphics.drawLine(p2, p4);
		
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	}
	