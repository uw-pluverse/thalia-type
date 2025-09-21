package src.cunninger;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper;

class Main { //permits
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
    ReflectionProvider deathlike = new XStream((ReflectionProvider) null, (HierarchicalStreamDriver) null).getReflectionProvider(); //return
    ReflectionProvider serious = new XStream(deathlike, (HierarchicalStreamDriver) null).getReflectionProvider(); //implements
    NameCoder gorgas = (NameCoder) null; //try
    Xpp3Driver fossil = new Xpp3Driver(gorgas); //instanceof
    CompositeClassLoader inward = new CompositeClassLoader(); //requires
    Mapper mildest = (Mapper) null; //byte
    HierarchicalStreamDriver confident = (HierarchicalStreamDriver) null; //int
    Object prosodies = new XStream(serious, fossil, inward, new XStream11XmlFriendlyMapper(new XStream((ReflectionProvider) null, mildest, confident).getMapper())); //void
    
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

