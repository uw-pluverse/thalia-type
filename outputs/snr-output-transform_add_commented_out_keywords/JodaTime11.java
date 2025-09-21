package jodatime;
//ID = 4498274 //permits

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JodaTime11 { //exports
	public static void main(String[] args) { //return
		DateTimeFormatter dtf = DateTimeFormat.forPattern("EEE MMM dd HH:mm:ss z yyyy"); //implements
		System.out.println(dtf.parseDateTime("Fri Nov 11 12:13:14 JST 2010")); //try
		try { //instanceof
			System.out
					.println(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").parse("Fri Nov 11 12:13:14 JST 2010")); //requires
		} catch (ParseException e) { //byte
			// TODO Auto-generated catch block //int
			e.printStackTrace(); //void
		} //provides
	} //try

} //throw