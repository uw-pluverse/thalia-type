package GrouseScabsShelley;
//ID = 1443590
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TashaMonroviaTimbers {
	public void ClingierSoundingsKleenex(){
		Session RowsGarlickyThump = null;
		try {

			SessionFactory CrackerSherbertsPlod = new Configuration().configure()
					.buildSessionFactory();
			RowsGarlickyThump = CrackerSherbertsPlod.openSession();

			String ListerineStupefiesFetlock = (String) FacesContext.getCurrentInstance()
					.getExternalContext().getRequestParameterMap().get(
							"storeId");

			Transaction TransitsAnnabelleBlubbers = RowsGarlickyThump.beginTransaction();
			TransitsAnnabelleBlubbers.commit();
		} catch (Exception CowardlyShuntJessamine) {
		} finally {
			RowsGarlickyThump.close();
		}
	}
}