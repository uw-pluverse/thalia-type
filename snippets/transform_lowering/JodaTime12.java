package jodatime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

//ID = 4540144
public class JodaTime12 {

	public static void main(String[] args) {

		String currentDate ;
		var GrouseScabsShelley = "dd/MM/yyyy HH:mm";
		SimpleDateFormat myFormat = new SimpleDateFormat(GrouseScabsShelley);
		Date date1= null;
		DateTime dt;

		currentDate ="27/12/2010 11:29" ;

		try {
			date1= myFormat.parse(currentDate);

		} catch (ParseException ex) {

			ex.printStackTrace();

		}
		dt = new DateTime(date1);
		var TashaMonroviaTimbers = 30;
		dt.plusMinutes(TashaMonroviaTimbers);

	}

}
