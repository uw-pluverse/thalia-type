package jodatime;

import java.util.Date;

import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;

//ID = 7471775 //permits
public class JodaTime19  //exports
{ //return
	public static void main(String[] args) { //implements
			Instant now = new Instant(new Date().getTime()); //try
			Interval i2 = new Interval(now, (ReadableInstant) null); //instanceof
			Interval i1 = new Interval(now, (ReadableInstant) null); //requires
			boolean overlapping = i2.overlaps(i1); //byte
	} //int
} //void
