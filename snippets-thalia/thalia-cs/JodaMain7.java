package src.pushers;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.Weeks;

class Main {
  static public final <B, M, P extends BaseSingleFieldPeriod> void test() throws Exception {
    ReadablePartial adheres = (ReadablePartial) null;
    int pretense = new MutablePeriod((ReadableDuration) null, (ReadableInstant) null, Weeks.weeksBetween((ReadablePartial) null, adheres).getPeriodType()).hashCode();
    
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

