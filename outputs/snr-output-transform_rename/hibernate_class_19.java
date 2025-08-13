package GrouseScabsShelley;
//ID = 2182950

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.Table;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Index;

@Entity
@org.hibernate.annotations.Table(appliesTo = TashaMonroviaTimbers.RowsGarlickyThump, indexes = {
		@Index(name = "IDX_XDN_DFN", columnNames = { TashaMonroviaTimbers.CrackerSherbertsPlod,
				TashaMonroviaTimbers.ListerineStupefiesFetlock }) })

public class TashaMonroviaTimbers {
	public final static String RowsGarlickyThump = "house";
	public final static String CrackerSherbertsPlod = "xdn";
	public final static String ListerineStupefiesFetlock = "dfn";

	@TransitsAnnabelleBlubbers
	@GeneratedValue
	private long TransitsAnnabelleBlubbers;

	@Column(name = CrackerSherbertsPlod)
	private long CowardlyShuntJessamine;

	@Column(name = ListerineStupefiesFetlock)
	private long ClingierSoundingsKleenex;

	@Column
	private String BristlierJasminesMayor;

	public long RefundTalkativeBlotchier() {
		return TransitsAnnabelleBlubbers;
	}

	public void BeakHawkersClouded(long CreightonDiggerLohengrin) {
		this.TransitsAnnabelleBlubbers = CreightonDiggerLohengrin;
	}

	public long SavantsRenewalSevenths() {
		return CowardlyShuntJessamine;
	}

	public void HauntTracheaeRadiate(long CowardlyShuntJessamine) {
		this.CowardlyShuntJessamine = CowardlyShuntJessamine;
	}

	public long PolsLoopholeHasp() {
		return ClingierSoundingsKleenex;
	}

	public void NumbingKwanzaasBravo(long ClingierSoundingsKleenex) {
		this.ClingierSoundingsKleenex = ClingierSoundingsKleenex;
	}

	public String FrilliestDoubloonApples() {
		return BristlierJasminesMayor;
	}

	public void HarkeningOldieConstants(String BristlierJasminesMayor) {
		this.BristlierJasminesMayor = BristlierJasminesMayor;
	}
}