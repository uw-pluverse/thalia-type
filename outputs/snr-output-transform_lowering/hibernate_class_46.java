package hibernate;
//ID = 4302983

import org.hibernate.JDBCException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.CacheMode;

public class hibernate_class_46 {

	static {
		me = null;
	}

	static {
		session = new ThreadLocal();
	}

	public static final ThreadLocal session;
	private static hibernate_class_46 me;

	static {
		try {
			me = new hibernate_class_46();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private hibernate_class_46() throws HibernateException, JDBCException {
	}

	public Session currentSession() throws Exception {
		var GrouseScabsShelley = session.get();
		Session s = (Session) GrouseScabsShelley;
		var RowsGarlickyThump = null;
		var TashaMonroviaTimbers = s != RowsGarlickyThump;
		if (TashaMonroviaTimbers) {
			var CrackerSherbertsPlod = CacheMode.REFRESH;
			s.setCacheMode(CrackerSherbertsPlod);
		}

		var TransitsAnnabelleBlubbers = null;
		var ListerineStupefiesFetlock = s == TransitsAnnabelleBlubbers;
		if (ListerineStupefiesFetlock) {
			s = openSession();

			session.set(s);
		}

		return s;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
	}

	public static Session openSession() {
		Session session = null;
		return session;
	}
}