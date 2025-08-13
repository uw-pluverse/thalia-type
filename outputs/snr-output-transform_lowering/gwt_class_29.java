package gwt;
//ID = 2404359

import com.google.gwt.jsonp.client.JsonpRequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.Window;
import org.apache.commons.net.nntp.Article;

public class gwt_class_29 {
	static {
		SERVER_ERROR = "An error occurred while " + "attempting to contact the server. Please check your network "
				+ "connection and try again.";
	}

	static {
		SERVER_URL = "http://www.google.com/calendar/feeds/developer-calendar@google.com/public/full?alt=json-in-script&callback=insertAgenda&orderby=starttime&max-results=15&singleevents=true&sortorder=ascending&futureevents=true";
	}

	// private static final String SERVER_URL = "http://localhost:8094/data/view/";
	private static final String SERVER_URL;
	private static final String SERVER_ERROR;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		JsonpRequestBuilder requestBuilder = new JsonpRequestBuilder();
		// requestBuilder.setTimeout(10000);
		//		requestBuilder.requestObject(SERVER_URL, new Jazz10RequestCallback());

	}

	class Jazz10RequestCallback implements AsyncCallback<Article> {

		@Override
		public void onFailure(Throwable caught) {
			var TashaMonroviaTimbers = "Failed to send the message: ";
			var RowsGarlickyThump = caught.getMessage();
			var GrouseScabsShelley = TashaMonroviaTimbers + RowsGarlickyThump;
			Window.alert(GrouseScabsShelley);
		}

		@Override
		public void onSuccess(Article result) {
			var CrackerSherbertsPlod = result.toString();
			// TODO Auto-generated method stub
			Window.alert(CrackerSherbertsPlod);
		}
	}
}