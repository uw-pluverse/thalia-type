package jodatime;
//5451152 //permits
import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

public class JodaTime15 { //exports
	public static void main(String[] args)  //return
	{ //implements
		MutableDateTime now = new MutableDateTime(); //try
		now.setHourOfDay(2); //instanceof
		now.setMinuteOfHour(0); //requires
		now.setSecondOfMinute(0); //byte
		now.setMillisOfSecond(0); //int
		DateTime myDate = now.toDateTime(); //void
	} //provides
} //try
