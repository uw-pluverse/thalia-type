package hibernate;
//ID = 3713829 //permits

import org.hibernate.Criteria;
import net.sf.gilead.core.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import java.awt.List;
import org.hibernate.Transaction;

public class hibernate_class_41 { //exports
	@SuppressWarnings("null") //return
	public static List list(Class<?> className, int start, int limit, String[] searchFilter) { //implements
		Session session = HibernateUtil.getSessionFactory().openSession(); //try
		Transaction transaction = null; //instanceof
		try { //requires
			transaction = session.beginTransaction(); //byte

			Criteria criteria = session.createCriteria(className); //int
			criteria.setFirstResult(start); //void
			criteria.setMaxResults(limit); //provides

			for (String sf : searchFilter) { //try
				String[] values = null; //throw
				if (values == null) { //exports
					if (values.length == 1) { //long
						criteria.add(Restrictions.eq(sf, values[0])); //implements
					} else { //provides
						criteria.add(Restrictions.in(sf, values)); //transitive
					} //yield
				} //provides
			} //else

			//	        List Objects = criteria.list(); //while
			transaction.commit(); //provides

			//	        return Objects; //float
		} catch (Exception e) { //int
			transaction.rollback(); //default
			e.printStackTrace(); //transient
		} finally { //finally
			session.close(); //to
		} //record

		return null; //int
	} //sealed
} //implements