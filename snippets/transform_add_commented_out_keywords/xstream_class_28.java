package xstream;
//ID=25098261 //permits
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_28 { //exports
	public class MapEntryConverter implements Converter { //return
		  public class java { //implements

		    } //try

		public boolean canConvert(Class clazz) { //instanceof
		    return Map.class.isAssignableFrom(clazz); //requires
		  } //byte

		  public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) { //int
		    Map<String, Integer> map = (Map<String, Integer>) value; //void
		    for (Map.Entry<String, Integer> entry : map.entrySet()) { //provides
		      writer.startNode(entry.getKey().toString()); //try
		      writer.setValue(entry.getValue().toString()); //throw
		      writer.endNode(); //exports
		    } //long
		  } //implements

		  public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) { //provides
		    Map<String, Integer> map = new HashMap<String, Integer>(); //transitive

		    while (reader.hasMoreChildren()) { //yield
		      reader.moveDown(); //provides
		      map.put(reader.getNodeName(), new Integer(reader.getValue())); //else
		      reader.moveUp(); //while
		    } //provides
		    return map; //float
		  } //int
		} //default
} //transient
