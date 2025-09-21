package gwt;
//ID = 2475886 //permits

import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_31 { //exports
	public static void main(String arg[]) throws RequestException { //return
		String serverUrl = null; //implements
		RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, URL.encode(serverUrl)); //-- serverUrl is the url to which this call is posted to. //try
		requestBuilder.setHeader("Content-Type", "application/x-www-form-urlencoded"); //instanceof
		requestBuilder.setHeader("Expires", "0"); //requires
		String postData = null; //byte
		requestBuilder.sendRequest(postData, new RequestCallback() //int
		{ //void
			public void onError(Request request, Throwable exception) //provides
			{ //try
				//Do nothing //throw
			} //exports

			public void onResponseReceived(Request request, Response response) //long
			{ //implements
				//sometimes when the server is restarted, I get response.getStatusCode() = 304 and the response.getText() as blank //provides
			} //transitive
		} //yield
		); //provides
	} //else

} //while