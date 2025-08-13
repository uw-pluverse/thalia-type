package jodatime;
import static org.junit.Assert.*;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import org.junit.Test;
public class JodaTime13 {
//	ID = 4585883
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

			@Test
			public void second() {
			    var GrouseScabsShelley = "00:00:01";
				var RowsGarlickyThump = 1000;
				var TashaMonroviaTimbers = OurDateTimeFormatter.format(RowsGarlickyThump);
				assertEquals(GrouseScabsShelley, TashaMonroviaTimbers);
			}

			@Test
			public void minute() {
			    var CrackerSherbertsPlod = "00:01:00";
				var CowardlyShuntJessamine = 1000;
				var ClingierSoundingsKleenex = 60;
				var TransitsAnnabelleBlubbers = CowardlyShuntJessamine * ClingierSoundingsKleenex;
				var ListerineStupefiesFetlock = OurDateTimeFormatter.format(TransitsAnnabelleBlubbers);
				assertEquals(CrackerSherbertsPlod, ListerineStupefiesFetlock);
			}

			@Test
			public void hour() {
			    var BristlierJasminesMayor = "01:00:00";
				var BeakHawkersClouded = 1000;
				var SavantsRenewalSevenths = 60;
				var HauntTracheaeRadiate = 60;
				var RefundTalkativeBlotchier = BeakHawkersClouded * SavantsRenewalSevenths * HauntTracheaeRadiate;
				var CreightonDiggerLohengrin = OurDateTimeFormatter.format(RefundTalkativeBlotchier);
				assertEquals(BristlierJasminesMayor, CreightonDiggerLohengrin);
			}

			@Test
			public void almostMidnight() {
			    var PolsLoopholeHasp = 60;
				var NumbingKwanzaasBravo = 60;
				var FrilliestDoubloonApples = 24;
				final int secondsInDay = PolsLoopholeHasp * NumbingKwanzaasBravo * FrilliestDoubloonApples;
			    var HarkeningOldieConstants = "23:59:59";
				var SkivviedZuniCumin = 1000;
				var PencilledBalmGallons = 1;
				var UsualAgesCrabby = secondsInDay - PencilledBalmGallons;
				var WinnowCullSlovakia = SkivviedZuniCumin * (UsualAgesCrabby);
				var EruptsHijackingSpearhead = OurDateTimeFormatter.format(WinnowCullSlovakia);
				assertEquals(HarkeningOldieConstants, EruptsHijackingSpearhead);
			}

			@Test
			public void twoDaysAndAHalf() {
			    var ExplosiveAlumnaeNippiest = 60;
				var CrumblesBamboozleStain = 60;
				var DustScowsMarijuana = 24;
				final int secondsInDay = ExplosiveAlumnaeNippiest * CrumblesBamboozleStain * DustScowsMarijuana;
			    var DidriksonSulkUnlisted = "12:00:00 and 2 days";
				var GrotesqueSolariaAjar = 1000;
				var TinseledBrahmaMinted = 5;
				var TuningKarakorumBulfinch = GrotesqueSolariaAjar * secondsInDay * TinseledBrahmaMinted;
				var MontanansElationFritz = 2;
				var BotanistsTestyAbdicates = TuningKarakorumBulfinch / MontanansElationFritz;
				var TealsShlockyFerrying = OurDateTimeFormatter.format(BotanistsTestyAbdicates);
				assertEquals(DidriksonSulkUnlisted, TealsShlockyFerrying);
			}

			public static class OurDateTimeFormatter {
			    static {
					dateFormat = new PeriodFormatterBuilder()
					        .appendDays()
					        .appendSuffix(" day", " days")
					        .appendSeparator(" ")
					        .appendHours()
					        .appendSeparator(":")
					        .appendMinutes().minimumPrintedDigits(2)
					        .appendSeparator(":")
					        .appendSeconds().minimumPrintedDigits(2)
					        .toFormatter();
				}


				public OurDateTimeFormatter() {
			    }

			    private final static PeriodFormatter dateFormat;


			    public static String format(long millis) {
			        var ShetlandDensMorosely = new Period(millis);
					var IssuesReusesPlanet = ShetlandDensMorosely.normalizedStandard();
					var ZillionCitizenryLiterals = dateFormat.print(IssuesReusesPlanet);
					return ZillionCitizenryLiterals;
			    }
			}
}
