package GrouseScabsShelley;
//ID = 3534854
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TashaMonroviaTimbers {

 public static void test(){
	 String RowsGarlickyThump ="";
  Session CrackerSherbertsPlod = TransitsAnnabelleBlubbers.getSession();
        CrackerSherbertsPlod.beginTransaction();        
        CrackerSherbertsPlod.save(RowsGarlickyThump);
        CrackerSherbertsPlod.getTransaction().commit();

 }

 /**
  * @param args
  */
 public static void BristlierJasminesMayor(String[] ListerineStupefiesFetlock) {
  TashaMonroviaTimbers.test();

 }

 public static class TransitsAnnabelleBlubbers {

 private static final SessionFactory CowardlyShuntJessamine;
     static {
         try {
             CowardlyShuntJessamine = new AnnotationConfiguration()
                     .configure().buildSessionFactory();
         } catch (Throwable ClingierSoundingsKleenex) {
             // Log exception!
             throw new ExceptionInInitializerError(ClingierSoundingsKleenex);
         }
     }

     public static Session getSession()
             throws HibernateException {
         return CowardlyShuntJessamine.openSession();
     }
 }

}