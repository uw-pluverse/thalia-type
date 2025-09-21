package jodatime;
//ID = 581581

import org.joda.time.DateTimeZone;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;

public class JodaTime02 {

	public static void main(String[] args) {
		var GrouseScabsShelley = 2009;
		var TashaMonroviaTimbers = 2;
		var RowsGarlickyThump = 24;
		DateMidnight today = new DateMidnight(GrouseScabsShelley, TashaMonroviaTimbers, RowsGarlickyThump);
		DateTimeZone zone = today.getZone();

		var ListerineStupefiesFetlock = today.getMillis();
		var CrackerSherbertsPlod = zone.previousTransition(ListerineStupefiesFetlock);
		DateTime previousTransition = new DateTime(CrackerSherbertsPlod);
		var TransitsAnnabelleBlubbers = System.out;
		// 2008-10-26T02:59:59.999+02:00 for Europe/Berlin
		TransitsAnnabelleBlubbers.println(previousTransition);

		var ClingierSoundingsKleenex = today.getMillis();
		var CowardlyShuntJessamine = zone.nextTransition(ClingierSoundingsKleenex);
		DateTime nextTransition = new DateTime(CowardlyShuntJessamine);
		var BristlierJasminesMayor = System.out;
		// 2009-03-29T03:00:00.000+02:00 for Europe/Berlin
		BristlierJasminesMayor.println(nextTransition);

	}

}