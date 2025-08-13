package GrouseScabsShelley;
//ID = 7807271

import org.joda.time.DateTimeZone;

public class TashaMonroviaTimbers {

	public static void BristlierJasminesMayor(String[] RowsGarlickyThump) {
		String CrackerSherbertsPlod = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter ListerineStupefiesFetlock = DateTimeFormat.forPattern(CrackerSherbertsPlod);
		DateTimeZone TransitsAnnabelleBlubbers = DateTimeZone.forID("-03:00");
		//date is 2000-01-01 00:00:00 -03:00
		DateTime CowardlyShuntJessamine = ListerineStupefiesFetlock.withZone(TransitsAnnabelleBlubbers)
				.parseDateTime("2000-01-01 00:00:00");
		System.out.println("Current date is: " + CowardlyShuntJessamine.toString());
		//now convert to UTC
		DateTime ClingierSoundingsKleenex = CowardlyShuntJessamine.toDateTime(DateTimeZone.UTC);
		System.out.println("Converted date: " + CowardlyShuntJessamine.toString());
		// TODO Auto-generated method stub

	}

}