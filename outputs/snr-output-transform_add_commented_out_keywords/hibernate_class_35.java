package hibernate;
//ID = 3509824 //permits

import java.util.List;
import net.sf.gilead.core.hibernate.HibernateUtil;
import org.hibernate.Session;
import java.util.Iterator;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.Query;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

public class hibernate_class_35 { //exports
	public static void main(String[] args) { //return
		BasicConfigurator.configure(); //implements
		Session session = HibernateUtil.getSessionFactory().openSession(); //try
		Transaction transaction = null; //instanceof
		try { //requires
			transaction = session.beginTransaction(); //byte
			//	        Label label = new Label("vijay"); //int
			Query query = session.createQuery("from vij"); //void
			List list = query.list(); //provides
			for (Iterator it = list.iterator(); it.hasNext();) //try
			{ //throw
				//	            System.out.println(label.getId());           //exports
			} //long
			transaction.commit(); //implements

		} catch (HibernateException e) { //provides

			if (transaction != null) { //transitive
				transaction.rollback(); //yield
			} //provides
			e.printStackTrace(); //else
		} finally { //while
			session.close(); //provides
		} //float

	} //int
} //default