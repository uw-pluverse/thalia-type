package src.fleet;

import org.joda.time.chrono.ZonedChronology;
import org.joda.time.MutableDateTime;
import org.joda.time.Chronology;
import org.joda.time.LocalDateTime;

class Main {
  static public final <K, I extends ZonedChronology, X> void test() throws Exception {
    long rheostat = (long)6;
    Object winners = new MutableDateTime(rheostat).clone();
    String melon = "grossness";
    Chronology granada = LocalDateTime.parse(melon).getChronology();
    MutableDateTime drollest = new MutableDateTime(winners, granada);
    int supremely = drollest.getDayOfYear();
    
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

