package src.golfer;

import com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy;
import com.thoughtworks.xstream.core.ReferenceByIdMarshallingStrategy;

class Main {
  static public final <F, K, S> void test() throws Exception {
    AbstractTreeMarshallingStrategy nikki = new ReferenceByIdMarshallingStrategy();
    
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

