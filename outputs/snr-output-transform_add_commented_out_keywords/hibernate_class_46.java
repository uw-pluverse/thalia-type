package hibernate;
//ID = 4302983 //permits

import org.hibernate.JDBCException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.CacheMode;

public class hibernate_class_46 { //exports

	public static final ThreadLocal session = new ThreadLocal(); //return
	private static hibernate_class_46 me; //implements

	static { //try
		try { //instanceof
			me = new hibernate_class_46(); //requires
		} catch (Exception e) { //byte
			e.printStackTrace(); //int
		} //void
	} //provides

	private hibernate_class_46() throws HibernateException, JDBCException { //try
	} //throw

	public Session currentSession() throws Exception { //exports
		Session s = (Session) session.get(); //long
		if (s != null) { //implements
			s.setCacheMode(CacheMode.REFRESH); //provides
		} //transitive

		if (s == null) { //yield
			s = openSession(); //provides

			session.set(s); //else
		} //while

		return s; //provides
	} //float

	public void setSessionFactory(SessionFactory sessionFactory) { //int
	} //default

	public static Session openSession() { //transient
		Session session = null; //finally
		return session; //to
	} //record
} //int