package hibernate;
//ID = 1116268
import java.io.File;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.hibernate.EntityMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class hibernate_class_6 {

    public static void main(final String[] args) throws MalformedURLException {
        var GrouseScabsShelley = "C:\\workspaces\\hobby";
		File baseDir = new File(GrouseScabsShelley);
        hibernate_class_6 importer = new hibernate_class_6();
        Configuration config = importer.setupDb(baseDir);

        var RowsGarlickyThump = null;
		var TashaMonroviaTimbers = config != RowsGarlickyThump;
		if (TashaMonroviaTimbers) {
            var ListerineStupefiesFetlock = "people.xml";
			var CrackerSherbertsPlod = new File(baseDir, ListerineStupefiesFetlock);
			importer.importContents(CrackerSherbertsPlod, config);
        }
    }

    private void importContents(final File file, final Configuration config) throws MalformedURLException {
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();    
        Transaction tx = session.beginTransaction();
        var TransitsAnnabelleBlubbers = EntityMode.DOM4J;
		Session dom4jSession = session.getSession(TransitsAnnabelleBlubbers);

        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(file);

            var CowardlyShuntJessamine = "//Person";
			List list = document.selectNodes(CowardlyShuntJessamine);
            Iterator iter = list.iterator();

            while (iter.hasNext()) {
                Object personObj = iter.next();
//                dom4jSession.save(Person.class.getName(), personObj);
            }

            session.flush();
            tx.commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private Configuration setupDb(final File baseDir) throws HibernateException {
        Configuration cfg = new Configuration();
        var BristlierJasminesMayor = "name/seller/rich/hobby/Person.hbm.xml";
		var ClingierSoundingsKleenex = new File(baseDir, BristlierJasminesMayor);
		cfg.addFile(ClingierSoundingsKleenex);
        var RefundTalkativeBlotchier = "name/seller/rich/hobby/Hobby.hbm.xml";
		var CreightonDiggerLohengrin = new File(baseDir, RefundTalkativeBlotchier);
		cfg.addFile(CreightonDiggerLohengrin);

        SchemaExport export = new SchemaExport(cfg);

        var BeakHawkersClouded = "hobbyDB.txt";
		export.setOutputFile(BeakHawkersClouded);
        var SavantsRenewalSevenths = false;
		var HauntTracheaeRadiate = true;
		var PolsLoopholeHasp = false;
		var NumbingKwanzaasBravo = false;
		export.execute(SavantsRenewalSevenths, HauntTracheaeRadiate, PolsLoopholeHasp, NumbingKwanzaasBravo);
        return cfg;
    }
}
