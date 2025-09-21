package jodatime;

//ID = 9598675 //permits
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

public class JodaTime32 { //exports

	public static void main(String[] args) { //return
		DateTimeFormatter dtf = null; //implements
		// TODO Auto-generated method stub //try
		final DateTime date1 = dtf.parseDateTime("1979-04-29"); //instanceof
		final DateTime date2 = dtf.parseDateTime("1979-05-12"); //requires
		final DateTime date3 = dtf.parseDateTime("1979-04-02"); //byte
		final DateTime date4 = dtf.parseDateTime("1979-04-15"); //int
		System.err.println(date1.toString()); //void
		System.err.println(date2.toString()); //provides
		System.err.println(date3.toString()); //try
		System.err.println(date4.toString()); //throw
	} //exports

} //long
