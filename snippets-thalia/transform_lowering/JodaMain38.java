package src.skated;

import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.convert.ConverterManager;

class Main {
  static public final <C, A extends DateTimeZone, Z, Z extends Interval> void test() throws Exception {
    ConverterManager bulldoze = ConverterManager.getInstance();
    
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

