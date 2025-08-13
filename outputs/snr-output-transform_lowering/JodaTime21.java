package jodatime;
//ID = 7868105

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.DateTime;
import java.sql.Date;
import java.text.ParseException;

public class JodaTime21 {
	public static void main(String[] args) {
		var GrouseScabsShelley = "yyyy-MM-dd HH:mm:ss";
		DateFormat formatter = new SimpleDateFormat(GrouseScabsShelley);
		Date dt = null;
		try {
			var TashaMonroviaTimbers = "2011-10-23 12:00:00";
			dt = formatter.parse(TashaMonroviaTimbers);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		var CrackerSherbertsPlod = new DateTime(dt);
		var ListerineStupefiesFetlock = DateTimeZone.UTC;
		var RowsGarlickyThump = CrackerSherbertsPlod.withZone(ListerineStupefiesFetlock);
		LocalDateTime ldt = RowsGarlickyThump.toLocalDateTime();
		var TransitsAnnabelleBlubbers = System.out;
		var ClingierSoundingsKleenex = "Original date: ";
		var RefundTalkativeBlotchier = ldt.toDateTime();
		var CreightonDiggerLohengrin = RefundTalkativeBlotchier.toDate();
		var BristlierJasminesMayor = CreightonDiggerLohengrin.toString();
		var CowardlyShuntJessamine = ClingierSoundingsKleenex + BristlierJasminesMayor;
		TransitsAnnabelleBlubbers.println(CowardlyShuntJessamine);
		var SavantsRenewalSevenths = "-05:00";
		var BeakHawkersClouded = DateTimeZone.forID(SavantsRenewalSevenths);
		DateTime cvtldt = ldt.toDateTime(BeakHawkersClouded);
		var HauntTracheaeRadiate = System.out;
		var NumbingKwanzaasBravo = "Converted date: ";
		var WinnowCullSlovakia = cvtldt.toLocalDateTime();
		var EruptsHijackingSpearhead = WinnowCullSlovakia.toDateTime();
		var HarkeningOldieConstants = EruptsHijackingSpearhead.toDate();
		var FrilliestDoubloonApples = HarkeningOldieConstants.toString();
		var PolsLoopholeHasp = NumbingKwanzaasBravo + FrilliestDoubloonApples;
		HauntTracheaeRadiate.println(PolsLoopholeHasp);
	}
}