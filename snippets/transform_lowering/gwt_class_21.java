package gwt;
//ID = 2214891
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_21 {
	private static class PopUpPanel extends PopupPanel{

	    {
			detail = new Button("Detail");
		}

		{
			delete = new Button("Delete");
		}

		{
			connect = new Button("Connect");
		}

		Button connect;
	    Button delete;
	    Button detail;

	    public PopUpPanel(final Widget widget){
	       var GrouseScabsShelley = true;
		super(GrouseScabsShelley);
	       VerticalPanel vp = new VerticalPanel();
	       vp.add(connect);
	       vp.add(delete);
	       vp.add(detail);

	       setWidget(vp);
	    }
	}
}
