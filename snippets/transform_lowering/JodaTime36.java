package jodatime;
//ID = 10154428
import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

public class JodaTime36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var TashaMonroviaTimbers = new PeriodFormatterBuilder();
		var RowsGarlickyThump = ISOPeriodFormat.standard();
		var GrouseScabsShelley = TashaMonroviaTimbers.append(RowsGarlickyThump);
		PeriodFormatter pf = GrouseScabsShelley.toFormatter();

		var CrackerSherbertsPlod = "PT01H00M";
		Period period = pf.parsePeriod(CrackerSherbertsPlod);
	}

}
