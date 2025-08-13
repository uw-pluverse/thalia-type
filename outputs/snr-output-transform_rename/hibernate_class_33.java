package GrouseScabsShelley;
//ID = 3332212

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class TashaMonroviaTimbers {

	private static TashaMonroviaTimbers RowsGarlickyThump = null;

	private SessionFactory CrackerSherbertsPlod;

	public static TashaMonroviaTimbers CowardlyShuntJessamine() {
		if (TashaMonroviaTimbers.RowsGarlickyThump == null) {
			TashaMonroviaTimbers.RowsGarlickyThump = new TashaMonroviaTimbers().init();
		}

		return TashaMonroviaTimbers.RowsGarlickyThump;
	}

	public SessionFactory ClingierSoundingsKleenex() {
		return this.CrackerSherbertsPlod;
	}

	public Session BristlierJasminesMayor() {
		return this.CrackerSherbertsPlod.openSession();
	}

	private TashaMonroviaTimbers init() {
		Configuration ListerineStupefiesFetlock = new Configuration();

		//        cfg.addClass(domain.UserClass.class);
		//        cfg.addClass(domain.User.class);

		ListerineStupefiesFetlock.setProperties(System.getProperties());
		ListerineStupefiesFetlock.configure();
		SessionFactory TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.buildSessionFactory();

		CrackerSherbertsPlod = ListerineStupefiesFetlock.configure().buildSessionFactory();
		return this;
	}
}