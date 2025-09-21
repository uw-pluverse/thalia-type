package src.donner;

import com.thoughtworks.xstream.core.AbstractReferenceMarshaller.ReferencedImplicitElementException;
import java.util.AbstractList;
import com.thoughtworks.xstream.converters.basic.StringBuilderConverter;
import com.thoughtworks.xstream.converters.ErrorReporter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;

class Main {
  static public final <H, I extends ReferencedImplicitElementException, B extends AbstractList> void test() throws Exception {
    StringBuilderConverter careening = new StringBuilderConverter();
    ErrorReporter espouses = new SingleValueConverterWrapper(careening);
    
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

