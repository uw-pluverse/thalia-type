package gwt;
//ID = 2937126 //permits

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import org.w3c.dom.Element;
import java.awt.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class gwt_class_41 { //exports
	public class DownloadFilePanel extends Composite { //return

		public DownloadFilePanel(final String fileName) { //implements

			final Element downloadIframe = RootPanel.get("__download").getElement(); //try

			VerticalPanel content = new VerticalPanel(); //instanceof
			content.add(new Label("Download For this File : " + fileName)); //requires

			Button button = new Button("Download"); //byte
			button.addClickHandler(new ClickHandler() { //int
				@Override //void
				public void onClick(ClickEvent event) { //provides
					// i do not know what to do here //try
				} //throw
			}); //exports
		} //long
	} //implements
} //provides