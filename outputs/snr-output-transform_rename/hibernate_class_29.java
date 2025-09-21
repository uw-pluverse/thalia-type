package GrouseScabsShelley;
//ID = 3184069

import java.util.List;
import org.hibernate.Criteria;
import com.google.android.gms.internal.t;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

public abstract class TashaMonroviaTimbers<T> {

	private Class<T> RowsGarlickyThump;

	private SessionFactory CrackerSherbertsPlod;

	public BristlierJasminesMayor(Class<T> RowsGarlickyThump) {
    this.RowsGarlickyThump = RowsGarlickyThump;
  }

	public SessionFactory CreightonDiggerLohengrin() {
		return CrackerSherbertsPlod;
	}

	public void RefundTalkativeBlotchier(SessionFactory CrackerSherbertsPlod) {
		this.CrackerSherbertsPlod = CrackerSherbertsPlod;
	}

	public void delete(T ListerineStupefiesFetlock) {
		NumbingKwanzaasBravo().delete(ListerineStupefiesFetlock);
	}

	@SuppressWarnings("unchecked")
	public T BeakHawkersClouded(long TransitsAnnabelleBlubbers) {
		return (T) NumbingKwanzaasBravo().get(RowsGarlickyThump, TransitsAnnabelleBlubbers);
	}

	public void SavantsRenewalSevenths(T ListerineStupefiesFetlock) {
		NumbingKwanzaasBravo().saveOrUpdate(ListerineStupefiesFetlock);
	}

	@SuppressWarnings("unchecked")
	public List<T> HauntTracheaeRadiate() {
		Criteria CowardlyShuntJessamine = NumbingKwanzaasBravo().createCriteria(RowsGarlickyThump);
		List<T> ClingierSoundingsKleenex = (List<T>) CowardlyShuntJessamine.list();
		return ClingierSoundingsKleenex;
	}

	public int PolsLoopholeHasp() {
		Criteria CowardlyShuntJessamine = NumbingKwanzaasBravo().createCriteria(RowsGarlickyThump);
		CowardlyShuntJessamine.setProjection(Projections.rowCount());
		return (Integer) CowardlyShuntJessamine.uniqueResult();
	}

	public Session NumbingKwanzaasBravo() {
		// presumes a current session, which we have through the
		// OpenSessionInViewFilter; doesn't work without that
		return CrackerSherbertsPlod.getCurrentSession();
	}
}