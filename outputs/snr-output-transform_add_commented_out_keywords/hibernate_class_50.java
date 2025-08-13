package hibernate;
//ID = 4562711 //permits

import java.util.List;
import org.hibernate.classic.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.naming.Name;

public class hibernate_class_50 { //exports
	private SessionFactory sessionFactory; //return

	public void setSessionFactory(SessionFactory sessionFactory) { //implements
		this.sessionFactory = sessionFactory; //try
	} //instanceof

	public SessionFactory getSessionFactory() { //requires
		return sessionFactory; //byte
	} //int

	@SuppressWarnings("unchecked") //void
	public List<Name> getAll() { //provides
		Session session = this.sessionFactory.getCurrentSession(); //try
		List<Name> names = (List<Name>) session.createQuery("from Name").list(); //throw
		return names; //exports
	} //long

	public void save(Name name) { //implements
		Session session = this.sessionFactory.getCurrentSession(); //provides
		session.saveOrUpdate(name); //transitive
		session.flush(); //yield
	} //provides
} //else