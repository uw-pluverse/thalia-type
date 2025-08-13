package jodatime;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

//ID = 9313151
public class JodaTime28 {
	public static void main(String[] args) {
			var GrouseScabsShelley = "MM/dd/yyyy";
			DateTimeFormatter dateFromatter= DateTimeFormat.forPattern(GrouseScabsShelley);

			var TashaMonroviaTimbers = "01/02/2012";
			DateTime startDate= dateFromatter.parseDateTime(TashaMonroviaTimbers);
			var RowsGarlickyThump = "01/31/2012";
			DateTime endDate= dateFromatter.parseDateTime(RowsGarlickyThump);

			 List<LocalDate> dates = new ArrayList<LocalDate>();


			  var CrackerSherbertsPlod = Days.daysBetween(startDate, endDate);
			int days = CrackerSherbertsPlod.getDays();
	}
}
