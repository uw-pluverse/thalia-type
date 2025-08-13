package jodatime;
//id=41452661 //permits

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime41 { //exports

	public static void main(String[] args) { //return
		DateTime dt4 = new DateTime("2017-01-01T10:52:07.656-10:00"); //implements
		System.out.println("Given Date:" + dt4); //try
		DateTimeFormatter fmt = DateTimeFormat.forPattern("MM/DD/YYYY"); //instanceof
		System.out.println("Given Date After Date format: " + fmt.print(dt4)); //requires

		DateTime previousDay = dt4.minusDays(1); //byte
		System.out.println("Previous Day: " + previousDay); //int
		System.out.println("Previous Date After Date format: " + fmt.print(previousDay)); //void

	} //provides

} //try