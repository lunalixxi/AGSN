package gsnfigures;


import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class LayoutUtil {
	
	public static void moveToCenterAndUp(WrappingLabel label, Figure parent, Graphics graphics) {

		Rectangle r = parent.getBounds();
		Rectangle newLabelBounds = new Rectangle();
		Point middle ;
		if(parent instanceof GSNArgumentModule||parent instanceof GSNAssumption 
				|| parent instanceof GSNJustification||parent instanceof GSNSolution
				|| parent instanceof GSNAwaySolution || parent instanceof GSNContract 
				|| parent instanceof GSNModule){
			middle = new Point(r.x + r.width/6, r.y +r.height/6);
		}
		else
			middle = new Point(r.x + r.width/6, r.y );
		
		newLabelBounds.x = middle.x;
		newLabelBounds.y = middle.y;
		newLabelBounds.width = r.width;
		newLabelBounds.height = r.height;
		label.setBounds(newLabelBounds);
		label.setTextWrap(true);
		label.setMaximumSize(new Dimension(2*r.width/3,r.height/8));
		label.setAlignment(PositionConstants.TOP);

	}
	
	public static void moveToCenterAndDown(WrappingLabel label, Figure parent, Graphics graphics) {
		Rectangle r = parent.getBounds();
		Rectangle newLabelBounds = new Rectangle();
		Point middle;
		if(parent instanceof GSNGoal||parent instanceof GSNContext||parent instanceof GSNStrategy
				||parent instanceof GSNAwayContext||parent instanceof GSNAwayGoal)
			middle = new Point(r.x + r.width/6, r.y +r.height/3);
		else
			middle = new Point(r.x + r.width/6, r.y +r.height/2);
	
		newLabelBounds.x = middle.x;
		newLabelBounds.y = middle.y;
		newLabelBounds.width = r.width;
		newLabelBounds.height = r.height;
		
		label.setBounds(newLabelBounds);
		label.setTextWrap(true);
		label.setAlignment(PositionConstants.TOP);
		if(parent instanceof GSNAssumption){
			if(((GSNAssumption) parent).getShape()!=0)
				label.setMaximumSize(new Dimension(2*r.width/3,r.height/4));
			else
				label.setMaximumSize(new Dimension(2*r.width/3,3*r.height/7));

		}
		else if(parent instanceof GSNSolution){
			if(((GSNSolution) parent).getShape()!=0)
				label.setMaximumSize(new Dimension(2*r.width/3,r.height/4));
			else
				label.setMaximumSize(new Dimension(2*r.width/3,3*r.height/7));

		}
		
		else if(parent instanceof GSNJustification){
			if(((GSNJustification) parent).getShape()!=0)
				label.setMaximumSize(new Dimension(2*r.width/3,r.height/4));
			else
				label.setMaximumSize(new Dimension(2*r.width/3,3*r.height/7));

		}
		else if(parent instanceof GSNContract || parent instanceof GSNAwaySolution)
			label.setMaximumSize(new Dimension(2*r.width/3,r.height/4));
	
		else	
			label.setMaximumSize(new Dimension(2*r.width/3,3*r.height/7));
		

	}

	public static void moveToCenterAndBottom(WrappingLabel label, Figure parent, Graphics graphics) {
		Rectangle r = parent.getBounds();
		Rectangle newLabelBounds = new Rectangle();
		Point middle = new Point(r.x + r.width/2, r.y +3*r.height/4); 
		
		int textWidth = (label.getText().length() -3 ) * graphics.getFontMetrics().getAverageCharWidth();
		int textHeight = graphics.getFontMetrics().getHeight();
		
		newLabelBounds.x = middle.x -r.width/5;
		newLabelBounds.y =  middle.y ;
		newLabelBounds.width = textWidth;
		newLabelBounds.height = textHeight;
		
		label.setBounds(newLabelBounds);
		label.setTextWrap(true);
		label.setMaximumSize(new Dimension(r.width/2,r.height/4));
		label.setAlignment(PositionConstants.TOP);

		
	}
	
}
