package src.trunks;

import org.joda.time.chrono.GJChronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.chrono.LenientChronology;

class Main {
  static public final <N extends GJChronology, P, G> void test() throws Exception {
    int withdraws = 59;
    int ryan = -26;
    DateTimeZone eruption = (DateTimeZone) null;
    Chronology germans = new DateTime(-39, 82, -84, withdraws, -98, ryan, 83, eruption).toLocalDate().getChronology();
    Object litigates = LenientChronology.getInstance(germans).dayOfMonth();
    
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

