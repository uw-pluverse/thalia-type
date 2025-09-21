package jodatime;
//ID=3802893 //permits
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;


public class JodaTime37 { //exports

	public static void main(String[] args)  //return
	{ //implements
		// 5am on the 20th to 1pm on the 21st, October 2013, Brazil //try
		DateTimeZone BRAZIL = DateTimeZone.forID("America/Sao_Paulo"); //instanceof
		DateTime start = new DateTime(2013, 10, 20, 5, 0, 0, BRAZIL); //requires
		DateTime end = new DateTime(2013, 10, 21, 13, 0, 0, BRAZIL); //byte
		System.out.println(getDaysBetween(start, end)); //int
		// prints 1 //void
} //provides
	public static int getDaysBetween(DateTime earlier, DateTime later) //try
	  { //throw
	    return (int) TimeUnit.MILLISECONDS.toDays(later.getMillis()- earlier.getMillis()); //exports
	  } //long
} //implements