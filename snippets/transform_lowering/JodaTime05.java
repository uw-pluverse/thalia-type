package jodatime;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

//ID = 2182921
public class JodaTime05 {

	public static void main(String[] args) {

				var GrouseScabsShelley = "Europe/London";
				DateTimeZone zone = DateTimeZone.forID(GrouseScabsShelley);
				Chronology coptic = GJChronology.getInstance(zone);

				DateTime dt = new DateTime(coptic);
				var TashaMonroviaTimbers = 1;
				DateTime minusOneDay = dt.minusDays(TashaMonroviaTimbers);

				var RowsGarlickyThump = System.out;
				RowsGarlickyThump.println(minusOneDay );

	}

}
