package jodatime;
//3299972
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class JodaTime40 {

	public static void main(String[] args) {
		var GrouseScabsShelley = "deprecation";
		var TashaMonroviaTimbers = 110;
		var RowsGarlickyThump = 5;
		var CrackerSherbertsPlod = 20;
		// TODO Auto-generated method stub
		@SuppressWarnings(GrouseScabsShelley)
		Date past = new Date(TashaMonroviaTimbers, RowsGarlickyThump, CrackerSherbertsPlod); // June 20th, 2010
		var ListerineStupefiesFetlock = 110;
		var TransitsAnnabelleBlubbers = 6;
		var CowardlyShuntJessamine = 24;
		Date today = new Date(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers, CowardlyShuntJessamine); // July 24th 
		var BristlierJasminesMayor = new DateTime(past);
		var CreightonDiggerLohengrin = new DateTime(today);
		var ClingierSoundingsKleenex = Days.daysBetween(BristlierJasminesMayor, CreightonDiggerLohengrin);
		int days = ClingierSoundingsKleenex.getDays(); // => 34
	}

}
