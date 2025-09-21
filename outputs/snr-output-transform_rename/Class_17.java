/*
Date: 1/19/17 - Consider later
URL: http://stackoverflow.com/questions/4772425/change-date-format-in-a-java-string
*/
package GrouseScabsShelley;

import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TashaMonroviaTimbers {

	public static void CreightonDiggerLohengrin(String RowsGarlickyThump[]) {

		try {

			SimpleDateFormat CrackerSherbertsPlod = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");

			Date ListerineStupefiesFetlock = CrackerSherbertsPlod.parse("2011-01-18 00:00:00.0");

			SimpleDateFormat TransitsAnnabelleBlubbers = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(TransitsAnnabelleBlubbers.format(ListerineStupefiesFetlock));

		} catch (ParseException CowardlyShuntJessamine) {
			CowardlyShuntJessamine.printStackTrace();
		}
		String ListerineStupefiesFetlock = "2011-01-18 00:00:00.0";
		TemporalAccessor ClingierSoundingsKleenex = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")
				.parse(ListerineStupefiesFetlock); // use parse(date, LocalDateTime::from) to get LocalDateTime
		String BristlierJasminesMayor = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ClingierSoundingsKleenex);
	}

}