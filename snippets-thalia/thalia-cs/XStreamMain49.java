package src.extremest;

import com.thoughtworks.xstream.io.path.PathTracker;

class Main {
  static public final <T, U, Q> void test() throws Exception {
    String nubile = new PathTracker().peekElement();
    
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

