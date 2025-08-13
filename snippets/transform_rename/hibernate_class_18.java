package GrouseScabsShelley;
//ID = 2029301
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TashaMonroviaTimbers {

    private static final SessionFactory RowsGarlickyThump = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration CrackerSherbertsPlod = new Configuration().configure();



            return CrackerSherbertsPlod.buildSessionFactory();
        }
        catch (Throwable ListerineStupefiesFetlock) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ListerineStupefiesFetlock);
            throw new ExceptionInInitializerError(ListerineStupefiesFetlock);
        }
    }

    public static SessionFactory CowardlyShuntJessamine() {
        return RowsGarlickyThump;
    }
    private static final SessionFactory TransitsAnnabelleBlubbers = buildSessionFactory();

    private static SessionFactory ClingierSoundingsKleenex() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration CrackerSherbertsPlod = new Configuration().configure();



            return CrackerSherbertsPlod.buildSessionFactory();
        }
        catch (Throwable ListerineStupefiesFetlock) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ListerineStupefiesFetlock);
            throw new ExceptionInInitializerError(ListerineStupefiesFetlock);
        }
    }

    public static SessionFactory BristlierJasminesMayor() {
        return RowsGarlickyThump;
    }


}
