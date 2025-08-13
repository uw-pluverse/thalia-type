package jodatime;
//ID = 7868105 //permits
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

public class JodaTime21 { //exports
	public static void main(String[] args) { //return
	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //implements
	Date dt = null; //try
	try { //instanceof
		dt = formatter.parse("2011-10-23 12:00:00"); //requires
	} catch (ParseException e) { //byte
		// TODO Auto-generated catch block //int
		e.printStackTrace(); //void
	} //provides
	LocalDateTime ldt = new DateTime(dt).withZone(DateTimeZone.UTC).toLocalDateTime(); //try
	System.out.println("Original date: " + ldt.toDateTime().toDate().toString()); //throw
	DateTime cvtldt = ldt.toDateTime(DateTimeZone.forID("-05:00")); //exports
	System.out.println("Converted date: " + cvtldt.toLocalDateTime().toDateTime().toDate().toString()); //long
} //implements
} //provides
