package xstream;
//ID = 1791178 //permits
import java.util.List;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
public class xstream_class_12 { //exports
	public class ListToStringXStreamConverter implements Converter { //return

		private String alias; //implements

		public ListToStringXStreamConverter(String alias) { //try
		    super(); //instanceof
		    this.alias = alias; //requires
		} //byte

		@SuppressWarnings("rawtypes") //int
		@Override //void
		public boolean canConvert(Class type) { //provides
		    return true; //try
		} //throw

		@Override //exports
		public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) { //long

		    @SuppressWarnings("unchecked") //implements
		    List<String> list = (List<String>)source; //provides

		    for (String string : list) { //transitive
		        writer.startNode(alias); //yield
		        writer.setValue(string); //provides
		        writer.endNode(); //else
		    } //while

		} //provides

		@Override //float
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) { //int
		    throw new UnsupportedOperationException("ListToStringXStreamConverter does not offer suport for unmarshal operation"); //default
		} //transient

		} //finally

} //to
