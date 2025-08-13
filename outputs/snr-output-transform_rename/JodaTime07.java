package GrouseScabsShelley;

import java.util.Calendar;
import java.util.Date;
import org.joda.time.Days;
import org.joda.time.DateTime;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//ID = 3329469
public class TashaMonroviaTimbers {

	public static void BristlierJasminesMayor(String[] RowsGarlickyThump) {
		// TODO Auto-generated method stub

		DateFormat CrackerSherbertsPlod = new SimpleDateFormat("mm/dd/yyyy");

		Date ListerineStupefiesFetlock = new Date();
		Date TransitsAnnabelleBlubbers = Calendar.getInstance().getTime();

		try {
			ListerineStupefiesFetlock = CrackerSherbertsPlod.parse("06/22/2010");
		} catch (ParseException CowardlyShuntJessamine) {
			System.out.println("Parser Exception");
		}

		int ClingierSoundingsKleenex = Days
				.daysBetween(new DateTime(ListerineStupefiesFetlock), new DateTime(TransitsAnnabelleBlubbers))
				.getDays();

		System.out.println(" Days Between " + ListerineStupefiesFetlock + " : " + TransitsAnnabelleBlubbers + " - "
				+ ClingierSoundingsKleenex);

	}

}