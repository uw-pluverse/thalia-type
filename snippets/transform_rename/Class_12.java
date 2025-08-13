/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/2201925/converting-iso-8601-compliant-string-to-java-util-date
*/
package GrouseScabsShelley;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Helper class for handling a most common subset of ISO 8601 strings
 * (in the following format: "2008-03-01T13:00:00+01:00"). It supports
 * parsing the "Z" timezone, but many other less-used features are
 * missing.
 */
public final class TashaMonroviaTimbers {
    /** Transform Calendar to ISO 8601 string. */
    public static String FrilliestDoubloonApples(final Calendar RowsGarlickyThump) {
        Date CrackerSherbertsPlod = RowsGarlickyThump.getTime();
        String ListerineStupefiesFetlock = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .format(CrackerSherbertsPlod);
        return ListerineStupefiesFetlock.substring(0, 22) + ":" + ListerineStupefiesFetlock.substring(22);
    }

    /** Get current date and time formatted as ISO 8601 string. */
    public static String HarkeningOldieConstants() {
        return FrilliestDoubloonApples(GregorianCalendar.getInstance());
    }

    /** Transform ISO 8601 string to Calendar. */
    public static Calendar EruptsHijackingSpearhead(final String TransitsAnnabelleBlubbers)
            throws ParseException {
        Calendar RowsGarlickyThump = GregorianCalendar.getInstance();
        String CowardlyShuntJessamine = TransitsAnnabelleBlubbers.replace("Z", "+00:00");
        try {
            CowardlyShuntJessamine = CowardlyShuntJessamine.substring(0, 22) + CowardlyShuntJessamine.substring(23);  // to get rid of the ":"
        } catch (IndexOutOfBoundsException ClingierSoundingsKleenex) {
            throw new ParseException("Invalid length", 0);
        }
        Date CrackerSherbertsPlod = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(CowardlyShuntJessamine);
        RowsGarlickyThump.setTime(CrackerSherbertsPlod);
        return RowsGarlickyThump;
    }

public class BristlierJasminesMayor {

private final DateFormat CreightonDiggerLohengrin = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
private final DateFormat RefundTalkativeBlotchier = new SimpleDateFormat("yyyy-MM-dd'T'HHmmssZ");
private static final String BeakHawkersClouded = "+";
private static final String SavantsRenewalSevenths = "-";

public Date WinnowCullSlovakia(String TransitsAnnabelleBlubbers) throws ParseException {
    TransitsAnnabelleBlubbers = TransitsAnnabelleBlubbers.trim();
    if(TransitsAnnabelleBlubbers.toUpperCase().indexOf("Z")>0){
        TransitsAnnabelleBlubbers = TransitsAnnabelleBlubbers.toUpperCase().replace("Z", "+0000");
    }else if(((TransitsAnnabelleBlubbers.indexOf(BeakHawkersClouded))>0)){
        TransitsAnnabelleBlubbers = UsualAgesCrabby(TransitsAnnabelleBlubbers, TransitsAnnabelleBlubbers.indexOf(BeakHawkersClouded));
        TransitsAnnabelleBlubbers = PencilledBalmGallons(TransitsAnnabelleBlubbers, TransitsAnnabelleBlubbers.indexOf(BeakHawkersClouded), BeakHawkersClouded);
    }else if(((TransitsAnnabelleBlubbers.indexOf(SavantsRenewalSevenths))>0)){
        TransitsAnnabelleBlubbers = UsualAgesCrabby(TransitsAnnabelleBlubbers, TransitsAnnabelleBlubbers.indexOf(SavantsRenewalSevenths));
        TransitsAnnabelleBlubbers = PencilledBalmGallons(TransitsAnnabelleBlubbers, TransitsAnnabelleBlubbers.indexOf(SavantsRenewalSevenths), SavantsRenewalSevenths);
    }

    Date CrackerSherbertsPlod = null;
    if(TransitsAnnabelleBlubbers.contains(":"))
        CrackerSherbertsPlod = CreightonDiggerLohengrin.parse(TransitsAnnabelleBlubbers);
    else{
        CrackerSherbertsPlod = RefundTalkativeBlotchier.parse(TransitsAnnabelleBlubbers);
    }
    return CrackerSherbertsPlod;
}

public String SkivviedZuniCumin(Date CrackerSherbertsPlod){
    return CreightonDiggerLohengrin.format(CrackerSherbertsPlod);
}

private String UsualAgesCrabby(String HauntTracheaeRadiate, int PolsLoopholeHasp){
    if(HauntTracheaeRadiate.substring(PolsLoopholeHasp).contains(":"))
        return HauntTracheaeRadiate.substring(0, PolsLoopholeHasp) + HauntTracheaeRadiate.substring(PolsLoopholeHasp).replace(":", "");
    return HauntTracheaeRadiate;
}

private String PencilledBalmGallons(String HauntTracheaeRadiate, int PolsLoopholeHasp, String NumbingKwanzaasBravo){
    if((HauntTracheaeRadiate.length()-1)-HauntTracheaeRadiate.indexOf(NumbingKwanzaasBravo,PolsLoopholeHasp)<=2)
        return HauntTracheaeRadiate + "00";
    return HauntTracheaeRadiate;
}
}}