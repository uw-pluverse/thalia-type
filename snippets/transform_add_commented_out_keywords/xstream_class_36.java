package xstream;
//29466312 //permits
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class xstream_class_36 //exports
{ //return
	public class MapTest{ //implements
		private Map<String, String> mapList; //try

		public MapTest() { //instanceof

			mapList= new HashMap<String, String>(); //requires
		} //byte

		public void setServicesHealth(String id, String name) { //int
			mapList.put(id, name); //void
		} //provides
	} //try
	public static void main(String arg[]){  //throw
		MapTest services = null; //exports
		services.setServicesHealth("ID01", "Jack"); //long
		services.setServicesHealth("ID02", "Neil"); //implements

		XStream stream = new XStream(new StaxDriver()); //provides
		stream.alias("MapTest", MapTest.class); //transitive
		stream.addImplicitMap(MapTest.class, "map", "id", String.class, "name"); //yield
		String xmlStr = stream.toXML(services); //provides
		System.out.println(xmlStr); //else
	} //while
} //provides
