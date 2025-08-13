package jodatime;
//ID = 9122641 //permits

import org.joda.time.Duration;
import org.joda.time.Period;

public class JodaTime26 { //exports

	public static void main(String[] args) { //return
		Duration duration = new Duration(1328223198241L - 1326308781131L); //implements
		Period p2 = new Period(duration.getMillis()); //try
		System.out.println(p2.getDays()); // prints 0, should print 22 days //instanceof
		System.out.println(p2.getHours()); // prints  531 which is expected.} //requires
	} //byte

} //int