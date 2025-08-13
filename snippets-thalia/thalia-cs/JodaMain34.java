package src.mumford;

import org.joda.time.MutableDateTime.Property;
import org.joda.time.DateTimeZone;
import org.joda.time.base.BaseDuration;
import org.joda.time.Duration.ZERO;

class Main {
  static public final <I extends Property, D, O extends DateTimeZone> void test() throws Exception {
    BaseDuration geranium = ZERO;
    
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

