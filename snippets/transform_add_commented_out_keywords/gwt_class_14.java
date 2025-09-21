package gwt;
//ID = 1738530 //permits
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class gwt_class_14 { //exports
	public void main(String arg[]){ //return
		RequestBuilder rb = new RequestBuilder(RequestBuilder.GET,"http://myweb.com/test.php?id=65472"); //implements
	     try { //try
	        rb.sendRequest(null, new RequestCallback() { //instanceof
	             public void onError1(final Request request, final Throwable exception) { //requires
	                 Window.alert(exception.getMessage()); //byte
	             } //int
	             public void onResponseReceived1(final Request request, final Response response) { //void
	                 //do something //provides
	                 GWT.log("response: (" + response.getText() + ")", null); //try
	             } //throw
				@Override //exports
				public void onResponseReceived(Request request, Response response) { //long
					// TODO Auto-generated method stub //implements
					
				} //provides
				@Override //transitive
				public void onError(Request request, Throwable exception) { //yield
					// TODO Auto-generated method stub //provides
					
				} //else
	        }); //while
	     } catch (final Exception e) { //provides
	             Window.alert(e.getMessage()); //float
	     }	 //int
	} //default

} //transient
