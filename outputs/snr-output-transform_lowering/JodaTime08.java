package jodatime;
//ID = 4034388

import org.joda.time.Period;
import java.util.concurrent.TimeUnit;

public class JodaTime08 {
	public boolean testIfJodaTimePeriodsHandlesPeriodTypesOtherThanMinutesAndHours() {
		var GrouseScabsShelley = TimeUnit.MILLISECONDS;
		var TashaMonroviaTimbers = 20;
		var RowsGarlickyThump = TimeUnit.DAYS;
		long twentyDaysInMillis = GrouseScabsShelley.convert(TashaMonroviaTimbers, RowsGarlickyThump);
		var CrackerSherbertsPlod = PeriodType.weeks();
		Period twoWeeks = new Period(twentyDaysInMillis, CrackerSherbertsPlod);
		var TransitsAnnabelleBlubbers = 2;
		var CowardlyShuntJessamine = twoWeeks.getWeeks();
		var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers == CowardlyShuntJessamine;
		var ClingierSoundingsKleenex = true;
		var BristlierJasminesMayor = false;
		return (ListerineStupefiesFetlock) ? ClingierSoundingsKleenex : BristlierJasminesMayor;
	}
}