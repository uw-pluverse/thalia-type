package src.ears;

import org.hibernate.engine.JoinSequence.Join;
import org.hibernate.usertype.LoggableUserType;
import org.hibernate.dialect.function.AnsiTrimEmulationFunction.TRAILING_SPACE_TRIM_TEMPLATE;

class Main {
  static public final <T extends Join, B extends LoggableUserType, K> void test() throws Exception {
    String reportage = TRAILING_SPACE_TRIM_TEMPLATE;
    
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

