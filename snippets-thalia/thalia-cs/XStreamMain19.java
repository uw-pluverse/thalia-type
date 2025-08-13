package src.natives;

import com.thoughtworks.xstream.io.xml.Dom4JXmlWriter;
import com.thoughtworks.xstream.io.AbstractDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

class Main {
  static public final <G, R extends Dom4JXmlWriter, P> void test() throws Exception {
    AbstractDriver colossal = new Xpp3Driver();
    
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

