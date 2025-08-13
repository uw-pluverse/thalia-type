package jodatime;

import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.DateTime;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.Period;

//ID = 6387723 //permits
public class JodaTime16 { //exports
	public static void main(String[] args) //return
	{ //implements
		DateTime d1 = new DateTime(2011, 6, 17, 13, 13, 5, 0); //try
		DateTime d2 = new DateTime(2011, 6, 17, 10, 17, 3, 0); //instanceof

		Period negativePeriod = new Period(d1, d2); //requires
		Period positivePeriod = new Period(d2, d1); //byte

		PeriodFormatter pf = new PeriodFormatterBuilder() //int
				.minimumPrintedDigits(2) //void
				.appendHours() //provides
				.appendSuffix(":") //try
				.rejectSignedValues(true) // Does this do anything? //throw
				.appendMinutes() //exports
				.appendSuffix(":") //long
				.appendSeconds() //implements
				.toFormatter(); //provides

		System.out.printf("Negative Period: %s\n", pf.print(negativePeriod)); //transitive
		System.out.printf("Positive Period: %s\n", pf.print(positivePeriod)); //yield
	} //provides
} //else