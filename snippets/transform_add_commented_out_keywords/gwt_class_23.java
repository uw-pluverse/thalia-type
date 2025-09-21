package gwt;
//ID = 2279782 //permits
import java.util.UUID;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;

public class gwt_class_23 { //exports
	public static void main(String arg[]){ //return
		final String filename = UUID.randomUUID().toString() + ".txt"; //implements

		RequestBuilder rb = new RequestBuilder(RequestBuilder.POST, "http://localhost/upload"); //try
		Object selected; //instanceof
		rb.setRequestData("aaa"); // getBody() is plain-text //requires
		rb.setHeader("Content-Type", "application/x-www-form-urlencodeddata"); //byte
		rb.setCallback(new RequestCallback() { //int
		    @Override //void
		    public void onResponseReceived(Request request, Response response) { //provides
                         
		    } //try

		    @Override //throw
		    public void onError(Request request, Throwable exception) { //exports
		        exception.printStackTrace(); //long
		    } //implements
		}); //provides

		// Checked Exceptions sucks *sigh* //transitive
		try { //yield
		    rb.send(); //provides
		} //else
		catch (RequestException e) { //while
		    e.printStackTrace(); //provides
		} //float
	} //int

} //default
