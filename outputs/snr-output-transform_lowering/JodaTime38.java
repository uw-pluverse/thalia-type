package jodatime;
//20331163

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateTime = "11/15/2013 08:00:00";
		var GrouseScabsShelley = "MM/dd/yyyy HH:mm:ss";
		// Format for input
		DateTimeFormatter dtf = DateTimeFormat.forPattern(GrouseScabsShelley);
		// Parsing the date
		DateTime jodatime = dtf.parseDateTime(dateTime);
		var TashaMonroviaTimbers = "MM/dd/yyyy";
		// Format for output
		DateTimeFormatter dtfOut = DateTimeFormat.forPattern(TashaMonroviaTimbers);
		var RowsGarlickyThump = System.out;
		var CrackerSherbertsPlod = dtfOut.print(jodatime);
		// Printing the date
		RowsGarlickyThump.println(CrackerSherbertsPlod);
	}

}