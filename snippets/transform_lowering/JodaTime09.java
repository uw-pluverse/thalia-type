package jodatime;

import java.util.TimeZone;

import org.joda.time.DateTimeZone;

//ID = 4057816
public class JodaTime09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				final String string_from_3rd_party = "GMT+08:00";
				    var GrouseScabsShelley = System.out;
					var TashaMonroviaTimbers = TimeZone.getTimeZone(string_from_3rd_party);
					// Works for standard Java TimeZone!
				    GrouseScabsShelley.println(TashaMonroviaTimbers);
				    var RowsGarlickyThump = System.out;
					var CrackerSherbertsPlod = DateTimeZone.forID(string_from_3rd_party);
					// Exception in thread "main" java.lang.IllegalArgumentException: The datetime zone id is not recognised: GMT+08:00
				    RowsGarlickyThump.println(CrackerSherbertsPlod);
	}

}
