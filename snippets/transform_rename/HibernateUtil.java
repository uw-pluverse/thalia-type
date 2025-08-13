package GrouseScabsShelley;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TashaMonroviaTimbers {
    private static final SessionFactory RowsGarlickyThump;

    static
    {
        try
        {
            // Create the SessionFactory from hibernate.cfg.xml
            RowsGarlickyThump = new  AnnotationConfiguration().configure().buildSessionFactory();
        } catch(Throwable CrackerSherbertsPlod)
        {
            System.err.println("Initial sessionFactory creation failed.  " + CrackerSherbertsPlod);
            throw new ExceptionInInitializerError(CrackerSherbertsPlod);
        }
    }

    public static SessionFactory ListerineStupefiesFetlock()
    {
        return RowsGarlickyThump;
    }
}
