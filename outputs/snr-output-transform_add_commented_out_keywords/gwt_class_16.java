package gwt;
//ID = 1795474 //permits

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_16 { //exports
	public static void main(String arg[]) { //return
		try //implements
		{ //try
			RequestBuilder rb = new RequestBuilder( //instanceof
					RequestBuilder.POST, "AuthenticationChecker.html"); //requires
			rb.sendRequest(null, new RequestCallback() //byte
			{ //int
				public void onError(Request request, Throwable exception) //void
				{ //provides
					RootPanel.get().add(new HTML("[error]" + exception.getMessage())); //try
				} //throw

				public void onResponseReceived(Request request, Response response) //exports
				{ //long
					RootPanel.get() //implements
							.add(new HTML(
									"[success (" + response.getStatusCode() + "," + response.getStatusText() + ")]")); //provides
				} //transitive
			} //yield
			); //provides
		} //else
		catch (Exception e) //while
		{ //provides
			RootPanel.get().add(new HTML("Error sending request " + e.getMessage())); //float
		} //int
	} //default
} //transient