package GrouseScabsShelley;
//20331163
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class TashaMonroviaTimbers {

	public static void CowardlyShuntJessamine(String[] RowsGarlickyThump) {
		// TODO Auto-generated method stub
		String CrackerSherbertsPlod = "11/15/2013 08:00:00";
		// Format for input
		DateTimeFormatter ListerineStupefiesFetlock = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
		// Parsing the date
		DateTime GrouseScabsShelley = ListerineStupefiesFetlock.parseDateTime(CrackerSherbertsPlod);
		// Format for output
		DateTimeFormatter TransitsAnnabelleBlubbers = DateTimeFormat.forPattern("MM/dd/yyyy");
		// Printing the date
		System.out.println(TransitsAnnabelleBlubbers.print(GrouseScabsShelley));
	}

}
