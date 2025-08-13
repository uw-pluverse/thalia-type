package GrouseScabsShelley;
//ID = 970573

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;

public class TashaMonroviaTimbers {
	private static final SessionFactory RowsGarlickyThump;

	static {
		try {
			RowsGarlickyThump = new Configuration().configure().buildSessionFactory();
		} catch (HibernateException CrackerSherbertsPlod) {
			System.err.println(CrackerSherbertsPlod);
			throw new ExceptionInInitializerError(CrackerSherbertsPlod);
		}
	}

	public static SessionFactory ListerineStupefiesFetlock() {
		return RowsGarlickyThump;
	}
}