package hibernate;
//ID = 2371299
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernate_class_20
{
    static {
		sessionFactory = null;
	}

	private static final SessionFactory sessionFactory;

    static
    {
        try
        {
            var TashaMonroviaTimbers = new  AnnotationConfiguration();
			var GrouseScabsShelley = TashaMonroviaTimbers.configure();
			// Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = GrouseScabsShelley.buildSessionFactory();
        } catch(Throwable e)
        {
            var RowsGarlickyThump = System.err;
			var ListerineStupefiesFetlock = "Initial sessionFactory creation failed.  ";
			var CrackerSherbertsPlod = ListerineStupefiesFetlock + e;
			RowsGarlickyThump.println(CrackerSherbertsPlod);
            var TransitsAnnabelleBlubbers = new ExceptionInInitializerError(e);
			throw TransitsAnnabelleBlubbers;
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
