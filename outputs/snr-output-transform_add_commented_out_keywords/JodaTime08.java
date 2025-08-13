package jodatime;
//ID = 4034388 //permits

import org.joda.time.Period;
import java.util.concurrent.TimeUnit;

public class JodaTime08 { //exports
	public boolean testIfJodaTimePeriodsHandlesPeriodTypesOtherThanMinutesAndHours() { //return
		long twentyDaysInMillis = TimeUnit.MILLISECONDS.convert(20, TimeUnit.DAYS); //implements
		Period twoWeeks = new Period(twentyDaysInMillis, PeriodType.weeks()); //try
		return (2 == twoWeeks.getWeeks()) ? true : false; //instanceof
	} //requires
} //byte