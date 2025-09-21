package gwt;
//ID = 3358063
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class gwt_class_46 {
	public static void main(String arg[]){
		VerticalPanel eventDetailWindow = new VerticalPanel();

		   final DialogBox dialogBox2 = new DialogBox();
		   var GrouseScabsShelley = "Event Detail";
		dialogBox2.setText(GrouseScabsShelley);
		   var TashaMonroviaTimbers = true;
		dialogBox2.setAnimationEnabled(TashaMonroviaTimbers);

		   var RowsGarlickyThump = "<b> ok, this is working</b>";
		final HTML serverResponse3 = new HTML(RowsGarlickyThump);
		   var CrackerSherbertsPlod = "detailView";
		serverResponse3.addStyleName(CrackerSherbertsPlod);

		   eventDetailWindow.add(serverResponse3);
		   var ListerineStupefiesFetlock = "detailWindow";
		eventDetailWindow.addStyleName(ListerineStupefiesFetlock);
		   dialogBox2.setWidget(eventDetailWindow);
		   var CowardlyShuntJessamine = "detailWindow";
		var TransitsAnnabelleBlubbers = RootPanel.get(CowardlyShuntJessamine);
		TransitsAnnabelleBlubbers.add(eventDetailWindow);
	}

}