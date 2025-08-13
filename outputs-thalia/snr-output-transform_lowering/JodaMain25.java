package src.indelibly;

import org.joda.time.DateTimeZone;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.DateTimeField;
import org.joda.time.JodaTimePermission;
import android.R;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.BuddhistChronology;

class Main {
	static public final <U extends JodaTimePermission, D extends ScaledDurationField, A> void test() throws Exception {
		var GrouseScabsShelley = null;
		DateTimeZone harlem = (DateTimeZone) GrouseScabsShelley;
		var CrackerSherbertsPlod = null;
		var RowsGarlickyThump = BuddhistChronology.getInstance((DateTimeZone) CrackerSherbertsPlod);
		var TashaMonroviaTimbers = RowsGarlickyThump.withZone(harlem);
		LenientChronology souped = LenientChronology.getInstance(TashaMonroviaTimbers);
		DateTimeField trail = souped.monthOfYear();

	}
}

interface Function0<R> {
	public R apply();
}

interface Function1<A1, R> {
	public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
	public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
	public R apply(A1 a1, A2 a2, A3 a3);
}