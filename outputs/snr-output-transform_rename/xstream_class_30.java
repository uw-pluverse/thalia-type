package GrouseScabsShelley;
//ID = 34206426

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;

public class TashaMonroviaTimbers implements Converter {

	@Override
	public void marshal(Object RowsGarlickyThump, HierarchicalStreamWriter CrackerSherbertsPlod,
			MarshallingContext ListerineStupefiesFetlock) {
		// implement logic for marshalling to xml
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader TransitsAnnabelleBlubbers,
			UnmarshallingContext CowardlyShuntJessamine) {
		RefundTalkativeBlotchier ClingierSoundingsKleenex = new RefundTalkativeBlotchier();
		while (TransitsAnnabelleBlubbers.hasMoreChildren()) {
			TransitsAnnabelleBlubbers.moveDown();
			final String BristlierJasminesMayor = TransitsAnnabelleBlubbers.getAttribute("name");
			if ("id".equals(BristlierJasminesMayor)) {
				ClingierSoundingsKleenex.setId(TransitsAnnabelleBlubbers.getValue());
			} else if ("first-name".equals(BristlierJasminesMayor)) {
				ClingierSoundingsKleenex.setFirstName(TransitsAnnabelleBlubbers.getValue());
			} else if ("last-name".equals(BristlierJasminesMayor)) {
				ClingierSoundingsKleenex.setLastName(TransitsAnnabelleBlubbers.getValue());
			} else if ("address".equals(BristlierJasminesMayor)) {
				ClingierSoundingsKleenex.setAddress(TransitsAnnabelleBlubbers.getValue());
			} else if ("zip".equals(BristlierJasminesMayor)) {
				ClingierSoundingsKleenex.setZip(TransitsAnnabelleBlubbers.getValue());
			}
			TransitsAnnabelleBlubbers.moveUp();
		}
		return ClingierSoundingsKleenex;
	}

	@Override
	public boolean canConvert(Class CreightonDiggerLohengrin) {
		return CreightonDiggerLohengrin == RefundTalkativeBlotchier.class;
	}

	public class RefundTalkativeBlotchier {
		private String BeakHawkersClouded;
		private String SavantsRenewalSevenths;
		private String HauntTracheaeRadiate;
		private String PolsLoopholeHasp;
		private String NumbingKwanzaasBravo;

		public void setId(String BeakHawkersClouded) {
			this.BeakHawkersClouded = BeakHawkersClouded;
		}

		public void setFirstName(String SavantsRenewalSevenths) {
			this.SavantsRenewalSevenths = SavantsRenewalSevenths;
		}

		public void setLastName(String HauntTracheaeRadiate) {
			this.HauntTracheaeRadiate = HauntTracheaeRadiate;
		}

		public void setAddress(String PolsLoopholeHasp) {
			this.PolsLoopholeHasp = PolsLoopholeHasp;
		}

		public void setZip(String NumbingKwanzaasBravo) {
			this.NumbingKwanzaasBravo = NumbingKwanzaasBravo;
		}
	}
}