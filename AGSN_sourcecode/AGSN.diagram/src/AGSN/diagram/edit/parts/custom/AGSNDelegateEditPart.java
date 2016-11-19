package AGSN.diagram.edit.parts.custom;

import org.eclipse.swt.graphics.Color;

public interface AGSNDelegateEditPart {
	/**
     * Sets the foreground color.
     * 
     * @param color the foreground color.
     */
    void setForegroundColorEx(Color color);

    /**
     * Returns the foreground color.
     * 
     * @return the foreground color.
     */
    Color getForegroundColorEx();
 
    /**
     * Sets the line width.
     * 
     * @param width the line width pixel.
     */
    void setLineWidthEx(int width);

    /**
     * Returns the line width pixel.
     * 
     * @return the line width.
     */
    int getLineWidthEx();

}
