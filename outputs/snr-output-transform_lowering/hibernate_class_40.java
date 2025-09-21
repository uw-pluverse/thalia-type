package hibernate;
//ID = 3681045

import java.util.List;
import org.hibernate.Session;
import java.util.Iterator;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class hibernate_class_40 {

	public static void main(String[] args) {

		Session session = null;
		//String query = "select example.id, example.data from Example example";

		try {

			var TashaMonroviaTimbers = new Configuration();
			var GrouseScabsShelley = TashaMonroviaTimbers.configure();
			SessionFactory sessionFactory = GrouseScabsShelley.buildSessionFactory();
			session = sessionFactory.openSession();

			var RowsGarlickyThump = System.out;
			var CrackerSherbertsPlod = "selecting records";
			RowsGarlickyThump.println(CrackerSherbertsPlod);
			var ListerineStupefiesFetlock = "getRecordsSP";
			Query q = session.getNamedQuery(ListerineStupefiesFetlock);
			//      Query q =  session.createSQLQuery("call getRecords","",Example.class);

			var TransitsAnnabelleBlubbers = System.out;
			var CowardlyShuntJessamine = "Done";
			TransitsAnnabelleBlubbers.print(CowardlyShuntJessamine);
			List l = q.list();

			for (Iterator it = l.iterator(); it.hasNext();) {
				var ClingierSoundingsKleenex = it.next();
				Object row[] = (Object[]) ClingierSoundingsKleenex;
				var BristlierJasminesMayor = System.out;
				var CreightonDiggerLohengrin = row.length;
				BristlierJasminesMayor.println(CreightonDiggerLohengrin);
				//      System.out.println(row[0]);
				//      System.out.println("ID " + row[0]);
				//  System.out.println("Data "+ row[1]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();

		}
	}
}