package GrouseScabsShelley;
//ID = 6107965

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;

public class TashaMonroviaTimbers implements Converter {
	@Override
	public Object unmarshal(HierarchicalStreamReader RowsGarlickyThump, UnmarshallingContext CrackerSherbertsPlod) {

		while (RowsGarlickyThump.hasMoreChildren()) {
			RowsGarlickyThump.moveDown();
			String ListerineStupefiesFetlock;
			if (RowsGarlickyThump.getNodeName().equals("a")) {
				ListerineStupefiesFetlock = RowsGarlickyThump.getValue();
			} else if (RowsGarlickyThump.getNodeName().equals("b")) {
				Object TransitsAnnabelleBlubbers = (Object) CrackerSherbertsPlod.convertAnother(RowsGarlickyThump,
						Object.class);
			} else if (RowsGarlickyThump.getNodeName().equals("c")) {
				ListerineStupefiesFetlock = RowsGarlickyThump.getValue();
			}

		}
		return CrackerSherbertsPlod;
	}

	@Override
	public boolean canConvert(Class CowardlyShuntJessamine) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void marshal(Object CowardlyShuntJessamine, HierarchicalStreamWriter ClingierSoundingsKleenex,
			MarshallingContext BristlierJasminesMayor) {
		// TODO Auto-generated method stub

	}
}