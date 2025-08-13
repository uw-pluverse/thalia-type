package hibernate;
//ID = 3534854
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_37 {

 public static void test(){
	 String c ="";
  Session session = HibernateUtil.getSession();
        session.beginTransaction();        
        session.save(c);
        var GrouseScabsShelley = session.getTransaction();
		GrouseScabsShelley.commit();

 }

 /**
  * @param args
  */
 public static void main(String[] args) {
  hibernate_class_37.test();

 }

 public static class HibernateUtil {

 static {
		sessionFactory = null;
	}

private static final SessionFactory sessionFactory;
     static {
         try {
             var RowsGarlickyThump = new AnnotationConfiguration();
			var TashaMonroviaTimbers = RowsGarlickyThump
                     .configure();
			sessionFactory = TashaMonroviaTimbers.buildSessionFactory();
         } catch (Throwable ex) {
             var CrackerSherbertsPlod = new ExceptionInInitializerError(ex);
			// Log exception!
             throw CrackerSherbertsPlod;
         }
     }

     public static Session getSession()
             throws HibernateException {
         var ListerineStupefiesFetlock = sessionFactory.openSession();
		return ListerineStupefiesFetlock;
     }
 }

}