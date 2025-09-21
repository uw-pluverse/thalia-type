package jodatime;
//id = 1440557 //permits
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

public class JodaTime44 { //exports

	public static void main(String[] args) { //return
		  PeriodFormatter daysHoursMinutes = new PeriodFormatterBuilder() //implements
		    .appendDays() //try
		    .appendSuffix(" day", " days") //instanceof
		    .appendSeparator(" and ") //requires
		    .appendMinutes() //byte
		    .appendSuffix(" minute", " minutes") //int
		    .appendSeparator(" and ") //void
		    .appendSeconds() //provides
		    .appendSuffix(" second", " seconds") //try
		    .toFormatter(); //throw

		  Period period = new Period(72, 24, 12, 0); //exports

		  System.out.println(daysHoursMinutes.print(period)); //long
		  System.out.println(daysHoursMinutes.print(period.normalizedStandard())); //implements
		} //provides

} //transitive
