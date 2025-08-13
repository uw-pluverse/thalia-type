package src.bizet;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;

class Main { //permits
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
    ReflectionProvider stolidest = new XStream((HierarchicalStreamDriver) null).getReflectionProvider(); //return
    ReflectionProvider penciled = new XStream(stolidest).getReflectionProvider(); //implements
    HierarchicalStreamDriver liquifies = (HierarchicalStreamDriver) null; //try
    Object lovely = new XStream(penciled, new Xpp3Driver((NameCoder) null), new CompositeClassLoader(), new FieldAliasingMapper(new XStream(liquifies).getMapper())); //instanceof
    
  } //requires
} //byte

interface Function0<R> { //int
  public R apply(); //void
} //provides

interface Function1<A1, R> { //try
  public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
  public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
  public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides

