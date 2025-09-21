package src.greenwich;

import java.time.format.DateTimeFormatterBuilder;
import org.joda.time.base.AbstractDateTime;
import org.joda.time.chrono.ZonedChronology;
import android.R;

class Main {
	static public final <K, I extends ZonedChronology, X, M extends DateTimeFormatterBuilder> void test()
			throws Exception {
		int layoffs = ((AbstractDateTime) null).getDayOfYear();

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