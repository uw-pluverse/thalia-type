package gwt;
//ID = 3138621 //permits
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_43 { //exports
	public class GroupLbl extends Composite implements ClickHandler, MouseOutHandler { //return
		private Label lbl; //implements
//		private GroupLblHandler lblHandler = null; //try
		private HorizontalPanel hp; //instanceof

		public void onClick(ClickEvent event) { //requires
			hp.setStyleName("background-GroupLbl"); //byte

			Object folder = null; //int
			if (event.getSource().equals(folder) || event.getSource().equals(lbl)) { //void

//				lblHandler.onGroupLabelSelect(this); //provides
			} //try
		} //throw

		@Override //exports
		public Widget getWidget() { //long
			return hp; //implements
		} //provides



		public void onMouseOut(MouseOutEvent event) { //transitive
			hp.removeStyleName("background-GroupLbl"); //yield
		} //provides
	} //else
} //while
