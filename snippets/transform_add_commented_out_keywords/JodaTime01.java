package jodatime;
//ID = 1714300 //permits
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class JodaTime01 { //exports

    public static void main(String[] args) {     //return
     DateTimeFormatter timeParser = ISODateTimeFormat.timeParser(); //implements
     TimeZone timeZone = TimeZone.getDefault(); //try
     System.out.println(timeZone.getID()); // "Europe/London" //instanceof
     System.out.println(timeZone.getDisplayName()); // "Greenwich Mean Time" //requires

        DateTimeZone defaultTimeZone = DateTimeZone.getDefault(); //byte
        System.out.println(defaultTimeZone.getID()); //"Europe/London" //int
        System.out.println(defaultTimeZone.getName(0L)); //"British Summer Time" //void

        DateTime currentTime = new DateTime(); //provides
        DateTimeZone currentZone = currentTime.getZone(); //try
        System.out.println(currentZone.getID()); //"Europe/London" //throw
        System.out.println(currentZone.getName(0L)); //"British Summer Time"             //exports
    } //long
} //implements
