package gwt;
//ID = 2937126

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import org.w3c.dom.Element;
import java.awt.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class gwt_class_41 {
	public class DownloadFilePanel extends Composite {

		public DownloadFilePanel(final String fileName) {

			final Element downloadIframe = RootPanel.get("__download").getElement();

			VerticalPanel content = new VerticalPanel();
			content.add(new Label("Download For this File : " + fileName));

			Button button = new Button("Download");
			button.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					// i do not know what to do here
				}
			});
		}
	}
}