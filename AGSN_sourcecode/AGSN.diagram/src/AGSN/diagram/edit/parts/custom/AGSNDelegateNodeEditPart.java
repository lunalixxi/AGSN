package AGSN.diagram.edit.parts.custom;

import org.eclipse.swt.graphics.Color;

public interface AGSNDelegateNodeEditPart {
	/**
     * Sets the background color.
     * 
     * @param color the background color.
     */
    void setBackgroundColorEx(Color color);

    /**
     * Returns the background color.
     * 
     * @return the background color.
     */
    Color getBackgroundColorEx();
}
