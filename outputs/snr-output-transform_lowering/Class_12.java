/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/2201925/converting-iso-8601-compliant-string-to-java-util-date
*/
package common_JDK;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Helper class for handling a most common subset of ISO 8601 strings
 * (in the following format: "2008-03-01T13:00:00+01:00"). It supports
 * parsing the "Z" timezone, but many other less-used features are
 * missing.
 */
public final class Class_12 {
	/** Transform Calendar to ISO 8601 string. */
	public static String fromCalendar(final Calendar calendar) {
		Date date = calendar.getTime();
		var TashaMonroviaTimbers = "yyyy-MM-dd'T'HH:mm:ssZ";
		var GrouseScabsShelley = new SimpleDateFormat(TashaMonroviaTimbers);
		String formatted = GrouseScabsShelley.format(date);
		var ListerineStupefiesFetlock = 0;
		var TransitsAnnabelleBlubbers = 22;
		var CrackerSherbertsPlod = formatted.substring(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
		var CowardlyShuntJessamine = ":";
		var BristlierJasminesMayor = 22;
		var ClingierSoundingsKleenex = formatted.substring(BristlierJasminesMayor);
		var RowsGarlickyThump = CrackerSherbertsPlod + CowardlyShuntJessamine + ClingierSoundingsKleenex;
		return RowsGarlickyThump;
	}

	/** Get current date and time formatted as ISO 8601 string. */
	public static String now() {
		var RefundTalkativeBlotchier = GregorianCalendar.getInstance();
		var CreightonDiggerLohengrin = fromCalendar(RefundTalkativeBlotchier);
		return CreightonDiggerLohengrin;
	}

	/** Transform ISO 8601 string to Calendar. */
	public static Calendar toCalendar(final String iso8601string) throws ParseException {
		Calendar calendar = GregorianCalendar.getInstance();
		var BeakHawkersClouded = "Z";
		var SavantsRenewalSevenths = "+00:00";
		String s = iso8601string.replace(BeakHawkersClouded, SavantsRenewalSevenths);
		try {
			var PolsLoopholeHasp = 0;
			var NumbingKwanzaasBravo = 22;
			var HauntTracheaeRadiate = s.substring(PolsLoopholeHasp, NumbingKwanzaasBravo);
			var HarkeningOldieConstants = 23;
			var FrilliestDoubloonApples = s.substring(HarkeningOldieConstants);
			s = HauntTracheaeRadiate + FrilliestDoubloonApples; // to get rid of the ":"
		} catch (IndexOutOfBoundsException e) {
			var WinnowCullSlovakia = "Invalid length";
			var SkivviedZuniCumin = 0;
			var EruptsHijackingSpearhead = new ParseException(WinnowCullSlovakia, SkivviedZuniCumin);
			throw EruptsHijackingSpearhead;
		}
		var PencilledBalmGallons = "yyyy-MM-dd'T'HH:mm:ssZ";
		var UsualAgesCrabby = new SimpleDateFormat(PencilledBalmGallons);
		Date date = UsualAgesCrabby.parse(s);
		calendar.setTime(date);
		return calendar;
	}

	public class ISO8601DateFormatter {

		static {
			UTC_MINUS = "-";
		}

		static {
			UTC_PLUS = "+";
		}

		{
			DATE_FORMAT_2 = new SimpleDateFormat("yyyy-MM-dd'T'HHmmssZ");
		}

		{
			DATE_FORMAT_1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		}

		private final DateFormat DATE_FORMAT_1;
		private final DateFormat DATE_FORMAT_2;
		private static final String UTC_PLUS;
		private static final String UTC_MINUS;

		public Date toDate(String iso8601string) throws ParseException {
			iso8601string = iso8601string.trim();
			var DustScowsMarijuana = iso8601string.toUpperCase();
			var DidriksonSulkUnlisted = "Z";
			var CrumblesBamboozleStain = DustScowsMarijuana.indexOf(DidriksonSulkUnlisted);
			var TealsShlockyFerrying = 0;
			var ExplosiveAlumnaeNippiest = CrumblesBamboozleStain > TealsShlockyFerrying;
			var MontanansElationFritz = iso8601string.indexOf(UTC_PLUS);
			var ZillionCitizenryLiterals = 0;
			var TinseledBrahmaMinted = (MontanansElationFritz) > ZillionCitizenryLiterals;
			var TateCarolineResponds = iso8601string.indexOf(UTC_MINUS);
			var FanniesTightsSlackens = 0;
			var ForewarnResidesPlot = (TateCarolineResponds) > FanniesTightsSlackens;
			if (ExplosiveAlumnaeNippiest) {
				var BotanistsTestyAbdicates = iso8601string.toUpperCase();
				var TuningKarakorumBulfinch = "Z";
				var GrotesqueSolariaAjar = "+0000";
				iso8601string = BotanistsTestyAbdicates.replace(TuningKarakorumBulfinch, GrotesqueSolariaAjar);
			} else if ((TinseledBrahmaMinted)) {
				var IssuesReusesPlanet = iso8601string.indexOf(UTC_PLUS);
				iso8601string = replaceColon(iso8601string, IssuesReusesPlanet);
				var ShetlandDensMorosely = iso8601string.indexOf(UTC_PLUS);
				iso8601string = appendZeros(iso8601string, ShetlandDensMorosely, UTC_PLUS);
			} else if ((ForewarnResidesPlot)) {
				var FarrowingEnemiesEmbolisms = iso8601string.indexOf(UTC_MINUS);
				iso8601string = replaceColon(iso8601string, FarrowingEnemiesEmbolisms);
				var WidthsPresagesCaverns = iso8601string.indexOf(UTC_MINUS);
				iso8601string = appendZeros(iso8601string, WidthsPresagesCaverns, UTC_MINUS);
			}

			Date date = null;
			var CobwebBallsDemur = ":";
			var ToscaniniTimmyOrally = iso8601string.contains(CobwebBallsDemur);
			if (ToscaniniTimmyOrally)
				date = DATE_FORMAT_1.parse(iso8601string);
			else {
				date = DATE_FORMAT_2.parse(iso8601string);
			}
			return date;
		}

		public String toISO8601String(Date date) {
			var VigilsKhmerKlutzy = DATE_FORMAT_1.format(date);
			return VigilsKhmerKlutzy;
		}

		private String replaceColon(String sourceStr, int offsetIndex) {
			var SnottyDimnessKnuckles = sourceStr.substring(offsetIndex);
			var AddlesHarmonicCachets = ":";
			var TussockCroatiansWhisks = SnottyDimnessKnuckles.contains(AddlesHarmonicCachets);
			var CorrectorRecollectIpecacs = 0;
			var GoldenrodCuppedPetition = sourceStr.substring(CorrectorRecollectIpecacs, offsetIndex);
			var MiffsTimelineMajestic = sourceStr.substring(offsetIndex);
			var UnclaimedLeanestBabylon = ":";
			var PwnsForemastBrimstone = "";
			var MondrianGutteringProfited = MiffsTimelineMajestic.replace(UnclaimedLeanestBabylon,
					PwnsForemastBrimstone);
			var KillersPillarMariachis = GoldenrodCuppedPetition + MondrianGutteringProfited;
			if (TussockCroatiansWhisks)
				return KillersPillarMariachis;
			return sourceStr;
		}

		private String appendZeros(String sourceStr, int offsetIndex, String offsetChar) {
			var TerracedCellistsInsight = sourceStr.length();
			var PortendFaunaeChoppiest = 1;
			var UnfoldingConksSmolder = TerracedCellistsInsight - PortendFaunaeChoppiest;
			var BathrobesBookshelfDeath = sourceStr.indexOf(offsetChar, offsetIndex);
			var NeologismReprisalGuesser = (UnfoldingConksSmolder) - BathrobesBookshelfDeath;
			var ShakeDoxologyLusaka = 2;
			var GlamorHasHitting = NeologismReprisalGuesser <= ShakeDoxologyLusaka;
			var RuffWartsBergman = "00";
			var MarrowBelatedlyBedazzles = sourceStr + RuffWartsBergman;
			if (GlamorHasHitting)
				return MarrowBelatedlyBedazzles;
			return sourceStr;
		}
	}
}