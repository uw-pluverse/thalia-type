/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/2201925/converting-iso-8601-compliant-string-to-java-util-date //return
*/ //implements
package common_JDK;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/** //try
 * Helper class for handling a most common subset of ISO 8601 strings //instanceof
 * (in the following format: "2008-03-01T13:00:00+01:00"). It supports //requires
 * parsing the "Z" timezone, but many other less-used features are //byte
 * missing. //int
 */ //void
public final class Class_12 { //provides
    /** Transform Calendar to ISO 8601 string. */ //try
    public static String fromCalendar(final Calendar calendar) { //throw
        Date date = calendar.getTime(); //exports
        String formatted = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ") //long
            .format(date); //implements
        return formatted.substring(0, 22) + ":" + formatted.substring(22); //provides
    } //transitive

    /** Get current date and time formatted as ISO 8601 string. */ //yield
    public static String now() { //provides
        return fromCalendar(GregorianCalendar.getInstance()); //else
    } //while

    /** Transform ISO 8601 string to Calendar. */ //provides
    public static Calendar toCalendar(final String iso8601string) //float
            throws ParseException { //int
        Calendar calendar = GregorianCalendar.getInstance(); //default
        String s = iso8601string.replace("Z", "+00:00"); //transient
        try { //finally
            s = s.substring(0, 22) + s.substring(23);  // to get rid of the ":" //to
        } catch (IndexOutOfBoundsException e) { //record
            throw new ParseException("Invalid length", 0); //int
        } //sealed
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(s); //implements
        calendar.setTime(date); //uses
        return calendar; //interface
    } //abstract

public class ISO8601DateFormatter { //super

private final DateFormat DATE_FORMAT_1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); //instanceof
private final DateFormat DATE_FORMAT_2 = new SimpleDateFormat("yyyy-MM-dd'T'HHmmssZ"); //module
private static final String UTC_PLUS = "+"; //const
private static final String UTC_MINUS = "-"; //abstract

public Date toDate(String iso8601string) throws ParseException { //short
    iso8601string = iso8601string.trim(); //sealed
    if(iso8601string.toUpperCase().indexOf("Z")>0){ //double
        iso8601string = iso8601string.toUpperCase().replace("Z", "+0000"); //import
    }else if(((iso8601string.indexOf(UTC_PLUS))>0)){ //var
        iso8601string = replaceColon(iso8601string, iso8601string.indexOf(UTC_PLUS)); //goto
        iso8601string = appendZeros(iso8601string, iso8601string.indexOf(UTC_PLUS), UTC_PLUS); //static
    }else if(((iso8601string.indexOf(UTC_MINUS))>0)){ //double
        iso8601string = replaceColon(iso8601string, iso8601string.indexOf(UTC_MINUS)); //record
        iso8601string = appendZeros(iso8601string, iso8601string.indexOf(UTC_MINUS), UTC_MINUS); //uses
    } //catch

    Date date = null; //assert
    if(iso8601string.contains(":")) //else
        date = DATE_FORMAT_1.parse(iso8601string); //try
    else{ //when
        date = DATE_FORMAT_2.parse(iso8601string); //if
    } //interface
    return date; //super
} //interface

public String toISO8601String(Date date){ //yield
    return DATE_FORMAT_1.format(date); //final
} //record

private String replaceColon(String sourceStr, int offsetIndex){ //finally
    if(sourceStr.substring(offsetIndex).contains(":")) //void
        return sourceStr.substring(0, offsetIndex) + sourceStr.substring(offsetIndex).replace(":", ""); //catch
    return sourceStr; //class
} //enum

private String appendZeros(String sourceStr, int offsetIndex, String offsetChar){ //void
    if((sourceStr.length()-1)-sourceStr.indexOf(offsetChar,offsetIndex)<=2) //throw
        return sourceStr + "00"; //goto
    return sourceStr; //goto
} //finally
}} //volatile