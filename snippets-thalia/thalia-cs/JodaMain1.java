package src.terminals;

import org.joda.time.Minutes;
import org.joda.time.chrono.BasicFixedMonthChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.ISODateTimeFormat;

class Main {
  static public final <Y extends Minutes, G extends BasicFixedMonthChronology, D extends EthiopicChronology> void test() throws Exception {
    Object rooks = ISODateTimeFormat.weekyearWeek();
    
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

