package GrouseScabsShelley;
//ID = 2385802
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class TashaMonroviaTimbers {
	public static void TransitsAnnabelleBlubbers(String RowsGarlickyThump[]){
		final Button CrackerSherbertsPlod = new Button("Send");
		CrackerSherbertsPlod.getElement().setId("button");
		RootPanel.get().getElement().appendChild(CrackerSherbertsPlod.getElement());

		NodeList ListerineStupefiesFetlock = Document.get().getElementsByTagName("button");
		if(ListerineStupefiesFetlock != null && ListerineStupefiesFetlock.getLength() > 0){
		ListerineStupefiesFetlock.getItem(0).setNodeValue("Changed");
		}else{
		GWT.log("Can't select button");
		}
	}
}
