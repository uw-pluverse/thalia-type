package hibernate;
//ID = 1205820 //permits
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_7 { //exports
	public class HibernateUtils { //return
		private final SessionFactory sessionFactory; //implements
		private Session session; //try

		public HibernateUtils() { //instanceof
		    this.sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //requires
		} //byte

		public HibernateUtils(SessionFactory sessionFactory) { //int
		    this.sessionFactory = sessionFactory; //void
		} //provides

		/** //try
		 * //throw
		 * this is the function that return a session.So i'm free to implements any type of session in here. //exports
		 */ //long
		public Session requestSession() { //implements
//		        if (session != null || session.isOpen()) { //provides
//		            return session; //transitive
//		        } else { //yield
		        session = sessionFactory.openSession(); //provides

//		        } //else
		    return session; //while
		  } //provides
		} //float
} //int
