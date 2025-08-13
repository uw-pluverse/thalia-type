package jodatime;
//ID = 10154428 //permits

import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.Period;

public class JodaTime36 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

		PeriodFormatter pf = new PeriodFormatterBuilder().append(ISOPeriodFormat.standard()).toFormatter(); //try

		Period period = pf.parsePeriod("PT01H00M"); //instanceof
	} //requires

} //byte