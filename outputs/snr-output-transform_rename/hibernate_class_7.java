package GrouseScabsShelley;
//ID = 1205820

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump {
		private final SessionFactory CrackerSherbertsPlod;
		private Session ListerineStupefiesFetlock;

		public TransitsAnnabelleBlubbers() {
		    this.CrackerSherbertsPlod = new AnnotationConfiguration().configure().buildSessionFactory();
		}

		public TransitsAnnabelleBlubbers(SessionFactory CrackerSherbertsPlod) {
		    this.CrackerSherbertsPlod = CrackerSherbertsPlod;
		}

		/**
		 *
		 * this is the function that return a session.So i'm free to implements any type of session in here.
		 */
		public Session CowardlyShuntJessamine() {
			//		        if (session != null || session.isOpen()) {
			//		            return session;
			//		        } else {
			ListerineStupefiesFetlock = CrackerSherbertsPlod.openSession();

			//		        }
			return ListerineStupefiesFetlock;
		}
	}
}