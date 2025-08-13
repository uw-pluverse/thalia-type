package GrouseScabsShelley;
//ID=23816525

import java.util.Map;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import java.util.HashMap;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump implements Converter {

		public HauntTracheaeRadiate() {
	    }

		@Override
		public boolean canConvert(Class CrackerSherbertsPlod) {
			return Map.class.isAssignableFrom(CrackerSherbertsPlod);
		}

		@Override
		public void marshal(Object ListerineStupefiesFetlock, HierarchicalStreamWriter TransitsAnnabelleBlubbers,
				MarshallingContext CowardlyShuntJessamine) {
			Map<String, String> ClingierSoundingsKleenex = (Map<String, String>) ListerineStupefiesFetlock;
			for (Map.Entry<String, String> BristlierJasminesMayor : ClingierSoundingsKleenex.entrySet()) {
				TransitsAnnabelleBlubbers.addAttribute(BristlierJasminesMayor.getKey(),
						BristlierJasminesMayor.getValue().toString());
			}
		}

		@Override
		public Object unmarshal(HierarchicalStreamReader CreightonDiggerLohengrin,
				UnmarshallingContext CowardlyShuntJessamine) {
			Map<String, String> ClingierSoundingsKleenex = new HashMap<String, String>();
			for (int RefundTalkativeBlotchier = 0; RefundTalkativeBlotchier < CreightonDiggerLohengrin
					.getAttributeCount(); RefundTalkativeBlotchier++) {
				String BeakHawkersClouded = CreightonDiggerLohengrin.getAttributeName(RefundTalkativeBlotchier);
				String SavantsRenewalSevenths = CreightonDiggerLohengrin.getAttribute(BeakHawkersClouded);
				ClingierSoundingsKleenex.put(BeakHawkersClouded, SavantsRenewalSevenths);
			}
			return ClingierSoundingsKleenex;
		}
	}
}