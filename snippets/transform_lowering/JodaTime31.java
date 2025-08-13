package jodatime;

import org.joda.time.DateTime;
import org.joda.time.Weeks;

//ID = 9543331
public class JodaTime31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var TashaMonroviaTimbers = "1330573027000";
		var GrouseScabsShelley = Long.parseLong(TashaMonroviaTimbers);
		DateTime s = new DateTime(GrouseScabsShelley); // 2012-02-29
		var CrackerSherbertsPlod = "1331005027000";
		var RowsGarlickyThump = Long.parseLong(CrackerSherbertsPlod);
		DateTime e = new DateTime(RowsGarlickyThump); // 2012-03-05   

		var ListerineStupefiesFetlock = Weeks.weeksBetween(s, e);
		var TransitsAnnabelleBlubbers = 1;
		Weeks weeks = ListerineStupefiesFetlock.plus(TransitsAnnabelleBlubbers);
		var ClingierSoundingsKleenex = "1330659427000";
		var CowardlyShuntJessamine = Long.parseLong(ClingierSoundingsKleenex);
		DateTime start = new DateTime(CowardlyShuntJessamine);
		var CreightonDiggerLohengrin = "1530659427000";
		var BristlierJasminesMayor = Long.parseLong(CreightonDiggerLohengrin);
		DateTime end = new DateTime(BristlierJasminesMayor);
		var RefundTalkativeBlotchier = start.dayOfWeek();
		DateTime finalStart = RefundTalkativeBlotchier.withMinimumValue();

		var BeakHawkersClouded = end.dayOfWeek();
		DateTime finalEnd   = BeakHawkersClouded.withMaximumValue();
	}

}
