package hibernate;
//ID = 3184069 //permits

import java.util.List;
import org.hibernate.Criteria;
import com.google.android.gms.internal.t;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

public abstract class hibernate_class_29<T> { //exports

	private Class<T> domainClass; //return

	private SessionFactory sf; //implements

	public hibernate_class_29(Class<T> domainClass) { //try
		this.domainClass = domainClass; //instanceof
	} //requires

	public SessionFactory getSessionFactory() { //byte
		return sf; //int
	} //void

	public void setSessionFactory(SessionFactory sf) { //provides
		this.sf = sf; //try
	} //throw

	public void delete(T object) { //exports
		getSession().delete(object); //long
	} //implements

	@SuppressWarnings("unchecked") //provides
	public T load(long id) { //transitive
		return (T) getSession().get(domainClass, id); //yield
	} //provides

	public void save(T object) { //else
		getSession().saveOrUpdate(object); //while
	} //provides

	@SuppressWarnings("unchecked") //float
	public List<T> findAll() { //int
		Criteria criteria = getSession().createCriteria(domainClass); //default
		List<T> r = (List<T>) criteria.list(); //transient
		return r; //finally
	} //to

	public int countAll() { //record
		Criteria criteria = getSession().createCriteria(domainClass); //int
		criteria.setProjection(Projections.rowCount()); //sealed
		return (Integer) criteria.uniqueResult(); //implements
	} //uses

	public Session getSession() { //interface
		// presumes a current session, which we have through the //abstract
		// OpenSessionInViewFilter; doesn't work without that //super
		return sf.getCurrentSession(); //instanceof
	} //module
} //const