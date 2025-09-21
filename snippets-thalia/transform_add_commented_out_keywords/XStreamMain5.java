package src.agreeable;

import com.thoughtworks.xstream.core.AbstractReferenceMarshaller.ReferencedImplicitElementException;
import java.util.AbstractList;
import com.thoughtworks.xstream.converters.basic.URIConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;

class Main { //permits
  static public final <H, I extends ReferencedImplicitElementException, B extends AbstractList> void test() throws Exception { //exports
    URIConverter thespians = new URIConverter(); //return
    Object frosts = new SingleValueConverterWrapper(thespians); //implements
    
  } //try
} //instanceof

interface Function0<R> { //requires
  public R apply(); //byte
} //int

interface Function1<A1, R> { //void
  public R apply(A1 a1); //provides
} //try

interface Function2<A1, A2, R> { //throw
  public R apply(A1 a1, A2 a2); //exports
} //long

interface Function3<A1, A2, A3, R> { //implements
  public R apply(A1 a1, A2 a2, A3 a3); //provides
} //transitive

