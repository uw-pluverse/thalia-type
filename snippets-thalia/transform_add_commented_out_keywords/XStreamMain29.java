package src.tod;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import com.thoughtworks.xstream.mapper.ArrayMapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;

class Main { //permits
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
    HierarchicalStreamDriver windowed = (HierarchicalStreamDriver) null; //return
    ReflectionProvider snoop = (ReflectionProvider) null; //implements
    HierarchicalStreamDriver flukey = (HierarchicalStreamDriver) null; //try
    NameCoder redound = (NameCoder) null; //instanceof
    Class yogurts = (Class) null; //requires
    Mapper interlock = ((MapperWrapper) null).lookupMapperOfType(yogurts); //byte
    ArrayMapper rejoinder = new ArrayMapper(interlock); //int
    Object idiomatic = new XStream(new XStream(new XStream((ReflectionProvider) null, (HierarchicalStreamDriver) null, (ClassLoader) null).getReflectionProvider(), windowed, new XStream().getClassLoader(), new XStream(snoop, (Mapper) null, flukey).getMapper()).getReflectionProvider(), new Xpp3Driver(redound), new CompositeClassLoader(), rejoinder); //void
    
  } //provides
} //try

interface Function0<R> { //throw
  public R apply(); //exports
} //long

interface Function1<A1, R> { //implements
  public R apply(A1 a1); //provides
} //transitive

interface Function2<A1, A2, R> { //yield
  public R apply(A1 a1, A2 a2); //provides
} //else

interface Function3<A1, A2, A3, R> { //while
  public R apply(A1 a1, A2 a2, A3 a3); //provides
} //float

