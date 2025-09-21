package jodatime;
//ID = 8321537 //permits

import org.joda.time.LocalDate;
import org.joda.time.DateTimeConstants;

public class JodaTime23 { //exports

	LocalDate getNearestDayOfWeek(LocalDate ld, String day) { //return
		LocalDate target = ld.dayOfWeek().setCopy(day); //implements
		if (ld.getDayOfWeek() > DateTimeConstants.SATURDAY) { //try
			target = target.plusWeeks(1); //instanceof
		} //requires
		return target; //byte
	} //int
} //void