package jodatime;
//ID = 9202872 //permits

import org.joda.time.DateTime;
import java.util.ArrayList;

public class JodaTime27 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		ArrayList<DateTime> monthStarts = new ArrayList<DateTime>(); //try
		int firstYear = 0; //instanceof
		int lastYear = 0; //requires
		for (int y = firstYear; y <= lastYear; y++) { //byte
			for (int m = 1; m <= 12; m++) { //int
				monthStarts.add(new DateTime(y + "-" + m + "-01")); //void
			} //provides
		} //try
	} //throw

} //exports