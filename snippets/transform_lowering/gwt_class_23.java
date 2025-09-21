package gwt;
//ID = 2279782
import java.util.UUID;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;

public class gwt_class_23 {
	public static void main(String arg[]){
		var TashaMonroviaTimbers = UUID.randomUUID();
		var GrouseScabsShelley = TashaMonroviaTimbers.toString();
		var RowsGarlickyThump = ".txt";
		final String filename = GrouseScabsShelley + RowsGarlickyThump;

		var CrackerSherbertsPlod = RequestBuilder.POST;
		var ListerineStupefiesFetlock = "http://localhost/upload";
		RequestBuilder rb = new RequestBuilder(CrackerSherbertsPlod, ListerineStupefiesFetlock);
		Object selected;
		var TransitsAnnabelleBlubbers = "aaa";
		rb.setRequestData(TransitsAnnabelleBlubbers); // getBody() is plain-text
		var CowardlyShuntJessamine = "Content-Type";
		var ClingierSoundingsKleenex = "application/x-www-form-urlencodeddata";
		rb.setHeader(CowardlyShuntJessamine, ClingierSoundingsKleenex);
		var BristlierJasminesMayor = new RequestCallback() {
		    @Override
		    public void onResponseReceived(Request request, Response response) {
                         
		    }

		    @Override
		    public void onError(Request request, Throwable exception) {
		        exception.printStackTrace();
		    }
		};
		rb.setCallback(BristlierJasminesMayor);

		// Checked Exceptions sucks *sigh*
		try {
		    rb.send();
		}
		catch (RequestException e) {
		    e.printStackTrace();
		}
	}

}
