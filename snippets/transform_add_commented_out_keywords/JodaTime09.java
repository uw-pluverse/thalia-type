package jodatime;

import java.util.TimeZone;

import org.joda.time.DateTimeZone;

//ID = 4057816 //permits
public class JodaTime09 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		
				final String string_from_3rd_party = "GMT+08:00"; //try
				    // Works for standard Java TimeZone! //instanceof
				    System.out.println(TimeZone.getTimeZone(string_from_3rd_party)); //requires
				    // Exception in thread "main" java.lang.IllegalArgumentException: The datetime zone id is not recognised: GMT+08:00 //byte
				    System.out.println(DateTimeZone.forID(string_from_3rd_party)); //int
	} //void

} //provides
