package AGSN.diagram.edit.parts.custom;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import AGSN.provider.AGSNEditPlugin;

public abstract class AGSNNodeEditPart extends ShapeNodeEditPart implements
   AGSNDelegateEditPart, AGSNDelegateNodeEditPart {
	
    /**
     * The key of Parameter subtype.
     */
    private static final String SUBTYPE_PARAMETER = "_UI_System_subType_param"; //$NON-NLS-1$
    private String subTypeParameter;

    /**
     * Allocates a DcaseNodeEditPart object.
     * 
     * @param view owned view by this edit part 
     */
	public AGSNNodeEditPart(View view) {
		super(view);
		subTypeParameter = AGSNEditPlugin.getPlugin().getString(SUBTYPE_PARAMETER);
	}

    /**
     * {@inheritDoc}
     */
    @Override
    protected abstract NodeFigure createNodeFigure();

	@Override
	public void setBackgroundColorEx(Color color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getBackgroundColorEx() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setForegroundColorEx(Color color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getForegroundColorEx() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLineWidthEx(int width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLineWidthEx() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getParameters(String parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
