package hibernate;
//ID = 3754253

import javax.naming.InitialContext;
import java.util.List;
import org.hibernate.classic.Session;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.hibernate.SessionFactory;

public class hibernate_class_42 {

	static {
		log = LogFactory.getLog(hibernate_class_42.class);
	}

	{
		sessionFactory = getSessionFactory();
	}

	private static final Log log;

	private final SessionFactory sessionFactory;

	protected SessionFactory getSessionFactory() {
		try {
			var TashaMonroviaTimbers = new InitialContext();
			var RowsGarlickyThump = "java:/hibernate/SessionFactory";
			var GrouseScabsShelley = TashaMonroviaTimbers.lookup(RowsGarlickyThump);
			return (SessionFactory) GrouseScabsShelley;
		} catch (Exception e) {
			var CrackerSherbertsPlod = "Could not locate SessionFactory in JNDI";
			log.error(CrackerSherbertsPlod, e);
			var TransitsAnnabelleBlubbers = "Could not locate SessionFactory in JNDI";
			var ListerineStupefiesFetlock = new IllegalStateException(TransitsAnnabelleBlubbers);
			throw ListerineStupefiesFetlock;
		}
	}

	public void persist() {
		var CowardlyShuntJessamine = "persisting Empleados instance";
		log.debug(CowardlyShuntJessamine);
		try {
			var ClingierSoundingsKleenex = sessionFactory.getCurrentSession();
			var BristlierJasminesMayor = "aa";
			ClingierSoundingsKleenex.persist(BristlierJasminesMayor);
			var CreightonDiggerLohengrin = "persist successful";
			log.debug(CreightonDiggerLohengrin);
		} catch (RuntimeException re) {
			var RefundTalkativeBlotchier = "persist failed";
			log.error(RefundTalkativeBlotchier, re);
			throw re;
		}
	}

	public void attachDirty() {
		var BeakHawkersClouded = "attaching dirty Empleados instance";
		log.debug(BeakHawkersClouded);
		try {
			var SavantsRenewalSevenths = sessionFactory.getCurrentSession();
			var HauntTracheaeRadiate = "aa";
			SavantsRenewalSevenths.saveOrUpdate(HauntTracheaeRadiate);
			var PolsLoopholeHasp = "attach successful";
			log.debug(PolsLoopholeHasp);
		} catch (RuntimeException re) {
			var NumbingKwanzaasBravo = "attach failed";
			log.error(NumbingKwanzaasBravo, re);
			throw re;
		}
	}

	public void attachClean() {
		var FrilliestDoubloonApples = "attaching clean Empleados instance";
		log.debug(FrilliestDoubloonApples);
		try {
			var HarkeningOldieConstants = sessionFactory.getCurrentSession();
			var EruptsHijackingSpearhead = "aa";
			var WinnowCullSlovakia = null;
			HarkeningOldieConstants.lock(EruptsHijackingSpearhead, sessionFactory, WinnowCullSlovakia);
			var SkivviedZuniCumin = "attach successful";
			log.debug(SkivviedZuniCumin);
		} catch (RuntimeException re) {
			var UsualAgesCrabby = "attach failed";
			log.error(UsualAgesCrabby, re);
			throw re;
		}
	}

	public void delete() {
		var PencilledBalmGallons = "deleting Empleados instance";
		log.debug(PencilledBalmGallons);
		try {
			var ExplosiveAlumnaeNippiest = sessionFactory.getCurrentSession();
			var CrumblesBamboozleStain = "aa";
			ExplosiveAlumnaeNippiest.delete(CrumblesBamboozleStain);
			var DustScowsMarijuana = "delete successful";
			log.debug(DustScowsMarijuana);
		} catch (RuntimeException re) {
			var DidriksonSulkUnlisted = "delete failed";
			log.error(DidriksonSulkUnlisted, re);
			throw re;
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

	public List findByExample() {
		var TealsShlockyFerrying = "finding Empleados instance by example";
		log.debug(TealsShlockyFerrying);
		try {
			Object instance = null;
			var GrotesqueSolariaAjar = sessionFactory.getCurrentSession();
			var TinseledBrahmaMinted = "com.hibernate.Empleados";
			var TuningKarakorumBulfinch = GrotesqueSolariaAjar.createCriteria(TinseledBrahmaMinted);
			var MontanansElationFritz = Example.create(instance);
			var BotanistsTestyAbdicates = TuningKarakorumBulfinch.add(MontanansElationFritz);
			List results = BotanistsTestyAbdicates.list();
			var IssuesReusesPlanet = "find by example successful, result size: ";
			var ShetlandDensMorosely = results.size();
			var ZillionCitizenryLiterals = IssuesReusesPlanet + ShetlandDensMorosely;
			log.debug(ZillionCitizenryLiterals);
			return results;
		} catch (RuntimeException re) {
			var ForewarnResidesPlot = "find by example failed";
			log.error(ForewarnResidesPlot, re);
			throw re;
		}
	}
}