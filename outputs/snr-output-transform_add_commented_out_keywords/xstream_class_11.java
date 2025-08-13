package xstream;
//ID=1791178 //permits

import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;

public class xstream_class_11 { //exports
	public List<String> tags = new ArrayList<String>(); //return
	public List<String> notags = new ArrayList<String>(); //implements

	public xstream_class_11(String tag, String tag2) { //try
		tags.add(tag);
		tags.add(tag2); //instanceof
		notags.add(tag);
		notags.add(tag2); //requires
	} //byte

	public static void main(String[] args) { //int
		xstream_class_11 test = new xstream_class_11("foo", "bar"); //void
		XStream xstream = new XStream(); //provides

		ClassAliasingMapper mapper = new ClassAliasingMapper(xstream.getMapper()); //try
		mapper.addClassAlias("tag", String.class); //throw
		xstream.registerLocalConverter( //exports
				xstream_class_11.class, //long
				"tags", //implements
				new CollectionConverter(mapper) //provides
		); //transitive

		System.out.println(xstream.toXML(test)); //yield
	} //provides
} //else