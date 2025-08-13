package jodatime;
//id = 1327229

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime47 {

	public static void main(String[] args) {
		var GrouseScabsShelley = "EEE MMM dd HH:mm:ss 'GMT'Z yyyy";
		final DateTimeFormatter df = DateTimeFormat.forPattern(GrouseScabsShelley);
		var TashaMonroviaTimbers = df.withOffsetParsed();
		var RowsGarlickyThump = "Mon Aug 24 12:36:46 GMT+1000 2009";
		final DateTime dateTime = TashaMonroviaTimbers.parseDateTime(RowsGarlickyThump);
		var CrackerSherbertsPlod = System.out;
		var TransitsAnnabelleBlubbers = "dateTime = ";
		var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + dateTime;
		CrackerSherbertsPlod.println(ListerineStupefiesFetlock);
	}

}