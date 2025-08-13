package hibernate;
//ID = 3556392

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernate_class_38 {

	public static void main(String... args) {
		var TashaMonroviaTimbers = new Configuration();
		var GrouseScabsShelley = TashaMonroviaTimbers.configure();
		SessionFactory sessionFact = GrouseScabsShelley.buildSessionFactory();
		Session ses = sessionFact.openSession();
		Transaction tx = ses.beginTransaction();
		String bean = "";
		ses.save(bean);
		tx.commit();
		ses.close();
	}
}