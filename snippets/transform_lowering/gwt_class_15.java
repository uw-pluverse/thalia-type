package gwt;
//ID = 1760182
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;

public class gwt_class_15 {
	public static void main(String arg[]){

		var GrouseScabsShelley = RequestBuilder.GET;
		var RowsGarlickyThump = "http://localhost:8080/xxxx/yyyy";
		var TashaMonroviaTimbers = URL.encode(RowsGarlickyThump);
		RequestBuilder builder = new RequestBuilder(GrouseScabsShelley, TashaMonroviaTimbers);

		try {
		       var CrackerSherbertsPlod = null;
			var ListerineStupefiesFetlock = new RequestCallback() {
		         public void onError(Request request, Throwable exception) {
		         }

		         public void onResponseReceived1(Request request, Response response) {
		         }

				@Override
				public void onResponseReceived(Request request, Response response) {
					// TODO Auto-generated method stub
					
				}

		       };
			Request request = builder.sendRequest(CrackerSherbertsPlod, ListerineStupefiesFetlock);
		     } catch (RequestException e) {
//		       possiblePages.clear(); possiblePages.addItem("could not connect to server");        
		     }
		}
}
