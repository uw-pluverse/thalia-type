package GrouseScabsShelley;
//ID = 3509824
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TashaMonroviaTimbers {    
	public static void CreightonDiggerLohengrin(String[] RowsGarlickyThump) {
	    BasicConfigurator.configure();
	    Session CrackerSherbertsPlod = HibernateUtil.getSessionFactory().openSession();
	    Transaction ListerineStupefiesFetlock = null;
	    try {
	        ListerineStupefiesFetlock = CrackerSherbertsPlod.beginTransaction();
//	        Label label = new Label("vijay");
	        Query TransitsAnnabelleBlubbers=CrackerSherbertsPlod.createQuery("from vij");
	        List CowardlyShuntJessamine=TransitsAnnabelleBlubbers.list();
	            for (Iterator ClingierSoundingsKleenex=CowardlyShuntJessamine.iterator();ClingierSoundingsKleenex.hasNext();)
	        {
//	            System.out.println(label.getId());          
	        }
	            ListerineStupefiesFetlock.commit();

	    } catch (HibernateException BristlierJasminesMayor) {

	        if (ListerineStupefiesFetlock != null) {
	              ListerineStupefiesFetlock.rollback();
	                        }
	                    BristlierJasminesMayor.printStackTrace();
	    } finally {
	        CrackerSherbertsPlod.close();
	    }

	}
}