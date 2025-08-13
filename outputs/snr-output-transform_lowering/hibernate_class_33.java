package hibernate;
//ID = 3332212

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class hibernate_class_33 {

	static {
		instance = null;
	}

	{
		sessionFactory = null;
	}

	private static hibernate_class_33 instance;

	private SessionFactory sessionFactory;

	public static hibernate_class_33 getInstance() {
		var TashaMonroviaTimbers = hibernate_class_33.instance;
		var RowsGarlickyThump = null;
		var GrouseScabsShelley = TashaMonroviaTimbers == RowsGarlickyThump;
		if (GrouseScabsShelley) {
			var CrackerSherbertsPlod = hibernate_class_33.instance;
			var ListerineStupefiesFetlock = new hibernate_class_33();
			CrackerSherbertsPlod = ListerineStupefiesFetlock.init();
		}

		var TransitsAnnabelleBlubbers = hibernate_class_33.instance;
		return TransitsAnnabelleBlubbers;
	}

	public SessionFactory getSessionFactory() {
		var CowardlyShuntJessamine = this.sessionFactory;
		return CowardlyShuntJessamine;
	}

	public Session getSession() {
		var BristlierJasminesMayor = this.sessionFactory;
		var ClingierSoundingsKleenex = BristlierJasminesMayor.openSession();
		return ClingierSoundingsKleenex;
	}

	private hibernate_class_33 init() {
		Configuration cfg = new Configuration();

		//        cfg.addClass(domain.UserClass.class);
		//        cfg.addClass(domain.User.class);

		var CreightonDiggerLohengrin = System.getProperties();
		cfg.setProperties(CreightonDiggerLohengrin);
		cfg.configure();
		SessionFactory sessions = cfg.buildSessionFactory();

		var RefundTalkativeBlotchier = cfg.configure();
		sessionFactory = RefundTalkativeBlotchier.buildSessionFactory();
		return this;
	}
}