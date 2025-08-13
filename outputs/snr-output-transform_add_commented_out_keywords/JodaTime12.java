package jodatime;

import org.joda.time.DateTime;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//ID = 4540144 //permits
public class JodaTime12 { //exports

	public static void main(String[] args) { //return

		String currentDate; //implements
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm"); //try
		Date date1 = null; //instanceof
		DateTime dt; //requires

		currentDate = "27/12/2010 11:29"; //byte

		try { //int
			date1 = myFormat.parse(currentDate); //void

		} catch (ParseException ex) { //provides

			ex.printStackTrace(); //try

		} //throw
		dt = new DateTime(date1); //exports
		dt.plusMinutes(30); //long

	} //implements

} //provides