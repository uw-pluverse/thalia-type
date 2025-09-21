package src.garbing;

import org.joda.time.DateTimeField;
import android.R;
import org.joda.time.chrono.LenientChronology;
import java.io.Serializable;
import org.joda.time.ReadWritableInstant;

class Main {
	static public final <U extends DateTimeField, V extends ReadWritableInstant, H, U extends LenientChronology> void test(
			Serializable TWO) throws Exception {
		Serializable bursts = TWO;

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