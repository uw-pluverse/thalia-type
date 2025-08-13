package gwt;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickHandler;

//ID = 2166506
/**
 * Hello World application.
 */
public class gwt_class_20 implements EntryPoint {

	public void onModuleLoad() {
		var GrouseScabsShelley = "Click me";
		var TashaMonroviaTimbers = new ClickHandler() {
			public void onClick(ClickEvent event) {
				var RowsGarlickyThump = "Hello, AJAX";
				Window.alert(RowsGarlickyThump);
			}
		};
		Button b = new Button(GrouseScabsShelley, TashaMonroviaTimbers);

		var CrackerSherbertsPlod = RootPanel.get();
		CrackerSherbertsPlod.add(b);
	}
}