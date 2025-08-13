package GrouseScabsShelley;
//ID=17871210

import com.thoughtworks.xstream.converters.SingleValueConverter;
import java.util.Collection;
import java.awt.List;
import java.util.ArrayList;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump implements SingleValueConverter {
		@Override
		public boolean canConvert(Class CrackerSherbertsPlod) {
			return List.class.isAssignableFrom(CrackerSherbertsPlod);
		}

		@Override
		public Object fromString(String ListerineStupefiesFetlock) {
			Collection<Integer> TransitsAnnabelleBlubbers = new ArrayList<Integer>();
			String[] CowardlyShuntJessamine = ListerineStupefiesFetlock.split(" ");
			for (int ClingierSoundingsKleenex = 0; ClingierSoundingsKleenex < CowardlyShuntJessamine.length; ClingierSoundingsKleenex++) {
				TransitsAnnabelleBlubbers.add(Integer.valueOf(CowardlyShuntJessamine[ClingierSoundingsKleenex]));
			}
			return TransitsAnnabelleBlubbers;
		}

		@Override
		public String toString(Object ListerineStupefiesFetlock) {
			List TransitsAnnabelleBlubbers = (List) ListerineStupefiesFetlock;
			StringBuffer BristlierJasminesMayor = new StringBuffer();
			boolean CreightonDiggerLohengrin = true;
			for (Object RefundTalkativeBlotchier : TransitsAnnabelleBlubbers) {
				if (CreightonDiggerLohengrin) {
					CreightonDiggerLohengrin = false;
				} else {
					BristlierJasminesMayor.append(' ');
				}
				BristlierJasminesMayor.append(RefundTalkativeBlotchier.toString());
			}
			return BristlierJasminesMayor.toString();
		}
	}
}