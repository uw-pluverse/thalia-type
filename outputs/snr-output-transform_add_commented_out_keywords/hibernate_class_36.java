package hibernate;
//ID = 3513366 //permits

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernate_class_36 //exports
{ //return
	public static void main(String[] args) //implements
	{ //try
		Session session = null; //instanceof
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //requires

		//        MyClass str1 = null; //byte
		Transaction tx = null; //int
		try //void
		{ //provides
			session = sessionFactory.openSession(); //try
			tx = session.beginTransaction(); //throw
			//            str1 = new MyClass("hello"); //exports
			//            session.save(str1); //long
			tx.commit(); //implements
		} //provides
		catch (Exception e) //transitive
		{ //yield
			e.printStackTrace(); //provides
		} //else
		finally //while
		{ //provides
			session.close(); //float
		} //int
	} //default
} //transient