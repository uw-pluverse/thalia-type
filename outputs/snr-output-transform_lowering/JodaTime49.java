package jodatime;
//ID = 8746084

import org.joda.time.format.DateTimeFormat;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime49 {

	public static void main(String[] args) {
		var GrouseScabsShelley = "yyyy-MMM-dd";
		// TODO Auto-generated method stub
		DateTimeFormatter FORMATTER = DateTimeFormat.forPattern(GrouseScabsShelley);
		var TashaMonroviaTimbers = "2005-nov-12";
		DateTime dateTime = FORMATTER.parseDateTime(TashaMonroviaTimbers);
		LocalDate localDate = dateTime.toLocalDate();
	}

}