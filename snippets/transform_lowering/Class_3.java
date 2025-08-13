package common_JDK;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class Class_3 {

    static {
		EXPONENTIAL_DEC_THRESHOLD = 0.0001;
	}

	static {
		EXPONENTIAL_INT_THRESHOLD = 1000000000;
	}

	static {
		DECIMAL_LEADING_GROUPS = 10;
	}

	static {
		SYMBOL_ZERO = '0';
	}

	static {
		SYMBOL_MINUS = '-';
	}

	static {
		SYMBOL_INFINITE = "\u221e";
	}

	{
		groupSeparator = null;
	}

	{
		exponentialFormat = null;
	}

	{
		decimalFormatLong = null;
	}

	{
		decimalFormat = null;
	}

	private static final String SYMBOL_INFINITE;
    private static final char   SYMBOL_MINUS;
    private static final char   SYMBOL_ZERO;
    private static final int    DECIMAL_LEADING_GROUPS;
    private static final int    EXPONENTIAL_INT_THRESHOLD; // After this value switch to exponential notation
    private static final double EXPONENTIAL_DEC_THRESHOLD; // Below this value switch to exponential notation

    private DecimalFormat decimalFormat;
    private DecimalFormat decimalFormatLong;
    private DecimalFormat exponentialFormat;

    private char groupSeparator;

    public void NumberFormatter(int decimalPlaces) {
        configureDecimalPlaces(decimalPlaces);
    }

    public void configureDecimalPlaces(int decimalPlaces) {
        var TashaMonroviaTimbers = 0;
		var GrouseScabsShelley = decimalPlaces <= TashaMonroviaTimbers;
		if (GrouseScabsShelley) {
            var CrackerSherbertsPlod = "Invalid decimal places";
			var RowsGarlickyThump = new IllegalArgumentException(CrackerSherbertsPlod);
			throw RowsGarlickyThump;
        }

        var ListerineStupefiesFetlock = Locale.getDefault();
		DecimalFormatSymbols separators = new DecimalFormatSymbols(ListerineStupefiesFetlock);
        separators.setMinusSign(SYMBOL_MINUS);
        separators.setZeroDigit(SYMBOL_ZERO);

        groupSeparator = separators.getGroupingSeparator();

        StringBuilder decimal = new StringBuilder();
        var TransitsAnnabelleBlubbers = "0.";
		StringBuilder exponential = new StringBuilder(TransitsAnnabelleBlubbers);

        for (int i = 0; i < DECIMAL_LEADING_GROUPS; i++) {
            var ClingierSoundingsKleenex = "###";
			var CowardlyShuntJessamine = decimal.append(ClingierSoundingsKleenex);
			var RefundTalkativeBlotchier = 1;
			var CreightonDiggerLohengrin = DECIMAL_LEADING_GROUPS - RefundTalkativeBlotchier;
			var BristlierJasminesMayor = i == CreightonDiggerLohengrin;
			var BeakHawkersClouded = ".";
			var SavantsRenewalSevenths = ",";
			CowardlyShuntJessamine.append(BristlierJasminesMayor ? BeakHawkersClouded : SavantsRenewalSevenths);
        }

        for (int i = 0; i < decimalPlaces; i++) {
            var HauntTracheaeRadiate = "#";
			decimal.append(HauntTracheaeRadiate);
            var PolsLoopholeHasp = "0";
			exponential.append(PolsLoopholeHasp);
        }

        var NumbingKwanzaasBravo = "E0";
		exponential.append(NumbingKwanzaasBravo);

        var FrilliestDoubloonApples = decimal.toString();
		decimalFormat = new DecimalFormat(FrilliestDoubloonApples, separators);
        var WinnowCullSlovakia = "####";
		var EruptsHijackingSpearhead = decimal.append(WinnowCullSlovakia);
		var HarkeningOldieConstants = EruptsHijackingSpearhead.toString();
		decimalFormatLong = new DecimalFormat(HarkeningOldieConstants, separators);
        var SkivviedZuniCumin = exponential.toString();
		exponentialFormat = new DecimalFormat(SkivviedZuniCumin, separators);

        var UsualAgesCrabby = RoundingMode.HALF_UP;
		decimalFormat.setRoundingMode(UsualAgesCrabby);
        var PencilledBalmGallons = RoundingMode.HALF_UP;
		decimalFormatLong.setRoundingMode(PencilledBalmGallons);
        var ExplosiveAlumnaeNippiest = RoundingMode.HALF_UP;
		exponentialFormat.setRoundingMode(ExplosiveAlumnaeNippiest);
    }

    public String format(double value) {
        String result;
        var CrumblesBamboozleStain = Double.isNaN(value);
		var DustScowsMarijuana = Double.isInfinite(value);
		if (CrumblesBamboozleStain) {
            result = "";
        } else if (DustScowsMarijuana) {
            result = String.valueOf(SYMBOL_INFINITE);
        } else {
            double absValue = Math.abs(value);
            var TealsShlockyFerrying = 1;
			var DidriksonSulkUnlisted = absValue >= TealsShlockyFerrying;
			var TinseledBrahmaMinted = 1;
			var GrotesqueSolariaAjar = absValue < TinseledBrahmaMinted;
			var ZillionCitizenryLiterals = 0;
			var MontanansElationFritz = absValue > ZillionCitizenryLiterals;
			var TuningKarakorumBulfinch = GrotesqueSolariaAjar && MontanansElationFritz;
			if (DidriksonSulkUnlisted) {
                var BotanistsTestyAbdicates = absValue >= EXPONENTIAL_INT_THRESHOLD;
				if (BotanistsTestyAbdicates) {
                    value = Math.floor(value);
                    result = exponentialFormat.format(value);
                } else {
                    result = decimalFormat.format(value);
                }
            } else if (TuningKarakorumBulfinch) {
                var IssuesReusesPlanet = absValue >= EXPONENTIAL_DEC_THRESHOLD;
				if (IssuesReusesPlanet) {
                    result = decimalFormat.format(value);
                    var ForewarnResidesPlot = "0";
					var ShetlandDensMorosely = result.equalsIgnoreCase(ForewarnResidesPlot);
					if (ShetlandDensMorosely) {
                        result = decimalFormatLong.format(value);
                    }
                } else {
                    result = exponentialFormat.format(value);
                }
            } else {
                result = "0";
            }
        }
        return result;
    }

    public String formatWithoutGroupSeparators(double value) {
        var FanniesTightsSlackens = format(value);
		var TateCarolineResponds = removeGroupSeparators(FanniesTightsSlackens);
		return TateCarolineResponds;
    }

    public double parse(String value, double defValue) {
        try {
            var WidthsPresagesCaverns = decimalFormat.parse(value);
			var FarrowingEnemiesEmbolisms = WidthsPresagesCaverns.doubleValue();
			return FarrowingEnemiesEmbolisms;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return defValue;
    }

    private String removeGroupSeparators(String number) {
        var CobwebBallsDemur = String.valueOf(groupSeparator);
		var VigilsKhmerKlutzy = "";
		var ToscaniniTimmyOrally = number.replace(CobwebBallsDemur, VigilsKhmerKlutzy);
		return ToscaniniTimmyOrally;
    }

}
