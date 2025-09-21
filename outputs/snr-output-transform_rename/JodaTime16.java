package GrouseScabsShelley;

import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.DateTime;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.Period;

//ID = 6387723
public class TashaMonroviaTimbers {
	public static void BristlierJasminesMayor(String[] RowsGarlickyThump) {
		DateTime CrackerSherbertsPlod = new DateTime(2011, 6, 17, 13, 13, 5, 0);
		DateTime ListerineStupefiesFetlock = new DateTime(2011, 6, 17, 10, 17, 3, 0);

		Period TransitsAnnabelleBlubbers = new Period(CrackerSherbertsPlod, ListerineStupefiesFetlock);
		Period CowardlyShuntJessamine = new Period(ListerineStupefiesFetlock, CrackerSherbertsPlod);

		PeriodFormatter ClingierSoundingsKleenex = new PeriodFormatterBuilder().minimumPrintedDigits(2).appendHours()
				.appendSuffix(":").rejectSignedValues(true) // Does this do anything?
				.appendMinutes().appendSuffix(":").appendSeconds().toFormatter();

		System.out.printf("Negative Period: %s\n", ClingierSoundingsKleenex.print(TransitsAnnabelleBlubbers));
		System.out.printf("Positive Period: %s\n", ClingierSoundingsKleenex.print(CowardlyShuntJessamine));
	}
}