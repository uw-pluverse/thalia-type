package jodatime;

import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.joda.time.Chronology;
import org.joda.time.DateTime;

//ID = 2182921
public class JodaTime05 {

	public static void main(String[] args) {

		DateTimeZone zone = DateTimeZone.forID("Europe/London");
		Chronology coptic = GJChronology.getInstance(zone);

		DateTime dt = new DateTime(coptic);
		DateTime minusOneDay = dt.minusDays(1);

		System.out.println(minusOneDay);

	}

}