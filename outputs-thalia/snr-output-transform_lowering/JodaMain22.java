package src.glad;

import org.joda.time.Partial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.DurationField;
import org.joda.time.TimeOfDay;
import org.joda.time.DurationFieldType;
import android.R;
import org.joda.time.Duration;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.convert.Converter;

class Main {
	static public final <D extends Duration, R, W extends Converter> void test() throws Exception {
		var GrouseScabsShelley = 25;
		int incisor = -GrouseScabsShelley;
		var RowsGarlickyThump = 28;
		var CrackerSherbertsPlod = null;
		var TashaMonroviaTimbers = new TimeOfDay((long) -RowsGarlickyThump, (Chronology) CrackerSherbertsPlod);
		DateTimeFieldType conceal = TashaMonroviaTimbers.getFieldType(incisor);
		var ListerineStupefiesFetlock = null;
		Chronology readjusts = (Chronology) ListerineStupefiesFetlock;
		var ClingierSoundingsKleenex = null;
		var BristlierJasminesMayor = "sybarites";
		var CowardlyShuntJessamine = new IllegalFieldValueException((DurationFieldType) ClingierSoundingsKleenex,
				BristlierJasminesMayor);
		var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.getDurationFieldType();
		DurationField nub = TransitsAnnabelleBlubbers.getField(readjusts);
		UnsupportedDateTimeField lamps = UnsupportedDateTimeField.getInstance(conceal, nub);
		var RefundTalkativeBlotchier = DateTimeFormat.mediumDate();
		var CreightonDiggerLohengrin = RefundTalkativeBlotchier.getChronology();
		Partial hayed = new Partial(CreightonDiggerLohengrin);
		int emceed = lamps.getMinimumValue(hayed);

	}
}

interface Function0<R> {
	public R apply();
}

interface Function1<A1, R> {
	public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
	public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
	public R apply(A1 a1, A2 a2, A3 a3);
}