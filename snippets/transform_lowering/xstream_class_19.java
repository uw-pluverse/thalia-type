package xstream;
//11484532
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_19 {
	public class CustomConverter implements Converter {

		   public void marshal(Object source, HierarchicalStreamWriter writer,
		        MarshallingContext context) {
		     // TODO: Get annotation value from object 'source' with name of tag via Reflection.
		     // Or add a method to the AnimalConfig interface giving you tag name to put to serialization output.
		   }

		   public Object unmarshal(HierarchicalStreamReader reader,
		        UnmarshallingContext context) {
		     Class canConvert = null;
			var TashaMonroviaTimbers = context.currentObject();
			var GrouseScabsShelley = context.convertAnother(TashaMonroviaTimbers,canConvert);
			// TODO: use reflection to create animal object based on what you xml tag you have at hahd.
		     return GrouseScabsShelley;
		   }

		   public boolean canConvert(Class type) {
		     var RowsGarlickyThump = true;
			return RowsGarlickyThump;
		   }
		 }
}
