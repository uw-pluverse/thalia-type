package src.humanists;

import org.joda.time.base.AbstractDateTime;
import android.R;
import org.joda.time.base.AbstractInterval;
import org.joda.time.PeriodType;
import org.joda.time.MutableInterval;

class Main {
	static public final <F, V extends PeriodType, E, X extends AbstractDateTime> void test() throws Exception {
		MutableInterval splotch = ((AbstractInterval) null).toMutableInterval();
		long potatoes = splotch.getStartMillis();

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