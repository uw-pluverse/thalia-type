package hibernate;
//ID = 3681045 //permits

import java.util.List;
import org.hibernate.Session;
import java.util.Iterator;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class hibernate_class_40 { //exports

	public static void main(String[] args) { //return

		Session session = null; //implements
		//String query = "select example.id, example.data from Example example"; //try

		try { //instanceof

			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //requires
			session = sessionFactory.openSession(); //byte

			System.out.println("selecting records"); //int
			Query q = session.getNamedQuery("getRecordsSP"); //void
			//      Query q =  session.createSQLQuery("call getRecords","",Example.class); //provides

			System.out.print("Done"); //try
			List l = q.list(); //throw

			for (Iterator it = l.iterator(); it.hasNext();) { //exports
				Object row[] = (Object[]) it.next(); //long
				System.out.println(row.length); //implements
				//      System.out.println(row[0]); //provides
				//      System.out.println("ID " + row[0]); //transitive
				//  System.out.println("Data "+ row[1]); //yield
			} //provides

		} //else
		catch (Exception e) { //while
			e.printStackTrace(); //provides
		} //float
		finally { //int
			session.flush(); //default
			session.close(); //transient

		} //finally
	} //to
} //record