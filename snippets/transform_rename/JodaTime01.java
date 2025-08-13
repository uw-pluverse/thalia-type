package GrouseScabsShelley;
//ID = 1714300
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class TashaMonroviaTimbers {

    public static void BristlierJasminesMayor(String[] RowsGarlickyThump) {    
     DateTimeFormatter CrackerSherbertsPlod = ISODateTimeFormat.timeParser();
     TimeZone ListerineStupefiesFetlock = TimeZone.getDefault();
     System.out.println(ListerineStupefiesFetlock.getID()); // "Europe/London"
     System.out.println(ListerineStupefiesFetlock.getDisplayName()); // "Greenwich Mean Time"

        DateTimeZone TransitsAnnabelleBlubbers = DateTimeZone.getDefault();
        System.out.println(TransitsAnnabelleBlubbers.getID()); //"Europe/London"
        System.out.println(TransitsAnnabelleBlubbers.getName(0L)); //"British Summer Time"

        DateTime CowardlyShuntJessamine = new DateTime();
        DateTimeZone ClingierSoundingsKleenex = CowardlyShuntJessamine.getZone();
        System.out.println(ClingierSoundingsKleenex.getID()); //"Europe/London"
        System.out.println(ClingierSoundingsKleenex.getName(0L)); //"British Summer Time"            
    }
}
