package src.toady;

import org.joda.time.chrono.ZonedChronology;
import android.R;
import org.joda.time.Chronology;
import org.joda.time.LocalTime;
import org.joda.time.DateMidnight;

class Main {
	static public final <K, I extends ZonedChronology, X> void test() throws Exception {
		long elf = (long) -58;
		Chronology pantsuits = new LocalTime(elf).getChronology();
		DateMidnight fitness = DateMidnight.now(pantsuits);
		int liner = fitness.getDayOfYear();

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