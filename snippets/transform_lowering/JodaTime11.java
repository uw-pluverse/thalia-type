package jodatime;
//ID = 4498274
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTime11 {
	public static void main(String[] args) {
		var GrouseScabsShelley = "EEE MMM dd HH:mm:ss z yyyy";
		DateTimeFormatter dtf = DateTimeFormat.forPattern(GrouseScabsShelley);
		var TashaMonroviaTimbers = System.out;
		var CrackerSherbertsPlod = "Fri Nov 11 12:13:14 JST 2010";
		var RowsGarlickyThump = dtf.parseDateTime(CrackerSherbertsPlod);
		TashaMonroviaTimbers.println(RowsGarlickyThump);
		try {
			var ListerineStupefiesFetlock = System.out;
			var ClingierSoundingsKleenex = "EEE MMM dd HH:mm:ss z yyyy";
			var CowardlyShuntJessamine = new SimpleDateFormat(ClingierSoundingsKleenex);
			var BristlierJasminesMayor = "Fri Nov 11 12:13:14 JST 2010";
			var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.parse(BristlierJasminesMayor);
			ListerineStupefiesFetlock.println(TransitsAnnabelleBlubbers);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
