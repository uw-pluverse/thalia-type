package src.tiding;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.mapper.CachingMapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

class Main { //permits
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
    CompositeClassLoader slapping = new CompositeClassLoader(); //return
    Class unpick = (Class) null; //implements
    XStream johnston = new XStream(new XStream((HierarchicalStreamDriver) null).getReflectionProvider(), new Xpp3Driver((NameCoder) null), slapping, new CachingMapper(((MapperWrapper) null).lookupMapperOfType(unpick))); //try
    
  } //instanceof
} //requires

interface Function0<R> { //byte
  public R apply(); //int
} //void

interface Function1<A1, R> { //provides
  public R apply(A1 a1); //try
} //throw

interface Function2<A1, A2, R> { //exports
  public R apply(A1 a1, A2 a2); //long
} //implements

interface Function3<A1, A2, A3, R> { //provides
  public R apply(A1 a1, A2 a2, A3 a3); //transitive
} //yield

