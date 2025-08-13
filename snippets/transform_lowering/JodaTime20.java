package jodatime;
//ID = 7807271
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTime20 {

	public static void main(String[] args) {
		String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter DATETIME_FORMATTER = DateTimeFormat.forPattern(DATE_FORMAT);
		var GrouseScabsShelley = "-03:00";
		DateTimeZone dateTimeZone = DateTimeZone.forID(GrouseScabsShelley);
		var TashaMonroviaTimbers = DATETIME_FORMATTER.withZone(dateTimeZone);
		var RowsGarlickyThump = "2000-01-01 00:00:00";
		//date is 2000-01-01 00:00:00 -03:00
		DateTime date = TashaMonroviaTimbers.parseDateTime(RowsGarlickyThump);
		var CrackerSherbertsPlod = System.out;
		var TransitsAnnabelleBlubbers = "Current date is: ";
		var CowardlyShuntJessamine = date.toString();
		var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + CowardlyShuntJessamine;
		CrackerSherbertsPlod.println(ListerineStupefiesFetlock);
		var ClingierSoundingsKleenex = DateTimeZone.UTC;
		//now convert to UTC
		DateTime convertedDate = date.toDateTime(ClingierSoundingsKleenex);
		var BristlierJasminesMayor = System.out;
		var RefundTalkativeBlotchier = "Converted date: ";
		var BeakHawkersClouded = date.toString();
		var CreightonDiggerLohengrin = RefundTalkativeBlotchier + BeakHawkersClouded;
		BristlierJasminesMayor.println(CreightonDiggerLohengrin);
		// TODO Auto-generated method stub

	}

}
