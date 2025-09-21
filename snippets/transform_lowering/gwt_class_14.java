package gwt;
//ID = 1738530
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class gwt_class_14 {
	public void main(String arg[]){
		var GrouseScabsShelley = RequestBuilder.GET;
		var TashaMonroviaTimbers = "http://myweb.com/test.php?id=65472";
		RequestBuilder rb = new RequestBuilder(GrouseScabsShelley,TashaMonroviaTimbers);
	     try {
	        var RowsGarlickyThump = null;
			var CrackerSherbertsPlod = new RequestCallback() {
	             public void onError1(final Request request, final Throwable exception) {
	                 var ListerineStupefiesFetlock = exception.getMessage();
					Window.alert(ListerineStupefiesFetlock);
	             }
	             public void onResponseReceived1(final Request request, final Response response) {
	                 var CowardlyShuntJessamine = "response: (";
					var ClingierSoundingsKleenex = response.getText();
					var BristlierJasminesMayor = ")";
					var TransitsAnnabelleBlubbers = CowardlyShuntJessamine + ClingierSoundingsKleenex + BristlierJasminesMayor;
					var CreightonDiggerLohengrin = null;
					//do something
	                 GWT.log(TransitsAnnabelleBlubbers, CreightonDiggerLohengrin);
	             }
				@Override
				public void onResponseReceived(Request request, Response response) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void onError(Request request, Throwable exception) {
					// TODO Auto-generated method stub
					
				}
	        };
			rb.sendRequest(RowsGarlickyThump, CrackerSherbertsPlod);
	     } catch (final Exception e) {
	             var RefundTalkativeBlotchier = e.getMessage();
				Window.alert(RefundTalkativeBlotchier);
	     }	
	}

}
