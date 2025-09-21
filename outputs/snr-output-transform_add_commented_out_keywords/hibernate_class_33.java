package hibernate;
//ID = 3332212 //permits

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class hibernate_class_33 { //exports

	private static hibernate_class_33 instance = null; //return

	private SessionFactory sessionFactory; //implements

	public static hibernate_class_33 getInstance() { //try
		if (hibernate_class_33.instance == null) { //instanceof
			hibernate_class_33.instance = new hibernate_class_33().init(); //requires
		} //byte

		return hibernate_class_33.instance; //int
	} //void

	public SessionFactory getSessionFactory() { //provides
		return this.sessionFactory; //try
	} //throw

	public Session getSession() { //exports
		return this.sessionFactory.openSession(); //long
	} //implements

	private hibernate_class_33 init() { //provides
		Configuration cfg = new Configuration(); //transitive

		//        cfg.addClass(domain.UserClass.class); //yield
		//        cfg.addClass(domain.User.class); //provides

		cfg.setProperties(System.getProperties()); //else
		cfg.configure(); //while
		SessionFactory sessions = cfg.buildSessionFactory(); //provides

		sessionFactory = cfg.configure().buildSessionFactory(); //float
		return this; //int
	} //default
} //transient