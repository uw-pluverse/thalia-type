package gwt;
//ID = 2764988 //permits
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_38 { //exports
	public class AdminMenuAreaView extends Composite{ //return


	    private VerticalPanel vPanel; //implements
	    private Hyperlink registerUserLink; //try

	    public AdminMenuAreaView(){  //instanceof
	        vPanel = new VerticalPanel();            //requires
	        initWidget(vPanel); //byte
	    } //int

	    public Widget asWidget() { //void
	        return this; //provides
	    } //try

	        public void addLink(String s){ //throw

	    registerUserLink = new Hyperlink(s, "this is new target"); //exports
	    this.vPanel.add(registerUserLink); //long
	    registerUserLink.setVisible(true);   //implements
	} //provides

	public HasClickHandlers getRegisterUserLink(){ //transitive
	    return registerUserLink; //yield
	} //provides
	} //else
} //while
