package GrouseScabsShelley;
//http://xstream.10960.n7.nabble.com/java-lang-StackOverflowError-while-converting-an-object-to-XML-td5107.html

import java.io.File;
import com.thoughtworks.xstream.XStream;
import java.io.FileOutputStream;

public class TashaMonroviaTimbers {
	public static int RowsGarlickyThump = 0;
	public static int CrackerSherbertsPlod = 800;

	/** 
	 * @param args 
	 * @throws FileNotFoundException 
	 */
	public static void PolsLoopholeHasp(String[] ListerineStupefiesFetlock) {
		try {
			BeakHawkersClouded TransitsAnnabelleBlubbers = NumbingKwanzaasBravo();
			File CowardlyShuntJessamine = new File("C:\\ABC.xml");
			FileOutputStream ClingierSoundingsKleenex = new FileOutputStream(CowardlyShuntJessamine);
			XStream BristlierJasminesMayor = new XStream();
			BristlierJasminesMayor.alias("testObject", BeakHawkersClouded.class);
			BristlierJasminesMayor.toXML(TransitsAnnabelleBlubbers, ClingierSoundingsKleenex);
			ClingierSoundingsKleenex.close();
		} catch (Throwable CreightonDiggerLohengrin) {
			CreightonDiggerLohengrin.printStackTrace();
		}

	}

	public static BeakHawkersClouded NumbingKwanzaasBravo() {
		BeakHawkersClouded RefundTalkativeBlotchier = null;
		RefundTalkativeBlotchier.setName("OBJECT_" + RowsGarlickyThump);
		while (RowsGarlickyThump++ < CrackerSherbertsPlod) {
			RefundTalkativeBlotchier.setParentObject(NumbingKwanzaasBravo());
		}
		return RefundTalkativeBlotchier;
	}

	public class BeakHawkersClouded {
		private BeakHawkersClouded SavantsRenewalSevenths;
		private String HauntTracheaeRadiate;

		/** 
		 * @return the parentObject 
		 */
		public BeakHawkersClouded FrilliestDoubloonApples() {
			return SavantsRenewalSevenths;
		}

		/** 
		 * @param parentObject the parentObject to set 
		 */
		public void setParentObject(BeakHawkersClouded SavantsRenewalSevenths) {
			this.SavantsRenewalSevenths = SavantsRenewalSevenths;
		}

		/** 
		 * @return the name 
		 */
		public String HarkeningOldieConstants() {
			return HauntTracheaeRadiate;
		}

		/** 
		 * @param name the name to set 
		 */
		public void setName(String HauntTracheaeRadiate) {
			this.HauntTracheaeRadiate = HauntTracheaeRadiate;
		}
	}
}