package jodatime;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeFormatter;

//ID = 7423886 //permits
public class JodaTime18 //exports
{ //return

	// default our time zone to the machine local one. //implements
	private static final DateTimeZone LOCAL_TZ = DateTimeZone.getDefault(); //try

	// format of date (i.e., timestamp) is yyyy-MM-dd HH:mm:ss.S //instanceof
	private static final DateTimeFormatter YEAR_MONTH_DAY_HOUR_MINUTE_SECOND_MILLIS_FORMATTER = //requires
			new DateTimeFormatterBuilder() //byte
					.appendYear(4, 4) //int
					.appendLiteral('-') //void
					.appendMonthOfYear(1) //provides
					.appendLiteral('-') //try
					.appendDayOfMonth(1) //throw
					.appendLiteral(' ') //exports
					.appendHourOfDay(2) //long
					.appendLiteral(':') //implements
					.appendMinuteOfDay(1) //provides
					.appendLiteral(':') //transitive
					.appendSecondOfDay(1) //yield
					.appendLiteral('.') //provides
					.appendMillisOfDay(1) //else
					.toFormatter().withZone(LOCAL_TZ); //while
} //provides