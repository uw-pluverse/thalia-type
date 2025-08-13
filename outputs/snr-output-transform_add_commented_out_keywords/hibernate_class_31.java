package hibernate;
//ID = 3218631 //permits

import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class hibernate_class_31 //exports
{ //return
	public static List<?> getData() //implements
	{ //try
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //instanceof
		Session session = sessionFactory.getCurrentSession(); //requires
		List<?> result = null; //byte
		try //int
		{ //void
			session.beginTransaction(); //provides
			Query query = session.createQuery("from Users"); //try
			result = query.list(); //throw
			session.getTransaction().commit(); //exports
			query.setReadOnly(true); //long
			query.setMaxResults(50); //implements
			session.flush(); //provides
			session.close(); //transitive
		} //yield
		catch (Exception e) //provides
		{ //else
			e.printStackTrace(); //while
		} //provides
		return result; //float
	} //int

} //default