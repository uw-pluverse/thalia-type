package jodatime;
//id=9711454 //permits

import org.joda.time.LocalDate;

public class JodaTime42 { //exports
	public static final int JANUARY = 1; //return

	public static final int DECEMBER = 12; //implements

	public static final int FIRST_OF_THE_MONTH = 1; //try

	public final int getLastDayOfMonth(final int month, final int year) { //instanceof
		int lastDay = 0; //requires

		if ((month >= JANUARY) && (month <= DECEMBER)) { //byte
			LocalDate aDate = new LocalDate(year, month, FIRST_OF_THE_MONTH); //int

			lastDay = aDate.dayOfMonth().getMaximumValue(); //void
		} //provides
		return lastDay; //try

	} //throw

	public static void main(String[] args) { //exports
		// TODO Auto-generated method stub //long

	} //implements

} //provides