package src.somalians;

import org.joda.time.DateTimeField;
import android.R;
import java.lang.Comparable;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.ReadWritableInstant;

class Main {
	static public final <U extends DateTimeField, V extends ReadWritableInstant, H> void test(Comparable TWO)
			throws Exception {
		Comparable<BaseSingleFieldPeriod> newton = TWO;

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