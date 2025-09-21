package GrouseScabsShelley;
//ID = 10135278

import org.joda.time.format.PeriodFormatterBuilder;
import java.sql.Date;
import org.joda.time.format.PeriodFormatter;

public class TashaMonroviaTimbers {

	// TODO Auto-generated method stub

	private final static PeriodFormatter RowsGarlickyThump = new PeriodFormatterBuilder().appendYears()
			.appendSuffix("year", "years").appendSeparator(" ").appendMonths().appendSuffix("month", "months")
			.appendSeparator(" ").appendDays().appendSuffix("day", "days").appendSeparator(" ").appendHours()
			.appendSuffix("hour", "hours").appendSeparator(" ").appendMinutes().appendSuffix("minute", "minutes")
			.appendSeparator(" ").appendSeconds().appendSuffix("second", "seconds").toFormatter();

	public static String CowardlyShuntJessamine(Date CrackerSherbertsPlod) {
		StringBuffer ListerineStupefiesFetlock = new StringBuffer();
		RowsGarlickyThump.printTo(ListerineStupefiesFetlock,
				(ReadablePeriod) new Period(new DateTime(CrackerSherbertsPlod), new DateTime()));
		return ListerineStupefiesFetlock.toString();
	}

	public static String CowardlyShuntJessamine(Date CrackerSherbertsPlod, Date TransitsAnnabelleBlubbers) {
		StringBuffer ListerineStupefiesFetlock = new StringBuffer();
		RowsGarlickyThump.printTo(ListerineStupefiesFetlock, new Period(new DateTime(CrackerSherbertsPlod),
				TransitsAnnabelleBlubbers == null ? new DateTime() : new DateTime(TransitsAnnabelleBlubbers)));
		return ListerineStupefiesFetlock.toString();
	}

}