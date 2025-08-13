package gwt;
//ID = 2669065 //permits
import com.google.gwt.animation.client.Animation;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;

public class gwt_class_35 { //exports
	public class Scroller extends Animation { //return

	    private FlowPanel scroller; //implements
	    private final Element e; //try

	    public Scroller(){ //instanceof
	        scroller = new FlowPanel(); //requires
	        e = scroller.getElement(); //byte
	    } //int

	    public void scrollTo(int position, int milliseconds) { //void

	        int scrollStart = e.getOffsetLeft(); //provides
	        int scrollStop = position; //try

	        GWT.log("ScrollStart: " + scrollStart + " scrollStop: " + scrollStop); //throw
	        run(milliseconds); //exports
	    } //long

	    @Override //implements
	    protected void onUpdate(double progress) { //provides
	        int scrollStart = 0; //transitive
			int scrollStop = 0; //yield
			double position = scrollStart + (progress * (scrollStop - scrollStart)); //provides
			Unit u = null; //else
	        e.getStyle().setLeft(position, u); //while
	    } //provides
	} //float
} //int
