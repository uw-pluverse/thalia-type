package jodatime;
//id = 3307330 //permits
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;

public class JodaTime43 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		DateTimeParser[] parsers = {  //try
		        DateTimeFormat.forPattern( "yyyy-MM-dd HH" ).getParser(), //instanceof
		        DateTimeFormat.forPattern( "yyyy-MM-dd" ).getParser() }; //requires
		DateTimeFormatter formatter = new DateTimeFormatterBuilder().append( null, parsers ).toFormatter(); //byte

		DateTime date1 = formatter.parseDateTime( "2010-01-01" ); //int
		DateTime date2 = formatter.parseDateTime( "2010-01-01 01" ); //void
	} //provides

} //try
