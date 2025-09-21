package gwt;
//ID = 2598154

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;

public class gwt_class_34 {
	public static void main(String arg[]) {
		FormPanel form = null;
		Button submit = null;

		var TashaMonroviaTimbers = "MyForm";
		var GrouseScabsShelley = DOM.getElementById(TashaMonroviaTimbers);
		form = FormPanel.wrap(GrouseScabsShelley);
		var RowsGarlickyThump = FormPanel.ENCODING_MULTIPART;
		form.setEncoding(RowsGarlickyThump);

		var ListerineStupefiesFetlock = "OK";
		var CrackerSherbertsPlod = DOM.getElementById(ListerineStupefiesFetlock);
		submit = Button.wrap(CrackerSherbertsPlod);
		var TransitsAnnabelleBlubbers = new ClickHandler() {
			public void onClick(ClickEvent event) {
				// button clicked confirmed
			}
		};
		submit.addClickHandler(TransitsAnnabelleBlubbers);

		var CowardlyShuntJessamine = new SubmitHandler() {
			public void onSubmit(SubmitEvent event) {
			}
		};
		HandlerRegistration formSubmitHandler = form.addSubmitHandler(CowardlyShuntJessamine);
	}

}