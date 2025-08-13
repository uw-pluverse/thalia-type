package GrouseScabsShelley;
//ID = 1738530
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class TashaMonroviaTimbers {
	public void BristlierJasminesMayor(String RowsGarlickyThump[]){
		RequestBuilder CrackerSherbertsPlod = new RequestBuilder(RequestBuilder.GET,"http://myweb.com/test.php?id=65472");
	     try {
	        CrackerSherbertsPlod.sendRequest(null, new RequestCallback() {
	             public void CreightonDiggerLohengrin(final Request ListerineStupefiesFetlock, final Throwable TransitsAnnabelleBlubbers) {
	                 Window.alert(TransitsAnnabelleBlubbers.getMessage());
	             }
	             public void RefundTalkativeBlotchier(final Request ListerineStupefiesFetlock, final Response CowardlyShuntJessamine) {
	                 //do something
	                 GWT.log("response: (" + CowardlyShuntJessamine.getText() + ")", null);
	             }
				@Override
				public void onResponseReceived(Request ListerineStupefiesFetlock, Response CowardlyShuntJessamine) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void onError(Request ListerineStupefiesFetlock, Throwable TransitsAnnabelleBlubbers) {
					// TODO Auto-generated method stub
					
				}
	        });
	     } catch (final Exception ClingierSoundingsKleenex) {
	             Window.alert(ClingierSoundingsKleenex.getMessage());
	     }	
	}

}
