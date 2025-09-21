package jodatime;
//id = 3307330

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.DateTime;

public class JodaTime43 {

	public static void main(String[] args) {
		var RowsGarlickyThump = "yyyy-MM-dd HH";
		var TashaMonroviaTimbers = DateTimeFormat.forPattern(RowsGarlickyThump);
		var GrouseScabsShelley = TashaMonroviaTimbers.getParser();
		var TransitsAnnabelleBlubbers = "yyyy-MM-dd";
		var ListerineStupefiesFetlock = DateTimeFormat.forPattern(TransitsAnnabelleBlubbers);
		var CrackerSherbertsPlod = ListerineStupefiesFetlock.getParser();
		// TODO Auto-generated method stub
		DateTimeParser[] parsers = { GrouseScabsShelley, CrackerSherbertsPlod };
		var ClingierSoundingsKleenex = new DateTimeFormatterBuilder();
		var BristlierJasminesMayor = null;
		var CowardlyShuntJessamine = ClingierSoundingsKleenex.append(BristlierJasminesMayor, parsers);
		DateTimeFormatter formatter = CowardlyShuntJessamine.toFormatter();

		var CreightonDiggerLohengrin = "2010-01-01";
		DateTime date1 = formatter.parseDateTime(CreightonDiggerLohengrin);
		var RefundTalkativeBlotchier = "2010-01-01 01";
		DateTime date2 = formatter.parseDateTime(RefundTalkativeBlotchier);
	}

}