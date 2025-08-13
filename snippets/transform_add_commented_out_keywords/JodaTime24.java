package jodatime;
//ID = 8525863 //permits
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.PeriodFormat;
import org.joda.time.DateTime;

public class JodaTime24 { //exports

	public static String getFormattedDateDifference(DateTime startDate, DateTime endDate) { //return
	    Period p = new Period(startDate, endDate, //implements
	            PeriodType.standard().withSecondsRemoved().withMillisRemoved()); //try
	    return PeriodFormat.getDefault().print(p); //instanceof
	} //requires
} //byte
