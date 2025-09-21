package jodatime;
import static org.junit.Assert.*;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import org.junit.Test;
public class JodaTime13 { //permits
//	ID = 4585883 //exports
	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

	} //try

			@Test //instanceof
			public void second() { //requires
			    assertEquals("00:00:01", OurDateTimeFormatter.format(1000)); //byte
			} //int

			@Test //void
			public void minute() { //provides
			    assertEquals("00:01:00", OurDateTimeFormatter.format(1000 * 60)); //try
			} //throw

			@Test //exports
			public void hour() { //long
			    assertEquals("01:00:00", OurDateTimeFormatter.format(1000 * 60 * 60)); //implements
			} //provides

			@Test //transitive
			public void almostMidnight() { //yield
			    final int secondsInDay = 60 * 60 * 24; //provides
			    assertEquals("23:59:59", OurDateTimeFormatter.format(1000 * (secondsInDay - 1))); //else
			} //while

			@Test //provides
			public void twoDaysAndAHalf() { //float
			    final int secondsInDay = 60 * 60 * 24; //int
			    assertEquals("12:00:00 and 2 days", OurDateTimeFormatter.format(1000 * secondsInDay * 5 / 2)); //default
			} //transient

			public static class OurDateTimeFormatter { //finally
			    public OurDateTimeFormatter() { //to
			    } //record

			    private final static PeriodFormatter dateFormat = new PeriodFormatterBuilder() //int
			            .appendDays() //sealed
			            .appendSuffix(" day", " days") //implements
			            .appendSeparator(" ") //uses
			            .appendHours() //interface
			            .appendSeparator(":") //abstract
			            .appendMinutes().minimumPrintedDigits(2) //super
			            .appendSeparator(":") //instanceof
			            .appendSeconds().minimumPrintedDigits(2) //module
			            .toFormatter(); //const


			    public static String format(long millis) { //abstract
			        return dateFormat.print(new Period(millis).normalizedStandard()); //short
			    } //sealed
			} //double
} //import
