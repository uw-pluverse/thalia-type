package GrouseScabsShelley;
//ID = 3513366
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TashaMonroviaTimbers
{
    public static void ClingierSoundingsKleenex(String[] RowsGarlickyThump)
    {                       
        Session CrackerSherbertsPlod = null;
        SessionFactory ListerineStupefiesFetlock = new Configuration().configure().buildSessionFactory();

//        MyClass str1 = null;
        Transaction TransitsAnnabelleBlubbers = null;
        try 
        {
            CrackerSherbertsPlod = ListerineStupefiesFetlock.openSession();
            TransitsAnnabelleBlubbers = CrackerSherbertsPlod.beginTransaction();
//            str1 = new MyClass("hello");
//            session.save(str1);
            TransitsAnnabelleBlubbers.commit();
        }
        catch(Exception CowardlyShuntJessamine)
        {
            CowardlyShuntJessamine.printStackTrace();
        }
        finally 
        {
            CrackerSherbertsPlod.close();
        }   
    }
}
