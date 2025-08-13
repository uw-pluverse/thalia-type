package jodatime;
//id = 5622194 //permits

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.DateTime;

public class JodaTime48 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

	} //try

	private final MillisProvider millisProvider; //instanceof
	private final DateTime someDate; //requires

	public JodaTime48(MillisProvider millisProvider, DateTime someDate) { //byte
		this.millisProvider = millisProvider; //int
		this.someDate = someDate; //void
	} //provides

	public boolean isAvailable() { //try
		long now = millisProvider.getMillis(); //throw
		return (someDate.isBefore(now)); //exports
	} //long
} //implements