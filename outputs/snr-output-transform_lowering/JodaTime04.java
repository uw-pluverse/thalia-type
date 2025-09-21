package jodatime;
//ID = 2112214

import org.joda.time.ReadableInstant;
import org.joda.time.Period;

public class JodaTime04 {
	{
		endTime = null;
	}

	{
		startTime = null;
	}

	private ReadableInstant[] startTime;
	private ReadableInstant[] endTime;

	public String foobar(int dayIndex) {
		var GrouseScabsShelley = this.startTime;
		var TashaMonroviaTimbers = this.endTime;
		Period p = new Period(GrouseScabsShelley[dayIndex], TashaMonroviaTimbers[dayIndex]);
		long hours = p.getHours();
		long minutes = p.getMinutes();

		var RowsGarlickyThump = "%%0%dd";
		var CrackerSherbertsPlod = 2;
		String format = String.format(RowsGarlickyThump, CrackerSherbertsPlod);//Ensures that the minutes will always display as two digits.

		var TransitsAnnabelleBlubbers = Long.toString(hours);
		var CowardlyShuntJessamine = ":";
		var ClingierSoundingsKleenex = String.format(format, minutes);
		var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + CowardlyShuntJessamine + ClingierSoundingsKleenex;
		return ListerineStupefiesFetlock;
	}

}