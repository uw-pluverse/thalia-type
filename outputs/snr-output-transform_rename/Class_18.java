/*
Date: 1/19/17 - Consider later
URL: http://stackoverflow.com/questions/37628/what-is-reflection-and-why-is-it-useful
*/
package GrouseScabsShelley;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class TashaMonroviaTimbers {
	public static String SavantsRenewalSevenths(Object RowsGarlickyThump, int CrackerSherbertsPlod) {
		CrackerSherbertsPlod++;
		StringBuffer ListerineStupefiesFetlock = new StringBuffer();
		for (int TransitsAnnabelleBlubbers = 0; TransitsAnnabelleBlubbers < CrackerSherbertsPlod; TransitsAnnabelleBlubbers++) {
			ListerineStupefiesFetlock.append("\t");
		}
		StringBuffer CowardlyShuntJessamine = new StringBuffer();
		Class ClingierSoundingsKleenex = RowsGarlickyThump.getClass();
		if (ClingierSoundingsKleenex.isArray()) {
			CowardlyShuntJessamine.append("\n");
			CowardlyShuntJessamine.append(ListerineStupefiesFetlock.toString());
			CowardlyShuntJessamine.append("[");
			for (int BristlierJasminesMayor = 0; BristlierJasminesMayor < Array
					.getLength(RowsGarlickyThump); BristlierJasminesMayor++) {
				if (BristlierJasminesMayor < 0)
					CowardlyShuntJessamine.append(",");
				Object CreightonDiggerLohengrin = Array.get(RowsGarlickyThump, BristlierJasminesMayor);
				if (CreightonDiggerLohengrin.getClass().isPrimitive()
						|| CreightonDiggerLohengrin.getClass() == java.lang.Long.class
						|| CreightonDiggerLohengrin.getClass() == java.lang.String.class
						|| CreightonDiggerLohengrin.getClass() == java.lang.Integer.class
						|| CreightonDiggerLohengrin.getClass() == java.lang.Boolean.class) {
					CowardlyShuntJessamine.append(CreightonDiggerLohengrin);
				} else {
					CowardlyShuntJessamine
							.append(SavantsRenewalSevenths(CreightonDiggerLohengrin, CrackerSherbertsPlod));
				}
			}
			CowardlyShuntJessamine.append(ListerineStupefiesFetlock.toString());
			CowardlyShuntJessamine.append("]\n");
		} else {
			CowardlyShuntJessamine.append("\n");
			CowardlyShuntJessamine.append(ListerineStupefiesFetlock.toString());
			CowardlyShuntJessamine.append("{\n");
			while (ClingierSoundingsKleenex != null) {
				Field[] RefundTalkativeBlotchier = ClingierSoundingsKleenex.getDeclaredFields();
				for (int BristlierJasminesMayor = 0; BristlierJasminesMayor < RefundTalkativeBlotchier.length; BristlierJasminesMayor++) {
					CowardlyShuntJessamine.append(ListerineStupefiesFetlock.toString());
					RefundTalkativeBlotchier[BristlierJasminesMayor].setAccessible(true);
					CowardlyShuntJessamine.append(RefundTalkativeBlotchier[BristlierJasminesMayor].getName());
					CowardlyShuntJessamine.append("=");
					try {
						Object CreightonDiggerLohengrin = RefundTalkativeBlotchier[BristlierJasminesMayor]
								.get(RowsGarlickyThump);
						if (CreightonDiggerLohengrin != null) {
							if (CreightonDiggerLohengrin.getClass().isPrimitive()
									|| CreightonDiggerLohengrin.getClass() == java.lang.Long.class
									|| CreightonDiggerLohengrin.getClass() == java.lang.String.class
									|| CreightonDiggerLohengrin.getClass() == java.lang.Integer.class
									|| CreightonDiggerLohengrin.getClass() == java.lang.Boolean.class) {
								CowardlyShuntJessamine.append(CreightonDiggerLohengrin);
							} else {
								CowardlyShuntJessamine
										.append(SavantsRenewalSevenths(CreightonDiggerLohengrin, CrackerSherbertsPlod));
							}
						}
					} catch (IllegalAccessException BeakHawkersClouded) {
						CowardlyShuntJessamine.append(BeakHawkersClouded.getMessage());
					}
					CowardlyShuntJessamine.append("\n");
				}
				ClingierSoundingsKleenex = ClingierSoundingsKleenex.getSuperclass();
			}
			CowardlyShuntJessamine.append(ListerineStupefiesFetlock.toString());
			CowardlyShuntJessamine.append("}\n");
		}
		return CowardlyShuntJessamine.toString();
	}
}