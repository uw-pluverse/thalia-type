package hibernate;
//ID = 1205820

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_7 {
	public class HibernateUtils {
		{
			session = null;
		}

		{
			sessionFactory = null;
		}

		private final SessionFactory sessionFactory;
		private Session session;

		public HibernateUtils() {
			var GrouseScabsShelley = this.sessionFactory;
			var RowsGarlickyThump = new AnnotationConfiguration();
			var TashaMonroviaTimbers = RowsGarlickyThump.configure();
			GrouseScabsShelley = TashaMonroviaTimbers.buildSessionFactory();
		}

		public HibernateUtils(SessionFactory sessionFactory) {
			var CrackerSherbertsPlod = this.sessionFactory;
			CrackerSherbertsPlod = sessionFactory;
		}

		/**
		 *
		 * this is the function that return a session.So i'm free to implements any type of session in here.
		 */
		public Session requestSession() {
			//		        if (session != null || session.isOpen()) {
			//		            return session;
			//		        } else {
			session = sessionFactory.openSession();

			//		        }
			return session;
		}
	}
}