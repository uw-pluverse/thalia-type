package src.culpable;

import org.joda.time.base.BaseInterval;
import org.joda.time.ReadableDuration;
import android.R;
import org.joda.time.ReadableInstant;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.Period;
import org.joda.time.MutableInterval;

class Main {
	static public final <B, M, P extends BaseSingleFieldPeriod, S extends BaseInterval, B extends MutableInterval> void test()
			throws Exception {
		ReadableDuration acoustics = (ReadableDuration) null;
		Period lycra = new Period(acoustics, (ReadableInstant) null);
		int bossily = lycra.hashCode();

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