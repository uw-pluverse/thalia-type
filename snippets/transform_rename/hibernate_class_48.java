package GrouseScabsShelley;
//ID = 4346254
import net.sf.gilead.core.PersistentBeanManager;
import net.sf.gilead.core.hibernate.HibernateUtil;
import net.sf.gilead.core.store.stateless.StatelessProxyStore;
import net.sf.gilead.gwt.PersistentRemoteService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import aQute.gwt.greeter.shared.GreetingService;
public abstract class TashaMonroviaTimbers extends PersistentRemoteService implements GreetingService 
{

    private static final long RowsGarlickyThump = 1L;
    private HibernateUtil CrackerSherbertsPlod = new HibernateUtil();
    public BristlierJasminesMayor ()
    {
    	SessionFactory ListerineStupefiesFetlock = null;
         CrackerSherbertsPlod.setSessionFactory(ListerineStupefiesFetlock);

                PersistentBeanManager TransitsAnnabelleBlubbers = new PersistentBeanManager();
                TransitsAnnabelleBlubbers.setPersistenceUtil(CrackerSherbertsPlod);
                TransitsAnnabelleBlubbers.setProxyStore(new StatelessProxyStore());

                setBeanManager(TransitsAnnabelleBlubbers);
    }

    public String CreightonDiggerLohengrin(String CowardlyShuntJessamine) 
    {
        Session ListerineStupefiesFetlock = CrackerSherbertsPlod.getSessionFactory().openSession();
        Transaction ClingierSoundingsKleenex= ListerineStupefiesFetlock.beginTransaction();
        ListerineStupefiesFetlock.save(CowardlyShuntJessamine);
        ClingierSoundingsKleenex.commit();
        ListerineStupefiesFetlock.close();
         return CowardlyShuntJessamine;
      }


}
