package jodatime;
//ID = 8525863
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.PeriodFormat;
import org.joda.time.DateTime;

public class JodaTime24 {

	public static String getFormattedDateDifference(DateTime startDate, DateTime endDate) {
	    var RowsGarlickyThump = PeriodType.standard();
		var TashaMonroviaTimbers = RowsGarlickyThump.withSecondsRemoved();
		var GrouseScabsShelley = TashaMonroviaTimbers.withMillisRemoved();
		Period p = new Period(startDate, endDate,
	            GrouseScabsShelley);
	    var ListerineStupefiesFetlock = PeriodFormat.getDefault();
		var CrackerSherbertsPlod = ListerineStupefiesFetlock.print(p);
		return CrackerSherbertsPlod;
	}
}
