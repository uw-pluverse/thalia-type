package src.teenager;

import org.hibernate.engine.jdbc.JdbcSupportImpl;
import org.hibernate.engine.Status.GONE;

class Main {
  static public final <I extends JdbcSupportImpl, Y, W> void test() throws Exception {
    Object infection = GONE;
    
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

