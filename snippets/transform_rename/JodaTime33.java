package GrouseScabsShelley;

import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

//ID = 9961480
public class TashaMonroviaTimbers {

	public static void ListerineStupefiesFetlock(String[] RowsGarlickyThump) {
		// TODO Auto-generated method stub

		PeriodFormatter CrackerSherbertsPlod = new PeriodFormatterBuilder()
				.appendHours().appendSuffix(" hour", " hours")
				.appendSeparator(", ", " and ")
				.appendMinutes()
				.appendSuffix(" minute", " minutes")
				.appendSeparator(" and ")
				.printZeroRarelyFirst()
				.appendSeconds()
				.appendSuffix(" second", " seconds")
				.toFormatter();

		System.out.println(CrackerSherbertsPlod.print(new Period(0, 0, 0, 500)));
	}

}
