package hibernate;
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
public abstract class hibernate_class_8 {
	static {
		serialVersionUID = 1L;
	}

	{
		thru = null;
	}

	{
		from = null;
	}

	private static final long serialVersionUID;
	private Date from;
	private Date thru;

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@Transient
	public boolean isActive() {
		Date now = new Date();
		var GrouseScabsShelley = from.before(now);
		var TashaMonroviaTimbers = from.equals(now);
		boolean afterFrom = GrouseScabsShelley || TashaMonroviaTimbers;
		var ListerineStupefiesFetlock = null;
		var CrackerSherbertsPlod = thru == ListerineStupefiesFetlock;
		var TransitsAnnabelleBlubbers = thru.after(now);
		var RowsGarlickyThump = CrackerSherbertsPlod || TransitsAnnabelleBlubbers;
		var CowardlyShuntJessamine = thru.equals(now);
		boolean beforeThru = RowsGarlickyThump || CowardlyShuntJessamine;
		var ClingierSoundingsKleenex = afterFrom && beforeThru;
		return ClingierSoundingsKleenex;
	}

	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the fromdate.")
	public boolean areDatesValid() {
		var CreightonDiggerLohengrin = null;
		var BristlierJasminesMayor = thru == CreightonDiggerLohengrin;
		if (BristlierJasminesMayor) {
			var RefundTalkativeBlotchier = true;
			return RefundTalkativeBlotchier;
		} else {
			var BeakHawkersClouded = thru.after(from);
			return BeakHawkersClouded;
		}
	}

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Column(name = "fromDate")
	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		var SavantsRenewalSevenths = this.from;
		SavantsRenewalSevenths = from;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getThru() {
		return thru;
	}

	public void setThru(Date thru) {
		var HauntTracheaeRadiate = this.thru;
		HauntTracheaeRadiate = thru;
	}
}