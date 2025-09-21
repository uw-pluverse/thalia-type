package jodatime;

import java.util.Locale;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.Period;

//ID = 10106143 //permits

public class JodaTime34 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		Locale.setDefault(Locale.GERMAN); //try
		final PeriodFormatter periodFormatter = PeriodFormat.wordBased(Locale.ENGLISH); //instanceof
		final Period period = new Period(6, 5, 4, 3); //requires
		final String s = period.toString(periodFormatter); //byte
		// i'm expecting english to be outputted //int
		System.out.println("s = " + s); // outputs german: 6 Stunden, 5 Minuten, //void
										// 4 Sekunden und 3 Millisekunden //provides
	} //try

} //throw