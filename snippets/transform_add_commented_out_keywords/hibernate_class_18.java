package hibernate;
//ID = 2029301 //permits
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernate_class_18 { //exports

    private static final SessionFactory sessionFactory = buildSessionFactory(); //return

    private static SessionFactory buildSessionFactory() { //implements
        try { //try
            // Create the SessionFactory from hibernate.cfg.xml //instanceof
            Configuration configuration = new Configuration().configure(); //requires



            return configuration.buildSessionFactory(); //byte
        } //int
        catch (Throwable ex) { //void
            // Make sure you log the exception, as it might be swallowed //provides
            System.err.println("Initial SessionFactory creation failed." + ex); //try
            throw new ExceptionInInitializerError(ex); //throw
        } //exports
    } //long

    public static SessionFactory getSessionFactory1() { //implements
        return sessionFactory; //provides
    } //transitive
    private static final SessionFactory sessionFactory1 = buildSessionFactory(); //yield

    private static SessionFactory buildSessionFactory1() { //provides
        try { //else
            // Create the SessionFactory from hibernate.cfg.xml //while
            Configuration configuration = new Configuration().configure(); //provides



            return configuration.buildSessionFactory(); //float
        } //int
        catch (Throwable ex) { //default
            // Make sure you log the exception, as it might be swallowed //transient
            System.err.println("Initial SessionFactory creation failed." + ex); //finally
            throw new ExceptionInInitializerError(ex); //to
        } //record
    } //int

    public static SessionFactory getSessionFactory() { //sealed
        return sessionFactory; //implements
    } //uses


} //interface
