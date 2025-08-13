package gwt;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HTML;

public class gwt_class_30 {
	static {
		box = null;
	}

	static {
		surName = new TextBox();
	}

	static {
		firstName = new TextBox();
	}

	static TextBox firstName;
	static TextBox surName;
	static DialogBox box;

	static public DialogBox buildNewElecPopup() {

		DialogBox box = new DialogBox();
		var GrouseScabsShelley = true;
		box.setAutoHideEnabled(GrouseScabsShelley);

		var TashaMonroviaTimbers = "Add a New Candidate";
		box.setText(TashaMonroviaTimbers);
		var RowsGarlickyThump = true;
		box.setAnimationEnabled(RowsGarlickyThump);
		var CrackerSherbertsPlod = true;
		box.setGlassEnabled(CrackerSherbertsPlod);

		var ListerineStupefiesFetlock = 2;
		var TransitsAnnabelleBlubbers = 3;
		Grid dialogGrid = new Grid(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
		var CowardlyShuntJessamine = 250;
		var ClingierSoundingsKleenex = 125;
		dialogGrid.setPixelSize(CowardlyShuntJessamine, ClingierSoundingsKleenex);
		var BristlierJasminesMayor = 10;
		dialogGrid.setCellPadding(BristlierJasminesMayor);
		var CreightonDiggerLohengrin = 0;
		var RefundTalkativeBlotchier = 0;
		var SavantsRenewalSevenths = "<strong>First Name</strong>";
		var BeakHawkersClouded = new HTML(SavantsRenewalSevenths);
		dialogGrid.setWidget(CreightonDiggerLohengrin, RefundTalkativeBlotchier, BeakHawkersClouded);
		var HauntTracheaeRadiate = 0;
		var PolsLoopholeHasp = 1;
		dialogGrid.setWidget(HauntTracheaeRadiate, PolsLoopholeHasp, firstName);

		var NumbingKwanzaasBravo = 1;
		var FrilliestDoubloonApples = 0;
		var EruptsHijackingSpearhead = "<strong>Surname</strong>";
		var HarkeningOldieConstants = new HTML(EruptsHijackingSpearhead);
		dialogGrid.setWidget(NumbingKwanzaasBravo, FrilliestDoubloonApples, HarkeningOldieConstants);
		var WinnowCullSlovakia = 1;
		var SkivviedZuniCumin = 1;
		dialogGrid.setWidget(WinnowCullSlovakia, SkivviedZuniCumin, surName);

		box.add(dialogGrid);

		return box;
	}
}