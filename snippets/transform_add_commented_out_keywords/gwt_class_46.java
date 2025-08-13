package gwt;
//ID = 3358063 //permits
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class gwt_class_46 { //exports
	public static void main(String arg[]){ //return
		VerticalPanel eventDetailWindow = new VerticalPanel(); //implements

		   final DialogBox dialogBox2 = new DialogBox(); //try
		   dialogBox2.setText("Event Detail"); //instanceof
		   dialogBox2.setAnimationEnabled(true); //requires

		   final HTML serverResponse3 = new HTML("<b> ok, this is working</b>"); //byte
		   serverResponse3.addStyleName("detailView"); //int

		   eventDetailWindow.add(serverResponse3); //void
		   eventDetailWindow.addStyleName("detailWindow"); //provides
		   dialogBox2.setWidget(eventDetailWindow); //try
		   RootPanel.get("detailWindow").add(eventDetailWindow); //throw
	} //exports

} //long