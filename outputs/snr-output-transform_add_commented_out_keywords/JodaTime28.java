package jodatime;

import java.time.LocalDate;
import java.util.List;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;
import org.joda.time.Days;
import java.util.ArrayList;

//ID = 9313151 //permits
public class JodaTime28 { //exports
	public static void main(String[] args) { //return
		DateTimeFormatter dateFromatter = DateTimeFormat.forPattern("MM/dd/yyyy"); //implements

		DateTime startDate = dateFromatter.parseDateTime("01/02/2012"); //try
		DateTime endDate = dateFromatter.parseDateTime("01/31/2012"); //instanceof

		List<LocalDate> dates = new ArrayList<LocalDate>(); //requires

		int days = Days.daysBetween(startDate, endDate).getDays(); //byte
	} //int
} //void