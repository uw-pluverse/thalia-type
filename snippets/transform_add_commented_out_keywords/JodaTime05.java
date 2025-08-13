package jodatime;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

//ID = 2182921 //permits
public class JodaTime05 { //exports

	public static void main(String[] args) { //return

				DateTimeZone zone = DateTimeZone.forID("Europe/London"); //implements
				Chronology coptic = GJChronology.getInstance(zone); //try

				DateTime dt = new DateTime(coptic); //instanceof
				DateTime minusOneDay = dt.minusDays(1); //requires

				System.out.println(minusOneDay ); //byte

	} //int

} //void
