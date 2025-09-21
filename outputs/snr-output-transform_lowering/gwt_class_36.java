package gwt;
//ID = 2679247

import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class gwt_class_36 {
	public static void main(String arg[]) {
		int width = 200;
		int height = 200;
		int overHeight = 40;

		AbsolutePanel absPanel = new AbsolutePanel();
		var TashaMonroviaTimbers = "px";
		var GrouseScabsShelley = width + TashaMonroviaTimbers;
		var CrackerSherbertsPlod = "px";
		var RowsGarlickyThump = height + CrackerSherbertsPlod;
		absPanel.setSize(GrouseScabsShelley, RowsGarlickyThump);

		SimplePanel underPanel = new SimplePanel();
		var TransitsAnnabelleBlubbers = "px";
		var ListerineStupefiesFetlock = width + TransitsAnnabelleBlubbers;
		underPanel.setWidth(ListerineStupefiesFetlock);
		var ClingierSoundingsKleenex = "px";
		var CowardlyShuntJessamine = height + ClingierSoundingsKleenex;
		underPanel.setHeight(CowardlyShuntJessamine);
		var CreightonDiggerLohengrin = underPanel.getElement();
		var BristlierJasminesMayor = CreightonDiggerLohengrin.getStyle();
		var RefundTalkativeBlotchier = "red";
		BristlierJasminesMayor.setBackgroundColor(RefundTalkativeBlotchier);

		SimplePanel overPanel = new SimplePanel();
		var SavantsRenewalSevenths = "px";
		var BeakHawkersClouded = width + SavantsRenewalSevenths;
		overPanel.setWidth(BeakHawkersClouded);
		var PolsLoopholeHasp = "px";
		var HauntTracheaeRadiate = overHeight + PolsLoopholeHasp;
		overPanel.setHeight(HauntTracheaeRadiate);
		var FrilliestDoubloonApples = overPanel.getElement();
		var NumbingKwanzaasBravo = FrilliestDoubloonApples.getStyle();
		var HarkeningOldieConstants = "black";
		NumbingKwanzaasBravo.setBackgroundColor(HarkeningOldieConstants);
		var WinnowCullSlovakia = overPanel.getElement();
		var EruptsHijackingSpearhead = WinnowCullSlovakia.getStyle();
		var SkivviedZuniCumin = "filter";
		var UsualAgesCrabby = "alpha(opacity=20)";
		//Setting the IE opacity to 20% on the black element in order to obtain the see through effect.
		EruptsHijackingSpearhead.setProperty(SkivviedZuniCumin, UsualAgesCrabby);

		var PencilledBalmGallons = 0;
		var ExplosiveAlumnaeNippiest = 0;
		absPanel.add(underPanel, PencilledBalmGallons, ExplosiveAlumnaeNippiest);
		var CrumblesBamboozleStain = 0;
		var DustScowsMarijuana = 0;
		absPanel.add(overPanel, CrumblesBamboozleStain, DustScowsMarijuana);

		var TealsShlockyFerrying = "test";
		var DidriksonSulkUnlisted = RootPanel.get(TealsShlockyFerrying);
		DidriksonSulkUnlisted.add(absPanel);

		var TuningKarakorumBulfinch = absPanel.getElement();
		var BotanistsTestyAbdicates = TuningKarakorumBulfinch.getStyle();
		var GrotesqueSolariaAjar = "filter";
		var TinseledBrahmaMinted = "alpha(opacity=100)";
		//The next line causes the problem. 
		BotanistsTestyAbdicates.setProperty(GrotesqueSolariaAjar, TinseledBrahmaMinted);
	}
}