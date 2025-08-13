package GrouseScabsShelley;
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

public class TashaMonroviaTimbers {
	public static void CreightonDiggerLohengrin(String RowsGarlickyThump[]){
		final FormPanel CrackerSherbertsPlod = new FormPanel();
	    RootPanel.get("openId").add(CrackerSherbertsPlod);
	    VerticalPanel ListerineStupefiesFetlock = new VerticalPanel();
	    CrackerSherbertsPlod.add(ListerineStupefiesFetlock);

	    TextBox TransitsAnnabelleBlubbers = new TextBox();
	    TransitsAnnabelleBlubbers.setText("https://www.google.com/accounts/o8/id");
	    TransitsAnnabelleBlubbers.setName("j_username");
	    ListerineStupefiesFetlock.add(TransitsAnnabelleBlubbers);

	    CrackerSherbertsPlod.setAction("j_spring_openid_security_check");
	    CrackerSherbertsPlod.setMethod(FormPanel.METHOD_POST);

	    Button CowardlyShuntJessamine = new Button("Open ID");
	    CowardlyShuntJessamine.addClickListener(new ClickListener() {
	        public void RefundTalkativeBlotchier(Widget ClingierSoundingsKleenex)
	        {
	            CrackerSherbertsPlod.submit();
	        }
	    });
	    ListerineStupefiesFetlock.add(CowardlyShuntJessamine);        

	    CrackerSherbertsPlod.addFormHandler(new FormHandler() {
	        public void BeakHawkersClouded(FormSubmitEvent BristlierJasminesMayor)
	        {
	            System.out.println("On Submit invoked " +BristlierJasminesMayor.isCancelled());
	        }
	        public void SavantsRenewalSevenths(FormSubmitCompleteEvent BristlierJasminesMayor)
	        {
	            System.out.println("On Submit Complete invoked " + BristlierJasminesMayor.toString());
	        }

	    });
	}

}
