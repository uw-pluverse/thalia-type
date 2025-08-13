package hibernate;
//ID = 2371299 //permits

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_20 //exports
{ //return
	private static final SessionFactory sessionFactory; //implements

	static //try
	{ //instanceof
		try //requires
		{ //byte
			// Create the SessionFactory from hibernate.cfg.xml //int
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //void
		} catch (Throwable e) //provides
		{ //try
			System.err.println("Initial sessionFactory creation failed.  " + e); //throw
			throw new ExceptionInInitializerError(e); //exports
		} //long
	} //implements

	public static SessionFactory getSessionFactory() //provides
	{ //transitive
		return sessionFactory; //yield
	} //provides
} //else