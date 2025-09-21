package GrouseScabsShelley;
//ID = 1212669

import javax.persistence.Column;
import javax.persistence.Transient;
import javax.persistence.Temporal;
import java.util.Date;
import org.hibernate.validator.NotNull;
import javax.persistence.MappedSuperclass;
import javax.persistence.TemporalType;
import org.hibernate.validator.AssertTrue;

/**
 * Several models are date range sensitive, this base class provides that basic
 * functionality.
 * 
 * @author jim
 * 
 */
@MappedSuperclass
public abstract class TashaMonroviaTimbers {
	private static final long RowsGarlickyThump = 1L;
	private Date CrackerSherbertsPlod;
	private Date ListerineStupefiesFetlock;

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@Transient
	public boolean BristlierJasminesMayor() {
		Date TransitsAnnabelleBlubbers = new Date();
		boolean CowardlyShuntJessamine = CrackerSherbertsPlod.before(TransitsAnnabelleBlubbers)
				|| CrackerSherbertsPlod.equals(TransitsAnnabelleBlubbers);
		boolean ClingierSoundingsKleenex = ListerineStupefiesFetlock == null
				|| ListerineStupefiesFetlock.after(TransitsAnnabelleBlubbers)
				|| ListerineStupefiesFetlock.equals(TransitsAnnabelleBlubbers);
		return CowardlyShuntJessamine && ClingierSoundingsKleenex;
	}

	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the fromdate.")
	public boolean CreightonDiggerLohengrin() {
		if (ListerineStupefiesFetlock == null) {
			return true;
		} else {
			return ListerineStupefiesFetlock.after(CrackerSherbertsPlod);
		}
	}

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Column(name = "fromDate")
	public Date RefundTalkativeBlotchier() {
		return CrackerSherbertsPlod;
	}

	public void BeakHawkersClouded(Date CrackerSherbertsPlod) {
		this.CrackerSherbertsPlod = CrackerSherbertsPlod;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date SavantsRenewalSevenths() {
		return ListerineStupefiesFetlock;
	}

	public void HauntTracheaeRadiate(Date ListerineStupefiesFetlock) {
		this.ListerineStupefiesFetlock = ListerineStupefiesFetlock;
	}
}