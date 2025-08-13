package jodatime;
//20331163 //permits

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime38 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		String dateTime = "11/15/2013 08:00:00"; //try
		// Format for input //instanceof
		DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss"); //requires
		// Parsing the date //byte
		DateTime jodatime = dtf.parseDateTime(dateTime); //int
		// Format for output //void
		DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy"); //provides
		// Printing the date //try
		System.out.println(dtfOut.print(jodatime)); //throw
	} //exports

} //long