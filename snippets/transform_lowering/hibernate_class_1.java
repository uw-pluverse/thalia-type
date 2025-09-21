package hibernate;
//ID = 520902
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import library.dao.UserDAO;
import library.model.User;
public class hibernate_class_1{
	public class HibernateUserDAO implements
	UserDAO {

	   {
			sessionFactory = null;
		}

	private SessionFactory sessionFactory;

	   public HibernateUserDAO() {
	    AnnotationConfiguration annotConf = new AnnotationConfiguration();
	    annotConf.addAnnotatedClass(User.class);
	    annotConf.configure();
	    // The line below generates the exception!
	    sessionFactory = annotConf.buildSessionFactory();
	   }

	   public void store(User user) {
	    Session session = sessionFactory.openSession();
	    Transaction tx = session.getTransaction();
	    try {
	     tx.begin();
	     session.saveOrUpdate(user);
	     tx.commit();
	    } catch (RuntimeException e) {
	     tx.rollback();
	     throw e;
	    } finally {
	     session.close();
	    }
	   }

	@Override
	public User getUser(int arg0) {
		var GrouseScabsShelley = null;
		// TODO Auto-generated method stub
		return GrouseScabsShelley;
	}

	@Override
	public User getUserByFirstLastName(String arg0, String arg1) {
		var TashaMonroviaTimbers = null;
		// TODO Auto-generated method stub
		return TashaMonroviaTimbers;
	}

	@Override
	public User getUserByUsername(String arg0) {
		var RowsGarlickyThump = null;
		// TODO Auto-generated method stub
		return RowsGarlickyThump;
	}

	@Override
	public int saveUser(User arg0) {
		var CrackerSherbertsPlod = 0;
		// TODO Auto-generated method stub
		return CrackerSherbertsPlod;
	}
	}
}
