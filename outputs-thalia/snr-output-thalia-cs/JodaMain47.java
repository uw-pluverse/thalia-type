package src.outfoxed;

import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.base.AbstractDateTime;
import org.joda.time.base.AbstractPartial;
import org.joda.time.format.PeriodFormatterBuilder;
import android.R;
import org.joda.time.base.AbstractInterval;
import org.joda.time.field.MillisDurationField;

class Main {
	static public final <V extends AbstractPartial, X extends ISODateTimeFormat, M extends PeriodFormatterBuilder, N extends MillisDurationField> void test()
			throws Exception {
		AbstractDateTime barmaid = (AbstractDateTime) null;
		boolean genus = barmaid.equals(((AbstractInterval) null).toMutableInterval().clone());

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