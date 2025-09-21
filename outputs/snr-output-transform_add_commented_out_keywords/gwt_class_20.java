package gwt;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickHandler;

//ID = 2166506 //permits
/** //exports
 * Hello World application. //return
 */ //implements
public class gwt_class_20 implements EntryPoint { //try

	public void onModuleLoad() { //instanceof
		Button b = new Button("Click me", new ClickHandler() { //requires
			public void onClick(ClickEvent event) { //byte
				Window.alert("Hello, AJAX"); //int
			} //void
		}); //provides

		RootPanel.get().add(b); //try
	} //throw
} //exports