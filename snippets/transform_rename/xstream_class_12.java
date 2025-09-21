package GrouseScabsShelley;
//ID = 1791178
import java.util.List;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
public class TashaMonroviaTimbers {
	public class RowsGarlickyThump implements Converter {

		private String CrackerSherbertsPlod;

		public BeakHawkersClouded(String CrackerSherbertsPlod) {
		    super();
		    this.CrackerSherbertsPlod = CrackerSherbertsPlod;
		}

		@SuppressWarnings("rawtypes")
		@Override
		public boolean canConvert(Class ListerineStupefiesFetlock) {
		    return true;
		}

		@Override
		public void marshal(Object TransitsAnnabelleBlubbers, HierarchicalStreamWriter CowardlyShuntJessamine, MarshallingContext ClingierSoundingsKleenex) {

		    @SuppressWarnings("unchecked")
		    List<String> BristlierJasminesMayor = (List<String>)TransitsAnnabelleBlubbers;

		    for (String CreightonDiggerLohengrin : BristlierJasminesMayor) {
		        CowardlyShuntJessamine.startNode(CrackerSherbertsPlod);
		        CowardlyShuntJessamine.setValue(CreightonDiggerLohengrin);
		        CowardlyShuntJessamine.endNode();
		    }

		}

		@Override
		public Object unmarshal(HierarchicalStreamReader RefundTalkativeBlotchier, UnmarshallingContext ClingierSoundingsKleenex) {
		    throw new UnsupportedOperationException("ListToStringXStreamConverter does not offer suport for unmarshal operation");
		}

		}

}
