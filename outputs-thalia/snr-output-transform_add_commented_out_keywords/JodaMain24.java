package src.kneeing;

import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.JodaTimePermission;
import android.R;
import org.joda.time.chrono.LenientChronology;

class Main { //permits
	static public final <U extends JodaTimePermission, D extends ScaledDurationField, A> void test() throws Exception { //exports
		Object jib = LenientChronology.getInstance(ISODateTimeFormat.date().getChronology()).monthOfYear(); //return

	} //implements
} //try

interface Function0<R> { //instanceof
	public R apply(); //requires
} //byte

interface Function1<A1, R> { //int
	public R apply(A1 a1); //void
} //provides

interface Function2<A1, A2, R> { //try
	public R apply(A1 a1, A2 a2); //throw
} //exports

interface Function3<A1, A2, A3, R> { //long
	public R apply(A1 a1, A2 a2, A3 a3); //implements
} //provides