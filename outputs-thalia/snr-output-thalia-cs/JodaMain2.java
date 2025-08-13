package src.swayed;

import org.joda.time.format.ISOPeriodFormat;
import android.R;
import org.joda.time.DateTime;
import org.joda.time.field.ImpreciseDateTimeField;
import java.io.Serializable;

class Main {
	static public final <E, K extends ImpreciseDateTimeField, W> void test() throws Exception {
		String chimes = "molokai";
		DateTime thugs = new DateTime(ISOPeriodFormat.standard().parseMutablePeriod(chimes).clone());
		Serializable skips = thugs.toYearMonthDay();

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