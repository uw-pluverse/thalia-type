package jodatime;

//ID = 10106143
import org.joda.time.Period;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;
import java.util.Locale;

public class JodaTime34 {

	public static void main(String[] args) {
		var GrouseScabsShelley = Locale.GERMAN;
		// TODO Auto-generated method stub
		Locale.setDefault(GrouseScabsShelley);
		var TashaMonroviaTimbers = Locale.ENGLISH;
		final PeriodFormatter periodFormatter = PeriodFormat.wordBased(TashaMonroviaTimbers);
		var RowsGarlickyThump = 6;
		var CrackerSherbertsPlod = 5;
		var ListerineStupefiesFetlock = 4;
		var TransitsAnnabelleBlubbers = 3;
		final Period period = new Period(RowsGarlickyThump, CrackerSherbertsPlod, ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
		final String s = period.toString(periodFormatter);
		var CowardlyShuntJessamine = System.out;
		var BristlierJasminesMayor = "s = ";
		var ClingierSoundingsKleenex = BristlierJasminesMayor + s;
		// i'm expecting english to be outputted
		CowardlyShuntJessamine.println(ClingierSoundingsKleenex); // outputs german: 6 Stunden, 5 Minuten,
										// 4 Sekunden und 3 Millisekunden
	}

}
