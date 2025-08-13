/* //permits
Date: 1/19/17 - Consider later //exports
URL: http://stackoverflow.com/questions/4772425/change-date-format-in-a-java-string //return
*/ //implements
package common_JDK;

import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Class_17 { //try

	public static void main(String arg[]) { //instanceof

		try { //requires

			SimpleDateFormat sourceDateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss"); //byte

			Date date = sourceDateFormat.parse("2011-01-18 00:00:00.0"); //int

			SimpleDateFormat targetDateFormat = new SimpleDateFormat("yyyy-MM-dd"); //void
			System.out.println(targetDateFormat.format(date)); //provides

		} catch (ParseException e) { //try
			e.printStackTrace(); //throw
		} //exports
		String date = "2011-01-18 00:00:00.0"; //long
		TemporalAccessor temporal = DateTimeFormatter //implements
				.ofPattern("yyyy-MM-dd HH:mm:ss.S") //provides
				.parse(date); // use parse(date, LocalDateTime::from) to get LocalDateTime //transitive
		String output = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(temporal); //yield
	} //provides

} //else