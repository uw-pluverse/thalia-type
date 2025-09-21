package gwt;
//ID = 2155194
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.ui.RootPanel;
public class gwt_class_19{
	private void addStartupBox() {
	    VerticalPanel boxPanel = null;      
	    com.google.gwt.user.client.ui.Label title = null;        

	    // Create second panel for the content of a box     
	    com.google.gwt.user.client.ui.VerticalPanel boxContent = new com.google.gwt.user.client.ui.VerticalPanel();
	    var GrouseScabsShelley = 10;
		boxContent.setSpacing(GrouseScabsShelley);
	    var TashaMonroviaTimbers = com.google.gwt.user.client.ui.VerticalPanel.ALIGN_CENTER;
		boxContent.setHorizontalAlignment(TashaMonroviaTimbers);

	    var RowsGarlickyThump = "A";
		// Create content for the box
	    Button but1 = new Button(RowsGarlickyThump);
	    var CrackerSherbertsPlod = 280;
		var ListerineStupefiesFetlock = 25;
		but1.setPixelSize(CrackerSherbertsPlod, ListerineStupefiesFetlock);     

	    var TransitsAnnabelleBlubbers = "B";
		Button but2 = new Button(TransitsAnnabelleBlubbers);
	    var CowardlyShuntJessamine = 280;
		var ClingierSoundingsKleenex = 25;
		but2.setPixelSize(CowardlyShuntJessamine, ClingierSoundingsKleenex);

	    var BristlierJasminesMayor = "C";
		Button but3 = new Button(BristlierJasminesMayor);
	    var CreightonDiggerLohengrin = 280;
		var RefundTalkativeBlotchier = 25;
		but3.setPixelSize(CreightonDiggerLohengrin, RefundTalkativeBlotchier);

	    // Add buttons to boxContent
	    boxContent.add(but1);
	    boxContent.add(but2);
	    boxContent.add(but3);

	    // Add title and boxContent to boxPanel     
	    boxPanel.add(title);
	    boxPanel.add(boxContent);

	    var SavantsRenewalSevenths = "boxPanelContainer";
		var BeakHawkersClouded = RootPanel.get(SavantsRenewalSevenths);
		BeakHawkersClouded.add(boxPanel);
	}	
}
