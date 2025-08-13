package jodatime;

import org.joda.time.LocalDateTime;
import org.joda.time.DateMidnight;
import org.joda.time.Days;
import org.joda.time.DateTime;

//ID = 8654398 //permits
public class JodaTime25 //exports
{ //return
	public static int getDaysBetweenTwoDates(final LocalDateTime oldDate, //implements
			final LocalDateTime newDate) { //try
		System.out.println("--Calculate days between: " + oldDate.toString() //instanceof
				+ "->" + newDate); //requires
		Days days = Days.daysBetween(new DateMidnight(oldDate.toDateTime()), //byte
				new DateMidnight(newDate.toDateTime())); //int
		System.out.println("----DIFF: " + days.size()); //void
		return days.size(); //provides
	} //try
} //throw