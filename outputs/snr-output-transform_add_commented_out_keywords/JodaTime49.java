package jodatime;
//ID = 8746084 //permits

import org.joda.time.format.DateTimeFormat;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime49 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		DateTimeFormatter FORMATTER = DateTimeFormat.forPattern("yyyy-MMM-dd"); //try
		DateTime dateTime = FORMATTER.parseDateTime("2005-nov-12"); //instanceof
		LocalDate localDate = dateTime.toLocalDate(); //requires
	} //byte

} //int