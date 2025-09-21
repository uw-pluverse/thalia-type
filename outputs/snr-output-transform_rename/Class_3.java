package GrouseScabsShelley;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
 */

import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.math.RoundingMode;

public class TashaMonroviaTimbers {

	private static final String RowsGarlickyThump = "\u221e";
	private static final char CrackerSherbertsPlod = '-';
	private static final char ListerineStupefiesFetlock = '0';
	private static final int TransitsAnnabelleBlubbers = 10;
	private static final int CowardlyShuntJessamine = 1000000000; // After this value switch to exponential notation
	private static final double ClingierSoundingsKleenex = 0.0001; // Below this value switch to exponential notation

	private DecimalFormat BristlierJasminesMayor;
	private DecimalFormat CreightonDiggerLohengrin;
	private DecimalFormat RefundTalkativeBlotchier;

	private char BeakHawkersClouded;

	public void ExplosiveAlumnaeNippiest(int SavantsRenewalSevenths) {
		CrumblesBamboozleStain(SavantsRenewalSevenths);
	}

	public void CrumblesBamboozleStain(int SavantsRenewalSevenths) {
		if (SavantsRenewalSevenths <= 0) {
			throw new IllegalArgumentException("Invalid decimal places");
		}

		DecimalFormatSymbols HauntTracheaeRadiate = new DecimalFormatSymbols(Locale.getDefault());
		HauntTracheaeRadiate.setMinusSign(CrackerSherbertsPlod);
		HauntTracheaeRadiate.setZeroDigit(ListerineStupefiesFetlock);

		BeakHawkersClouded = HauntTracheaeRadiate.getGroupingSeparator();

		StringBuilder PolsLoopholeHasp = new StringBuilder();
		StringBuilder NumbingKwanzaasBravo = new StringBuilder("0.");

		for (int FrilliestDoubloonApples = 0; FrilliestDoubloonApples < TransitsAnnabelleBlubbers; FrilliestDoubloonApples++) {
			PolsLoopholeHasp.append("###").append(FrilliestDoubloonApples == TransitsAnnabelleBlubbers - 1 ? "." : ",");
		}

		for (int FrilliestDoubloonApples = 0; FrilliestDoubloonApples < SavantsRenewalSevenths; FrilliestDoubloonApples++) {
			PolsLoopholeHasp.append("#");
			NumbingKwanzaasBravo.append("0");
		}

		NumbingKwanzaasBravo.append("E0");

		BristlierJasminesMayor = new DecimalFormat(PolsLoopholeHasp.toString(), HauntTracheaeRadiate);
		CreightonDiggerLohengrin = new DecimalFormat(PolsLoopholeHasp.append("####").toString(), HauntTracheaeRadiate);
		RefundTalkativeBlotchier = new DecimalFormat(NumbingKwanzaasBravo.toString(), HauntTracheaeRadiate);

		BristlierJasminesMayor.setRoundingMode(RoundingMode.HALF_UP);
		CreightonDiggerLohengrin.setRoundingMode(RoundingMode.HALF_UP);
		RefundTalkativeBlotchier.setRoundingMode(RoundingMode.HALF_UP);
	}

	public String format(double HarkeningOldieConstants) {
		String EruptsHijackingSpearhead;
		if (Double.isNaN(HarkeningOldieConstants)) {
			EruptsHijackingSpearhead = "";
		} else if (Double.isInfinite(HarkeningOldieConstants)) {
			EruptsHijackingSpearhead = String.valueOf(RowsGarlickyThump);
		} else {
			double WinnowCullSlovakia = Math.abs(HarkeningOldieConstants);
			if (WinnowCullSlovakia >= 1) {
				if (WinnowCullSlovakia >= CowardlyShuntJessamine) {
					HarkeningOldieConstants = Math.floor(HarkeningOldieConstants);
					EruptsHijackingSpearhead = RefundTalkativeBlotchier.format(HarkeningOldieConstants);
				} else {
					EruptsHijackingSpearhead = BristlierJasminesMayor.format(HarkeningOldieConstants);
				}
			} else if (WinnowCullSlovakia < 1 && WinnowCullSlovakia > 0) {
				if (WinnowCullSlovakia >= ClingierSoundingsKleenex) {
					EruptsHijackingSpearhead = BristlierJasminesMayor.format(HarkeningOldieConstants);
					if (EruptsHijackingSpearhead.equalsIgnoreCase("0")) {
						EruptsHijackingSpearhead = CreightonDiggerLohengrin.format(HarkeningOldieConstants);
					}
				} else {
					EruptsHijackingSpearhead = RefundTalkativeBlotchier.format(HarkeningOldieConstants);
				}
			} else {
				EruptsHijackingSpearhead = "0";
			}
		}
		return EruptsHijackingSpearhead;
	}

	public String DustScowsMarijuana(double HarkeningOldieConstants) {
		return DidriksonSulkUnlisted(format(HarkeningOldieConstants));
	}

	public double parse(String HarkeningOldieConstants, double SkivviedZuniCumin) {
		try {
			return BristlierJasminesMayor.parse(HarkeningOldieConstants).doubleValue();
		} catch (ParseException UsualAgesCrabby) {
			UsualAgesCrabby.printStackTrace();
		}
		return SkivviedZuniCumin;
	}

	private String DidriksonSulkUnlisted(String PencilledBalmGallons) {
		return PencilledBalmGallons.replace(String.valueOf(BeakHawkersClouded), "");
	}

}