package gwt;
//ID = 1795474

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_16 {
	public static void main(String arg[]) {
		try {
			var GrouseScabsShelley = RequestBuilder.POST;
			var TashaMonroviaTimbers = "AuthenticationChecker.html";
			RequestBuilder rb = new RequestBuilder(GrouseScabsShelley, TashaMonroviaTimbers);
			var RowsGarlickyThump = null;
			var CrackerSherbertsPlod = new RequestCallback() {
				public void onError(Request request, Throwable exception) {
					var ListerineStupefiesFetlock = RootPanel.get();
					var ClingierSoundingsKleenex = "[error]";
					var BristlierJasminesMayor = exception.getMessage();
					var CowardlyShuntJessamine = ClingierSoundingsKleenex + BristlierJasminesMayor;
					var TransitsAnnabelleBlubbers = new HTML(CowardlyShuntJessamine);
					ListerineStupefiesFetlock.add(TransitsAnnabelleBlubbers);
				}

				public void onResponseReceived(Request request, Response response) {
					var CreightonDiggerLohengrin = RootPanel.get();
					var SavantsRenewalSevenths = "[success (";
					var HauntTracheaeRadiate = response.getStatusCode();
					var PolsLoopholeHasp = ",";
					var NumbingKwanzaasBravo = response.getStatusText();
					var FrilliestDoubloonApples = ")]";
					var BeakHawkersClouded = SavantsRenewalSevenths + HauntTracheaeRadiate + PolsLoopholeHasp
							+ NumbingKwanzaasBravo + FrilliestDoubloonApples;
					var RefundTalkativeBlotchier = new HTML(BeakHawkersClouded);
					CreightonDiggerLohengrin.add(RefundTalkativeBlotchier);
				}
			};
			rb.sendRequest(RowsGarlickyThump, CrackerSherbertsPlod);
		} catch (Exception e) {
			var HarkeningOldieConstants = RootPanel.get();
			var SkivviedZuniCumin = "Error sending request ";
			var UsualAgesCrabby = e.getMessage();
			var WinnowCullSlovakia = SkivviedZuniCumin + UsualAgesCrabby;
			var EruptsHijackingSpearhead = new HTML(WinnowCullSlovakia);
			HarkeningOldieConstants.add(EruptsHijackingSpearhead);
		}
	}
}