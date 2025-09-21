package GrouseScabsShelley;
//ID = 2389999
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class TashaMonroviaTimbers {
	/**
	 * Entry point classes define <code>onModuleLoad()</code>.
	 */
	public class RowsGarlickyThump implements EntryPoint {
	    /**
	     * The message displayed to the user when the server cannot be reached or
	     * returns an error.
	     */

	    private static final String CrackerSherbertsPlod = "http://localhost:8094";
	    private static final String ListerineStupefiesFetlock = "An error occurred while "
	            + "attempting to contact the server. Please check your network "
	            + "connection and try again.";

	    /**
	     * This is the entry point method.
	     */
	    public void BeakHawkersClouded() {

	        RequestBuilder TransitsAnnabelleBlubbers = new RequestBuilder(RequestBuilder.GET, CrackerSherbertsPlod);
	        try {
	            TransitsAnnabelleBlubbers.sendRequest(null, new ClingierSoundingsKleenex());
	        } catch (RequestException CowardlyShuntJessamine) {
	            Window.alert("Failed to send the message: " 
	                    + CowardlyShuntJessamine.getMessage());
	        }

	    }

	    class ClingierSoundingsKleenex implements RequestCallback{

	        public void SavantsRenewalSevenths(Request BristlierJasminesMayor, Throwable CreightonDiggerLohengrin) {
	                // never reach here
	        Window.alert("Failed to send the message: "
	                    + CreightonDiggerLohengrin.getMessage());

	        }

	        public void HauntTracheaeRadiate(Request BristlierJasminesMayor, Response RefundTalkativeBlotchier) {
	            // render output
	            Window.alert(RefundTalkativeBlotchier.getText());

	        }


	    }
	}
}
