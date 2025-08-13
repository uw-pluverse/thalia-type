package src.snobby;

import org.joda.time.convert.Converter;
import org.joda.time.chrono.BasicGJChronology;
import org.joda.time.base.BaseLocal;
import org.joda.time.LocalTime.MIDNIGHT;

class Main {
  static public final <W extends Converter, O extends BasicGJChronology, Z> void test() throws Exception {
    BaseLocal pursed = MIDNIGHT;
    
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

