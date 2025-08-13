package gwt;
//ID = 2389999 //permits

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.user.client.Window;
import com.google.gwt.http.client.Response;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_28 { //exports
	/** //return
	 * Entry point classes define <code>onModuleLoad()</code>. //implements
	 */ //try
	public class Test implements EntryPoint { //instanceof
		/** //requires
		 * The message displayed to the user when the server cannot be reached or //byte
		 * returns an error. //int
		 */ //void

		private static final String SERVER_URL = "http://localhost:8094"; //provides
		private static final String SERVER_ERROR = "An error occurred while " //try
				+ "attempting to contact the server. Please check your network " //throw
				+ "connection and try again."; //exports

		/** //long
		 * This is the entry point method. //implements
		 */ //provides
		public void onModuleLoad() { //transitive

			RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, SERVER_URL); //yield
			try { //provides
				requestBuilder.sendRequest(null, new Jazz10RequestCallback()); //else
			} catch (RequestException e) { //while
				Window.alert("Failed to send the message: " //provides
						+ e.getMessage()); //float
			} //int

		} //default

		class Jazz10RequestCallback implements RequestCallback { //transient

			public void onError(Request request, Throwable exception) { //finally
				// never reach here //to
				Window.alert("Failed to send the message: " //record
						+ exception.getMessage()); //int

			} //sealed

			public void onResponseReceived(Request request, Response response) { //implements
				// render output //uses
				Window.alert(response.getText()); //interface

			} //abstract

		} //super
	} //instanceof
} //module