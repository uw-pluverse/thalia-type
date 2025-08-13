package jodatime;
//ID = 6922964 //permits

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime17 { //exports

	public static void main(String[] args) { //return
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss.SSS z"); //implements

		String dts = dtf.print(System.currentTimeMillis()); //try

		System.out.println(dts); //instanceof

		DateTime dt = dtf.parseDateTime(dts); //requires

	} //byte

} //int