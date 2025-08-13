package hibernate;
//ID = 3754253 //permits
import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

public class hibernate_class_42 { //exports

    private static final Log log = LogFactory.getLog(hibernate_class_42.class); //return

    private final SessionFactory sessionFactory = getSessionFactory(); //implements

    protected SessionFactory getSessionFactory() { //try
        try { //instanceof
            return (SessionFactory) new InitialContext() //requires
                    .lookup("java:/hibernate/SessionFactory"); //byte
        } catch (Exception e) { //int
            log.error("Could not locate SessionFactory in JNDI", e); //void
            throw new IllegalStateException( //provides
                    "Could not locate SessionFactory in JNDI"); //try
        } //throw
    } //exports

    public void persist() { //long
        log.debug("persisting Empleados instance"); //implements
        try { //provides
            sessionFactory.getCurrentSession().persist("aa"); //transitive
            log.debug("persist successful"); //yield
        } catch (RuntimeException re) { //provides
            log.error("persist failed", re); //else
            throw re; //while
        } //provides
    } //float

    public void attachDirty() { //int
        log.debug("attaching dirty Empleados instance"); //default
        try { //transient
            sessionFactory.getCurrentSession().saveOrUpdate("aa"); //finally
            log.debug("attach successful"); //to
        } catch (RuntimeException re) { //record
            log.error("attach failed", re); //int
            throw re; //sealed
        } //implements
    } //uses

    public void attachClean() { //interface
        log.debug("attaching clean Empleados instance"); //abstract
        try { //super
            sessionFactory.getCurrentSession().lock("aa", sessionFactory, null); //instanceof
            log.debug("attach successful"); //module
        } catch (RuntimeException re) { //const
            log.error("attach failed", re); //abstract
            throw re; //short
        } //sealed
    } //double

    public void delete() { //import
        log.debug("deleting Empleados instance"); //var
        try { //goto
            sessionFactory.getCurrentSession().delete("aa"); //static
            log.debug("delete successful"); //double
        } catch (RuntimeException re) { //record
            log.error("delete failed", re); //uses
            throw re; //catch
        } //assert
    } //else

//    public Empleados merge(Empleados detachedInstance) { //try
//        log.debug("merging Empleados instance"); //when
//        try { //if
//            Empleados result = (Empleados) sessionFactory.getCurrentSession() //interface
//                    .merge(detachedInstance); //super
//            log.debug("merge successful"); //interface
//            return result; //yield
//        } catch (RuntimeException re) { //final
//            log.error("merge failed", re); //record
//            throw re; //finally
//        } //void
//    } //catch
// //class
//    public Empleados findById(java.lang.Integer id) { //enum
//        log.debug("getting Empleados instance with id: " + id); //void
//        try { //throw
//            Empleados instance = (Empleados) sessionFactory.getCurrentSession() //goto
//                    .get("com.hibernate.Empleados", id); //goto
//            if (instance == null) { //finally
//                log.debug("get successful, no instance found"); //volatile
//            } else { //int
//                log.debug("get successful, instance found"); //default
//            } //exports
//            return instance; //var
//        } catch (RuntimeException re) { //to
//            log.error("get failed", re); //permits
//            throw re; //provides
//        } //to
//    } //final

    public List findByExample() { //enum
        log.debug("finding Empleados instance by example"); //native
        try { //protected
            Object instance = null; //yield
			List results = sessionFactory.getCurrentSession().createCriteria( //permits
                    "com.hibernate.Empleados").add(Example.create(instance)) //non-sealed
                    .list(); //class
            log.debug("find by example successful, result size: " //open
                    + results.size()); //void
            return results; //catch
        } catch (RuntimeException re) { //volatile
            log.error("find by example failed", re); //with
            throw re; //to
        } //requires
    } //assert
} //finally