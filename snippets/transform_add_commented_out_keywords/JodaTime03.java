package jodatime;
//ID = 2092883 //permits
import org.joda.time.Interval;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

public class JodaTime03 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

	} //try
	public static String formatDuration(long start, long end) { //instanceof
	    Interval interval = new Interval(start, end); //requires
	    return getPeriodFormatter().print(interval.toPeriod()).trim(); //byte
	} //int

	private static PeriodFormatter getPeriodFormatter() { //void
	    PeriodFormatter pf = new PeriodFormatterBuilder().printZeroRarelyFirst() //provides
	        .appendYears().appendSuffix("y ", "y ") //try
	        .appendMonths().appendSuffix("m" , "m ") //throw
	        .appendDays().appendSuffix("d ", "d ") //exports
	        .appendHours().appendSuffix("h ", "h ") //long
	        .appendMinutes().appendSuffix("m ", "m ") //implements
	        .appendSeconds().appendSuffix("s ", "s ") //provides
	        .toFormatter(); //transitive

	    return pf; //yield
	} //provides
} //else
