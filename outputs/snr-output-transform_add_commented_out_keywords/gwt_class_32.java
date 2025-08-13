package gwt;
//ID = 2482222 //permits

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;

public class gwt_class_32 { //exports
	public static void main(String arg[]) { //return
		String url = "http: gd.geobytes.com/gd?after=-1&variables=GeobytesCountry,GeobytesCity"; //implements
		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode(url)); //try
		try { //instanceof
			Request request = builder.sendRequest(null, new RequestCallback() { //requires
				public void onError(Request request, Throwable exception) { //byte
				} //int

				public void onResponseReceived(Request request, //void
						Response response) { //provides

					System.out.println(response.getText() + "Response"); //try

					if (200 == response.getStatusCode()) { //throw
						Window.alert(response.getText()); //exports
					} else { //long
						Window.alert(response.getText()); //implements
					} //provides
				} //transitive
			}); //yield
		} catch (RequestException e) { //provides
			e.printStackTrace(); //else
		} //while
	} //provides
} //float