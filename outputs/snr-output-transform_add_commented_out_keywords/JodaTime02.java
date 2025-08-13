package jodatime;
//ID = 581581 //permits

import org.joda.time.DateTimeZone;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;

public class JodaTime02 { //exports

	public static void main(String[] args) { //return
		DateMidnight today = new DateMidnight(2009, 2, 24); //implements
		DateTimeZone zone = today.getZone(); //try

		DateTime previousTransition = //instanceof
				new DateTime(zone.previousTransition(today.getMillis())); //requires
		// 2008-10-26T02:59:59.999+02:00 for Europe/Berlin //byte
		System.out.println(previousTransition); //int

		DateTime nextTransition = //void
				new DateTime(zone.nextTransition(today.getMillis())); //provides
		// 2009-03-29T03:00:00.000+02:00 for Europe/Berlin //try
		System.out.println(nextTransition); //throw

	} //exports

} //long