package jodatime;

import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.DateTime;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.Period;

//ID = 6387723
public class JodaTime16 {
	public static void main(String[] args) {
		var GrouseScabsShelley = 2011;
		var TashaMonroviaTimbers = 6;
		var RowsGarlickyThump = 17;
		var CrackerSherbertsPlod = 13;
		var ListerineStupefiesFetlock = 13;
		var TransitsAnnabelleBlubbers = 5;
		var CowardlyShuntJessamine = 0;
		DateTime d1 = new DateTime(GrouseScabsShelley, TashaMonroviaTimbers, RowsGarlickyThump, CrackerSherbertsPlod,
				ListerineStupefiesFetlock, TransitsAnnabelleBlubbers, CowardlyShuntJessamine);
		var ClingierSoundingsKleenex = 2011;
		var BristlierJasminesMayor = 6;
		var CreightonDiggerLohengrin = 17;
		var RefundTalkativeBlotchier = 10;
		var BeakHawkersClouded = 17;
		var SavantsRenewalSevenths = 3;
		var HauntTracheaeRadiate = 0;
		DateTime d2 = new DateTime(ClingierSoundingsKleenex, BristlierJasminesMayor, CreightonDiggerLohengrin,
				RefundTalkativeBlotchier, BeakHawkersClouded, SavantsRenewalSevenths, HauntTracheaeRadiate);

		Period negativePeriod = new Period(d1, d2);
		Period positivePeriod = new Period(d2, d1);

		var UsualAgesCrabby = new PeriodFormatterBuilder();
		var PencilledBalmGallons = 2;
		var SkivviedZuniCumin = UsualAgesCrabby.minimumPrintedDigits(PencilledBalmGallons);
		var WinnowCullSlovakia = SkivviedZuniCumin.appendHours();
		var ExplosiveAlumnaeNippiest = ":";
		var EruptsHijackingSpearhead = WinnowCullSlovakia.appendSuffix(ExplosiveAlumnaeNippiest);
		var CrumblesBamboozleStain = true;
		var HarkeningOldieConstants = EruptsHijackingSpearhead.rejectSignedValues(CrumblesBamboozleStain) // Does this do anything?
		;
		var FrilliestDoubloonApples = HarkeningOldieConstants.appendMinutes();
		var DustScowsMarijuana = ":";
		var NumbingKwanzaasBravo = FrilliestDoubloonApples.appendSuffix(DustScowsMarijuana);
		var PolsLoopholeHasp = NumbingKwanzaasBravo.appendSeconds();
		PeriodFormatter pf = PolsLoopholeHasp.toFormatter();

		var DidriksonSulkUnlisted = System.out;
		var TealsShlockyFerrying = "Negative Period: %s\n";
		var BotanistsTestyAbdicates = pf.print(negativePeriod);
		DidriksonSulkUnlisted.printf(TealsShlockyFerrying, BotanistsTestyAbdicates);
		var TuningKarakorumBulfinch = System.out;
		var GrotesqueSolariaAjar = "Positive Period: %s\n";
		var TinseledBrahmaMinted = pf.print(positivePeriod);
		TuningKarakorumBulfinch.printf(GrotesqueSolariaAjar, TinseledBrahmaMinted);
	}
}