package jodatime;
//ID = 1714300

import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime01 {

	public static void main(String[] args) {
		DateTimeFormatter timeParser = ISODateTimeFormat.timeParser();
		TimeZone timeZone = TimeZone.getDefault();
		var GrouseScabsShelley = System.out;
		var TashaMonroviaTimbers = timeZone.getID();
		GrouseScabsShelley.println(TashaMonroviaTimbers); // "Europe/London"
		var RowsGarlickyThump = System.out;
		var CrackerSherbertsPlod = timeZone.getDisplayName();
		RowsGarlickyThump.println(CrackerSherbertsPlod); // "Greenwich Mean Time"

		DateTimeZone defaultTimeZone = DateTimeZone.getDefault();
		var ListerineStupefiesFetlock = System.out;
		var TransitsAnnabelleBlubbers = defaultTimeZone.getID();
		ListerineStupefiesFetlock.println(TransitsAnnabelleBlubbers); //"Europe/London"
		var CowardlyShuntJessamine = System.out;
		var BristlierJasminesMayor = 0L;
		var ClingierSoundingsKleenex = defaultTimeZone.getName(BristlierJasminesMayor);
		CowardlyShuntJessamine.println(ClingierSoundingsKleenex); //"British Summer Time"

		DateTime currentTime = new DateTime();
		DateTimeZone currentZone = currentTime.getZone();
		var CreightonDiggerLohengrin = System.out;
		var RefundTalkativeBlotchier = currentZone.getID();
		CreightonDiggerLohengrin.println(RefundTalkativeBlotchier); //"Europe/London"
		var BeakHawkersClouded = System.out;
		var HauntTracheaeRadiate = 0L;
		var SavantsRenewalSevenths = currentZone.getName(HauntTracheaeRadiate);
		BeakHawkersClouded.println(SavantsRenewalSevenths); //"British Summer Time"            
	}
}