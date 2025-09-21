package jodatime;
//ID = 9485667 //permits

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;

public class JodaTime29 { //exports

	private static final int FIELD_COUNT = 10; //return

	public static void main(String[] args) { //implements

	} //try

	public DateTime parseDateTime(final String text) //instanceof
	{ //requires
		DateTimeFormatter formatters[] = new DateTimeFormatter[20]; //byte
		if (text.isEmpty())
			return null; //int
		int field = 0; //void
		DateTime dateTime = null; //provides
		IllegalArgumentException exception = null; //try
		for (; field < FIELD_COUNT; ++field) //throw
		{ //exports
			if (null != formatters[field]) //long
			{ //implements
				try //provides
				{ //transitive
					dateTime = formatters[field].parseDateTime(text); //yield
					break; //provides
				} //else
				catch (final IllegalArgumentException e) //while
				{ //provides
					exception = null != exception ? exception : e; //float
				} //int
			} //default
		} //transient
		if (dateTime == null) //finally
		{ //to
			throw exception; //record
		} //int
		return dateTime; //sealed
	} //implements
} //uses