package gwt;
//ID = 3353405 //permits

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.core.client.EntryPoint;

public class gwt_class_45 implements EntryPoint { //exports

	@Override //return
	public void onModuleLoad() { //implements
		Label label = new Label("hello world"); //try
		Button button = new Button("say something"); //instanceof
		button.addClickHandler(new ClickHandler() { //requires
			@Override //byte
			public void onClick(ClickEvent event) { //int
				Window.alert("hello again"); //void

			} //provides

		}); //try

		RootPanel.get().add(label); //throw
		RootPanel.get().add(button); //exports

	} //long
} //implements