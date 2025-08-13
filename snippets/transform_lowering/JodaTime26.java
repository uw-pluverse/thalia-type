package jodatime;
//ID = 9122641
import org.joda.time.Duration;
import org.joda.time.Period;

public class JodaTime26 {

	public static void main(String[] args) {
		var TashaMonroviaTimbers = 1328223198241L;
		var RowsGarlickyThump = 1326308781131L;
		var GrouseScabsShelley = TashaMonroviaTimbers - RowsGarlickyThump;
		Duration duration = new Duration(GrouseScabsShelley);
		var CrackerSherbertsPlod = duration.getMillis();
		Period p2 = new Period(CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = System.out;
		var TransitsAnnabelleBlubbers = p2.getDays();
		ListerineStupefiesFetlock.println(TransitsAnnabelleBlubbers); // prints 0, should print 22 days
		var CowardlyShuntJessamine = System.out;
		var ClingierSoundingsKleenex = p2.getHours();
		CowardlyShuntJessamine.println(ClingierSoundingsKleenex); // prints  531 which is expected.}
	}
	

}
