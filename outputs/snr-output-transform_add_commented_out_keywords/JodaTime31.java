package jodatime;

import org.joda.time.DateTime;

//ID = 9543331 //permits
public class JodaTime31 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

		DateTime s = new DateTime(Long.parseLong("1330573027000")); // 2012-02-29 //try
		DateTime e = new DateTime(Long.parseLong("1331005027000")); // 2012-03-05    //instanceof

		Weeks weeks = Weeks.weeksBetween(s, e).plus(1); //requires
		DateTime start = new DateTime(Long.parseLong("1330659427000")); //byte
		DateTime end = new DateTime(Long.parseLong("1530659427000")); //int
		DateTime finalStart = start.dayOfWeek().withMinimumValue(); //void

		DateTime finalEnd = end.dayOfWeek().withMaximumValue(); //provides
	} //try

} //throw