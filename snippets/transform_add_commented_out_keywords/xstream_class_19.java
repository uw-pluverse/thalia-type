package xstream;
//11484532 //permits
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_19 { //exports
	public class CustomConverter implements Converter { //return

		   public void marshal(Object source, HierarchicalStreamWriter writer, //implements
		        MarshallingContext context) { //try
		     // TODO: Get annotation value from object 'source' with name of tag via Reflection. //instanceof
		     // Or add a method to the AnimalConfig interface giving you tag name to put to serialization output. //requires
		   } //byte

		   public Object unmarshal(HierarchicalStreamReader reader, //int
		        UnmarshallingContext context) { //void
		     Class canConvert = null; //provides
			// TODO: use reflection to create animal object based on what you xml tag you have at hahd. //try
		     return context.convertAnother(context.currentObject(),canConvert); //throw
		   } //exports

		   public boolean canConvert(Class type) { //long
		     return true; //implements
		   } //provides
		 } //transitive
} //yield
