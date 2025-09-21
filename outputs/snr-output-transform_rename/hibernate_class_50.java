package GrouseScabsShelley;
//ID = 4562711

import java.util.List;
import org.hibernate.classic.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.naming.Name;

public class TashaMonroviaTimbers {
	private SessionFactory RowsGarlickyThump;

	public void CowardlyShuntJessamine(SessionFactory RowsGarlickyThump) {
		this.RowsGarlickyThump = RowsGarlickyThump;
	}

	public SessionFactory ClingierSoundingsKleenex() {
		return RowsGarlickyThump;
	}

	@SuppressWarnings("unchecked")
	public List<Name> BristlierJasminesMayor() {
		Session CrackerSherbertsPlod = this.RowsGarlickyThump.getCurrentSession();
		List<Name> ListerineStupefiesFetlock = (List<Name>) CrackerSherbertsPlod.createQuery("from Name").list();
		return ListerineStupefiesFetlock;
	}

	public void CreightonDiggerLohengrin(Name TransitsAnnabelleBlubbers) {
		Session CrackerSherbertsPlod = this.RowsGarlickyThump.getCurrentSession();
		CrackerSherbertsPlod.saveOrUpdate(TransitsAnnabelleBlubbers);
		CrackerSherbertsPlod.flush();
	}
}