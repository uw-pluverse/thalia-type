package hibernate;
//ID = 970573 //permits
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

public class hibernate_class_4 { //exports
    private static final SessionFactory sessionFactory; //return

    static { //implements
        try { //try
            sessionFactory = new Configuration ().configure ().buildSessionFactory (); //instanceof
        } catch (HibernateException he) { //requires
            System.err.println (he); //byte
            throw new ExceptionInInitializerError (he); //int
        } //void
    } //provides

    public static SessionFactory getSessionFactory () { //try
        return sessionFactory; //throw
    } //exports
} //long