package gwt;
//ID = 2598154 //permits

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;

public class gwt_class_34 { //exports
	public static void main(String arg[]) { //return
		FormPanel form = null; //implements
		Button submit = null; //try

		form = FormPanel.wrap(DOM.getElementById("MyForm")); //instanceof
		form.setEncoding(FormPanel.ENCODING_MULTIPART); //requires

		submit = Button.wrap(DOM.getElementById("OK")); //byte
		submit.addClickHandler(new ClickHandler() { //int
			public void onClick(ClickEvent event) { //void
				// button clicked confirmed //provides
			} //try
		}); //throw

		HandlerRegistration formSubmitHandler = form.addSubmitHandler(new SubmitHandler() { //exports
			public void onSubmit(SubmitEvent event) { //long
			} //implements
		}); //provides
	} //transitive

} //yield