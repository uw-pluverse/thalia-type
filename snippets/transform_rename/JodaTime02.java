package GrouseScabsShelley;
//ID = 581581
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TashaMonroviaTimbers {

	public static void ClingierSoundingsKleenex(String[] RowsGarlickyThump) {
		DateMidnight CrackerSherbertsPlod = new DateMidnight(2009, 2, 24);
		DateTimeZone ListerineStupefiesFetlock = CrackerSherbertsPlod.getZone();

		DateTime TransitsAnnabelleBlubbers =
		    new DateTime(ListerineStupefiesFetlock.previousTransition(CrackerSherbertsPlod.getMillis()));
		// 2008-10-26T02:59:59.999+02:00 for Europe/Berlin
		System.out.println(TransitsAnnabelleBlubbers);

		DateTime CowardlyShuntJessamine =
		    new DateTime(ListerineStupefiesFetlock.nextTransition(CrackerSherbertsPlod.getMillis()));
		// 2009-03-29T03:00:00.000+02:00 for Europe/Berlin
		System.out.println(CowardlyShuntJessamine);

	}

}
