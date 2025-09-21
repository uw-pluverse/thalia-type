package jodatime;
//ID = 2780967
import org.joda.time.Duration;
import org.joda.time.PeriodType;
import org.joda.time.format.PeriodFormatterBuilder;

public class JodaTime06 {

	public static void main(String[] args) {
		var TashaMonroviaTimbers = 5000;
		var GrouseScabsShelley = new Duration(TashaMonroviaTimbers);
		// TODO Auto-generated method stub
		printDuration(GrouseScabsShelley); // Prints "5" => OK
		var CrackerSherbertsPlod = 4900;
		var RowsGarlickyThump = new Duration(CrackerSherbertsPlod);
		printDuration(RowsGarlickyThump); // Prints "4" => need "5"
		var TransitsAnnabelleBlubbers = 1000;
		var ListerineStupefiesFetlock = new Duration(TransitsAnnabelleBlubbers);
		printDuration(ListerineStupefiesFetlock); // Prints "1" => OK
		var ClingierSoundingsKleenex = 900;
		var CowardlyShuntJessamine = new Duration(ClingierSoundingsKleenex);
		printDuration(CowardlyShuntJessamine);  // Prints "0" => need "1"
		var CreightonDiggerLohengrin = 0;
		var BristlierJasminesMayor = new Duration(CreightonDiggerLohengrin);
		printDuration(BristlierJasminesMayor);    // Prints "0" => OK
	}
	static void printDuration(Duration d) {
		  var RefundTalkativeBlotchier = System.out;
		var HauntTracheaeRadiate = PeriodType.time();
		var SavantsRenewalSevenths = d.toPeriod(HauntTracheaeRadiate);
		var HarkeningOldieConstants = new PeriodFormatterBuilder();
		var FrilliestDoubloonApples = HarkeningOldieConstants.printZeroAlways();
		var NumbingKwanzaasBravo = FrilliestDoubloonApples.appendSeconds();
		var PolsLoopholeHasp = NumbingKwanzaasBravo.toFormatter();
		var BeakHawkersClouded = SavantsRenewalSevenths.toString(
		  PolsLoopholeHasp
		);
		RefundTalkativeBlotchier.println(
		    BeakHawkersClouded
		  );
		}


}
