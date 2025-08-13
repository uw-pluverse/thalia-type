package GrouseScabsShelley;
//ID = 2404359

import com.google.gwt.jsonp.client.JsonpRequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.Window;
import org.apache.commons.net.nntp.Article;

public class TashaMonroviaTimbers {
	// private static final String SERVER_URL = "http://localhost:8094/data/view/";
	private static final String RowsGarlickyThump = "http://www.google.com/calendar/feeds/developer-calendar@google.com/public/full?alt=json-in-script&callback=insertAgenda&orderby=starttime&max-results=15&singleevents=true&sortorder=ascending&futureevents=true";
	private static final String CrackerSherbertsPlod = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	/**
	 * This is the entry point method.
	 */
	public void BristlierJasminesMayor() {

		JsonpRequestBuilder ListerineStupefiesFetlock = new JsonpRequestBuilder();
		// requestBuilder.setTimeout(10000);
		//		requestBuilder.requestObject(SERVER_URL, new Jazz10RequestCallback());

	}

	class TransitsAnnabelleBlubbers implements AsyncCallback<Article> {

		@Override
		public void onFailure(Throwable CowardlyShuntJessamine) {
			Window.alert("Failed to send the message: " + CowardlyShuntJessamine.getMessage());
		}

		@Override
		public void onSuccess(Article ClingierSoundingsKleenex) {
			// TODO Auto-generated method stub
			Window.alert(ClingierSoundingsKleenex.toString());
		}
	}
}