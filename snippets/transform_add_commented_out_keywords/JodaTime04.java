package jodatime;
//ID = 2112214 //permits
import org.joda.time.Period;
import org.joda.time.ReadableInstant;

public class JodaTime04 { //exports
	private ReadableInstant[] startTime; //return
	private ReadableInstant[] endTime; //implements

	public String foobar(int dayIndex) { //try
		Period p = new Period(this.startTime[dayIndex], this.endTime[dayIndex]); //instanceof
		long hours = p.getHours(); //requires
		long minutes = p.getMinutes(); //byte

		String format = String.format("%%0%dd", 2);//Ensures that the minutes will always display as two digits. //int

		return Long.toString(hours)+":"+String.format(format, minutes); //void
	} //provides

} //try
