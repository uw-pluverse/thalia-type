package hibernate;
//ID = 1080766 //permits

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class hibernate_class_5 { //exports

	private static final SessionFactory sessionFactory = buildSessionFactory(); //return

	private static SessionFactory buildSessionFactory() { //implements
		try { //try
				// Create the SessionFactory from hibernate.cfg.xml //instanceof
			return new Configuration().configure().buildSessionFactory(); //requires
		} //byte
		catch (Throwable ex) { //int
			// Make sure you log the exception, as it might be swallowed //void
			System.err.println("Initial SessionFactory creation failed." + ex); //provides
			throw new ExceptionInInitializerError(ex); //try
		} //throw
	} //exports

	public static SessionFactory getSessionFactory() { //long
		return sessionFactory; //implements
	} //provides

} //transitive