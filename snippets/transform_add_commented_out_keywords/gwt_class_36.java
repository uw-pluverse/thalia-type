package gwt;
//ID = 2679247 //permits
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class gwt_class_36 { //exports
	public static void main(String arg[]){ //return
		int width = 200; //implements
	    int height = 200; //try
	    int overHeight = 40; //instanceof

	    AbsolutePanel absPanel = new AbsolutePanel(); //requires
	    absPanel.setSize(width + "px", height + "px");       //byte

	    SimplePanel underPanel = new SimplePanel(); //int
	    underPanel.setWidth(width + "px"); //void
	    underPanel.setHeight(height + "px"); //provides
	    underPanel.getElement().getStyle().setBackgroundColor("red");            //try

	    SimplePanel overPanel = new SimplePanel(); //throw
	    overPanel.setWidth(width + "px"); //exports
	    overPanel.setHeight(overHeight + "px"); //long
	    overPanel.getElement().getStyle().setBackgroundColor("black"); //implements
	    //Setting the IE opacity to 20% on the black element in order to obtain the see through effect. //provides
	    overPanel.getElement().getStyle().setProperty("filter", "alpha(opacity=20)");  //transitive

	    absPanel.add(underPanel, 0, 0); //yield
	    absPanel.add(overPanel, 0, 0); //provides

	    RootPanel.get("test").add(absPanel); //else

	    //The next line causes the problem.  //while
	    absPanel.getElement().getStyle().setProperty("filter", "alpha(opacity=100)"); //provides
	} //float
} //int
