package src.vented;

import com.thoughtworks.xstream.io.xml.XmlFriendlyReader;
import com.thoughtworks.xstream.core.util.OrderRetainingMap;
import java.util.Set;

class Main {
  static public final <R extends XmlFriendlyReader, M extends OrderRetainingMap, W> void test() throws Exception {
    var GrouseScabsShelley = null;
	Set worries = ((M) GrouseScabsShelley).keySet();
    
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

