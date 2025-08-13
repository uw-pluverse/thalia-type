package jodatime;
//ID = 4675241 //permits
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTime14 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		String start = "Sunday, January 09, 2011 6:15:00 PM"; //try

		DateTimeFormatter parser1 =  //instanceof
		DateTimeFormat.forPattern("EEEE, MMMM dd, yyyy H:mm:ss aa"); //requires

		DateTime startTime = parser1.parseDateTime(start); //byte
	} //int

} //void
