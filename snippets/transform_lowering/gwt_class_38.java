package gwt;
//ID = 2764988
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_38 {
	public class AdminMenuAreaView extends Composite{


	    {
			registerUserLink = null;
		}

		{
			vPanel = null;
		}

		private VerticalPanel vPanel;
	    private Hyperlink registerUserLink;

	    public AdminMenuAreaView(){ 
	        vPanel = new VerticalPanel();           
	        initWidget(vPanel);
	    }

	    public Widget asWidget() {
	        return this;
	    }

	        public void addLink(String s){

	    var GrouseScabsShelley = "this is new target";
		registerUserLink = new Hyperlink(s, GrouseScabsShelley);
	    var TashaMonroviaTimbers = this.vPanel;
		TashaMonroviaTimbers.add(registerUserLink);
	    var RowsGarlickyThump = true;
		registerUserLink.setVisible(RowsGarlickyThump);  
	}

	public HasClickHandlers getRegisterUserLink(){
	    return registerUserLink;
	}
	}
}
