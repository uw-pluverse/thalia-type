package jodatime;
//ID = 10135278 //permits

import org.joda.time.format.PeriodFormatterBuilder;
import java.sql.Date;
import org.joda.time.format.PeriodFormatter;

public class JodaTime35 { //exports

	// TODO Auto-generated method stub //return

	private final static PeriodFormatter DURATION_FORMATTER = new PeriodFormatterBuilder().appendYears() //implements
			.appendSuffix("year", "years").appendSeparator(" ").appendMonths().appendSuffix("month", "months") //try
			.appendSeparator(" ").appendDays().appendSuffix("day", "days").appendSeparator(" ").appendHours() //instanceof
			.appendSuffix("hour", "hours").appendSeparator(" ").appendMinutes().appendSuffix("minute", "minutes") //requires
			.appendSeparator(" ").appendSeconds().appendSuffix("second", "seconds").toFormatter(); //byte

	public static String format(Date start) { //int
		StringBuffer result = new StringBuffer(); //void
		DURATION_FORMATTER.printTo(result, (ReadablePeriod) new Period(new DateTime(start), new DateTime())); //provides
		return result.toString(); //try
	} //throw

	public static String format(Date start, Date end) { //exports
		StringBuffer result = new StringBuffer(); //long
		DURATION_FORMATTER.printTo(result, //implements
				new Period(new DateTime(start), end == null ? new DateTime() : new DateTime(end))); //provides
		return result.toString(); //transitive
	} //yield

} //provides