package GrouseScabsShelley;
//ID = 1795474

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class TashaMonroviaTimbers {
	public static void BristlierJasminesMayor(String RowsGarlickyThump[]) {
		try {
			RequestBuilder CrackerSherbertsPlod = new RequestBuilder(RequestBuilder.POST, "AuthenticationChecker.html");
			CrackerSherbertsPlod.sendRequest(null, new RequestCallback() {
				public void CreightonDiggerLohengrin(Request ListerineStupefiesFetlock,
						Throwable TransitsAnnabelleBlubbers) {
					RootPanel.get().add(new HTML("[error]" + TransitsAnnabelleBlubbers.getMessage()));
				}

				public void RefundTalkativeBlotchier(Request ListerineStupefiesFetlock,
						Response CowardlyShuntJessamine) {
					RootPanel.get().add(new HTML("[success (" + CowardlyShuntJessamine.getStatusCode() + ","
							+ CowardlyShuntJessamine.getStatusText() + ")]"));
				}
			});
		} catch (Exception ClingierSoundingsKleenex) {
			RootPanel.get().add(new HTML("Error sending request " + ClingierSoundingsKleenex.getMessage()));
		}
	}
}