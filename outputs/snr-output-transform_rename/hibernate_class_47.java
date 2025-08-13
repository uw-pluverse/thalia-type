package GrouseScabsShelley;
//ID = 4323066

import net.sf.gilead.core.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TashaMonroviaTimbers {

	public static boolean CowardlyShuntJessamine() {

		SessionFactory RowsGarlickyThump = HibernateUtil.getSessionFactory();
		Transaction CrackerSherbertsPlod = null;
		try {
			Session ListerineStupefiesFetlock = RowsGarlickyThump.openSession();
			CrackerSherbertsPlod = ListerineStupefiesFetlock.beginTransaction(); // start a new transaction
			ListerineStupefiesFetlock.persist("aa");
			CrackerSherbertsPlod.commit(); // commit transaction 
			return true;
		} catch (Exception TransitsAnnabelleBlubbers) {
			System.err.println("Error -->" + TransitsAnnabelleBlubbers.getMessage());
			if (CrackerSherbertsPlod != null)
				CrackerSherbertsPlod.rollback(); // rollback transaction on exception 
			return false;
		}
	}
}