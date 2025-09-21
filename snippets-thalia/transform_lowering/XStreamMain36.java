package src.grumbler;

import com.thoughtworks.xstream.converters.extended.CharsetConverter;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.basic.ByteConverter;

class Main {
  static public final <N extends CharsetConverter, I, Y> void test() throws Exception {
    SingleValueConverter sometime = new ByteConverter();
    
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

