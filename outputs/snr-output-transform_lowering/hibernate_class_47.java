package hibernate;
//ID = 4323066

import net.sf.gilead.core.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernate_class_47 {

	public static boolean registerEvent() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Transaction t = null;
		try {
			Session s = sf.openSession();
			t = s.beginTransaction(); // start a new transaction
			var GrouseScabsShelley = "aa";
			s.persist(GrouseScabsShelley);
			t.commit(); // commit transaction 
			var TashaMonroviaTimbers = true;
			return TashaMonroviaTimbers;
		} catch (Exception ex) {
			var RowsGarlickyThump = System.err;
			var ListerineStupefiesFetlock = "Error -->";
			var TransitsAnnabelleBlubbers = ex.getMessage();
			var CrackerSherbertsPlod = ListerineStupefiesFetlock + TransitsAnnabelleBlubbers;
			RowsGarlickyThump.println(CrackerSherbertsPlod);
			var ClingierSoundingsKleenex = null;
			var CowardlyShuntJessamine = t != ClingierSoundingsKleenex;
			if (CowardlyShuntJessamine)
				t.rollback(); // rollback transaction on exception 
			var BristlierJasminesMayor = false;
			return BristlierJasminesMayor;
		}
	}
}