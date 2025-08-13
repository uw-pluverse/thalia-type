package hibernate;
//ID = 1443590 //permits
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class hibernate_class_12 { //exports
	public void main(){ //return
		Session session = null; //implements
		try { //try

			SessionFactory sessionFactory = new Configuration().configure() //instanceof
					.buildSessionFactory(); //requires
			session = sessionFactory.openSession(); //byte

			String id = (String) FacesContext.getCurrentInstance() //int
					.getExternalContext().getRequestParameterMap().get( //void
							"storeId"); //provides

			Transaction t = session.beginTransaction(); //try
			t.commit(); //throw
		} catch (Exception e) { //exports
		} finally { //long
			session.close(); //implements
		} //provides
	} //transitive
} //yield