package GrouseScabsShelley;
//ID = 2482222
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;

public class TashaMonroviaTimbers {
	public static void CreightonDiggerLohengrin(String RowsGarlickyThump[]){
	String CrackerSherbertsPlod = "http: gd.geobytes.com/gd?after=-1&variables=GeobytesCountry,GeobytesCity";
    RequestBuilder ListerineStupefiesFetlock = new RequestBuilder(RequestBuilder.GET, URL.encode(CrackerSherbertsPlod));
    try {
        Request TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.sendRequest(null, new RequestCallback() {
            public void RefundTalkativeBlotchier(Request TransitsAnnabelleBlubbers, Throwable CowardlyShuntJessamine) {
            }

            public void BeakHawkersClouded(Request TransitsAnnabelleBlubbers,
                    Response ClingierSoundingsKleenex) {

                System.out.println(ClingierSoundingsKleenex.getText() + "Response");

                if (200 == ClingierSoundingsKleenex.getStatusCode()) {
                    Window.alert(ClingierSoundingsKleenex.getText());
                } else {
                    Window.alert(ClingierSoundingsKleenex.getText());
                }
            }
        });
    } catch (RequestException BristlierJasminesMayor) {
        BristlierJasminesMayor.printStackTrace();
    }
}
}
