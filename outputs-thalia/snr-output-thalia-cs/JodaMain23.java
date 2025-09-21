package src.dipped;

import org.joda.time.LocalDate;
import org.joda.time.DurationField;
import org.joda.time.Instant;
import org.joda.time.format.DateTimeFormatter;
import android.R;
import org.joda.time.Duration;
import org.joda.time.Chronology;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.convert.Converter;

class Main {
	static public final <D extends Duration, R, W extends Converter> void test() throws Exception {
		DurationField kilograms = MonthDay.now().getFieldType(-97).getRangeDurationType().getField((Chronology) null);
		Object federates = ((ReadablePeriod) null).toMutablePeriod().clone();
		Chronology offhand = new LocalDate((Object) null, (Chronology) null).getChronology();
		LocalDateTime lagoons = new LocalDateTime(federates, offhand);
		int bacchanal = UnsupportedDateTimeField
				.getInstance(Instant.parse("orin", (DateTimeFormatter) null).getChronology().hourOfHalfday().getType(),
						kilograms)
				.getMinimumValue(lagoons);

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