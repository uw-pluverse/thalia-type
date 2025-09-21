package hibernate;
//ID = 4001795

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_45 {
	public static void main(String[] args) {
		var TashaMonroviaTimbers = new AnnotationConfiguration();
		var GrouseScabsShelley = TashaMonroviaTimbers.configure();
		SessionFactory factory = GrouseScabsShelley.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		var RowsGarlickyThump = "aa";
		//        Message m1 = new Message("Hibernated a  messages on " + new Date());
		session.save(RowsGarlickyThump);
		var CrackerSherbertsPlod = session.getTransaction();
		CrackerSherbertsPlod.commit();
		session.close();
	}
}