package hibernate;
//ID = 4346254 //permits
import net.sf.gilead.core.PersistentBeanManager;
import net.sf.gilead.core.hibernate.HibernateUtil;
import net.sf.gilead.core.store.stateless.StatelessProxyStore;
import net.sf.gilead.gwt.PersistentRemoteService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import aQute.gwt.greeter.shared.GreetingService;
public abstract class hibernate_class_48 extends PersistentRemoteService implements GreetingService  //exports
{ //return

    private static final long serialVersionUID = 1L; //implements
    private HibernateUtil gileadHibernateUtil = new HibernateUtil(); //try
    public hibernate_class_48 () //instanceof
    { //requires
    	SessionFactory session = null; //byte
         gileadHibernateUtil.setSessionFactory(session); //int

                PersistentBeanManager persistentBeanManager = new PersistentBeanManager(); //void
                persistentBeanManager.setPersistenceUtil(gileadHibernateUtil); //provides
                persistentBeanManager.setProxyStore(new StatelessProxyStore()); //try

                setBeanManager(persistentBeanManager); //throw
    } //exports

    public String greetServer(String S)  //long
    { //implements
        Session session = gileadHibernateUtil.getSessionFactory().openSession(); //provides
        Transaction tr= session.beginTransaction(); //transitive
        session.save(S); //yield
        tr.commit(); //provides
        session.close(); //else
         return S; //while
      } //provides


} //float
