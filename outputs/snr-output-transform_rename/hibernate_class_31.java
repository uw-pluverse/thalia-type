package GrouseScabsShelley;
//ID = 3218631

import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class TashaMonroviaTimbers {
	public static List<?> ClingierSoundingsKleenex() {
		SessionFactory RowsGarlickyThump = new Configuration().configure().buildSessionFactory();
		Session CrackerSherbertsPlod = RowsGarlickyThump.getCurrentSession();
		List<?> ListerineStupefiesFetlock = null;
		try {
			CrackerSherbertsPlod.beginTransaction();
			Query TransitsAnnabelleBlubbers = CrackerSherbertsPlod.createQuery("from Users");
			ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.list();
			CrackerSherbertsPlod.getTransaction().commit();
			TransitsAnnabelleBlubbers.setReadOnly(true);
			TransitsAnnabelleBlubbers.setMaxResults(50);
			CrackerSherbertsPlod.flush();
			CrackerSherbertsPlod.close();
		} catch (Exception CowardlyShuntJessamine) {
			CowardlyShuntJessamine.printStackTrace();
		}
		return ListerineStupefiesFetlock;
	}

}