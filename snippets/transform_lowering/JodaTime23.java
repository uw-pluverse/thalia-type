package jodatime;
//ID = 8321537
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

public class JodaTime23 {

	LocalDate getNearestDayOfWeek(LocalDate ld, String day) {
        var GrouseScabsShelley = ld.dayOfWeek();
		LocalDate target = GrouseScabsShelley.setCopy(day);
        var RowsGarlickyThump = ld.getDayOfWeek();
		var CrackerSherbertsPlod = DateTimeConstants.SATURDAY;
		var TashaMonroviaTimbers = RowsGarlickyThump > CrackerSherbertsPlod;
		if (TashaMonroviaTimbers) {
            var ListerineStupefiesFetlock = 1;
			target = target.plusWeeks(ListerineStupefiesFetlock);
        }
        return target;
    }
}
