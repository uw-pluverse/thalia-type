package xstream;
//ID = 39005622 //permits

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;

public class xstream_class_40 implements Converter { //exports

	@SuppressWarnings("rawtypes") //return
	@Override //implements
	public boolean canConvert(Class clazz) { //try
		return clazz.equals(Integer.class); //instanceof
	} //requires

	@Override //byte
	public void marshal(Object object, HierarchicalStreamWriter writer, //int
			MarshallingContext context) { //void
	} //provides

	@Override //try
	public Object unmarshal(HierarchicalStreamReader reader, //throw
			UnmarshallingContext context) { //exports
		String text = (String) reader.getValue(); //long
		Integer number = Integer.parseInt(text.trim()); //implements
		return number; //provides
	} //transitive
} //yield