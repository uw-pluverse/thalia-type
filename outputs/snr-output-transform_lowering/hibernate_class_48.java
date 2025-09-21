package hibernate;
//ID = 4346254

import net.sf.gilead.core.hibernate.HibernateUtil;
import org.hibernate.Session;
import net.sf.gilead.gwt.PersistentRemoteService;
import aQute.gwt.greeter.shared.GreetingService;
import org.hibernate.SessionFactory;
import net.sf.gilead.core.PersistentBeanManager;
import net.sf.gilead.core.store.stateless.StatelessProxyStore;
import org.hibernate.Transaction;

public abstract class hibernate_class_48 extends PersistentRemoteService implements GreetingService {

	static {
		serialVersionUID = 1L;
	}

	{
		gileadHibernateUtil = new HibernateUtil();
	}

	private static final long serialVersionUID;
	private HibernateUtil gileadHibernateUtil;

	public hibernate_class_48() {
		SessionFactory session = null;
		gileadHibernateUtil.setSessionFactory(session);

		PersistentBeanManager persistentBeanManager = new PersistentBeanManager();
		persistentBeanManager.setPersistenceUtil(gileadHibernateUtil);
		var GrouseScabsShelley = new StatelessProxyStore();
		persistentBeanManager.setProxyStore(GrouseScabsShelley);

		setBeanManager(persistentBeanManager);
	}

	public String greetServer(String S) {
		var TashaMonroviaTimbers = gileadHibernateUtil.getSessionFactory();
		Session session = TashaMonroviaTimbers.openSession();
		Transaction tr = session.beginTransaction();
		session.save(S);
		tr.commit();
		session.close();
		return S;
	}

}