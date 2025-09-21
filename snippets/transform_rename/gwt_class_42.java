package GrouseScabsShelley;
//ID = 2987127
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump implements EntryPoint { 

		String CrackerSherbertsPlod= "http://localhost/phpmyadmin/tesdb3/datauser.php";

		public void CreightonDiggerLohengrin() throws RequestException{             

		    RequestBuilder ListerineStupefiesFetlock = new RequestBuilder(RequestBuilder.GET, URL.encode(CrackerSherbertsPlod));

		    ListerineStupefiesFetlock.sendRequest(null, new RequestCallback(){
		        @Override
		        public void onError(Request TransitsAnnabelleBlubbers, Throwable CowardlyShuntJessamine) {
		            Window.alert("error " + CowardlyShuntJessamine);
		        }
		        public void RefundTalkativeBlotchier(Request TransitsAnnabelleBlubbers,
		                Response ClingierSoundingsKleenex) {
		              if (200 == ClingierSoundingsKleenex.getStatusCode()) {
		                  Window.alert("ok -" + ClingierSoundingsKleenex.getText() + "-" + ClingierSoundingsKleenex.getStatusCode());
		              } else {
		                  Window.alert("error2 -" + ClingierSoundingsKleenex.getText()+ ClingierSoundingsKleenex.getStatusText() + "-" + ClingierSoundingsKleenex.getStatusCode());
		              }         
		        }
		    });
		}

		public void BeakHawkersClouded() {        
		    try {
		        CreightonDiggerLohengrin();
		    } catch (RequestException BristlierJasminesMayor) {
		        BristlierJasminesMayor.printStackTrace();
		    }       
		}
		}
}
