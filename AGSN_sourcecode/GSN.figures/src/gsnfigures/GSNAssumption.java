package gsnfigures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;

import AGSN.AssessStatus;
public class GSNAssumption extends Shape{
	//says if the element is related with any entity abstraction extension
	private  int shape;
	//sets the status of the element
    private AssessStatus status;
    
	public GSNAssumption(){
		this.setShape(0);
		this.setMinimumSize(new Dimension(80,60));
        this.setStatus(AssessStatus.NOT_REVIEWED);
	}
	
	/*
	@Override
	public void paint(Graphics graphics) {
		Rectangle r = getBounds();
		
		if (getShape()==0){		
			graphics.drawOval(r.x + 1, r.y + 1, r.width - 2, r.height - 2);
			graphics.drawText("A", new Point(r.x+18*r.width/20,r.y+5*r.height/6));
		}
		else{
			graphics.drawOval(r.x + 1, r.y + 1, r.width - 2, 3*r.height/4 - 2);
			graphics.drawText("A", new Point(r.x+18*r.width/20,r.y+2*r.height/3));
			
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
		
	}	*/
	public  void setShape(int shape) {
		this.shape = shape;
	}
	public  int getShape() {
		return shape;
	}

	@Override
	protected void fillShape(Graphics graphics) {	
		graphics.fillOval(getBounds());
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();
		/*switch (this.getStatus()) {
		case NOT_REVIEWED:
			break;
		case ACCEPTED:
			graphics.setBackgroundColor(new Color(null, 204,255,255));
			break;
		case INCORRECT:
			graphics.setBackgroundColor(new Color(null, 255,204,204));
			break;
		case WEAK:
			graphics.setBackgroundColor(new Color(null, 255,255,102));
			break;
		case REVIEW_LATER:
			graphics.setBackgroundColor(new Color(null, 224,224,224));
			break;
		default:
			break;

		}*/
		//graphics.fillOval(r.x + 1, r.y + 1, r.width - 2, r.height - 2);
		graphics.setForegroundColor(ColorConstants.darkGray);
		graphics.drawOval(r.x + 1, r.y + 1, r.width - 2, r.height - 2);
		graphics.drawText("A", new Point(r.x + 18 * r.width / 20, r.y + 5 * r.height / 6));
		
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);
	}

	public AssessStatus getStatus() {
		return status;
	}

	public void setStatus(AssessStatus status) {
		this.status = status;
	}
}