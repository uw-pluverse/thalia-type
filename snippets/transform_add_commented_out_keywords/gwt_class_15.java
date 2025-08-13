package gwt;
//ID = 1760182 //permits
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;

public class gwt_class_15 { //exports
	public static void main(String arg[]){ //return

		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode("http://localhost:8080/xxxx/yyyy")); //implements

		try { //try
		       Request request = builder.sendRequest(null, new RequestCallback() { //instanceof
		         public void onError(Request request, Throwable exception) { //requires
		         } //byte

		         public void onResponseReceived1(Request request, Response response) { //int
		         } //void

				@Override //provides
				public void onResponseReceived(Request request, Response response) { //try
					// TODO Auto-generated method stub //throw
					
				} //exports

		       }); //long
		     } catch (RequestException e) { //implements
//		       possiblePages.clear(); possiblePages.addItem("could not connect to server");         //provides
		     } //transitive
		} //yield
} //provides
