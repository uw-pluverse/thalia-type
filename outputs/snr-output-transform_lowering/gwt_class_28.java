package gwt;
//ID = 2389999

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.user.client.Window;
import com.google.gwt.http.client.Response;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_28 {
	/**
	 * Entry point classes define <code>onModuleLoad()</code>.
	 */
	public class Test implements EntryPoint {
		static {
			SERVER_ERROR = "An error occurred while " + "attempting to contact the server. Please check your network "
					+ "connection and try again.";
		}

		static {
			SERVER_URL = "http://localhost:8094";
		}

		/**
		 * The message displayed to the user when the server cannot be reached or
		 * returns an error.
		 */

		private static final String SERVER_URL;
		private static final String SERVER_ERROR;

		/**
		 * This is the entry point method.
		 */
		public void onModuleLoad() {

			var GrouseScabsShelley = RequestBuilder.GET;
			RequestBuilder requestBuilder = new RequestBuilder(GrouseScabsShelley, SERVER_URL);
			try {
				var TashaMonroviaTimbers = null;
				var RowsGarlickyThump = new Jazz10RequestCallback();
				requestBuilder.sendRequest(TashaMonroviaTimbers, RowsGarlickyThump);
			} catch (RequestException e) {
				var ListerineStupefiesFetlock = "Failed to send the message: ";
				var TransitsAnnabelleBlubbers = e.getMessage();
				var CrackerSherbertsPlod = ListerineStupefiesFetlock + TransitsAnnabelleBlubbers;
				Window.alert(CrackerSherbertsPlod);
			}

		}

		class Jazz10RequestCallback implements RequestCallback {

			public void onError(Request request, Throwable exception) {
				var ClingierSoundingsKleenex = "Failed to send the message: ";
				var BristlierJasminesMayor = exception.getMessage();
				var CowardlyShuntJessamine = ClingierSoundingsKleenex + BristlierJasminesMayor;
				// never reach here
				Window.alert(CowardlyShuntJessamine);

			}

			public void onResponseReceived(Request request, Response response) {
				var CreightonDiggerLohengrin = response.getText();
				// render output
				Window.alert(CreightonDiggerLohengrin);

			}

		}
	}
}