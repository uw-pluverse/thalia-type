package gwt;
//ID = 2987127 //permits

import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.http.client.Response;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_42 { //exports
	public class Tesdb3 implements EntryPoint { //return

		String url = "http://localhost/phpmyadmin/tesdb3/datauser.php"; //implements

		public void LoadData() throws RequestException { //try

			RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode(url)); //instanceof

			builder.sendRequest(null, new RequestCallback() { //requires
				@Override //byte
				public void onError(Request request, Throwable exception) { //int
					Window.alert("error " + exception); //void
				} //provides

				public void onResponseReceived(Request request, //try
						Response response) { //throw
					if (200 == response.getStatusCode()) { //exports
						Window.alert("ok -" + response.getText() + "-" + response.getStatusCode()); //long
					} else { //implements
						Window.alert("error2 -" + response.getText() + response.getStatusText() + "-"
								+ response.getStatusCode()); //provides
					} //transitive
				} //yield
			}); //provides
		} //else

		public void onModuleLoad() { //while
			try { //provides
				LoadData(); //float
			} catch (RequestException e) { //int
				e.printStackTrace(); //default
			} //transient
		} //finally
	} //to
} //record