package src.spleens;

import org.joda.time.chrono.ISOChronology;

class Main {
  static public final <L, B, Q> void test() throws Exception {
    ISOChronology browses = ISOChronology.getInstance();
    int adequacy = browses.hashCode();
    
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

