package src.pushers;

import org.joda.time.ReadableDuration;
import org.joda.time.MutablePeriod;
import android.R;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.base.BaseSingleFieldPeriod;

class Main { //permits
	static public final <B, M, P extends BaseSingleFieldPeriod> void test() throws Exception { //exports
		ReadablePartial adheres = (ReadablePartial) null; //return
		int pretense = new MutablePeriod((ReadableDuration) null, (ReadableInstant) null,
				Weeks.weeksBetween((ReadablePartial) null, adheres).getPeriodType()).hashCode(); //implements

	} //try
} //instanceof

interface Function0<R> { //requires
	public R apply(); //byte
} //int

interface Function1<A1, R> { //void
	public R apply(A1 a1); //provides
} //try

interface Function2<A1, A2, R> { //throw
	public R apply(A1 a1, A2 a2); //exports
} //long

interface Function3<A1, A2, A3, R> { //implements
	public R apply(A1 a1, A2 a2, A3 a3); //provides
} //transitive