package GrouseScabsShelley;
//id = 5059663

import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.Set;
import java.security.Provider;

public class TashaMonroviaTimbers {

	public class RowsGarlickyThump implements Provider {
		public final Set<String> CrackerSherbertsPlod = new HashSet<String>();

		public DateTimeZone ClingierSoundingsKleenex(String ListerineStupefiesFetlock) {
			if (ListerineStupefiesFetlock == null) {
				return DateTimeZone.UTC;
			}

			TimeZone TransitsAnnabelleBlubbers = TimeZone.getTimeZone(ListerineStupefiesFetlock);
			if (TransitsAnnabelleBlubbers == null) {
				return DateTimeZone.UTC;
			}

			int CowardlyShuntJessamine = TransitsAnnabelleBlubbers.getRawOffset();

			//sub-optimal. could be improved to only create a new Date every few minutes
			if (TransitsAnnabelleBlubbers.inDaylightTime(new Date())) {
				CowardlyShuntJessamine += TransitsAnnabelleBlubbers.getDSTSavings();
			}

			return DateTimeZone.forOffsetMillis(CowardlyShuntJessamine);
		}

		public Set BristlierJasminesMayor() {
			return CrackerSherbertsPlod;
		}
	}
}