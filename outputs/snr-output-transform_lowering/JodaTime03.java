package jodatime;
//ID = 2092883

import org.joda.time.Interval;
import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.format.PeriodFormatter;

public class JodaTime03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String formatDuration(long start, long end) {
		Interval interval = new Interval(start, end);
		var RowsGarlickyThump = getPeriodFormatter();
		var CrackerSherbertsPlod = interval.toPeriod();
		var TashaMonroviaTimbers = RowsGarlickyThump.print(CrackerSherbertsPlod);
		var GrouseScabsShelley = TashaMonroviaTimbers.trim();
		return GrouseScabsShelley;
	}

	private static PeriodFormatter getPeriodFormatter() {
		var HarkeningOldieConstants = new PeriodFormatterBuilder();
		var FrilliestDoubloonApples = HarkeningOldieConstants.printZeroRarelyFirst();
		var NumbingKwanzaasBravo = FrilliestDoubloonApples.appendYears();
		var EruptsHijackingSpearhead = "y ";
		var WinnowCullSlovakia = "y ";
		var PolsLoopholeHasp = NumbingKwanzaasBravo.appendSuffix(EruptsHijackingSpearhead, WinnowCullSlovakia);
		var HauntTracheaeRadiate = PolsLoopholeHasp.appendMonths();
		var SkivviedZuniCumin = "m";
		var UsualAgesCrabby = "m ";
		var SavantsRenewalSevenths = HauntTracheaeRadiate.appendSuffix(SkivviedZuniCumin, UsualAgesCrabby);
		var BeakHawkersClouded = SavantsRenewalSevenths.appendDays();
		var PencilledBalmGallons = "d ";
		var ExplosiveAlumnaeNippiest = "d ";
		var RefundTalkativeBlotchier = BeakHawkersClouded.appendSuffix(PencilledBalmGallons, ExplosiveAlumnaeNippiest);
		var CreightonDiggerLohengrin = RefundTalkativeBlotchier.appendHours();
		var CrumblesBamboozleStain = "h ";
		var DustScowsMarijuana = "h ";
		var BristlierJasminesMayor = CreightonDiggerLohengrin.appendSuffix(CrumblesBamboozleStain, DustScowsMarijuana);
		var ClingierSoundingsKleenex = BristlierJasminesMayor.appendMinutes();
		var DidriksonSulkUnlisted = "m ";
		var TealsShlockyFerrying = "m ";
		var CowardlyShuntJessamine = ClingierSoundingsKleenex.appendSuffix(DidriksonSulkUnlisted, TealsShlockyFerrying);
		var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.appendSeconds();
		var BotanistsTestyAbdicates = "s ";
		var TuningKarakorumBulfinch = "s ";
		var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.appendSuffix(BotanistsTestyAbdicates,
				TuningKarakorumBulfinch);
		PeriodFormatter pf = ListerineStupefiesFetlock.toFormatter();

		return pf;
	}
}