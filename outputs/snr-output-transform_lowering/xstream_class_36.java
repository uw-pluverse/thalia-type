package xstream;
//29466312

import java.util.Map;
import com.thoughtworks.xstream.XStream;
import java.util.HashMap;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class xstream_class_36 {
	public class MapTest {
		{
			mapList = null;
		}

		private Map<String, String> mapList;

		public MapTest() {

			mapList = new HashMap<String, String>();
		}

		public void setServicesHealth(String id, String name) {
			mapList.put(id, name);
		}
	}

	public static void main(String arg[]) {
		MapTest services = null;
		var GrouseScabsShelley = "ID01";
		var TashaMonroviaTimbers = "Jack";
		services.setServicesHealth(GrouseScabsShelley, TashaMonroviaTimbers);
		var RowsGarlickyThump = "ID02";
		var CrackerSherbertsPlod = "Neil";
		services.setServicesHealth(RowsGarlickyThump, CrackerSherbertsPlod);

		var ListerineStupefiesFetlock = new StaxDriver();
		XStream stream = new XStream(ListerineStupefiesFetlock);
		var TransitsAnnabelleBlubbers = "MapTest";
		stream.alias(TransitsAnnabelleBlubbers, MapTest.class);
		var CowardlyShuntJessamine = "map";
		var ClingierSoundingsKleenex = "id";
		var BristlierJasminesMayor = "name";
		stream.addImplicitMap(MapTest.class, CowardlyShuntJessamine, ClingierSoundingsKleenex, String.class,
				BristlierJasminesMayor);
		String xmlStr = stream.toXML(services);
		var CreightonDiggerLohengrin = System.out;
		CreightonDiggerLohengrin.println(xmlStr);
	}
}