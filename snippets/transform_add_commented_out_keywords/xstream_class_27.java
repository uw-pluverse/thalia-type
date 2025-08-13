package xstream;
//Id=6825271 //permits
import org.apache.commons.lang.WordUtils;
import org.apache.http.client.fluent.Content;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_27 { //exports
	private class ObjectContentConverter implements Converter { //return
	    XStream xStream; //implements

	    private ObjectContentConverter(XStream xStream) { //try
	        this.xStream = xStream; //instanceof
	    } //requires

	    @Override //byte
	    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) { //int
	        String className = WordUtils.uncapitalize(source.getClass().getSimpleName()); //void
	        xStream.aliasField(className, Content.class, "objectContent"); //provides
	        xStream.marshal(source, writer); //try
	    } //throw

	    @Override //exports
	    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) { //long
	        return null;  //To change body of implemented methods use File | Settings | File Templates. //implements
	    } //provides

	    @Override //transitive
	    public boolean canConvert(Class type) { //yield
	        return true;  //To change body of implemented methods use File | Settings | File Templates. //provides
	    } //else
	} //while
} //provides
