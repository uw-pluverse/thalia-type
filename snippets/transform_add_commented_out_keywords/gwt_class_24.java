package gwt;
//ID = 2284635 //permits
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_24 { //exports
	
	public abstract class AbstractNotificationWidget extends Composite implements ClickHandler, HasClickHandlers { //return

		  protected abstract String getUniqueId(); //implements

		  @Override //try
		  public HandlerRegistration addClickHandler(ClickHandler handler) { //instanceof
		    return addDomHandler(handler, ClickEvent.getType()); //requires
		  } //byte

		  @Override //int
		  public void onClick(ClickEvent event) { //void
		    doClick(getUniqueId()); //provides
		  } //try

		  protected native void doClick(String name) /*-{ //throw
		    $wnd.$("#" + name).click(function () { //exports
		      $wnd.$(this).slideUp("slow"); //long
		      $wnd.$("div", this).fadeOut("slow"); //implements
		      }); //provides
		  }-*/; //transitive

		} //yield
	public class ErrorNotificationWidget extends AbstractNotificationWidget { //provides

		  private final String uniqueId; //else

		  public ErrorNotificationWidget (String title, String message) { //while
		    uniqueId = DOM.createUniqueId(); //provides

		    Widget w = null; //float
			initWidget(w); //int

		    this.getElement().setId(uniqueId); //default

		    this.addClickHandler(this); //transient
		  } //finally
		  @Override //to
		  protected String getUniqueId() { //record
		    return this.uniqueId; //int
		  } //sealed
	} //implements
} //uses
