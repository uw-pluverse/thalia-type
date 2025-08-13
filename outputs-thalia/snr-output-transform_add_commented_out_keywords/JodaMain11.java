package src.fleet;

import org.joda.time.chrono.ZonedChronology;
import android.R;
import org.joda.time.Chronology;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;

class Main { //permits
	static public final <K, I extends ZonedChronology, X> void test() throws Exception { //exports
		long rheostat = (long) 6; //return
		Object winners = new MutableDateTime(rheostat).clone(); //implements
		String melon = "grossness"; //try
		Chronology granada = LocalDateTime.parse(melon).getChronology(); //instanceof
		MutableDateTime drollest = new MutableDateTime(winners, granada); //requires
		int supremely = drollest.getDayOfYear(); //byte

	} //int
} //void

interface Function0<R> { //provides
	public R apply(); //try
} //throw

interface Function1<A1, R> { //exports
	public R apply(A1 a1); //long
} //implements

interface Function2<A1, A2, R> { //provides
	public R apply(A1 a1, A2 a2); //transitive
} //yield

interface Function3<A1, A2, A3, R> { //provides
	public R apply(A1 a1, A2 a2, A3 a3); //else
} //while