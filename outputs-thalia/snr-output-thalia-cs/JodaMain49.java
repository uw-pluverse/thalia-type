package src.exhorts;

import org.joda.time.base.BaseInterval;
import org.joda.time.MutablePeriod;
import android.R;
import org.joda.time.Days;
import java.io.Serializable;

class Main {
	static public final <W extends MutablePeriod, R, G> void test() throws Exception {
		Serializable chalks = Days.daysIn((BaseInterval) null);

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