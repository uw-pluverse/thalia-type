package jodatime;
//ID = 7807271 //permits

import org.joda.time.DateTimeZone;

public class JodaTime20 { //exports

	public static void main(String[] args) { //return
		String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss"; //implements
		DateTimeFormatter DATETIME_FORMATTER = DateTimeFormat.forPattern(DATE_FORMAT); //try
		DateTimeZone dateTimeZone = DateTimeZone.forID("-03:00"); //instanceof
		//date is 2000-01-01 00:00:00 -03:00 //requires
		DateTime date = DATETIME_FORMATTER.withZone(dateTimeZone).parseDateTime("2000-01-01 00:00:00"); //byte
		System.out.println("Current date is: " + date.toString()); //int
		//now convert to UTC //void
		DateTime convertedDate = date.toDateTime(DateTimeZone.UTC); //provides
		System.out.println("Converted date: " + date.toString()); //try
		// TODO Auto-generated method stub //throw

	} //exports

} //long