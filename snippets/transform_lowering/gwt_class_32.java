package gwt;
//ID = 2482222
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;

public class gwt_class_32 {
	public static void main(String arg[]){
	String url = "http: gd.geobytes.com/gd?after=-1&variables=GeobytesCountry,GeobytesCity";
    var GrouseScabsShelley = RequestBuilder.GET;
	var TashaMonroviaTimbers = URL.encode(url);
	RequestBuilder builder = new RequestBuilder(GrouseScabsShelley, TashaMonroviaTimbers);
    try {
        var RowsGarlickyThump = null;
		var CrackerSherbertsPlod = new RequestCallback() {
            public void onError(Request request, Throwable exception) {
            }

            public void onResponseReceived(Request request,
                    Response response) {

                var ListerineStupefiesFetlock = System.out;
				var CowardlyShuntJessamine = response.getText();
				var ClingierSoundingsKleenex = "Response";
				var TransitsAnnabelleBlubbers = CowardlyShuntJessamine + ClingierSoundingsKleenex;
				ListerineStupefiesFetlock.println(TransitsAnnabelleBlubbers);

                var CreightonDiggerLohengrin = 200;
				var RefundTalkativeBlotchier = response.getStatusCode();
				var BristlierJasminesMayor = CreightonDiggerLohengrin == RefundTalkativeBlotchier;
				if (BristlierJasminesMayor) {
                    var BeakHawkersClouded = response.getText();
					Window.alert(BeakHawkersClouded);
                } else {
                    var SavantsRenewalSevenths = response.getText();
					Window.alert(SavantsRenewalSevenths);
                }
            }
        };
		Request request = builder.sendRequest(RowsGarlickyThump, CrackerSherbertsPlod);
    } catch (RequestException e) {
        e.printStackTrace();
    }
}
}
