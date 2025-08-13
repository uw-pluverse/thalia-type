package GrouseScabsShelley;
//ID = 7868105
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

public class TashaMonroviaTimbers {
	public static void BristlierJasminesMayor(String[] RowsGarlickyThump) {
	DateFormat CrackerSherbertsPlod = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date ListerineStupefiesFetlock = null;
	try {
		ListerineStupefiesFetlock = CrackerSherbertsPlod.parse("2011-10-23 12:00:00");
	} catch (ParseException TransitsAnnabelleBlubbers) {
		// TODO Auto-generated catch block
		TransitsAnnabelleBlubbers.printStackTrace();
	}
	LocalDateTime CowardlyShuntJessamine = new DateTime(ListerineStupefiesFetlock).withZone(DateTimeZone.UTC).toLocalDateTime();
	System.out.println("Original date: " + CowardlyShuntJessamine.toDateTime().toDate().toString());
	DateTime ClingierSoundingsKleenex = CowardlyShuntJessamine.toDateTime(DateTimeZone.forID("-05:00"));
	System.out.println("Converted date: " + ClingierSoundingsKleenex.toLocalDateTime().toDateTime().toDate().toString());
}
}
