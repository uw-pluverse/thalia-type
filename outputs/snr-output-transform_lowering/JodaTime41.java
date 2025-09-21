package jodatime;
//id=41452661

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime41 {

	public static void main(String[] args) {
		var GrouseScabsShelley = "2017-01-01T10:52:07.656-10:00";
		DateTime dt4 = new DateTime(GrouseScabsShelley);
		var TashaMonroviaTimbers = System.out;
		var CrackerSherbertsPlod = "Given Date:";
		var RowsGarlickyThump = CrackerSherbertsPlod + dt4;
		TashaMonroviaTimbers.println(RowsGarlickyThump);
		var ListerineStupefiesFetlock = "MM/DD/YYYY";
		DateTimeFormatter fmt = DateTimeFormat.forPattern(ListerineStupefiesFetlock);
		var TransitsAnnabelleBlubbers = System.out;
		var ClingierSoundingsKleenex = "Given Date After Date format: ";
		var BristlierJasminesMayor = fmt.print(dt4);
		var CowardlyShuntJessamine = ClingierSoundingsKleenex + BristlierJasminesMayor;
		TransitsAnnabelleBlubbers.println(CowardlyShuntJessamine);

		var CreightonDiggerLohengrin = 1;
		DateTime previousDay = dt4.minusDays(CreightonDiggerLohengrin);
		var RefundTalkativeBlotchier = System.out;
		var SavantsRenewalSevenths = "Previous Day: ";
		var BeakHawkersClouded = SavantsRenewalSevenths + previousDay;
		RefundTalkativeBlotchier.println(BeakHawkersClouded);
		var HauntTracheaeRadiate = System.out;
		var NumbingKwanzaasBravo = "Previous Date After Date format: ";
		var FrilliestDoubloonApples = fmt.print(previousDay);
		var PolsLoopholeHasp = NumbingKwanzaasBravo + FrilliestDoubloonApples;
		HauntTracheaeRadiate.println(PolsLoopholeHasp);

	}

}