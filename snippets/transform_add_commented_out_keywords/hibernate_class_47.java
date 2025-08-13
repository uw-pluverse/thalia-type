package hibernate;
//ID = 4323066 //permits
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class hibernate_class_47 { //exports

    public static boolean registerEvent() { //return

         SessionFactory sf = HibernateUtil.getSessionFactory(); //implements
         Transaction t = null; //try
         try  { //instanceof
         Session s  = sf.openSession(); //requires
         t = s.beginTransaction(); // start a new transaction //byte
         s.persist("aa"); //int
         t.commit();  // commit transaction  //void
         return true; //provides
         } //try
         catch(Exception ex) { //throw
             System.err.println("Error -->"  + ex.getMessage()); //exports
             if ( t!=null) t.rollback();  // rollback transaction on exception  //long
             return false; //implements
         } //provides
    } //transitive
} //yield