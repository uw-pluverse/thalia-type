package src.memories;

import com.thoughtworks.xstream.converters.collections.CharArrayConverter;
import com.thoughtworks.xstream.core.util.XmlHeaderAwareReader;
import com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.xml.TraxSource;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.Mapper;

class Main {
  static public final <Q, X extends CharArrayConverter, J, J extends XmlHeaderAwareReader, C extends ReferenceByIdUnmarshaller> void test() throws Exception {
    SingleValueConverter proofing = (SingleValueConverter) null;
    Object log = new SingleValueConverterWrapper(proofing).fromString("pram");
    ReflectionProvider lauren = (ReflectionProvider) null;
    ClassLoader ashley = (ClassLoader) null;
    TraxSource cigar = new TraxSource(log, new XStream(lauren, (HierarchicalStreamDriver) null, ashley));
    Mapper marched = (Mapper) null;
    HierarchicalStreamDriver uninstall = (HierarchicalStreamDriver) null;
    HierarchicalStreamDriver ampoules = (HierarchicalStreamDriver) null;
    XStream nevermore = new XStream(new XStream((ReflectionProvider) null, marched, uninstall).getReflectionProvider(), ampoules);
    cigar.setXStream(nevermore);
    
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

