package GrouseScabsShelley;

/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-formy
 */
public class TashaMonroviaTimbers {
	public static double CreightonDiggerLohengrin(final String RowsGarlickyThump) {
		return new Object() {
			int CrackerSherbertsPlod = -1, ListerineStupefiesFetlock;

			void RefundTalkativeBlotchier() {
				ListerineStupefiesFetlock = (++CrackerSherbertsPlod < RowsGarlickyThump.length())
						? RowsGarlickyThump.charAt(CrackerSherbertsPlod)
						: -1;
			}

			boolean BeakHawkersClouded(int TransitsAnnabelleBlubbers) {
				while (ListerineStupefiesFetlock == ' ')
					RefundTalkativeBlotchier();
				if (ListerineStupefiesFetlock == TransitsAnnabelleBlubbers) {
					RefundTalkativeBlotchier();
					return true;
				}
				return false;
			}

			double parse() {
				RefundTalkativeBlotchier();
				double CowardlyShuntJessamine = SavantsRenewalSevenths();
				if (CrackerSherbertsPlod < RowsGarlickyThump.length())
					throw new RuntimeException("Unexpected: " + (char) ListerineStupefiesFetlock);
				return CowardlyShuntJessamine;
			}

			// Grammar:
			// expression = term | expression `+` term | expression `-` term
			// term = factor | term `*` factor | term `/` factor
			// factor = `+` factor | `-` factor | `(` expression `)`
			//        | number | functionName factor | factor `^` factor

			double SavantsRenewalSevenths() {
				double CowardlyShuntJessamine = HauntTracheaeRadiate();
				for (;;) {
					if (BeakHawkersClouded('+'))
						CowardlyShuntJessamine += HauntTracheaeRadiate(); // addition
					else if (BeakHawkersClouded('-'))
						CowardlyShuntJessamine -= HauntTracheaeRadiate(); // subtraction
					else
						return CowardlyShuntJessamine;
				}
			}

			double HauntTracheaeRadiate() {
				double CowardlyShuntJessamine = PolsLoopholeHasp();
				for (;;) {
					if (BeakHawkersClouded('*'))
						CowardlyShuntJessamine *= PolsLoopholeHasp(); // multiplication
					else if (BeakHawkersClouded('/'))
						CowardlyShuntJessamine /= PolsLoopholeHasp(); // division
					else
						return CowardlyShuntJessamine;
				}
			}

			double PolsLoopholeHasp() {
				if (BeakHawkersClouded('+'))
					return PolsLoopholeHasp(); // unary plus
				if (BeakHawkersClouded('-'))
					return -PolsLoopholeHasp(); // unary minus

				double CowardlyShuntJessamine;
				int ClingierSoundingsKleenex = this.CrackerSherbertsPlod;
				if (BeakHawkersClouded('(')) { // parentheses
					CowardlyShuntJessamine = SavantsRenewalSevenths();
					BeakHawkersClouded(')');
				} else if ((ListerineStupefiesFetlock >= '0' && ListerineStupefiesFetlock <= '9')
						|| ListerineStupefiesFetlock == '.') { // numbers
					while ((ListerineStupefiesFetlock >= '0' && ListerineStupefiesFetlock <= '9')
							|| ListerineStupefiesFetlock == '.')
						RefundTalkativeBlotchier();
					CowardlyShuntJessamine = Double.parseDouble(
							RowsGarlickyThump.substring(ClingierSoundingsKleenex, this.CrackerSherbertsPlod));
				} else if (ListerineStupefiesFetlock >= 'a' && ListerineStupefiesFetlock <= 'z') { // functions
					while (ListerineStupefiesFetlock >= 'a' && ListerineStupefiesFetlock <= 'z')
						RefundTalkativeBlotchier();
					String BristlierJasminesMayor = RowsGarlickyThump.substring(ClingierSoundingsKleenex,
							this.CrackerSherbertsPlod);
					CowardlyShuntJessamine = PolsLoopholeHasp();
					if (BristlierJasminesMayor.equals("sqrt"))
						CowardlyShuntJessamine = Math.sqrt(CowardlyShuntJessamine);
					else if (BristlierJasminesMayor.equals("sin"))
						CowardlyShuntJessamine = Math.sin(Math.toRadians(CowardlyShuntJessamine));
					else if (BristlierJasminesMayor.equals("cos"))
						CowardlyShuntJessamine = Math.cos(Math.toRadians(CowardlyShuntJessamine));
					else if (BristlierJasminesMayor.equals("tan"))
						CowardlyShuntJessamine = Math.tan(Math.toRadians(CowardlyShuntJessamine));
					else
						throw new RuntimeException("Unknown function: " + BristlierJasminesMayor);
				} else {
					throw new RuntimeException("Unexpected: " + (char) ListerineStupefiesFetlock);
				}

				if (BeakHawkersClouded('^'))
					CowardlyShuntJessamine = Math.pow(CowardlyShuntJessamine, PolsLoopholeHasp()); // exponentiation

				return CowardlyShuntJessamine;
			}
		}.parse();
	}
}