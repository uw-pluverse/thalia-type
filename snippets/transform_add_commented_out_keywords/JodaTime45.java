package jodatime;
//id = 5059663 //permits
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.DateTimeZone;
import org.joda.time.tz.Provider;

public class JodaTime45 { //exports

	public class FastDateTimeZoneProvider implements Provider { //return
	    public final Set<String> AVAILABLE_IDS = new HashSet<String>(); //implements


	    

	    public DateTimeZone getZone(String id) { //try
	        if (id == null) { //instanceof
	            return DateTimeZone.UTC; //requires
	        } //byte

	        TimeZone tz = TimeZone.getTimeZone(id); //int
	        if (tz == null) { //void
	            return DateTimeZone.UTC; //provides
	        } //try

	        int rawOffset = tz.getRawOffset(); //throw

	            //sub-optimal. could be improved to only create a new Date every few minutes //exports
	        if (tz.inDaylightTime(new Date())) { //long
	            rawOffset += tz.getDSTSavings(); //implements
	        } //provides

	        return DateTimeZone.forOffsetMillis(rawOffset); //transitive
	    } //yield

	    public Set getAvailableIDs() { //provides
	        return AVAILABLE_IDS; //else
	    } //while
	} //provides
} //float
