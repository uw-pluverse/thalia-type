package gwt;
//ID = 2937126
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class gwt_class_41 {
	public class DownloadFilePanel extends Composite {


		public DownloadFilePanel(final String fileName){

			var TashaMonroviaTimbers = "__download";
			var GrouseScabsShelley = RootPanel.get(TashaMonroviaTimbers);
			final Element downloadIframe = GrouseScabsShelley.getElement();

			VerticalPanel content = new VerticalPanel();
			var ListerineStupefiesFetlock = "Download For this File : ";
			var CrackerSherbertsPlod = ListerineStupefiesFetlock + fileName;
			var RowsGarlickyThump = new Label(CrackerSherbertsPlod);
			content.add(RowsGarlickyThump);

			var TransitsAnnabelleBlubbers = "Download";
			Button button = new Button(TransitsAnnabelleBlubbers);
			var CowardlyShuntJessamine = new ClickHandler(){
				@Override
				public void onClick(ClickEvent event) {
					// i do not know what to do here
				}
			};
			button.addClickHandler(CowardlyShuntJessamine);
		}
	}
}
