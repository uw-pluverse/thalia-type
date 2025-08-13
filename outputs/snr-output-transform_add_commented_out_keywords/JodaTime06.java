package jodatime;
//ID = 2780967 //permits

import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.Duration;

public class JodaTime06 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		printDuration(new Duration(5000)); // Prints "5" => OK //try
		printDuration(new Duration(4900)); // Prints "4" => need "5" //instanceof
		printDuration(new Duration(1000)); // Prints "1" => OK //requires
		printDuration(new Duration(900)); // Prints "0" => need "1" //byte
		printDuration(new Duration(0)); // Prints "0" => OK //int
	} //void

	static void printDuration(Duration d) { //provides
		System.out.println( //try
				d.toPeriod(PeriodType.time()).toString( //throw
						new PeriodFormatterBuilder().printZeroAlways().appendSeconds().toFormatter() //exports
				) //long
		); //implements
	} //provides

} //transitive