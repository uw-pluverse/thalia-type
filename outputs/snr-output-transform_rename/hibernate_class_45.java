package GrouseScabsShelley;
//ID = 4001795

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TashaMonroviaTimbers {
	public static void TransitsAnnabelleBlubbers(String[] RowsGarlickyThump) {
		SessionFactory CrackerSherbertsPlod = new AnnotationConfiguration().configure().buildSessionFactory();
		Session ListerineStupefiesFetlock = CrackerSherbertsPlod.openSession();
		ListerineStupefiesFetlock.beginTransaction();

		//        Message m1 = new Message("Hibernated a  messages on " + new Date());
		ListerineStupefiesFetlock.save("aa");
		ListerineStupefiesFetlock.getTransaction().commit();
		ListerineStupefiesFetlock.close();
	}
}