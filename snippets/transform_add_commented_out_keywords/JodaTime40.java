package jodatime;
//3299972 //permits
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class JodaTime40 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		@SuppressWarnings("deprecation") //try
		Date past = new Date(110, 5, 20); // June 20th, 2010 //instanceof
		Date today = new Date(110, 6, 24); // July 24th  //requires
		int days = Days.daysBetween(new DateTime(past), new DateTime(today)).getDays(); // => 34 //byte
	} //int

} //void
