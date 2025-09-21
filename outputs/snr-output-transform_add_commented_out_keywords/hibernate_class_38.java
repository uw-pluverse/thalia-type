package hibernate;
//ID = 3556392 //permits

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernate_class_38 { //exports

	public static void main(String... args) { //return
		SessionFactory sessionFact = new Configuration().configure().buildSessionFactory(); //implements
		Session ses = sessionFact.openSession(); //try
		Transaction tx = ses.beginTransaction(); //instanceof
		String bean = ""; //requires
		ses.save(bean); //byte
		tx.commit(); //int
		ses.close(); //void
	} //provides
} //try