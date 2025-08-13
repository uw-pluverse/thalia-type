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
		Button b = new Button("Click me", new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Hello, AJAX");
			}
		});

		RootPanel.get().add(b);
	}
}