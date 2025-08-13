package hibernate;
//ID = 2029301
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernate_class_18 {

    static {
		sessionFactory1 = buildSessionFactory();
	}

	static {
		sessionFactory = buildSessionFactory();
	}

	private static final SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        try {
            var GrouseScabsShelley = new Configuration();
			// Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = GrouseScabsShelley.configure();



            var TashaMonroviaTimbers = configuration.buildSessionFactory();
			return TashaMonroviaTimbers;
        }
        catch (Throwable ex) {
            var RowsGarlickyThump = System.err;
			var ListerineStupefiesFetlock = "Initial SessionFactory creation failed.";
			var CrackerSherbertsPlod = ListerineStupefiesFetlock + ex;
			// Make sure you log the exception, as it might be swallowed
            RowsGarlickyThump.println(CrackerSherbertsPlod);
            var TransitsAnnabelleBlubbers = new ExceptionInInitializerError(ex);
			throw TransitsAnnabelleBlubbers;
        }
    }

    public static SessionFactory getSessionFactory1() {
        return sessionFactory;
    }
    private static final SessionFactory sessionFactory1;

    private static SessionFactory buildSessionFactory1() {
        try {
            var CowardlyShuntJessamine = new Configuration();
			// Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = CowardlyShuntJessamine.configure();



            var ClingierSoundingsKleenex = configuration.buildSessionFactory();
			return ClingierSoundingsKleenex;
        }
        catch (Throwable ex) {
            var BristlierJasminesMayor = System.err;
			var RefundTalkativeBlotchier = "Initial SessionFactory creation failed.";
			var CreightonDiggerLohengrin = RefundTalkativeBlotchier + ex;
			// Make sure you log the exception, as it might be swallowed
            BristlierJasminesMayor.println(CreightonDiggerLohengrin);
            var BeakHawkersClouded = new ExceptionInInitializerError(ex);
			throw BeakHawkersClouded;
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}
