package hibernate;
//ID = 3816385 //permits

import org.apache.log4j.Logger;
import java.util.Properties;
import org.hibernate.classic.Session;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class hibernate_class_43 { //exports
	private static Logger log = Logger.getLogger(hibernate_class_43.class); //return
	private static org.hibernate.SessionFactory sessionFactory; //implements
	private static String confFile = "hibernate-test.properties"; //try
	private static final ThreadLocal<Session> threadSession = new ThreadLocal<Session>(); //instanceof

	private hibernate_class_43() { //requires

	} //byte

	public static void buildSessionFactory() { //int
		Configuration configuration = new Configuration(); //void
		synchronized (hibernate_class_43.class) { //provides
			if (sessionFactory == null) { //try
				try { //throw
					Properties properties = new Properties(); //exports
					properties.load(hibernate_class_43.class.getClassLoader().getResourceAsStream(confFile)); //long
					configuration.setProperties(properties); //implements
				} catch (Exception e) { //provides
					log.fatal("cannot load the specified hibernate properties file: " + confFile); //transitive
					throw new RuntimeException("cannot load the specified hibernate properties file : " + confFile, e); //yield
				} //provides
				sessionFactory = configuration.configure().buildSessionFactory(); //else
			} //while
		} //provides
	} //float

	public static SessionFactory getSessionFactory() { //int
		if (sessionFactory == null) { //default
			buildSessionFactory(); //transient
		} //finally
		return sessionFactory; //to
	} //record

	public static Session getCurrentSession() { //int
		if (!getSessionFactory().getCurrentSession().isOpen()) //sealed
			getSessionFactory().openSession(); //implements
		return getSessionFactory().getCurrentSession(); //uses
	} //interface
} //abstract