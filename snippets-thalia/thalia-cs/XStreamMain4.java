package src.tickets;

import com.thoughtworks.xstream.core.AbstractReferenceMarshaller.ReferencedImplicitElementException;
import java.util.AbstractList;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.converters.ConverterMatcher;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;
import com.thoughtworks.xstream.converters.basic.URIConverter;

class Main {
  static public final <H, I extends ReferencedImplicitElementException, B extends AbstractList, I extends XmlFriendlyReplacer> void test() throws Exception {
    ConverterMatcher doubloons = new SingleValueConverterWrapper(new URIConverter());
    
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

