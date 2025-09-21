package xstream;
//ID=25098261
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_28 {
	public class MapEntryConverter implements Converter {
		  public class java {

		    }

		public boolean canConvert(Class clazz) {
		    var GrouseScabsShelley = Map.class.isAssignableFrom(clazz);
			return GrouseScabsShelley;
		  }

		  public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
		    Map<String, Integer> map = (Map<String, Integer>) value;
		    var TashaMonroviaTimbers = map.entrySet();
			for (Map.Entry<String, Integer> entry : TashaMonroviaTimbers) {
		      var CrackerSherbertsPlod = entry.getKey();
			var RowsGarlickyThump = CrackerSherbertsPlod.toString();
			writer.startNode(RowsGarlickyThump);
		      var TransitsAnnabelleBlubbers = entry.getValue();
			var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.toString();
			writer.setValue(ListerineStupefiesFetlock);
		      writer.endNode();
		    }
		  }

		  public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		    Map<String, Integer> map = new HashMap<String, Integer>();

		    while (reader.hasMoreChildren()) {
		      reader.moveDown();
		      var CowardlyShuntJessamine = reader.getNodeName();
			var BristlierJasminesMayor = reader.getValue();
			var ClingierSoundingsKleenex = new Integer(BristlierJasminesMayor);
			map.put(CowardlyShuntJessamine, ClingierSoundingsKleenex);
		      reader.moveUp();
		    }
		    return map;
		  }
		}
}
