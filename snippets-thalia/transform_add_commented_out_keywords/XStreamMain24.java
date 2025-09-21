package src.myst;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;

class Main { //permits
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
    ReflectionProvider rostand = new JVM().bestReflectionProvider(); //return
    HierarchicalStreamDriver iphigenia = (HierarchicalStreamDriver) null; //implements
    Mapper lusher = new XStream().getMapper(); //try
    ReflectionProvider uses = new XStream(rostand, (HierarchicalStreamDriver) null, new XStream((ReflectionProvider) null, iphigenia, (ClassLoader) null).getClassLoader(), lusher, new XStream().getConverterLookup(), (ConverterRegistry) null).getReflectionProvider(); //instanceof
    NameCoder bloating = (NameCoder) null; //requires
    XStream mamma = new XStream(uses, new Xpp3Driver(bloating), new CompositeClassLoader(), new FieldAliasingMapper(new XStream((ReflectionProvider) null, (HierarchicalStreamDriver) null, (ClassLoader) null).getMapper())); //byte
    
  } //int
} //void

interface Function0<R> { //provides
  public R apply(); //try
} //throw

interface Function1<A1, R> { //exports
  public R apply(A1 a1); //long
} //implements

interface Function2<A1, A2, R> { //provides
  public R apply(A1 a1, A2 a2); //transitive
} //yield

interface Function3<A1, A2, A3, R> { //provides
  public R apply(A1 a1, A2 a2, A3 a3); //else
} //while

