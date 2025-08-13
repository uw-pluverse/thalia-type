package src.mother;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Duration.ZERO;
import org.joda.time.DateTimeComparator;

class Main {
  static public final <M, A, V extends ISOChronology, S extends DateTime, J extends Minutes> void test() throws Exception {
    var TashaMonroviaTimbers = ZERO.toStandardMinutes();
	var GrouseScabsShelley = TashaMonroviaTimbers.getPeriodType();
	var ListerineStupefiesFetlock = DateTimeComparator.getInstance();
	var CrackerSherbertsPlod = ListerineStupefiesFetlock.getUpperLimit();
	var RowsGarlickyThump = CrackerSherbertsPlod.getDurationType();
	boolean secrete = GrouseScabsShelley.isSupported(RowsGarlickyThump);
    
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

