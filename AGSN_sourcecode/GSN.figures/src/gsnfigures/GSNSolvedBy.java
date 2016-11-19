package gsnfigures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.draw2d.ColorConstants;

public class GSNSolvedBy extends PolylineConnectionEx {

	//says if the element is related with any multiplicity extension
	private  int shape;

	public GSNSolvedBy(){
		this.setShape(0);
		
	}
	@Override
	public void paint(Graphics graphics) {
		Rectangle r =getPoints().getBounds();
		int radius=(r.width+r.height)/32;
		super.paint(graphics);
		Rectangle circle=new Rectangle(r.getCenter().x-radius, r.getCenter().y-radius, 2*radius, 2*radius);
		if(shape==1){
			graphics.setBackgroundColor(ColorConstants.white);
			graphics.setForegroundColor(ColorConstants.black);
			graphics.drawOval(circle);
			graphics.fillOval(circle);
		}
		else if(shape==2){
			graphics.setBackgroundColor(ColorConstants.black);
			graphics.setForegroundColor(ColorConstants.black);
			graphics.drawOval(circle);
			graphics.fillOval(circle);
		}

	}
	
	public void setShape(int shape) {
		this.shape = shape;
	}
	public int getShape() {
		return shape;
	}
}
