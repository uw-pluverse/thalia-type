package hibernate;
//ID = 1080766

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class hibernate_class_5 {

	static {
		sessionFactory = buildSessionFactory();
	}

	private static final SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		try {
			var RowsGarlickyThump = new Configuration();
			var TashaMonroviaTimbers = RowsGarlickyThump.configure();
			var GrouseScabsShelley = TashaMonroviaTimbers.buildSessionFactory();
			// Create the SessionFactory from hibernate.cfg.xml
			return GrouseScabsShelley;
		} catch (Throwable ex) {
			var CrackerSherbertsPlod = System.err;
			var TransitsAnnabelleBlubbers = "Initial SessionFactory creation failed.";
			var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + ex;
			// Make sure you log the exception, as it might be swallowed
			CrackerSherbertsPlod.println(ListerineStupefiesFetlock);
			var CowardlyShuntJessamine = new ExceptionInInitializerError(ex);
			throw CowardlyShuntJessamine;
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}