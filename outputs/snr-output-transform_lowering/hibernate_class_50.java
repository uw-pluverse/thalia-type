package hibernate;
//ID = 4562711

import java.util.List;
import org.hibernate.classic.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.naming.Name;

public class hibernate_class_50 {
	{
		sessionFactory = null;
	}

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		var GrouseScabsShelley = this.sessionFactory;
		GrouseScabsShelley = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Name> getAll() {
		var TashaMonroviaTimbers = this.sessionFactory;
		Session session = TashaMonroviaTimbers.getCurrentSession();
		var ListerineStupefiesFetlock = "from Name";
		var CrackerSherbertsPlod = session.createQuery(ListerineStupefiesFetlock);
		var RowsGarlickyThump = CrackerSherbertsPlod.list();
		List<Name> names = (List<Name>) RowsGarlickyThump;
		return names;
	}

	public void save(Name name) {
		var TransitsAnnabelleBlubbers = this.sessionFactory;
		Session session = TransitsAnnabelleBlubbers.getCurrentSession();
		session.saveOrUpdate(name);
		session.flush();
	}
}