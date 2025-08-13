package gwt;
//ID = 2369187
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_26 {
	public static void main(String arg[]){
		final FormPanel formPanel = new FormPanel();
	    var TashaMonroviaTimbers = "openId";
		var GrouseScabsShelley = RootPanel.get(TashaMonroviaTimbers);
		GrouseScabsShelley.add(formPanel);
	    VerticalPanel openIdContainer = new VerticalPanel();
	    formPanel.add(openIdContainer);

	    TextBox url = new TextBox();
	    var RowsGarlickyThump = "https://www.google.com/accounts/o8/id";
		url.setText(RowsGarlickyThump);
	    var CrackerSherbertsPlod = "j_username";
		url.setName(CrackerSherbertsPlod);
	    openIdContainer.add(url);

	    var ListerineStupefiesFetlock = "j_spring_openid_security_check";
		formPanel.setAction(ListerineStupefiesFetlock);
	    var TransitsAnnabelleBlubbers = FormPanel.METHOD_POST;
		formPanel.setMethod(TransitsAnnabelleBlubbers);

	    var CowardlyShuntJessamine = "Open ID";
		Button btn = new Button(CowardlyShuntJessamine);
	    var ClingierSoundingsKleenex = new ClickListener() {
	        public void onClick(Widget sender)
	        {
	            formPanel.submit();
	        }
	    };
		btn.addClickListener(ClingierSoundingsKleenex);
	    openIdContainer.add(btn);        

	    var BristlierJasminesMayor = new FormHandler() {
	        public void onSubmit(FormSubmitEvent event)
	        {
	            var CreightonDiggerLohengrin = System.out;
				var BeakHawkersClouded = "On Submit invoked ";
				var SavantsRenewalSevenths = event.isCancelled();
				var RefundTalkativeBlotchier = BeakHawkersClouded +SavantsRenewalSevenths;
				CreightonDiggerLohengrin.println(RefundTalkativeBlotchier);
	        }
	        public void onSubmitComplete(FormSubmitCompleteEvent event)
	        {
	            var HauntTracheaeRadiate = System.out;
				var NumbingKwanzaasBravo = "On Submit Complete invoked ";
				var FrilliestDoubloonApples = event.toString();
				var PolsLoopholeHasp = NumbingKwanzaasBravo + FrilliestDoubloonApples;
				HauntTracheaeRadiate.println(PolsLoopholeHasp);
	        }

	    };
		formPanel.addFormHandler(BristlierJasminesMayor);
	}

}
