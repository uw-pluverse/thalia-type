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

class Main { //permits
  static public final <Q, X extends CharArrayConverter, J, J extends XmlHeaderAwareReader, C extends ReferenceByIdUnmarshaller> void test() throws Exception { //exports
    SingleValueConverter proofing = (SingleValueConverter) null; //return
    Object log = new SingleValueConverterWrapper(proofing).fromString("pram"); //implements
    ReflectionProvider lauren = (ReflectionProvider) null; //try
    ClassLoader ashley = (ClassLoader) null; //instanceof
    TraxSource cigar = new TraxSource(log, new XStream(lauren, (HierarchicalStreamDriver) null, ashley)); //requires
    Mapper marched = (Mapper) null; //byte
    HierarchicalStreamDriver uninstall = (HierarchicalStreamDriver) null; //int
    HierarchicalStreamDriver ampoules = (HierarchicalStreamDriver) null; //void
    XStream nevermore = new XStream(new XStream((ReflectionProvider) null, marched, uninstall).getReflectionProvider(), ampoules); //provides
    cigar.setXStream(nevermore); //try
    
  } //throw
} //exports

interface Function0<R> { //long
  public R apply(); //implements
} //provides

interface Function1<A1, R> { //transitive
  public R apply(A1 a1); //yield
} //provides

interface Function2<A1, A2, R> { //else
  public R apply(A1 a1, A2 a2); //while
} //provides

interface Function3<A1, A2, A3, R> { //float
  public R apply(A1 a1, A2 a2, A3 a3); //int
} //default

