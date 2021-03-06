/*
 * 
 */
package AGSN.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import AGSN.AGSNPackage;
import AGSN.AdditionalElement;
import AGSN.diagram.common.constant.ColorConstant;
import AGSN.diagram.edit.policies.AdditionalElementItemSemanticEditPolicy;
import AGSN.diagram.part.AGSNVisualIDRegistry;

/**
 * @generated
 */
public class AdditionalElementEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2018;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AdditionalElementEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AdditionalElementItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AdditionalElementFigure();
	}

	/**
	* @generated
	*/
	public AdditionalElementFigure getPrimaryShape() {
		return (AdditionalElementFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AdditionalElementNameEditPart) {
			((AdditionalElementNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAdditionalElementLabelFigure());
			return true;
		}
		if (childEditPart instanceof AdditionalElementDescriptionEditPart) {
			((AdditionalElementDescriptionEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureBasicNodeDescriptionLabelFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AdditionalElementNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AdditionalElementDescriptionEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(120, 80);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(AGSNVisualIDRegistry.getType(AdditionalElementNameEditPart.VISUAL_ID));
	}

	/**
	* @generated NOT
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			if (event.getFeature() instanceof EAttributeImpl
					&& event.getFeatureID(AdditionalElement.class) == AGSNPackage.ADDITIONAL_ELEMENT__ASSESSSTATUS) {
				getPrimaryShape().updateBGColor();
			}
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class AdditionalElementFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAdditionalElementLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBasicNodeDescriptionLabelFigure;

		/**
		 * @generated NOT
		 */
		public AdditionalElementFigure() {
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(120), getMapMode().DPtoLP(80)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			this.updateBGColor();
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAdditionalElementLabelFigure = new WrappingLabel();

			fFigureAdditionalElementLabelFigure.setText("AdditionalElement");

			this.add(fFigureAdditionalElementLabelFigure);

			fFigureBasicNodeDescriptionLabelFigure = new WrappingLabel();

			fFigureBasicNodeDescriptionLabelFigure.setText("");

			this.add(fFigureBasicNodeDescriptionLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAdditionalElementLabelFigure() {
			return fFigureAdditionalElementLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBasicNodeDescriptionLabelFigure() {
			return fFigureBasicNodeDescriptionLabelFigure;
		}

		/**
		 * @generated NOT
		 */
		public void updateBGColor() {
			AdditionalElement addelement = (AdditionalElement) ((Node) AdditionalElementEditPart.this.getModel())
					.getElement();

			switch (addelement.getAssessstatus()) {
			case NOT_REVIEWED:
				this.setBackgroundColor(ColorConstant.WHITE);
				break;
			case ACCEPTED:
				this.setBackgroundColor(ColorConstant.LIGHT_GREEN);
				break;
			case INCORRECT:
				this.setBackgroundColor(ColorConstant.LIGHT_RED);
				break;
			case WEAK:
				this.setBackgroundColor(ColorConstant.LIGHT_YELLOW);
				break;
			case REVIEW_LATER:
				this.setBackgroundColor(ColorConstant.LIGHT_GRAY);
				break;
			default:
				break;

			}
		}

	}

	/**
	* @generated
	*/
	static final Color THIS_BACK = new Color(null, 255, 255, 255);

}
