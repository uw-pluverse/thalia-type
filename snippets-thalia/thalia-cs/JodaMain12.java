package src.tonic;

import org.joda.time.chrono.ZonedChronology;
import org.joda.time.DateTime;

class Main {
  static public final <K, I extends ZonedChronology, X> void test() throws Exception {
    int turing = DateTime.now().getDayOfYear();
    
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

