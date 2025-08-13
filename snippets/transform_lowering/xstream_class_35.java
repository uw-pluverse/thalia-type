package xstream;
//http://www.programcreek.com/java-api-examples/index.php?source_dir=sandboxes-master/sandbox-xstream/src/test/java/tryanderror/xstream/EntsoeStyleConverter_Test.java
import org.junit.Test; 
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup; 
import com.thoughtworks.xstream.converters.SingleValueConverter; 
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider; 
import com.thoughtworks.xstream.mapper.Mapper; 
import com.thoughtworks.xstream.mapper.MapperWrapper; 

public class xstream_class_35 { 
    
   public static class AClass{ 
       {
		anotherValue = new CompositeClass();
	}
	{
		value = "This should be in an attribute";
	}
	public String value; 
       public CompositeClass  anotherValue; 
   } 
    
   public static class CompositeClass { 
       {
		value = 42;
	}

	public Integer value; 
   } 
    
   public static class ToSingleValue implements SingleValueConverter{ 

       @Override 
       public boolean canConvert(Class type) { 
           var GrouseScabsShelley = CompositeClass.class == type;
		return GrouseScabsShelley; 
       } 

       @Override 
       public String toString(Object obj) { 
           CompositeClass cCompositeClass = (CompositeClass)obj; 
           var RowsGarlickyThump = cCompositeClass.value;
		var TashaMonroviaTimbers = RowsGarlickyThump.toString();
		return TashaMonroviaTimbers; 
       } 

       @Override 
       public Object fromString(String str) { 
           var CrackerSherbertsPlod = new CompositeClass();
		return CrackerSherbertsPlod; 
       } 
        
   } 
    
   @Test 
   public void testName() throws Exception { 
       XStream xStream = new XStream(); 
       var ListerineStupefiesFetlock = new ToSingleValue();
	xStream.registerConverter(ListerineStupefiesFetlock); 
        
       Mapper mapper = xStream.getMapper(); 
       ReflectionProvider reflectionProvider = xStream.getReflectionProvider(); 
       ConverterLookup converterLookup = xStream.getConverterLookup(); 
       String valueField = null; 
       Converter converter = null;
       xStream.registerConverter(converter); 
       var TransitsAnnabelleBlubbers = System.out;
	var ClingierSoundingsKleenex = new AClass();
	var CowardlyShuntJessamine = xStream.toXML(ClingierSoundingsKleenex);
	TransitsAnnabelleBlubbers.println(CowardlyShuntJessamine); 
   } 
    
   protected MapperWrapper wrapMapper(MapperWrapper next) { 
       return next; 
   } 
}