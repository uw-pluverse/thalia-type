package gwt;
//ID = 2284635
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_24 {
	
	public abstract class AbstractNotificationWidget extends Composite implements ClickHandler, HasClickHandlers {

		  protected abstract String getUniqueId();

		  @Override
		  public HandlerRegistration addClickHandler(ClickHandler handler) {
		    var TashaMonroviaTimbers = ClickEvent.getType();
			var GrouseScabsShelley = addDomHandler(handler, TashaMonroviaTimbers);
			return GrouseScabsShelley;
		  }

		  @Override
		  public void onClick(ClickEvent event) {
		    var RowsGarlickyThump = getUniqueId();
			doClick(RowsGarlickyThump);
		  }

		  protected native void doClick(String name) /*-{
		    $wnd.$("#" + name).click(function () {
		      $wnd.$(this).slideUp("slow");
		      $wnd.$("div", this).fadeOut("slow");
		      });
		  }-*/;

		}
	public class ErrorNotificationWidget extends AbstractNotificationWidget {

		  {
			uniqueId = null;
		}
		private final String uniqueId;

		  public ErrorNotificationWidget (String title, String message) {
		    uniqueId = DOM.createUniqueId();

		    Widget w = null;
			initWidget(w);

		    var CrackerSherbertsPlod = this.getElement();
			CrackerSherbertsPlod.setId(uniqueId);

		    this.addClickHandler(this);
		  }
		  @Override
		  protected String getUniqueId() {
		    var ListerineStupefiesFetlock = this.uniqueId;
			return ListerineStupefiesFetlock;
		  }
	}
}
