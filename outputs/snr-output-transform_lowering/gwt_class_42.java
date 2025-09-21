package gwt;
//ID = 2987127

import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.http.client.Response;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_42 {
	public class Tesdb3 implements EntryPoint {

		{
			url = "http://localhost/phpmyadmin/tesdb3/datauser.php";
		}

		String url;

		public void LoadData() throws RequestException {

			var GrouseScabsShelley = RequestBuilder.GET;
			var TashaMonroviaTimbers = URL.encode(url);
			RequestBuilder builder = new RequestBuilder(GrouseScabsShelley, TashaMonroviaTimbers);

			var RowsGarlickyThump = null;
			var CrackerSherbertsPlod = new RequestCallback() {
				@Override
				public void onError(Request request, Throwable exception) {
					var TransitsAnnabelleBlubbers = "error ";
					var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + exception;
					Window.alert(ListerineStupefiesFetlock);
				}

				public void onResponseReceived(Request request, Response response) {
					var ClingierSoundingsKleenex = 200;
					var BristlierJasminesMayor = response.getStatusCode();
					var CowardlyShuntJessamine = ClingierSoundingsKleenex == BristlierJasminesMayor;
					if (CowardlyShuntJessamine) {
						var RefundTalkativeBlotchier = "ok -";
						var BeakHawkersClouded = response.getText();
						var SavantsRenewalSevenths = "-";
						var HauntTracheaeRadiate = response.getStatusCode();
						var CreightonDiggerLohengrin = RefundTalkativeBlotchier + BeakHawkersClouded
								+ SavantsRenewalSevenths + HauntTracheaeRadiate;
						Window.alert(CreightonDiggerLohengrin);
					} else {
						var NumbingKwanzaasBravo = "error2 -";
						var FrilliestDoubloonApples = response.getText();
						var HarkeningOldieConstants = response.getStatusText();
						var EruptsHijackingSpearhead = "-";
						var WinnowCullSlovakia = response.getStatusCode();
						var PolsLoopholeHasp = NumbingKwanzaasBravo + FrilliestDoubloonApples + HarkeningOldieConstants
								+ EruptsHijackingSpearhead + WinnowCullSlovakia;
						Window.alert(PolsLoopholeHasp);
					}
				}
			};
			builder.sendRequest(RowsGarlickyThump, CrackerSherbertsPlod);
		}

		public void onModuleLoad() {
			try {
				LoadData();
			} catch (RequestException e) {
				e.printStackTrace();
			}
		}
	}
}