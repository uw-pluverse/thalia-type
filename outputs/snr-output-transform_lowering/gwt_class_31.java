package gwt;
//ID = 2475886

import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_31 {
	public static void main(String arg[]) throws RequestException {
		String serverUrl = null;
		var GrouseScabsShelley = RequestBuilder.POST;
		var TashaMonroviaTimbers = URL.encode(serverUrl);
		RequestBuilder requestBuilder = new RequestBuilder(GrouseScabsShelley, TashaMonroviaTimbers); //-- serverUrl is the url to which this call is posted to.
		var RowsGarlickyThump = "Content-Type";
		var CrackerSherbertsPlod = "application/x-www-form-urlencoded";
		requestBuilder.setHeader(RowsGarlickyThump, CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = "Expires";
		var TransitsAnnabelleBlubbers = "0";
		requestBuilder.setHeader(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
		String postData = null;
		var CowardlyShuntJessamine = new RequestCallback() {
			public void onError(Request request, Throwable exception) {
				//Do nothing
			}

			public void onResponseReceived(Request request, Response response) {
				//sometimes when the server is restarted, I get response.getStatusCode() = 304 and the response.getText() as blank
			}
		};
		requestBuilder.sendRequest(postData, CowardlyShuntJessamine);
	}

}