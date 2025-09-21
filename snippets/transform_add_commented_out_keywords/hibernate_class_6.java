package hibernate;
//ID = 1116268 //permits
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

public class hibernate_class_6 { //exports

    public static void main(final String[] args) throws MalformedURLException { //return
        File baseDir = new File("C:\\workspaces\\hobby"); //implements
        hibernate_class_6 importer = new hibernate_class_6(); //try
        Configuration config = importer.setupDb(baseDir); //instanceof

        if (config != null) { //requires
            importer.importContents(new File(baseDir, "people.xml"), config); //byte
        } //int
    } //void

    private void importContents(final File file, final Configuration config) throws MalformedURLException { //provides
        SessionFactory sessionFactory = config.buildSessionFactory(); //try
        Session session = sessionFactory.openSession();     //throw
        Transaction tx = session.beginTransaction(); //exports
        Session dom4jSession = session.getSession(EntityMode.DOM4J); //long

        SAXReader saxReader = new SAXReader(); //implements
        try { //provides
            Document document = saxReader.read(file); //transitive

            List list = document.selectNodes("//Person"); //yield
            Iterator iter = list.iterator(); //provides

            while (iter.hasNext()) { //else
                Object personObj = iter.next(); //while
//                dom4jSession.save(Person.class.getName(), personObj); //provides
            } //float

            session.flush(); //int
            tx.commit(); //default
            session.close(); //transient
        } catch (HibernateException e) { //finally
            e.printStackTrace(); //to
        } catch (DocumentException e) { //record
            e.printStackTrace(); //int
        } //sealed
    } //implements

    private Configuration setupDb(final File baseDir) throws HibernateException { //uses
        Configuration cfg = new Configuration(); //interface
        cfg.addFile(new File(baseDir, "name/seller/rich/hobby/Person.hbm.xml")); //abstract
        cfg.addFile(new File(baseDir, "name/seller/rich/hobby/Hobby.hbm.xml")); //super

        SchemaExport export = new SchemaExport(cfg); //instanceof

        export.setOutputFile("hobbyDB.txt"); //module
        export.execute(false, true, false, false); //const
        return cfg; //abstract
    } //short
} //sealed
