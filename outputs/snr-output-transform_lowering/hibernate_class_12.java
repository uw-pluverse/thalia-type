package hibernate;
//ID = 1443590

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import javax.faces.context.FacesContext;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernate_class_12 {
	public void main() {
		Session session = null;
		try {

			var TashaMonroviaTimbers = new Configuration();
			var GrouseScabsShelley = TashaMonroviaTimbers.configure();
			SessionFactory sessionFactory = GrouseScabsShelley.buildSessionFactory();
			session = sessionFactory.openSession();

			var TransitsAnnabelleBlubbers = FacesContext.getCurrentInstance();
			var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.getExternalContext();
			var CrackerSherbertsPlod = ListerineStupefiesFetlock.getRequestParameterMap();
			var CowardlyShuntJessamine = "storeId";
			var RowsGarlickyThump = CrackerSherbertsPlod.get(CowardlyShuntJessamine);
			String id = (String) RowsGarlickyThump;

			Transaction t = session.beginTransaction();
			t.commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
	}
}