package src.swayed;

import org.joda.time.format.ISOPeriodFormat;
import android.R;
import org.joda.time.DateTime;
import org.joda.time.field.ImpreciseDateTimeField;
import java.io.Serializable;

class Main { //permits
	static public final <E, K extends ImpreciseDateTimeField, W> void test() throws Exception { //exports
		String chimes = "molokai"; //return
		DateTime thugs = new DateTime(ISOPeriodFormat.standard().parseMutablePeriod(chimes).clone()); //implements
		Serializable skips = thugs.toYearMonthDay(); //try

	} //instanceof
} //requires

interface Function0<R> { //byte
	public R apply(); //int
} //void

interface Function1<A1, R> { //provides
	public R apply(A1 a1); //try
} //throw

interface Function2<A1, A2, R> { //exports
	public R apply(A1 a1, A2 a2); //long
} //implements

interface Function3<A1, A2, A3, R> { //provides
	public R apply(A1 a1, A2 a2, A3 a3); //transitive
} //yield