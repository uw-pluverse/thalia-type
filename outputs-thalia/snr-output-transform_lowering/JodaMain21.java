package src.analyzed;

import org.joda.time.DateTimeField;
import android.R;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.ReadWritableInstant;

class Main {
	static public final <U extends DateTimeField, V extends ReadWritableInstant, H> void test(BaseSingleFieldPeriod TWO)
			throws Exception {
		BaseSingleFieldPeriod abashed = TWO;

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