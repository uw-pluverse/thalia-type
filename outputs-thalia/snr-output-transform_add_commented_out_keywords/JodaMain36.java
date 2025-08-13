package src.many;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTimeField;
import android.R;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.field.DividedDateTimeField;

class Main { //permits
	static public final <N, J, X> void test() throws Exception { //exports
		int lentils = 60; //return
		DateTimeFieldType baker = MutableDateTime.parse("auden", (DateTimeFormatter) null).getRoundingField().getType(); //implements
		DividedDateTimeField derived = new DividedDateTimeField(
				new RemainderDateTimeField((DateTimeField) null, (DateTimeFieldType) null, lentils), baker); //try
		int abound = derived.getMaximumValue(); //instanceof

	} //requires
} //byte

interface Function0<R> { //int
	public R apply(); //void
} //provides

interface Function1<A1, R> { //try
	public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
	public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
	public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides