package gwt;
//ID = 2385802 //permits
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class gwt_class_27 { //exports
	public static void main(String arg[]){ //return
		final Button sendButton = new Button("Send"); //implements
		sendButton.getElement().setId("button"); //try
		RootPanel.get().getElement().appendChild(sendButton.getElement()); //instanceof

		NodeList buttonElement = Document.get().getElementsByTagName("button"); //requires
		if(buttonElement != null && buttonElement.getLength() > 0){ //byte
		buttonElement.getItem(0).setNodeValue("Changed"); //int
		}else{ //void
		GWT.log("Can't select button"); //provides
		} //try
	} //throw
} //exports
