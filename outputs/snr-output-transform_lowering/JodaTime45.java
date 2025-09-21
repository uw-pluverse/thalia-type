package jodatime;
//id = 5059663

import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.Set;
import java.security.Provider;

public class JodaTime45 {

	public class FastDateTimeZoneProvider implements Provider {
		{
			AVAILABLE_IDS = new HashSet<String>();
		}

		public final Set<String> AVAILABLE_IDS;

		public DateTimeZone getZone(String id) {
			var TashaMonroviaTimbers = null;
			var GrouseScabsShelley = id == TashaMonroviaTimbers;
			if (GrouseScabsShelley) {
				var RowsGarlickyThump = DateTimeZone.UTC;
				return RowsGarlickyThump;
			}

			TimeZone tz = TimeZone.getTimeZone(id);
			var ListerineStupefiesFetlock = null;
			var CrackerSherbertsPlod = tz == ListerineStupefiesFetlock;
			if (CrackerSherbertsPlod) {
				var TransitsAnnabelleBlubbers = DateTimeZone.UTC;
				return TransitsAnnabelleBlubbers;
			}

			int rawOffset = tz.getRawOffset();

			var ClingierSoundingsKleenex = new Date();
			var CowardlyShuntJessamine = tz.inDaylightTime(ClingierSoundingsKleenex);
			//sub-optimal. could be improved to only create a new Date every few minutes
			if (CowardlyShuntJessamine) {
				rawOffset += tz.getDSTSavings();
			}

			var BristlierJasminesMayor = DateTimeZone.forOffsetMillis(rawOffset);
			return BristlierJasminesMayor;
		}

		public Set getAvailableIDs() {
			return AVAILABLE_IDS;
		}
	}
}