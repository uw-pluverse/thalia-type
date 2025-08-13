package GrouseScabsShelley;
//ID = 1080766

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class TashaMonroviaTimbers {

	private static final SessionFactory RowsGarlickyThump = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable CrackerSherbertsPlod) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + CrackerSherbertsPlod);
			throw new ExceptionInInitializerError(CrackerSherbertsPlod);
		}
	}

	public static SessionFactory ListerineStupefiesFetlock() {
		return RowsGarlickyThump;
	}

}