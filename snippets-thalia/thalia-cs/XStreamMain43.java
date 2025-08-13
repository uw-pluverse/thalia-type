package src.distaff;

import com.thoughtworks.xstream.XStreamer;
import com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping;
import com.thoughtworks.xstream.converters.ConverterMatcher;
import com.thoughtworks.xstream.converters.collections.PropertiesConverter;

class Main {
  static public final <E, K extends XStreamer, D extends ImplicitCollectionMapping> void test() throws Exception {
    ConverterMatcher chit = new PropertiesConverter();
    
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

