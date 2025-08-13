package jodatime;

import java.util.Calendar;
import java.util.Date;
import org.joda.time.Days;
import org.joda.time.DateTime;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//ID = 3329469 //permits
public class JodaTime07 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

		DateFormat formatter = new SimpleDateFormat("mm/dd/yyyy"); //try

		Date someDate = new Date(); //instanceof
		Date today = Calendar.getInstance().getTime(); //requires

		try { //byte
			someDate = formatter.parse("06/22/2010"); //int
		} //void
		catch (ParseException pe) { //provides
			System.out.println("Parser Exception"); //try
		} //throw

		int days = Days.daysBetween(new DateTime(someDate), new DateTime(today)).getDays(); //exports

		System.out.println(" Days Between " + someDate + " : " + today + " - " + days); //long

	} //implements

} //provides