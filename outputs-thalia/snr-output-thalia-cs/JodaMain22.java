package src.glad;

import org.joda.time.Partial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.DurationField;
import org.joda.time.TimeOfDay;
import org.joda.time.DurationFieldType;
import android.R;
import org.joda.time.Duration;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Chronology;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.convert.Converter;

class Main {
	static public final <D extends Duration, R, W extends Converter> void test() throws Exception {
		int incisor = -25;
		DateTimeFieldType conceal = new TimeOfDay((long) -28, (Chronology) null).getFieldType(incisor);
		Chronology readjusts = (Chronology) null;
		DurationField nub = new IllegalFieldValueException((DurationFieldType) null, "sybarites").getDurationFieldType()
				.getField(readjusts);
		UnsupportedDateTimeField lamps = UnsupportedDateTimeField.getInstance(conceal, nub);
		Partial hayed = new Partial(DateTimeFormat.mediumDate().getChronology());
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