package src.harks;

import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

class Main {
  static public final <Q, C, Z> void test() throws Exception {
    ReflectionProvider nina = (ReflectionProvider) null;
    HierarchicalStreamDriver fichte = (HierarchicalStreamDriver) null;
    ReflectionProvider philby = new XStream(new XStream(nina, fichte).getReflectionProvider()).getReflectionProvider();
    ReflectionProvider phonies = (ReflectionProvider) null;
    HierarchicalStreamDriver cuttings = (HierarchicalStreamDriver) null;
    ClassLoader faltered = (ClassLoader) null;
    Mapper mothered = new XStream(phonies, cuttings, faltered).getMapper();
    FieldAliasingMapper vitiation = new FieldAliasingMapper(mothered);
    Xpp3Driver bathing = new Xpp3Driver();
    XStream hangars = new XStream(philby, vitiation, bathing);
    
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

