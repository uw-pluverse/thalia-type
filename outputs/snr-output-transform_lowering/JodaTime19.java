package jodatime;

import org.joda.time.Instant;
import java.util.Date;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;

//ID = 7471775
public class JodaTime19 {
	public static void main(String[] args) {
		var TashaMonroviaTimbers = new Date();
		var GrouseScabsShelley = TashaMonroviaTimbers.getTime();
		Instant now = new Instant(GrouseScabsShelley);
		var RowsGarlickyThump = null;
		Interval i2 = new Interval(now, (ReadableInstant) RowsGarlickyThump);
		var CrackerSherbertsPlod = null;
		Interval i1 = new Interval(now, (ReadableInstant) CrackerSherbertsPlod);
		boolean overlapping = i2.overlaps(i1);
	}
}