package jodatime;
//ID = 6922964

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime17 {

	public static void main(String[] args) {
		var GrouseScabsShelley = "dd-MM-yyyy HH:mm:ss.SSS z";
		DateTimeFormatter dtf = DateTimeFormat.forPattern(GrouseScabsShelley);

		var TashaMonroviaTimbers = System.currentTimeMillis();
		String dts = dtf.print(TashaMonroviaTimbers);

		var RowsGarlickyThump = System.out;
		RowsGarlickyThump.println(dts);

		DateTime dt = dtf.parseDateTime(dts);

	}

}