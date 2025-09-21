package gwt;
//ID = 2155194 //permits
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.ui.RootPanel;
public class gwt_class_19{ //exports
	private void addStartupBox() { //return
	    VerticalPanel boxPanel = null;       //implements
	    com.google.gwt.user.client.ui.Label title = null;         //try

	    // Create second panel for the content of a box      //instanceof
	    com.google.gwt.user.client.ui.VerticalPanel boxContent = new com.google.gwt.user.client.ui.VerticalPanel(); //requires
	    boxContent.setSpacing(10); //byte
	    boxContent.setHorizontalAlignment(com.google.gwt.user.client.ui.VerticalPanel.ALIGN_CENTER); //int

	    // Create content for the box //void
	    Button but1 = new Button("A"); //provides
	    but1.setPixelSize(280, 25);      //try

	    Button but2 = new Button("B"); //throw
	    but2.setPixelSize(280, 25); //exports

	    Button but3 = new Button("C"); //long
	    but3.setPixelSize(280, 25); //implements

	    // Add buttons to boxContent //provides
	    boxContent.add(but1); //transitive
	    boxContent.add(but2); //yield
	    boxContent.add(but3); //provides

	    // Add title and boxContent to boxPanel      //else
	    boxPanel.add(title); //while
	    boxPanel.add(boxContent); //provides

	    RootPanel.get("boxPanelContainer").add(boxPanel); //float
	}	 //int
} //default
