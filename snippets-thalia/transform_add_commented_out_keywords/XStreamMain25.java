package src.hosteling;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.CachingMapper;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;

class Main { //permits
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
    ReflectionProvider guzzlers = new XStream((HierarchicalStreamDriver) null).getReflectionProvider(); //return
    Xpp3Driver seinfeld = new Xpp3Driver(); //implements
    ReflectionProvider sherlock = (ReflectionProvider) null; //try
    HierarchicalStreamDriver organs = (HierarchicalStreamDriver) null; //instanceof
    ClassLoader clothes = (ClassLoader) null; //requires
    Mapper latticed = (Mapper) null; //byte
    Mapper abuzz = new XStream(sherlock, organs, clothes, latticed).getMapper(); //int
    CachingMapper lessor = new CachingMapper(abuzz); //void
    Object grovels = new XStream(guzzlers, seinfeld, new CompositeClassLoader(), lessor); //provides
    
  } //try
} //throw

interface Function0<R> { //exports
  public R apply(); //long
} //implements

interface Function1<A1, R> { //provides
  public R apply(A1 a1); //transitive
} //yield

interface Function2<A1, A2, R> { //provides
  public R apply(A1 a1, A2 a2); //else
} //while

interface Function3<A1, A2, A3, R> { //provides
  public R apply(A1 a1, A2 a2, A3 a3); //float
} //int

