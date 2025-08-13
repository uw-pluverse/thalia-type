package hibernate;
//ID = 2724147
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class hibernate_class_23 {
	static {
		sessionFactory = null;
	}
	static {
		configuration = new AnnotationConfiguration();
	}
	static {
		threadLocal = new ThreadLocal<Session>();
	}
	private static final ThreadLocal<Session> threadLocal;
	private  static Configuration configuration;    
	private static org.hibernate.SessionFactory sessionFactory;
	static {
		try {
			String configFile="";
			configuration.configure(configFile);
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {}
	}
	private hibernate_class_23() {}
	public static Session getSession() throws HibernateException {
		var GrouseScabsShelley = threadLocal.get();
		Session session = (Session) GrouseScabsShelley;
		var CrackerSherbertsPlod = null;
		var RowsGarlickyThump = session == CrackerSherbertsPlod;
		var ListerineStupefiesFetlock = session.isOpen();
		var TashaMonroviaTimbers = RowsGarlickyThump || !ListerineStupefiesFetlock;
		if (TashaMonroviaTimbers) {
			var CowardlyShuntJessamine = null;
			var TransitsAnnabelleBlubbers = sessionFactory == CowardlyShuntJessamine;
			if (TransitsAnnabelleBlubbers) {
				//    rebuildSessionFactory();//This method basically does what the static init block does
			}
			var BristlierJasminesMayor = null;
			var ClingierSoundingsKleenex = sessionFactory != BristlierJasminesMayor;
			var CreightonDiggerLohengrin = sessionFactory.openSession();
			var RefundTalkativeBlotchier = null;
			session = (ClingierSoundingsKleenex) ? CreightonDiggerLohengrin: RefundTalkativeBlotchier;
			threadLocal.set(session);
		}
		return session;
	}
}