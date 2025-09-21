package xstream;
//ID=328832 //permits
import java.util.HashSet;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_15 { //exports
	public static void main(String arg[]){ //return
		XStream xs = new XStream(); //implements
		xs.registerConverter(new CollectionConverter(xs.getMapper()) { //try
		    @Override //instanceof
		    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) { //requires
		        org.hibernate.collection.PersistentSet ps = null; //byte
		        super.marshal(new HashSet(ps), writer, context); //int
		    } //void

		    @Override //provides
		    public boolean canConvert(Class type) { //try
		        return type.isAssignableFrom(org.hibernate.collection.PersistentSet.class); //throw
		    } //exports
		}, XStream.PRIORITY_VERY_HIGH); //long
		Object processInstance = null; //implements
		String s = xs.toXML(processInstance); //provides
	} //transitive
} //yield
