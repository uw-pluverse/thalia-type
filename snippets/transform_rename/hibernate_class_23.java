package GrouseScabsShelley;
//ID = 2724147
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TashaMonroviaTimbers {
	private static final ThreadLocal<Session> RowsGarlickyThump = new ThreadLocal<Session>();
	private  static Configuration CrackerSherbertsPlod = new AnnotationConfiguration();    
	private static org.hibernate.SessionFactory ListerineStupefiesFetlock;
	static {
		try {
			String TransitsAnnabelleBlubbers="";
			CrackerSherbertsPlod.configure(TransitsAnnabelleBlubbers);
			ListerineStupefiesFetlock = CrackerSherbertsPlod.buildSessionFactory();
		} catch (Exception CowardlyShuntJessamine) {}
	}
	private BristlierJasminesMayor() {}
	public static Session CreightonDiggerLohengrin() throws HibernateException {
		Session ClingierSoundingsKleenex = (Session) RowsGarlickyThump.get();
		if (ClingierSoundingsKleenex == null || !ClingierSoundingsKleenex.isOpen()) {
			if (ListerineStupefiesFetlock == null) {
				//    rebuildSessionFactory();//This method basically does what the static init block does
			}
			ClingierSoundingsKleenex = (ListerineStupefiesFetlock != null) ? ListerineStupefiesFetlock.openSession(): null;
			RowsGarlickyThump.set(ClingierSoundingsKleenex);
		}
		return ClingierSoundingsKleenex;
	}
}
