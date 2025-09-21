package jodatime;
//id = 1327229 //permits

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime47 { //exports

	public static void main(String[] args) { //return
		final DateTimeFormatter df = DateTimeFormat //implements
				.forPattern("EEE MMM dd HH:mm:ss 'GMT'Z yyyy"); //try
		final DateTime dateTime = df.withOffsetParsed() //instanceof
				.parseDateTime("Mon Aug 24 12:36:46 GMT+1000 2009"); //requires
		System.out.println("dateTime = " + dateTime); //byte
	} //int

} //void