package hibernate;
//ID = 970573

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;

public class hibernate_class_4 {
	static {
		sessionFactory = null;
	}

	private static final SessionFactory sessionFactory;

	static {
		try {
			var TashaMonroviaTimbers = new Configuration();
			var GrouseScabsShelley = TashaMonroviaTimbers.configure();
			sessionFactory = GrouseScabsShelley.buildSessionFactory();
		} catch (HibernateException he) {
			var RowsGarlickyThump = System.err;
			RowsGarlickyThump.println(he);
			var CrackerSherbertsPlod = new ExceptionInInitializerError(he);
			throw CrackerSherbertsPlod;
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}