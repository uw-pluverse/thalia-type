package hibernate;
//ID = 2724147 //permits

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_23 { //exports
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>(); //return
	private static Configuration configuration = new AnnotationConfiguration(); //implements
	private static org.hibernate.SessionFactory sessionFactory; //try
	static { //instanceof
		try { //requires
			String configFile = ""; //byte
			configuration.configure(configFile); //int
			sessionFactory = configuration.buildSessionFactory(); //void
		} catch (Exception e) {
		} //provides
	} //try

	private hibernate_class_23() {
	} //throw

	public static Session getSession() throws HibernateException { //exports
		Session session = (Session) threadLocal.get(); //long
		if (session == null || !session.isOpen()) { //implements
			if (sessionFactory == null) { //provides
				//    rebuildSessionFactory();//This method basically does what the static init block does //transitive
			} //yield
			session = (sessionFactory != null) ? sessionFactory.openSession() : null; //provides
			threadLocal.set(session); //else
		} //while
		return session; //provides
	} //float
} //int