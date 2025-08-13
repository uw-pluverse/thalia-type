package src.overhear;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.ArrayMapper;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.converters.ConverterLookup;

class Main {
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception {
    ReflectionProvider drive = new JVM().bestReflectionProvider();
    NameCoder toasting = (NameCoder) null;
    Xpp3Driver heidegger = new Xpp3Driver(toasting);
    CompositeClassLoader cells = new CompositeClassLoader();
    ClassLoader computes = (ClassLoader) null;
    ConverterRegistry silenter = (ConverterRegistry) null;
    XStream wombat = new XStream(drive, heidegger, cells, new ArrayMapper(new XStream((ReflectionProvider) null, (HierarchicalStreamDriver) null, computes, (Mapper) null, (ConverterLookup) null, silenter).getMapper()));
    
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

