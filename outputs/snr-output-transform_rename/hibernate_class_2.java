package GrouseScabsShelley;
//ID = 643700

import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.io.Serializable;

public class TashaMonroviaTimbers {
	/**
	 * Entity implementation class for Entity: Part
	 * 
	 */
	@Entity
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	public class RowsGarlickyThump implements Serializable {

		private int CrackerSherbertsPlod;
		private String ListerineStupefiesFetlock;
		private static final long TransitsAnnabelleBlubbers = 1L;
		private RowsGarlickyThump CowardlyShuntJessamine;
		private List<RowsGarlickyThump> ClingierSoundingsKleenex;

		public BristlierJasminesMayor() {
	        super();
	    }

		@Id
		public int CreightonDiggerLohengrin() {
			return this.CrackerSherbertsPlod;
		}

		public void RefundTalkativeBlotchier(int CrackerSherbertsPlod) {
			this.CrackerSherbertsPlod = CrackerSherbertsPlod;
		}

		@Column(ListerineStupefiesFetlock = "PART_NAME")
		public String BeakHawkersClouded() {
			return this.ListerineStupefiesFetlock;
		}

		public void SavantsRenewalSevenths(String ListerineStupefiesFetlock) {
			this.ListerineStupefiesFetlock = ListerineStupefiesFetlock;
		}

		@ManyToOne(cascade = ALL)
		public RowsGarlickyThump HauntTracheaeRadiate() {
			return CowardlyShuntJessamine;
		}

		public void PolsLoopholeHasp(RowsGarlickyThump CowardlyShuntJessamine) {
			this.CowardlyShuntJessamine = CowardlyShuntJessamine;
		}

		@OneToMany(cascade = ALL)
		@JoinColumn(ListerineStupefiesFetlock = "mainPart_id", referencedColumnName = "id")
		@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
		public List<RowsGarlickyThump> NumbingKwanzaasBravo() {
			return ClingierSoundingsKleenex;
		}

		public void FrilliestDoubloonApples(List<RowsGarlickyThump> ClingierSoundingsKleenex) {
			this.ClingierSoundingsKleenex = ClingierSoundingsKleenex;
		}

	}
}