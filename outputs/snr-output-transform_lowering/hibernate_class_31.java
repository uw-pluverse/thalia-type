package hibernate;
//ID = 3218631

import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class hibernate_class_31 {
	public static List<?> getData() {
		var TashaMonroviaTimbers = new Configuration();
		var GrouseScabsShelley = TashaMonroviaTimbers.configure();
		SessionFactory sessionFactory = GrouseScabsShelley.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<?> result = null;
		try {
			session.beginTransaction();
			var RowsGarlickyThump = "from Users";
			Query query = session.createQuery(RowsGarlickyThump);
			result = query.list();
			var CrackerSherbertsPlod = session.getTransaction();
			CrackerSherbertsPlod.commit();
			var ListerineStupefiesFetlock = true;
			query.setReadOnly(ListerineStupefiesFetlock);
			var TransitsAnnabelleBlubbers = 50;
			query.setMaxResults(TransitsAnnabelleBlubbers);
			session.flush();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}