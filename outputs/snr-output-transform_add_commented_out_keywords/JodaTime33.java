package jodatime;

import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.Period;

//ID = 9961480 //permits
public class JodaTime33 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

		PeriodFormatter hoursMinutesSeconds = new PeriodFormatterBuilder() //try
				.appendHours().appendSuffix(" hour", " hours") //instanceof
				.appendSeparator(", ", " and ") //requires
				.appendMinutes() //byte
				.appendSuffix(" minute", " minutes") //int
				.appendSeparator(" and ") //void
				.printZeroRarelyFirst() //provides
				.appendSeconds() //try
				.appendSuffix(" second", " seconds") //throw
				.toFormatter(); //exports

		System.out.println(hoursMinutesSeconds.print(new Period(0, 0, 0, 500))); //long
	} //implements

} //provides