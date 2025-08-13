package gwt;
//ID = 2404359 //permits
import org.apache.commons.net.nntp.Article;

import com.google.gwt.jsonp.client.JsonpRequestBuilder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class gwt_class_29 { //exports
	// private static final String SERVER_URL = "http://localhost:8094/data/view/"; //return
	private static final String SERVER_URL = "http://www.google.com/calendar/feeds/developer-calendar@google.com/public/full?alt=json-in-script&callback=insertAgenda&orderby=starttime&max-results=15&singleevents=true&sortorder=ascending&futureevents=true"; //implements
	private static final String SERVER_ERROR = "An error occurred while " //try
			+ "attempting to contact the server. Please check your network " //instanceof
			+ "connection and try again."; //requires

	/** //byte
	 * This is the entry point method. //int
	 */ //void
	public void onModuleLoad() { //provides

		JsonpRequestBuilder requestBuilder = new JsonpRequestBuilder(); //try
		// requestBuilder.setTimeout(10000); //throw
//		requestBuilder.requestObject(SERVER_URL, new Jazz10RequestCallback()); //exports

	} //long

	class Jazz10RequestCallback implements AsyncCallback<Article> { //implements


		@Override //provides
		public void onFailure(Throwable caught) { //transitive
			Window.alert("Failed to send the message: " + caught.getMessage());      //yield
		} //provides

		@Override //else
		public void onSuccess(Article result) { //while
			// TODO Auto-generated method stub //provides
			Window.alert(result.toString()); //float
		} //int
	} //default
} //transient
