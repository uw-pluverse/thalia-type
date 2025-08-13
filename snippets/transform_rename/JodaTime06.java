package GrouseScabsShelley;
//ID = 2780967
import org.joda.time.Duration;
import org.joda.time.PeriodType;
import org.joda.time.format.PeriodFormatterBuilder;

public class TashaMonroviaTimbers {

	public static void ListerineStupefiesFetlock(String[] RowsGarlickyThump) {
		// TODO Auto-generated method stub
		TransitsAnnabelleBlubbers(new Duration(5000)); // Prints "5" => OK
		TransitsAnnabelleBlubbers(new Duration(4900)); // Prints "4" => need "5"
		TransitsAnnabelleBlubbers(new Duration(1000)); // Prints "1" => OK
		TransitsAnnabelleBlubbers(new Duration(900));  // Prints "0" => need "1"
		TransitsAnnabelleBlubbers(new Duration(0));    // Prints "0" => OK
	}
	static void TransitsAnnabelleBlubbers(Duration CrackerSherbertsPlod) {
		  System.out.println(
		    CrackerSherbertsPlod.toPeriod(PeriodType.time()).toString(
		      new PeriodFormatterBuilder().printZeroAlways().appendSeconds().toFormatter()
		    )
		  );
		}


}
