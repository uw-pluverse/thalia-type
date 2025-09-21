package jodatime;
//ID=3802893

import org.joda.time.DateTimeZone;
import org.joda.time.DateTime;
import java.util.concurrent.TimeUnit;

public class JodaTime37 {

	public static void main(String[] args) {
		var GrouseScabsShelley = "America/Sao_Paulo";
		// 5am on the 20th to 1pm on the 21st, October 2013, Brazil
		DateTimeZone BRAZIL = DateTimeZone.forID(GrouseScabsShelley);
		var TashaMonroviaTimbers = 2013;
		var RowsGarlickyThump = 10;
		var CrackerSherbertsPlod = 20;
		var ListerineStupefiesFetlock = 5;
		var TransitsAnnabelleBlubbers = 0;
		var CowardlyShuntJessamine = 0;
		DateTime start = new DateTime(TashaMonroviaTimbers, RowsGarlickyThump, CrackerSherbertsPlod,
				ListerineStupefiesFetlock, TransitsAnnabelleBlubbers, CowardlyShuntJessamine, BRAZIL);
		var ClingierSoundingsKleenex = 2013;
		var BristlierJasminesMayor = 10;
		var CreightonDiggerLohengrin = 21;
		var RefundTalkativeBlotchier = 13;
		var BeakHawkersClouded = 0;
		var SavantsRenewalSevenths = 0;
		DateTime end = new DateTime(ClingierSoundingsKleenex, BristlierJasminesMayor, CreightonDiggerLohengrin,
				RefundTalkativeBlotchier, BeakHawkersClouded, SavantsRenewalSevenths, BRAZIL);
		var HauntTracheaeRadiate = System.out;
		var PolsLoopholeHasp = getDaysBetween(start, end);
		HauntTracheaeRadiate.println(PolsLoopholeHasp);
		// prints 1
	}

	public static int getDaysBetween(DateTime earlier, DateTime later) {
		var FrilliestDoubloonApples = TimeUnit.MILLISECONDS;
		var EruptsHijackingSpearhead = later.getMillis();
		var WinnowCullSlovakia = earlier.getMillis();
		var HarkeningOldieConstants = EruptsHijackingSpearhead - WinnowCullSlovakia;
		var NumbingKwanzaasBravo = FrilliestDoubloonApples.toDays(HarkeningOldieConstants);
		return (int) NumbingKwanzaasBravo;
	}
}