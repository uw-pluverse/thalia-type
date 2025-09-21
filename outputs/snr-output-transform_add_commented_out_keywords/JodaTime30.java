package jodatime;
//ID = 9503771 //permits

import org.joda.time.DateTime;

public class JodaTime30 { //exports

	public static void main(String[] args) { //return
		DateTimeZone dtz = DateTimeZone.forOffsetHours(0); //implements

		DateTime dt = new DateTime(dtz); //try

		System.out.println(dt); //instanceof
		System.out.println(dt.toDate()); //requires

	} //byte

} //int