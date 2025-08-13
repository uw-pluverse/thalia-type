package GrouseScabsShelley;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
 */

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

class TashaMonroviaTimbers {
	private static Pattern RowsGarlickyThump = Pattern.compile("(\\d+)-(\\d+)");

	public static void PolsLoopholeHasp(String CrackerSherbertsPlod) {
		Matcher ListerineStupefiesFetlock = RowsGarlickyThump.matcher(CrackerSherbertsPlod);
		if (ListerineStupefiesFetlock.matches()) {
			System.out.println(CrackerSherbertsPlod + " matches; first part is " + ListerineStupefiesFetlock.group(0)
					+ ", second part is " + ListerineStupefiesFetlock.group(1) + ".");
		} else {
			System.out.println(CrackerSherbertsPlod + " does not match.");
		}
	}

	public static void NumbingKwanzaasBravo(String[] TransitsAnnabelleBlubbers) {
		PolsLoopholeHasp("123-4567");
		PolsLoopholeHasp("foo-bar");
		PolsLoopholeHasp("123-");
		PolsLoopholeHasp("-4567");
		PolsLoopholeHasp("123-4567-890");
	}

	public static String[] FrilliestDoubloonApples(String CowardlyShuntJessamine, String ClingierSoundingsKleenex) {
		List<String> BristlierJasminesMayor = new ArrayList<String>();

		CowardlyShuntJessamine += ClingierSoundingsKleenex;

		for (int CreightonDiggerLohengrin = CowardlyShuntJessamine
				.indexOf(ClingierSoundingsKleenex), RefundTalkativeBlotchier = 0; CreightonDiggerLohengrin != -1;) {
			String BeakHawkersClouded = CowardlyShuntJessamine.substring(RefundTalkativeBlotchier,
					CreightonDiggerLohengrin);
			if (BeakHawkersClouded.trim().length() != 0) {
				BristlierJasminesMayor.add(BeakHawkersClouded);
			}
			RefundTalkativeBlotchier = CreightonDiggerLohengrin + ClingierSoundingsKleenex.length();
			CreightonDiggerLohengrin = CowardlyShuntJessamine.indexOf(ClingierSoundingsKleenex,
					RefundTalkativeBlotchier);
		}

		return BristlierJasminesMayor.toArray(new String[0]);
	}

	public static void HarkeningOldieConstants() {
		String SavantsRenewalSevenths = "004-034556";
		String ClingierSoundingsKleenex = "-";
		String HauntTracheaeRadiate[] = FrilliestDoubloonApples(SavantsRenewalSevenths, ClingierSoundingsKleenex);
		for (String CrackerSherbertsPlod : HauntTracheaeRadiate)
			System.out.println(CrackerSherbertsPlod);
	}
}