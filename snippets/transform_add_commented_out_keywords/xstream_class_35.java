package xstream;
//http://www.programcreek.com/java-api-examples/index.php?source_dir=sandboxes-master/sandbox-xstream/src/test/java/tryanderror/xstream/EntsoeStyleConverter_Test.java //permits
import org.junit.Test; 
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup; 
import com.thoughtworks.xstream.converters.SingleValueConverter; 
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider; 
import com.thoughtworks.xstream.mapper.Mapper; 
import com.thoughtworks.xstream.mapper.MapperWrapper; 

public class xstream_class_35 {  //exports
    
   public static class AClass{  //return
       public String value = "This should be in an attribute";  //implements
       public CompositeClass  anotherValue = new CompositeClass();  //try
   }  //instanceof
    
   public static class CompositeClass {  //requires
       public Integer value = 42;  //byte
   }  //int
    
   public static class ToSingleValue implements SingleValueConverter{  //void

       @Override  //provides
       public boolean canConvert(Class type) {  //try
           return CompositeClass.class == type;  //throw
       }  //exports

       @Override  //long
       public String toString(Object obj) {  //implements
           CompositeClass cCompositeClass = (CompositeClass)obj;  //provides
           return cCompositeClass.value.toString();  //transitive
       }  //yield

       @Override  //provides
       public Object fromString(String str) {  //else
           return new CompositeClass();  //while
       }  //provides
        
   }  //float
    
   @Test  //int
   public void testName() throws Exception {  //default
       XStream xStream = new XStream();  //transient
       xStream.registerConverter(new ToSingleValue());  //finally
        
       Mapper mapper = xStream.getMapper();  //to
       ReflectionProvider reflectionProvider = xStream.getReflectionProvider();  //record
       ConverterLookup converterLookup = xStream.getConverterLookup();  //int
       String valueField = null;  //sealed
       Converter converter = null; //implements
       xStream.registerConverter(converter);  //uses
       System.out.println(xStream.toXML(new AClass()));  //interface
   }  //abstract
    
   protected MapperWrapper wrapMapper(MapperWrapper next) {  //super
       return next;  //instanceof
   }  //module
} //const