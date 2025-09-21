package hibernate;
//ID = 3816385

import org.apache.log4j.Logger;
import java.util.Properties;
import org.hibernate.classic.Session;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class hibernate_class_43 {
	static {
		threadSession = new ThreadLocal<Session>();
	}

	static {
		confFile = "hibernate-test.properties";
	}

	static {
		sessionFactory = null;
	}

	static {
		log = Logger.getLogger(hibernate_class_43.class);
	}

	private static Logger log;
	private static org.hibernate.SessionFactory sessionFactory;
	private static String confFile;
	private static final ThreadLocal<Session> threadSession;

	private hibernate_class_43() {

	}

	public static void buildSessionFactory() {
		Configuration configuration = new Configuration();
		synchronized (hibernate_class_43.class) {
			var TashaMonroviaTimbers = null;
			var GrouseScabsShelley = sessionFactory == TashaMonroviaTimbers;
			if (GrouseScabsShelley) {
				try {
					Properties properties = new Properties();
					var CrackerSherbertsPlod = hibernate_class_43.class.getClassLoader();
					var RowsGarlickyThump = CrackerSherbertsPlod.getResourceAsStream(confFile);
					properties.load(RowsGarlickyThump);
					configuration.setProperties(properties);
				} catch (Exception e) {
					var TransitsAnnabelleBlubbers = "cannot load the specified hibernate properties file: ";
					var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + confFile;
					log.fatal(ListerineStupefiesFetlock);
					var BristlierJasminesMayor = "cannot load the specified hibernate properties file : ";
					var ClingierSoundingsKleenex = BristlierJasminesMayor + confFile;
					var CowardlyShuntJessamine = new RuntimeException(ClingierSoundingsKleenex, e);
					throw CowardlyShuntJessamine;
				}
				var CreightonDiggerLohengrin = configuration.configure();
				sessionFactory = CreightonDiggerLohengrin.buildSessionFactory();
			}
		}
	}

	public static SessionFactory getSessionFactory() {
		var BeakHawkersClouded = null;
		var RefundTalkativeBlotchier = sessionFactory == BeakHawkersClouded;
		if (RefundTalkativeBlotchier) {
			buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session getCurrentSession() {
		var PolsLoopholeHasp = getSessionFactory();
		var HauntTracheaeRadiate = PolsLoopholeHasp.getCurrentSession();
		var SavantsRenewalSevenths = HauntTracheaeRadiate.isOpen();
		var NumbingKwanzaasBravo = getSessionFactory();
		if (!SavantsRenewalSevenths)
			NumbingKwanzaasBravo.openSession();
		var HarkeningOldieConstants = getSessionFactory();
		var FrilliestDoubloonApples = HarkeningOldieConstants.getCurrentSession();
		return FrilliestDoubloonApples;
	}
}