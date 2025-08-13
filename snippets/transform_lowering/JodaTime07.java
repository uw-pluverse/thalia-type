package jodatime;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;

//ID = 3329469
public class JodaTime07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				var GrouseScabsShelley = "mm/dd/yyyy";
				DateFormat formatter = new SimpleDateFormat(GrouseScabsShelley);

				Date someDate=new Date();
				var TashaMonroviaTimbers = Calendar.getInstance();
				Date today = TashaMonroviaTimbers.getTime();

				try     {
				    var RowsGarlickyThump = "06/22/2010";
					someDate = formatter.parse(RowsGarlickyThump);
				}
				catch(ParseException pe)    {
				    var CrackerSherbertsPlod = System.out;
					var ListerineStupefiesFetlock = "Parser Exception";
					CrackerSherbertsPlod.println(ListerineStupefiesFetlock);
				}

				var CowardlyShuntJessamine = new DateTime(someDate);
				var ClingierSoundingsKleenex = new DateTime(today);
				var TransitsAnnabelleBlubbers = Days.daysBetween(CowardlyShuntJessamine, ClingierSoundingsKleenex);
				int days = TransitsAnnabelleBlubbers.getDays();

				var BristlierJasminesMayor = System.out;
				var RefundTalkativeBlotchier = " Days Between ";
				var BeakHawkersClouded = " : ";
				var SavantsRenewalSevenths = " - ";
				var CreightonDiggerLohengrin = RefundTalkativeBlotchier + someDate + BeakHawkersClouded + today + SavantsRenewalSevenths + days;
				BristlierJasminesMayor.println(CreightonDiggerLohengrin);

	}

}
