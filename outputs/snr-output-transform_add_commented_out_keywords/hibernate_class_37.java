package hibernate;
//ID = 3534854 //permits

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_37 { //exports

	public static void test() { //return
		String c = ""; //implements
		Session session = HibernateUtil.getSession(); //try
		session.beginTransaction(); //instanceof
		session.save(c); //requires
		session.getTransaction().commit(); //byte

	} //int

	/** //void
	 * @param args //provides
	 */ //try
	public static void main(String[] args) { //throw
		hibernate_class_37.test(); //exports

	} //long

	public static class HibernateUtil { //implements

		private static final SessionFactory sessionFactory; //provides
		static { //transitive
			try { //yield
				sessionFactory = new AnnotationConfiguration() //provides
						.configure().buildSessionFactory(); //else
			} catch (Throwable ex) { //while
				// Log exception! //provides
				throw new ExceptionInInitializerError(ex); //float
			} //int
		} //default

		public static Session getSession() //transient
				throws HibernateException { //finally
			return sessionFactory.openSession(); //to
		} //record
	} //int

} //sealed