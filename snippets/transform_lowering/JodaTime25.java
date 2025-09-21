package jodatime;

import org.joda.time.DateMidnight;
import org.joda.time.Days;
import org.joda.time.LocalDateTime;

//ID = 8654398
public class JodaTime25 
{
			public static int getDaysBetweenTwoDates(final LocalDateTime oldDate,
			        final LocalDateTime newDate) {
			    var GrouseScabsShelley = System.out;
				var RowsGarlickyThump = "--Calculate days between: ";
				var CrackerSherbertsPlod = oldDate.toString();
				var ListerineStupefiesFetlock = "->";
				var TashaMonroviaTimbers = RowsGarlickyThump + CrackerSherbertsPlod
			            + ListerineStupefiesFetlock + newDate;
				GrouseScabsShelley.println(TashaMonroviaTimbers);
			    var CowardlyShuntJessamine = oldDate.toDateTime();
				var TransitsAnnabelleBlubbers = new DateMidnight(CowardlyShuntJessamine);
				var BristlierJasminesMayor = newDate.toDateTime();
				var ClingierSoundingsKleenex = new DateMidnight(BristlierJasminesMayor);
				Days days = Days.daysBetween(TransitsAnnabelleBlubbers,
			            ClingierSoundingsKleenex);
			    var CreightonDiggerLohengrin = System.out;
				var BeakHawkersClouded = "----DIFF: ";
				var SavantsRenewalSevenths = days.size();
				var RefundTalkativeBlotchier = BeakHawkersClouded + SavantsRenewalSevenths;
				CreightonDiggerLohengrin.println(RefundTalkativeBlotchier);
			    var HauntTracheaeRadiate = days.size();
				return HauntTracheaeRadiate;
			}
}
