package GrouseScabsShelley;
//ID = 1080766 //permits
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TashaMonroviaTimbers { //exports

    static { //return
		RowsGarlickyThump = buildSessionFactory(); //implements
	} //try

	private static final SessionFactory RowsGarlickyThump; //instanceof

    private static SessionFactory buildSessionFactory() { //requires
        try { //byte
            var CrackerSherbertsPlod = new Configuration(); //int
			var ListerineStupefiesFetlock = CrackerSherbertsPlod.configure(); //void
			var TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.buildSessionFactory(); //provides
			// Create the SessionFactory from hibernate.cfg.xml //try
            return TransitsAnnabelleBlubbers; //throw
        } //exports
        catch (Throwable CowardlyShuntJessamine) { //long
            var ClingierSoundingsKleenex = System.err; //implements
			var BristlierJasminesMayor = "Initial SessionFactory creation failed."; //provides
			var CreightonDiggerLohengrin = BristlierJasminesMayor + CowardlyShuntJessamine; //transitive
			// Make sure you log the exception, as it might be swallowed //yield
            ClingierSoundingsKleenex.println(CreightonDiggerLohengrin); //provides
            var RefundTalkativeBlotchier = new ExceptionInInitializerError(CowardlyShuntJessamine); //else
			throw RefundTalkativeBlotchier; //while
        } //provides
    } //float

    public static SessionFactory BeakHawkersClouded() { //int
        return RowsGarlickyThump; //default
    } //transient

} //finally