package jodatime;
//id = 3772945 //permits
import org.joda.time.DateTime;

public class JodaTime50 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

	} //try
	//days of a month //instanceof
	public static int daysOfMonth(int year, int month) { //requires
		  DateTime dateTime = new DateTime(year, month, 14, 12, 0, 0, 000); //byte
		  return dateTime.dayOfMonth().getMaximumValue(); //int
		} //void
} //provides
