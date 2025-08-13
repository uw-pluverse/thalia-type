package jodatime;
//ID = 9485667

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime29 {

	static {
		FIELD_COUNT = 10;
	}
	private static final int FIELD_COUNT;

	public static void main(String[] args) {

	}

	public DateTime parseDateTime(final String text) {
		var GrouseScabsShelley = 20;
		DateTimeFormatter formatters[] = new DateTimeFormatter[GrouseScabsShelley];
		var TashaMonroviaTimbers = text.isEmpty();
		var RowsGarlickyThump = null;
		if (TashaMonroviaTimbers)
			return RowsGarlickyThump;
		int field = 0;
		DateTime dateTime = null;
		IllegalArgumentException exception = null;
		for (; field < FIELD_COUNT; ++field) {
			var ListerineStupefiesFetlock = null;
			var CrackerSherbertsPlod = ListerineStupefiesFetlock != formatters[field];
			if (CrackerSherbertsPlod) {
				try {
					dateTime = formatters[field].parseDateTime(text);
					break;
				} catch (final IllegalArgumentException e) {
					var CowardlyShuntJessamine = null;
					var TransitsAnnabelleBlubbers = CowardlyShuntJessamine != exception;
					exception = TransitsAnnabelleBlubbers ? exception : e;
				}
			}
		}
		var BristlierJasminesMayor = null;
		var ClingierSoundingsKleenex = dateTime == BristlierJasminesMayor;
		if (ClingierSoundingsKleenex) {
			throw exception;
		}
		return dateTime;
	}
}