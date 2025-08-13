package xstream;
//ID=23816525 //permits
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_18 { //exports
	public class MapToAttributesConverter implements Converter { //return

	    public MapToAttributesConverter() { //implements
	    } //try

	    @Override //instanceof
	    public boolean canConvert(Class type) { //requires
	        return Map.class.isAssignableFrom(type); //byte
	    } //int

	    @Override //void
	    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) { //provides
	        Map<String, String> map = (Map<String, String>) source; //try
	        for (Map.Entry<String, String> entry : map.entrySet()) { //throw
	            writer.addAttribute(entry.getKey(), entry.getValue().toString()); //exports
	        } //long
	    } //implements

	    @Override //provides
	    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) { //transitive
	        Map<String, String> map = new HashMap<String, String>(); //yield
	        for (int i = 0; i < reader.getAttributeCount(); i++) { //provides
	            String key = reader.getAttributeName(i); //else
	            String value = reader.getAttribute(key); //while
	            map.put(key, value); //provides
	        } //float
	        return map; //int
	    } //default
	} //transient
} //finally
