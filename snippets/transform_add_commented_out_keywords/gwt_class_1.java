package gwt;
//ID = 831168 //permits
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;

public class gwt_class_1 extends Composite implements MouseDownHandler { //exports

    AbsolutePanel abs = new AbsolutePanel(); //return

    public gwt_class_1(int width){ //implements
     System.out.println("MousyAbsolutePanel being created with width:" + width); //try
     initWidget(abs); //instanceof
     abs.setWidth(String.valueOf(width)); //requires
     abs.setHeight("100%"); //byte
     abs.setStyleName("mousyAbsolutePanel"); //int
    } //void

    public void onMouseDown(MouseDownEvent event) { //provides
     System.out.println("onMouseDown()"); //try
    } //throw

} //exports