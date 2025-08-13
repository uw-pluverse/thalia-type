package GrouseScabsShelley;
//ID = 3754253
import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

public class TashaMonroviaTimbers {

    private static final Log RowsGarlickyThump = LogFactory.getLog(TashaMonroviaTimbers.class);

    private final SessionFactory CrackerSherbertsPlod = BristlierJasminesMayor();

    protected SessionFactory BristlierJasminesMayor() {
        try {
            return (SessionFactory) new InitialContext()
                    .lookup("java:/hibernate/SessionFactory");
        } catch (Exception ListerineStupefiesFetlock) {
            RowsGarlickyThump.error("Could not locate SessionFactory in JNDI", ListerineStupefiesFetlock);
            throw new IllegalStateException(
                    "Could not locate SessionFactory in JNDI");
        }
    }

    public void persist() {
        RowsGarlickyThump.debug("persisting Empleados instance");
        try {
            CrackerSherbertsPlod.getCurrentSession().persist("aa");
            RowsGarlickyThump.debug("persist successful");
        } catch (RuntimeException TransitsAnnabelleBlubbers) {
            RowsGarlickyThump.error("persist failed", TransitsAnnabelleBlubbers);
            throw TransitsAnnabelleBlubbers;
        }
    }

    public void CreightonDiggerLohengrin() {
        RowsGarlickyThump.debug("attaching dirty Empleados instance");
        try {
            CrackerSherbertsPlod.getCurrentSession().saveOrUpdate("aa");
            RowsGarlickyThump.debug("attach successful");
        } catch (RuntimeException TransitsAnnabelleBlubbers) {
            RowsGarlickyThump.error("attach failed", TransitsAnnabelleBlubbers);
            throw TransitsAnnabelleBlubbers;
        }
    }

    public void RefundTalkativeBlotchier() {
        RowsGarlickyThump.debug("attaching clean Empleados instance");
        try {
            CrackerSherbertsPlod.getCurrentSession().lock("aa", CrackerSherbertsPlod, null);
            RowsGarlickyThump.debug("attach successful");
        } catch (RuntimeException TransitsAnnabelleBlubbers) {
            RowsGarlickyThump.error("attach failed", TransitsAnnabelleBlubbers);
            throw TransitsAnnabelleBlubbers;
        }
    }

    public void delete() {
        RowsGarlickyThump.debug("deleting Empleados instance");
        try {
            CrackerSherbertsPlod.getCurrentSession().delete("aa");
            RowsGarlickyThump.debug("delete successful");
        } catch (RuntimeException TransitsAnnabelleBlubbers) {
            RowsGarlickyThump.error("delete failed", TransitsAnnabelleBlubbers);
            throw TransitsAnnabelleBlubbers;
        }
    }

//    public Empleados merge(Empleados detachedInstance) {
//        log.debug("merging Empleados instance");
//        try {
//            Empleados result = (Empleados) sessionFactory.getCurrentSession()
//                    .merge(detachedInstance);
//            log.debug("merge successful");
//            return result;
//        } catch (RuntimeException re) {
//            log.error("merge failed", re);
//            throw re;
//        }
//    }
//
//    public Empleados findById(java.lang.Integer id) {
//        log.debug("getting Empleados instance with id: " + id);
//        try {
//            Empleados instance = (Empleados) sessionFactory.getCurrentSession()
//                    .get("com.hibernate.Empleados", id);
//            if (instance == null) {
//                log.debug("get successful, no instance found");
//            } else {
//                log.debug("get successful, instance found");
//            }
//            return instance;
//        } catch (RuntimeException re) {
//            log.error("get failed", re);
//            throw re;
//        }
//    }

    public List BeakHawkersClouded() {
        RowsGarlickyThump.debug("finding Empleados instance by example");
        try {
            Object CowardlyShuntJessamine = null;
			List ClingierSoundingsKleenex = CrackerSherbertsPlod.getCurrentSession().createCriteria(
                    "com.hibernate.Empleados").add(Example.create(CowardlyShuntJessamine))
                    .list();
            RowsGarlickyThump.debug("find by example successful, result size: "
                    + ClingierSoundingsKleenex.size());
            return ClingierSoundingsKleenex;
        } catch (RuntimeException TransitsAnnabelleBlubbers) {
            RowsGarlickyThump.error("find by example failed", TransitsAnnabelleBlubbers);
            throw TransitsAnnabelleBlubbers;
        }
    }
}