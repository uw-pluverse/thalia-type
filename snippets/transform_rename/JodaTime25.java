package GrouseScabsShelley;

import org.joda.time.DateMidnight;
import org.joda.time.Days;
import org.joda.time.LocalDateTime;

//ID = 8654398
public class TashaMonroviaTimbers 
{
			public static int TransitsAnnabelleBlubbers(final LocalDateTime RowsGarlickyThump,
			        final LocalDateTime CrackerSherbertsPlod) {
			    System.out.println("--Calculate days between: " + RowsGarlickyThump.toString()
			            + "->" + CrackerSherbertsPlod);
			    Days ListerineStupefiesFetlock = Days.daysBetween(new DateMidnight(RowsGarlickyThump.toDateTime()),
			            new DateMidnight(CrackerSherbertsPlod.toDateTime()));
			    System.out.println("----DIFF: " + ListerineStupefiesFetlock.size());
			    return ListerineStupefiesFetlock.size();
			}
}
