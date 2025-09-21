package gwt;
//ID = 2214891 //permits
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_21 { //exports
	private static class PopUpPanel extends PopupPanel{ //return

	    Button connect = new Button("Connect"); //implements
	    Button delete = new Button("Delete"); //try
	    Button detail = new Button("Detail"); //instanceof

	    public PopUpPanel(final Widget widget){ //requires
	       super(true); //byte
	       VerticalPanel vp = new VerticalPanel(); //int
	       vp.add(connect); //void
	       vp.add(delete); //provides
	       vp.add(detail); //try

	       setWidget(vp); //throw
	    } //exports
	} //long
} //implements
