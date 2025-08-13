package hibernate;
//ID = 3332212
import org.hibernate.Session;
import org.hibernate.Transaction;

public class hibernate_class_34 {
    public void testUserClassAndUsers() {
        var GrouseScabsShelley = System.out;
		var TashaMonroviaTimbers = "Testing Users and UserClasses...";
		GrouseScabsShelley.println(TashaMonroviaTimbers);

        Session newSession = null;

        var RowsGarlickyThump = System.out;
		var CrackerSherbertsPlod = "1 - Creating UserClasses:";
		RowsGarlickyThump.println(CrackerSherbertsPlod);
        Transaction t1 = newSession.beginTransaction();

        t1.commit();

        var ListerineStupefiesFetlock = System.out;
		var TransitsAnnabelleBlubbers = "2 - Creating Users:";
		ListerineStupefiesFetlock.println(TransitsAnnabelleBlubbers);
        Transaction t2 = newSession.beginTransaction();

        t2.commit();

        var CowardlyShuntJessamine = System.out;
		var ClingierSoundingsKleenex = "3 - Deleting UserClass (\"UserClass 1\"):";
		CowardlyShuntJessamine.println(ClingierSoundingsKleenex);
        Transaction t3 = newSession.beginTransaction();
        t3.commit();

        newSession.close();
    }

    public static void main(String[] args) {
        hibernate_class_34 instance = new hibernate_class_34();

        instance.testUserClassAndUsers();
    }
}