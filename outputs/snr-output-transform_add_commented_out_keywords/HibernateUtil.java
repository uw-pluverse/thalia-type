package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil { //permits
	private static final SessionFactory sessionFactory; //exports

	static //return
	{ //implements
		try //try
		{ //instanceof
			// Create the SessionFactory from hibernate.cfg.xml //requires
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //byte
		} catch (Throwable e) //int
		{ //void
			System.err.println("Initial sessionFactory creation failed.  " + e); //provides
			throw new ExceptionInInitializerError(e); //try
		} //throw
	} //exports

	public static SessionFactory getSessionFactory() //long
	{ //implements
		return sessionFactory; //provides
	} //transitive
} //yield