package src.pummeled;

import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

class Main {
  static public final <Q, C, Z> void test() throws Exception {
    ReflectionProvider carthage = (ReflectionProvider) null;
    HierarchicalStreamDriver retries = (HierarchicalStreamDriver) null;
    ClassLoader tans = (ClassLoader) null;
    HierarchicalStreamDriver avenging = (HierarchicalStreamDriver) null;
    ClassLoader auguries = new XStream((HierarchicalStreamDriver) null).getClassLoader();
    ReflectionProvider daises = new XStream(new XStream(carthage, retries, tans).getReflectionProvider(), avenging, auguries).getReflectionProvider();
    FieldAliasingMapper exempts = new FieldAliasingMapper(new XStream().getMapper());
    Xpp3Driver childish = new Xpp3Driver();
    Object smoothes = new XStream(daises, exempts, childish);
    
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

