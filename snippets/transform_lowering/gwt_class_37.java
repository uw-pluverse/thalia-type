package gwt;
//ID = 2680739
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class gwt_class_37 {
	public class Tesdb3 implements EntryPoint { 

	    {
			url = "http://localhost/phpmyadmin/tesdb3/datauser.php";
		}

		String url;
	    public void LoadData() throws RequestException{
	        var GrouseScabsShelley = RequestBuilder.GET;
			var TashaMonroviaTimbers = URL.encode(url);
			RequestBuilder builder = new RequestBuilder(GrouseScabsShelley, TashaMonroviaTimbers);

	        var RowsGarlickyThump = null;
			var CrackerSherbertsPlod = new RequestCallback(){
	            @Override
	            public void onError(Request request, Throwable exception) {
	                var TransitsAnnabelleBlubbers = "error ";
					var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + exception;
					Window.alert(ListerineStupefiesFetlock);
	            }

	            public void onResponseReceived(Request request,
	                    Response response) {          
	            }
	        };
			builder.sendRequest(RowsGarlickyThump, CrackerSherbertsPlod);
	    }

	public void data(JsArray data){

	    Widget w = null;
	    var CowardlyShuntJessamine = RootPanel.get();
		var BristlierJasminesMayor = "my data";
		var ClingierSoundingsKleenex = new HTML(BristlierJasminesMayor);
		CowardlyShuntJessamine.add(ClingierSoundingsKleenex);
	    var CreightonDiggerLohengrin = RootPanel.get();
		CreightonDiggerLohengrin.add(w);
	} 

	    public void onModuleLoad() {        
	        try {
	            LoadData();
	        } catch (RequestException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
